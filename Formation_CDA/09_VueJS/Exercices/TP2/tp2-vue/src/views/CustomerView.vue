<script setup>
import { inject } from 'vue';

const { customers } = inject('customers'); //on injecte ici le provide définit dans main.js

</script>

<template>
    <h1>Cette page affiche la liste des clients</h1>
    <p>Cliquer sur une carte affiche le nom en dessous</p>
    <p>Cliquer sur "plus de détails" redirige vers une nouvelle page qui affiche les informations du client</p>

    <div class="card" v-for="c of customers">
        <h2 class="card-title">{{ c.name }}</h2>
        <p>{{ c.email }}</p>
        <p>{{ c.phone }}</p>
        <button class="btn btn-primary">
            <RouterLink :to="`/customer/${c.id}`" class="text-white">Cliquer pour plus de détails</RouterLink>
        </button>
    </div>
</template>

<style scoped></style>
