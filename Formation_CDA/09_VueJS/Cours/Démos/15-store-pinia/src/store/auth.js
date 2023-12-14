import {ref, computed} from 'vue';
import {defineStore} from 'pinia'

export const useAuthStore = defineStore('auth', ()=> {
  
  const user = ref(null);

  const isLoggedIn = computed(()=> !!user.value); //notion de truthy/falsy. 
  /* 
    Le !! va faire une sorte de double vérification: va d'abord être équivalent 
    à "!user.value" puis va ensuite "transformer" en booléen au passage du deuxième "!"
  */
  function login(username, password){
    user.value = {username, password};
  }

  function logout(){
   user.value = null;
  }

return {user, isLoggedIn, login, logout}

})