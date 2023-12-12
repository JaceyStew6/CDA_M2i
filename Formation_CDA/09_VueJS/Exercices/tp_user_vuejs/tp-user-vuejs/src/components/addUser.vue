<script setup>

import { ref, defineEmits } from 'vue';

class User {
    name;
    email;

    constructor(name, email){
        this.name = name;
        this.email = email;
    }
}

const newUserName = ref(User.name);
const newUserEmail = ref(User.email);

const emit = defineEmits(['add-user']);

function emitAddUser(){
    emit('add-user', newUserName.value, newUserEmail.value);
    newUserName.value = '';
    newUserEmail.value = '';
}

// const emit = defineEmits({
//   // No validation
//   click: null,

//   // Validate submit event
//   submit: ({username, email}) => {
//     if (username && email) {
//       return true
//     } else {
//       console.warn('Invalid submit event payload!')
//       return false
//     }
//   }
// })

// function submitForm(username, email) {
//     username = new User.name;
//     email = new User.email;
//   emit('add-user', { username, email })
// }

</script>

<template>

<div>
    <label for="user-name">Name</label>
    <input type="text" id="user-name" v-model="newUserName">
    <label for="user-email">Email</label>
    <input type="email" id="user-email" v-model="newUserEmail">
    <button class="btn btn-primary" @click="emitAddUser">Add User</button>
</div>
</template>

<style scoped>

</style>
