<script setup>
import { useCharactersStore } from '../stores/characters';

const characterStore = useCharactersStore();
const { getAllCharacters } = characterStore;


</script>

<template>
    <h1>characters view</h1>
    <input type="text" @keyup.enter="characterId = $event.target.value">
    <div v-if="characterStore">
        
        <div v-for="character in characterStore.characters" :characterId="character.id">
            <p>{{ character.name }}</p>
            <p>{{ character.id }}</p>
        </div>
    </div>
</template>

<style scoped></style>