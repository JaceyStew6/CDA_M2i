<template>
  <div class="user-table">
      <div v-if="users.length < 1" class="alert alert-light">
          No Users
      </div>
      <table v-else class="table table-bordered">
          <thead>
              <tr>
                   <th>Id</th>
                  <th>Name</th>
                  <th>Email</th>
                  <th></th>
              </tr>
          </thead>
          <tbody>
              <tr v-for="user in users" :key="user.id">
                  
                  <td v-if="editing === user.id">
                      <p>{{ user.id }}</p>
                  </td>
                  <td v-else>{{ user.id }}</td>
                  <td v-if="editing === user.id">
                      <input type="text" v-model="user.name">
                  </td>
                  <td v-else>{{ user.name }}</td>
                  <td v-if="editing === user.id">
                      <input type="email" v-model="user.email">
                  </td>
                  <td v-else>{{ user.email }}</td>
                  <td v-if="editing === user.id">
                      <button @click="editUser(user)" class="btn btn-primary mx-2">Save</button>
                      <button @click="cancelEdit(user)" class="btn btn-light">Cancel</button>
                  </td>
                  <td v-else>
                      <button @click="editMode(user)" class="btn btn-warning mx-2">Edit</button>
                      <button @click="deleteUser(user.id)" class="btn btn-danger">Delete</button>
                  </td>
              </tr>
          </tbody>
      </table>
  </div>
</template>

<script setup>
import { ref, defineProps, defineEmits } from 'vue'

const props = defineProps({
  users: Array
})

const editing = ref(null)
const cachedUser = ref(null)

const emit = defineEmits(['edit-user', 'delete-user'])

const editMode = (user) => {
  cachedUser.value = Object.assign({}, user)
  editing.value = user.id
}

const cancelEdit = (user) => {
  Object.assign(user, cachedUser.value)
  editing.value = null
}

const editUser = (user) => {
  if(user.name === '' || user.email === '') return
  emit('edit-user', user.id, user)
  editing.value = null
}

const deleteUser = (id) => {
  emit('deleteuser', id)
}
</script>

<style>
/* Votre style ici */
</style>