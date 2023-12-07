<script setup>
import { reactive, ref } from 'vue';


let toDo = ref("");

let toDoLists = ref(["first"]);

function addToDo() {
  toDoLists.value.push(todo.value)
}

</script>

<template>
  <form @submit.prevent="console.log(`${toDoLists}`)">

    <label for="todo"></label>
    <input type="text" name="" id="todo" v-model.lazy="toDo">

    <button type="submit" @click="addToDo">Ajouter une tâche</button>

  </form>

  <ul>
    <li v-for="toDo in toDoLists">
      <input type="checkbox" id="checkboxList" v-model="toDoLists"  />
      <label for="checkboxList">{{ toDo }}</label>
    </li>
  </ul>


  <!-- <div>
    <ul v-for="toDoList in toDoLists">
      <li>{{ toDoList }}</li>
    </ul>
  </div> -->

  <!-- <div>
    <input type="checkbox" id="checkbox" v-model.lazy="toDoLists" />
    <label for="checkbox">{{ toDoLists }}</label>
  </div> -->
</template>

<style scoped></style>
