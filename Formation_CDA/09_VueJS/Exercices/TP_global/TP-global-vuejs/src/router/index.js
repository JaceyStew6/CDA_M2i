import { createRouter, createWebHistory } from 'vue-router'
// import { useAuthStore } from '../stores/auth'

import HomeView from '../views/HomeView.vue';
import CharactersView from '../views/CharactersView.vue';
import CharacterNotFoundView from '../views/CharacterNotFoundView.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: HomeView },
    { path: '/characters', component: CharactersView },
    { path: '/not-found', component: CharacterNotFoundView },
  ],
});

//On définit un garde de navigation avec beforeEach afin de protéger les navigations, soit en les redirigeant soit en les annulant

/*router.beforeEach((to, from) => {
  const authStore = useAuthStore()
  if (authStore.isLoggedIn){
    return true
  } else if (to.fullPath.startsWith('/characters')) return '/'
  return true
})*/

export default router
