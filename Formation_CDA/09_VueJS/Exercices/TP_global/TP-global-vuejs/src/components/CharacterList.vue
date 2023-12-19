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
    <main>
        <form action="#" class="">
            <input class="input-search" type="text" placeholder="Search by name..." @keyup.enter="name = $event.target.value">
        </form>

        <div class="btn-nav">
            <button @click="pageId = 1, getCharactersByPage(pageId)">First</button>
            <button @click="pageId > 1 ? pageId-- : '', getCharactersByPage(pageId)">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-left"
                    viewBox="0 0 16 16">
                    <path
                        d="M10 12.796V3.204L4.519 8zm-.659.753-5.48-4.796a1 1 0 0 1 0-1.506l5.48-4.796A1 1 0 0 1 11 3.204v9.592a1 1 0 0 1-1.659.753z" />
                </svg>
            </button>
            <button class="btn-show-page">{{ pageId }}</button>
            <button @click="pageId < 41 ? pageId++ : '', getCharactersByPage(pageId)">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right"
                    viewBox="0 0 16 16">
                    <path
                        d="M6 12.796V3.204L11.481 8zm.659.753 5.48-4.796a1 1 0 0 0 0-1.506L6.66 2.451C6.011 1.885 5 2.345 5 3.204v9.592a1 1 0 0 0 1.659.753z" />
                </svg>
            </button>
            <button @click="pageId = 42, getCharactersByPage(pageId)">Last</button>
        </div>


        <div class="character-card-container">
            <CharacterCard v-if="characterStore.characters" v-for="character in characterStore.characters.results"
                :key="character.id" :characterCard="character" />
        </div>

        <div class="btn-nav">
            <button @click="pageId = 1, getCharactersByPage(pageId)">First</button>
            <button @click="pageId > 1 ? pageId-- : '', getCharactersByPage(pageId)">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-left"
                    viewBox="0 0 16 16">
                    <path
                        d="M10 12.796V3.204L4.519 8zm-.659.753-5.48-4.796a1 1 0 0 1 0-1.506l5.48-4.796A1 1 0 0 1 11 3.204v9.592a1 1 0 0 1-1.659.753z" />
                </svg>
            </button>
            <button class="btn-show-page">{{ pageId }}</button>
            <button @click="pageId < 41 ? pageId++ : '', getCharactersByPage(pageId)">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right"
                    viewBox="0 0 16 16">
                    <path
                        d="M6 12.796V3.204L11.481 8zm.659.753 5.48-4.796a1 1 0 0 0 0-1.506L6.66 2.451C6.011 1.885 5 2.345 5 3.204v9.592a1 1 0 0 0 1.659.753z" />
                </svg>
            </button>
            <button @click="pageId = 42, getCharactersByPage(pageId)">Last</button>
        </div>


    </main>
</template>

<style scoped>
.character-card-container {
    margin-top: 1rem;
    margin-bottom: 1rem;
    display: grid;
    /* grid-template-rows: 200px 200px; */
    grid-template-columns: 1fr 1fr 1fr 1fr;
    row-gap: 10px;
    column-gap: 15px;
    justify-content: center;
    justify-items: center;
}

.btn-nav {
    display: flex;
    flex-direction: row;
    justify-content: center;
}

form {
    display: flex;
    flex-direction: row;
    justify-content: center;
    margin: 1rem;
}

button {
    margin: 5px;
    border-radius: 5px;
    border: solid 1px lightgray;
    background-color: white;
}

.btn-show-page {
    padding-left: 10px;
    padding-right: 10px;
}

.input-search {
    border: solid 1px rgb(150, 226, 36);
    width: 20rem;
    border-radius: 15px;
    text-align: center;
}
</style>