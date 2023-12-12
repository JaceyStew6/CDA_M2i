<script setup>
import { ref } from 'vue';
import addUser from './addUser.vue';
import UserItem from './UserItem.vue';

const users = ref([]);

const addNewUser = newUser => {
    users.value.push({username, email})
}

</script>

<template>

<div>
    <addUser @add-user="addUser"/>
    <ul>
        <UserItem v-for="(username, email, index) in users"
        :key="index"
        :username="username"
        :email="email"
        :index="index"
        />
    </ul>
    
</div>
</template>

<style scoped>

</style>
