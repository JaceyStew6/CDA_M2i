import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import { BASE_DB_URL } from "../firebaseConfig";
import axios from "axios";

export const fetchTodos = createAsyncThunk("todos/fetchTodos", async () => {
  axios.get(`${BASE_DB_URL}/todoList.json`).then((response) => {
    const todos = [];

    for (const key in response.data) {
      todos.push({ id: key, ...response.data[key] });
    }

    return todos;
  });
});

export const postTodo = createAsyncThunk("todos/postTodo", async (newTodo) => {
  axios.post(`${BASE_DB_URL}/todoList.json`, newTodo).then((response) => {
    return {
      id: response.data.name,
      ...newTodo,
    };
  });
});

const todoSlice = createSlice({
  name: "todos",
  initialState: {
    todos: [],
    isLoading: false,
  },
  reducers: {},
  /*
    .fullfilled => L'action se déclenche si la requête se termine
    .rejected => L'action se déclenche si la requête echoue
    .pending => l'action se déclenche pendant la requête
  */
  extraReducers: (builder) => {
    builder.addCase(fetchTodos.fulfilled, (state, action) => {
      state.todos = action.payload;
    });
    builder.addCase(postTodo.fulfilled, (state, action) => {
      state.todos.push(action.payload);
    });
    builder.addCase(fetchTodos.pending, (state, action) => {
      state.isLoading = true;
    });
  },
});

export default todoSlice.reducer;
