<script setup>
import { useGameStore } from '../../store/games'
import { useAuthStore } from '../../store/auth'

const gameStore = useGameStore();
const authStore = useAuthStore();

</script>

<template>
    <h1>Liste des jeux</h1>
    <div v-if="gameStore.games.length > 0">

    </div>
</template>

<style scoped></style>
