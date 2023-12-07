<script setup>
import { ref, reactive } from 'vue';
// Inachevé
let message = "Hello world";

function reverse (message){
  message.split().reverse().join();
  return message;
}

</script>

<template>

  <h1></h1>
  <button v-on:click="reverse(message)">Reverse content</button>
  <button>Add !</button>
  <a href=""></a>
</template>

<style scoped>

</style>
