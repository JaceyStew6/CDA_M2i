import { computed, ref, watchEffect } from "vue";
import { defineStore } from "pinia";

export const useCharactersStore = defineStore('characters', () => {
    // const characters = ref([])
    // const characterId = ref(1)
    const characters = ref();


    async function getCharactersByPage(page) {
        try {
            const response = await fetch(`https://rickandmortyapi.com/api/character/?page=${page}`);
            if (!response.ok) {
                throw new Error('Erreur lors du chargement des données');
            }
            characters.value = await response.json();
            console.log(characters.value.results);
        } catch (error) {
            console.error('Erreur:', error);
        }
        return characters.value
    }

    // function getAllCharacters() {
    //     watchEffect(async () => {
    //         const response = await fetch(
    //             `https://rickandmortyapi.com/api/character`
    //         )
    //         characters.value = await response.json();
    //         console.log(characters.value);
    //     })
    // }





    // const characterForId = computed((characterId)=> characters.value.find(c=>c.id === characterId))

    // function filter (){

    // }

    return { characters, getCharactersByPage }
})