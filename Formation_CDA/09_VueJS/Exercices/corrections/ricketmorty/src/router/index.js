import { createRouter, createWebHistory } from "vue-router";
import EpisodeList from '../views/EpisodeList.vue';
import CharactersList from '../views/CharactersList.vue';
import LocationList from '../views/LocationList.vue';
import Page404 from '../views/Page404.vue';
import Login from '../views/Login.vue';
import Register from '../views/Register.vue';
import { useUserStore } from '../stores/auth'



const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
      { path: "/", component: Login },
      { path: "/caracteres", component: CharactersList },
      { path: "/episodes", component: EpisodeList},
      { path: "/locations", component: LocationList},
      { path: "/login", component: Login, name: 'login'},
      { path: "/register", component: Register, name: 'register'},
      { path: "/:pathMatch(.*)", redirect: "/not-found" },
      { path: "/not-found", component: Page404 },
    ],
  });
 
  router.beforeEach((to, from, next) => {
    const authStore = useUserStore();
  
    // Vérifier si l'utilisateur est connecté
    const isLoggedIn = authStore.isLoggedIn;
  
    if (to.path === '/login' || to.path === '/register') {
      if (isLoggedIn) {
        
        next('/episodes');
      } else {

        next();
      }
    } else {
      if (!isLoggedIn) {
       
        next('/login');
      } else {
        
        next();
      }
    }
  });
  
  
  export default router;