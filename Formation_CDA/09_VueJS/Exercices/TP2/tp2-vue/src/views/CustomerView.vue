<script setup>
import { inject } from 'vue';

const {customers} = inject ('customers');

</script>

<template>
<h1>Cette page affiche la liste des clients</h1>
<p>Cliquer sur une carte affiche le nom en dessous</p>
<p>Cliquer sur "plus de détails" redirige vers une nouvelle page qui affiche les informations du client</p>

<ul v-for="c of customers">
        <li>{{ c.name }}</li>
        <li>{{ c.email }}</li>
        <li>{{ c.phone }}</li>
    <button><RouterLink :to="`/customer/${c.id}`">Cliquer pour plus de détails</RouterLink></button>
</ul>

</template>

<style scoped>

</style>
