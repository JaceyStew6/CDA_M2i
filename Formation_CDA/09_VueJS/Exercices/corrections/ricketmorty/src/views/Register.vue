<template>
    <section class="bg-gray-50 dark:bg-gray-900">
        <div class="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
            <img src="../images/rickandmorty_logo.png" class="my-5" />
            <div
                class="w-full bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-md xl:p-0 dark:bg-gray-800 dark:border-gray-700">
                <div class="p-6 space-y-4 md:space-y-6 sm:p-8">
                    <h1
                        class="text-xl font-bold leading-tight text-center tracking-tight text-gray-900 md:text-2xl dark:text-black">
                        Create account
                    </h1>
                    <form class="space-y-4 md:space-y-6" @submit.prevent="submitForm" action="#">
                        <div>
                            <label for="email" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Your
                                email</label>
                            <input type="email" v-model="email" name="email" id="email"
                                class="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                placeholder="name@company.com" required="">
                        </div>
                        <div>
                            <label for="password"
                                class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Password</label>
                            <input type="password" v-model="password" name="password" id="password" placeholder="••••••••"
                                class="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                required="">
                        </div>
                        <div>
                            <label for="confirm-password"
                                class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Confirm
                                password</label>
                            <input type="password" v-model="confirmPassword" name="confirm-password"
                                id="confirm-password" placeholder="••••••••" 
                                class="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                required="">
                        </div>
                        <div class="text-center"><button type="submit"
                                class="bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow mb-2">Create
                                an account</button></div>

                        <span class="text-sm font-light text-gray-500 dark:text-gray-400">
                            Already have an account? <span
                                class="font-medium text-black-600 hover:underline dark:text-black-500"><RouterLink to="/login">Login</RouterLink></span>
                        </span>
                    </form>
                </div>
            </div>
        </div>
    </section>
</template>


<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import { useUserStore } from '../stores/auth';

const email = ref('');
const password = ref('');
const confirmPassword = ref('');
const isLoggedIn = ref(false);
const router = useRouter();
const userStore = useUserStore();

const isValidEmail = (email) => {
    const regex = /^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/;
    return regex.test(email);
};

const isValidPassword = (password) => {
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return regex.test(password);
};

const submitForm = () => {
    if (!isValidEmail(email.value)) {
        alert('Invalid email address.');
        return;
    }
    if (!isValidPassword(password.value)) {
        alert('Password must contain at least one uppercase letter, one lowercase letter, one number, one special character, and be at least 8 characters long.');
        return;
    }

    if (password.value !== confirmPassword.value) {
        alert('Passwords do not match.');
        return;
    }

    try {
        userStore.registerUser(email.value, password.value);
        alert('Account created successfully!');
        router.push('/login');
    } catch (error) {
        alert(error.message);
    }
}
</script>

  
<style>/* Votre CSS ici */</style>
  