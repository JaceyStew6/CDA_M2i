<script setup>
import CharacterList from '../components/CharacterList.vue'

</script>

<template>
<header>
    <h1>Personnages de Rick et Morty</h1>
</header>
<main>
<CharacterList/>

</main>

<footer>
    <img src="../assets/20231219_101802_0000.webp" alt="Logo" class="polar-fox-games-img">
</footer>
</template>

<style scoped>
header {
    text-align: center;
    background-color: rgb(10, 140, 180);
    color: rgb(253, 249, 242);
    height: 5em;
    margin-bottom: 1rem;
    font-size: 16px;
    padding: 1rem
}

footer {
    margin-top: 1rem;
    height: 4em;
    background-color: black;    
    text-align: center;
}

.polar-fox-games-img {
    width: 4em;
    border-radius: 10px;
}

</style>