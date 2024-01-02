<template>
    <section class="bg-blue-500 dark:bg-blue-500">
        <div class="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
            <img src="../images/rickandmorty_logo_black.png" class="my-5" />
            <div
                class="w-full bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-md xl:p-0 dark:bg-gray-800 dark:border-gray-700">
                <div class="p-6 space-y-4 md:space-y-6 sm:p-8">
                    <h1
                        class="text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-black">
                        Sign in to your account
                    </h1>
                    <form class="space-y-4 md:space-y-6" @submit.prevent="submitForm">
                        <div>
                            <label for="email" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Your
                                email</label>
                            <input type="email" v-model="email" id="email"
                                class="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                placeholder="name@company.com" required>
                        </div>
                        <div>
                            <label for="password"
                                class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Password</label>
                            <input type="password" v-model="password" id="password" placeholder="••••••••"
                                class="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                required>
                        </div>
                        <div class="text-center">
                            <button type="submit"
                                class="bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">Sign
                                in</button>
                        </div>
                        <p class="text-sm font-light text-gray-500 dark:text-gray-400">
                            Don’t have an account yet? <a href="#"
                                class="font-medium text-primary-600 hover:underline dark:text-primary-500">
                                <RouterLink to="/register">Sign up</RouterLink>
                            </a>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </section>
</template>
<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import {useUserStore} from '../stores/auth';

const email = ref('');
const password = ref('');
const router = useRouter();
const userStore = useUserStore();

const submitForm = async () => {
  try {
    userStore.loginUser(email.value, password.value);
    router.push('/caracteres');
  } catch (error) {
    alert(error.message);
  }
};
</script>