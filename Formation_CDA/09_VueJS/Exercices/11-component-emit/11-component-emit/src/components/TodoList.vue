<script setup>
import { ref } from 'vue';
import AddTodo from './AddTodo.vue'
import TodoItem from './TodoItem.vue'

const todos = ref([]);

const addTodo = newTodoText => {
    todos.value.push({ text: newTodoText })
};

const removeTodo = index => {
    todos.value.splice(index, 1)
}

let editedTodoValue = new ref('');

const editTodo = index => {
    editedTodoValue.value = prompt("Quelle modification?");
    console.log(index);
    todos.value[index].text = editedTodoValue.value;
    console.log(todos.value[index]);

}

</script>

<template>
    <div>
        <AddTodo @add-todo="addTodo" />
        <h3 v-if="todos.length" class="mt-4">Liste des tâches :</h3>
        <ul>
            <TodoItem v-for="(todo, index) in todos" 
            :key="index" 
            :todo="todo" 
            :index="index" 
            @edit-todo="editTodo"
            @remove-todo="removeTodo" />
        </ul>
    </div>
</template>

<style scoped></style>