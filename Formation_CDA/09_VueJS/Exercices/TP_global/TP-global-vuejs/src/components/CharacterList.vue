<script setup>
import { useCharactersStore } from '../stores/characters';
import { ref, onMounted } from 'vue';
import CharacterCard from './CharacterCard.vue';

const characterStore = useCharactersStore();
const { getCharactersByPage } = characterStore;

const pageId = ref(1);

onMounted(() => {
    getCharactersByPage(pageId);
})

// setTimeout(() => {
//     console.log(characterStore.characters.results);
// }, 5000);

let data = ref();
data = getCharactersByPage(pageId)
// console.log(characterStore.characters.info);


</script>


<template>
    <h1>characters view</h1>
    <form action="#">
        <input type="text" @keyup.enter="name = $event.target.value">
    </form>


    <div class="character-card-container">
        <CharacterCard v-if="characterStore.characters" v-for="character in characterStore.characters.results" :key="character.id" :characterCard="character"/>
    </div>
    <button @click="pageId++, getCharactersByPage(pageId)">Next</button>
    <button @click="pageId--, getCharactersByPage(pageId)">Previous</button>
</template>

<style scoped>

.character-card-container{
    display: grid;
    align-content: center;
}

</style>