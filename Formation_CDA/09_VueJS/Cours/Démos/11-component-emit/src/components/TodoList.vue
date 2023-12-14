<template>
  <div>
    <AddTodo @add-todo="addTodo" />
    <h3 v-if="todos.length" class="mt-4">Liste des tâches :</h3>
    <ul>
      <TodoItem
        v-for="(todo, index) in todos"
        :key="index"
        :todo="todo"
        :index="index"
        @remove-todo="removeTodo"
        @update-todo="prepareUpdate"
      />
    </ul>
    <div class="d-flex flex-row" v-if="editingIndex !== null">
      <input  class="form-control form-control mx-2" v-model="newText" @keyup.enter="updateTodo">
      <button class="btn btn-primary" @click="updateTodo">Save</button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import TodoItem from './TodoItem.vue'   
import AddTodo from './AddTodo.vue' 

const todos = ref([])
const editingIndex = ref(null)
const newText = ref('')

const addTodo = newTodoText => {
todos.value.push({ text: newTodoText})
}

const removeTodo = index => {
todos.value.splice(index, 1)
}

const prepareUpdate = index => {
if (index !== undefined && todos.value[index]) {
  editingIndex.value = index
  newText.value = todos.value[index].text
} else {
  console.error('Tâche introuvable à l\'indice:', index)
}
}

const updateTodo = () => {
if (editingIndex.value !== null && todos.value[editingIndex.value]) {
  todos.value[editingIndex.value].text = newText.value
  //console.log(todos.value[editingIndex.value].text);
  editingIndex.value = null
  newText.value = ''
} else {
  console.error('Tentative de mise à jour d\'une tâche non valide')
  editingIndex.value = null
}
}
</script>