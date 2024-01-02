<template>
  <header class="flex justify-between items-center p-4 text-white bg-blue-400 bg-opacity-95 body-font">
    <div class="flex flex-row items-center">
      <h1 class="mr-5 text-3xl">Rick et Morty M2I</h1>
      <ul v-if="authStore.isLoggedIn" class="flex flex-row">
        <li class="mx-4 text-2xl">
          <RouterLink to="/caracteres">Personnages</RouterLink>
        </li>
        <li class="mx-4 text-2xl">
          <RouterLink to="/episodes">Episodes</RouterLink>
        </li>
        <li class="mx-4 text-2xl">
          <RouterLink to="/locations">Locations</RouterLink>
        </li>
        <li class="mx-4 text-2xl">
          <RouterLink to="/">Statistiques</RouterLink>
        </li>
      </ul>
    </div>
    <div class="d-flex flex-row">
      <span v-if="authStore.isLoggedIn" class="d-flex flex-column justify-content-center mx-4">{{ authStore.currentUser.split('@')[0] }}</span>
      <div>
        <button v-if="!authStore.isLoggedIn" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
          <RouterLink to="/login"><i class="bi bi-person"></i>
            Login</RouterLink>
        </button>
        <button v-if="authStore.isLoggedIn" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"
          @click="handleLogout">
          <i class="bi bi-box-arrow-right"></i>
          Logout
        </button>
      </div>
    </div>
  </header>
</template>

<script setup>
import { useRoute, useRouter } from 'vue-router';
import { useUserStore } from '../stores/auth'
import { ref } from 'vue';


const authStore = useUserStore();
const route = useRoute();
const router = useRouter();
const routeName = route.name;
const name = ref('');


name.value = authStore.currentUser;

console.log(authStore.currentUser);

authStore.checkLoginStatus();
const handleLogout = () => {
  authStore.logoutUser();
  if (!authStore.isLoggedIn) {
    router.push('/login')
  }
};



</script>

