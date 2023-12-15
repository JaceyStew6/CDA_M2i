<script setup>
import AddTodo from './components/AddTodo.vue';
import TodoList from './components/TodoList.vue';

</script>

<template>
  <header>
    <div class="container">
      <span>
        <img src="./assets/Pinialogo.svg" alt="Pinialogo" width="60rem" >
      <h1>To do</h1>
    </span>
      
      <AddTodo />
    </div>
  </header>
  <main>
    <TodoList />
  </main>
</template>

<style scoped>
header {
  background-color: rgba(194, 190, 190, 0.672);
  display: flex;
  justify-content: center;
  padding-top: 2rem;
  padding-bottom: 2rem;
}

.container {
    flex-direction: column;
    text-align: center;
}

/* span {
  display: flex;
  text-align: center;
} */

main {
  margin-top: 2%;
  display: flex;
  flex-direction: column;
  align-items: center;
}
</style>
