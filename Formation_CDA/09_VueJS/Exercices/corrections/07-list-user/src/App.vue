<template>
  <div id="app">
    <div class="container">
      <h1 class="mb-4 mt-4">Users</h1>
      <UserForm @add-user="addUser" />
      <UsersTable :users="users" @delete:user="deleteUser" @edit:user="editUser" />
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import UsersTable from './components/UserTable.vue'
import UserForm from './components/UserForm.vue'

const users = ref([
  {
    id: 1,
    name: 'Jean Michel Apeupres',
    email: 'jean.michel@gmail.com'
  },
  {
    id: 2,
    name: 'Rio Mavuba',
    email: 'rio@gmail.com'
  },
  {
    id: 3,
    name: 'John Doe',
    email: 'john@gmail.com'
  }
])

const addUser = (user) => {
  const lastId = users.value.length > 0 ? users.value[users.value.length - 1].id : 0
  const id = lastId + 1
  const newUser = { ...user, id }
  users.value.push(newUser)
}

const deleteUser = (id) => {
  users.value = users.value.filter(user => user.id !== id)
}

const editUser = (id, updatedUser) => {
  users.value = users.value.map(user => user.id === id ? updatedUser : user)
}
</script>

<style>
.container  {
  max-width: 700px;
}
</style>
