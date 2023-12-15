import { computed, ref } from "vue";
import { defineStore } from "pinia";
import { v4 as uuidv4} from 'uuid'

export const useTodoStore = defineStore('todos', () => {
    const todos = ref([]);
    const todoForId = computed((todoId) => todos.value.find(t => t.id == todoId))

    let id = 0;

    function createTodo(todo) {
        todos.value.push({todo, id: id++, favorite: false})
    }

    function removeTodo(todo){
        todos.value = todos.value.filter(t => t !== todo)
    }

    function toggleFavorite(id){
        const favoriteTodo = todos.value.find((obj)=> obj.id === id)
        if (favoriteTodo){
            favoriteTodo.favorite = !favoriteTodo.favorite
        }
    }


    return {todos, todoForId, createTodo, removeTodo, toggleFavorite}

})