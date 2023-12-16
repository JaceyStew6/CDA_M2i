import { computed, ref, watchEffect } from "vue";
import { defineStore } from "pinia";

export const useCharactersStore = defineStore('characters', ()=> {
    // const characters = ref([])
    const characterId = ref(1)
    const characters = ref(null)

    function getAllCharacters(){
       watchEffect(async () => {
        const response = await fetch (
            `https://rickandmortyapi.com/api/character`
        )
        characters.value = await response.json();
        console.log(characters.value);
    }) 
    }
    


    // const characterForId = computed((characterId)=> characters.value.find(c=>c.id === characterId))

    // function filter (){

    // }

    return {characters, characterForId, characterId, getAllCharacters}
})