<script setup>
import { ref, onMounted } from 'vue';

let data = ref();
let nbPage = ref(1);

async function getCharacterByPage(page) {

    try {
        const response = await fetch(`https://rickandmortyapi.com/api/character/?page=${page}`);
        if (!response.ok) {
            throw new Error('Erreur lors du chargement des données');
        }
        const jsonData = await response.json();
        data.value = jsonData;

        console.log(data.value.results);
    } catch (error) {
        console.error('Erreur:', error);
    }
}


onMounted(() => {
    getCharacterByPage(nbPage);
    console.log(data);
});
</script>
 
<template>
    <header>
        <h1>
            TP Rick & Morty
        </h1>
    </header>
    <section>
        <input @keyup.enter="name = $event.target.value">
    </section>

    <section v-if="data" v-for="character in data.results" :key="character.id">
        <h1>{{ character.name }}</h1>
        <h1>{{ character.species }}</h1>
    </section>

    <button @click="nbPage < 41 ? nbPage++ : '', getCharacterByPage(nbPage)">PLUS</button>
    <button @click="nbPage > 1 ? nbPage-- : '', getCharacterByPage(nbPage)">MOINS</button>
</template>