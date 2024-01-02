import { defineStore } from 'pinia';
import { ref } from 'vue';

export const useUserStore = defineStore('user', () => {
  const currentUser = ref(null);
  const isLoggedIn = ref(false);

  const registerUser = (email, password) => {
    let users = JSON.parse(localStorage.getItem('users')) || [];
    users.push({ email, password });
    localStorage.setItem('users', JSON.stringify(users));
  };

  const loginUser = (email, password) => {
    const users = JSON.parse(localStorage.getItem('users')) || [];
    const user = users.find(u => u.email === email && u.password === password);
    if (user) {
      currentUser.value = email;
      isLoggedIn.value = true;
      localStorage.setItem('currentUser', email);
      localStorage.setItem('isLoggedIn', 'true');
    } else {
      throw new Error('Invalid credentials');
    }
  };

  const checkLoginStatus = () => {
    const loggedIn = localStorage.getItem('isLoggedIn') === 'true';
    if (loggedIn) {
      currentUser.value = localStorage.getItem('currentUser');
      isLoggedIn.value = true;
    }
  };

  const logoutUser = () => {
    currentUser.value = null;
    isLoggedIn.value = false;
    localStorage.removeItem('currentUser');
    localStorage.setItem('isLoggedIn', 'false');
    console.log("coucou");
  };

  return { currentUser, isLoggedIn, registerUser, loginUser, checkLoginStatus, logoutUser };
});
