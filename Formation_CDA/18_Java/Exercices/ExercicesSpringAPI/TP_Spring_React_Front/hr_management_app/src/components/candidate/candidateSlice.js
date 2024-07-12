import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";

const BASE_URL = "http://localhost:8080/api/candidates";

export const fetchCandidates = createAsyncThunk(
    "candidate/fetchCandidates",
    async () => {
        const response = await axios.get(BASE_URL);
                console.log(response.data);
        return response.data;
    }
);


export const fetchCandidate = createAsyncThunk(
    "candidate/fetchCandidate",
    async (url) => {
        const response = await axios.get(url);
        const data = await response.data;
        return data;
    }
);

const candidateSlice = createSlice({
    name: "candidates",
    initialState:{
        candidates: [],
        error: null,
        isLoading: false,
    },
    reducers: {
        addCandidate: (state, action) => {
            state.candidates.push(action.payload);
        }
    },
    extraReducers: (builder) => {
        builder
            .addCase(fetchCandidates.pending, (state) => {
                state.isLoading = true;
                state.error = null;
                state.candidates = [];
            })
            .addCase(fetchCandidates.fulfilled, (state, action) => {
                state.isLoading = false;
                state.candidates = action.payload;
            })
            .addCase(fetchCandidates.rejected, (state, action) => {
                state.isLoading = false;
                state.error = action.error.message;
            });
    }
});

export const { addCandidate } = candidateSlice.reducer;
export default candidateSlice.reducer;