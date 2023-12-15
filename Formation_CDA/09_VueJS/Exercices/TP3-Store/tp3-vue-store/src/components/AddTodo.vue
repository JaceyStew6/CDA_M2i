<script setup>
import { ref } from 'vue';
import { useTodoStore } from '../stores/todo';

const todoStore = useTodoStore();

const { createTodo } = todoStore;
// let todo = ref('');
// function addItemAndClear() {
//     if (todo.length === 0) {
//         return
//     }
//     // invokes function in the store:
//     todoStore.createTodo(todo)
//     todo.value = ''
// }

</script>

<template>
    <form action="#" @submit.prevent="createTodo(todo)">
        <input type="text" placeholder="I need to..." v-model="todo">
        <button class="btn btn-warning">Add</button>
    </form>
</template>

<style scoped></style>
