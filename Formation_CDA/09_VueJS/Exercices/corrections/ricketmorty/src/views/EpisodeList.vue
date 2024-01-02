<template>
  <div v-if="episodeStore.episodes.length > 0">

    <div v-for="episode in episodeStore.episodes" :key="episode.id" class="card m-2">
      <h1 class="text-center card-header bg-blue-500 text-white">{{ episode.name }} - {{ episode.episode }} </h1>
      <div class="d-flex flex-wrap justify-content-center">
        <div v-for="character in episode.characters" :key="character.id" class="text-center">
          <a href="#" data-bs-toggle="modal" :alt="character.name" :data-bs-target="'#characterModal' + character.id">
            <img :src="character.image" class="character-image hover:opacity-75 transition-opacity duration-300"
            @mouseenter="setCurrentCharacter(character)"></a>

          <p style="font-size: xx-small;"><b>{{ truncateString(character.name, 10) }}</b></p>
        </div>
      </div>
    </div>
  </div>
  <div v-else>
    <h1 class="text-2xl text-center font-bold">Chargement...</h1>
    <img src="../images/load.jpg" alt="" srcset="">
  </div>


  <div class="modal fade modal-xl" :id="'characterModal' + currentCharacter.id" tabindex="-1"
    aria-labelledby="exampleModalLabel" aria-hidden="true" alignment="center">
    <div class="modal-dialog modal-dialog-centered custom-modal-width">
      <div class="modal-content">
        <div class="modal-body">
          <div class="d-flex flex-row align-items-center mb-2">
            <div class="flex-shrink-0"> 
              <img :src="currentCharacter.image" alt="image personnage">
            </div>
            <div class="flex-grow-1 text-center ms-2">
             
              <h1 class="text-2xl font-extrabold my-4">{{ currentCharacter.name }}</h1>
              <p><span class="uppercase text-blue-500">Status : </span>{{ currentCharacter.status }}</p>
              <p><span class="uppercase text-blue-500">Species : </span>{{ currentCharacter.species }}</p>
              <p><span class="uppercase text-blue-500">Type : </span>{{ currentCharacter.type }}</p>
              <p><span class="uppercase text-blue-500">Gender : </span>{{ currentCharacter.gender }}</p>
              <p><span class="uppercase text-blue-500">Origin : </span>{{ currentCharacter.origin?.name }}</p>
              <p><span class="uppercase text-blue-500">Location : </span>{{ currentCharacter.location?.name }}</p>
              <p><span class="uppercase text-blue-500">Created : </span>{{ currentCharacter.created }}</p>
            </div>
          </div>

          <div class="modal-footer">
            <button @click="currentCharacter = null" class="btn btn-secondary"
              data-bs-dismiss="modal">Fermer</button>
          </div>
        </div>
      </div>


    </div>
  </div>
</template>
  
<script setup>
import { onMounted, reactive, ref } from 'vue';
import { useEpisodeStore } from '../stores/useEpisodeStore';

const currentCharacter = ref({});

const setCurrentCharacter = (character) => { currentCharacter.value = character; console.log(currentCharacter.value); };


const truncateString = (str, maxLength) => {
  return str.length > maxLength ? str.substring(0, maxLength) + '...' : str;
};

const episodeStore = useEpisodeStore();

onMounted(async () => {
  await episodeStore.fetchEpisodes();
});



</script>
<style>
.custom-modal-width {
  max-width: 800px; 
}
.character-image {
  max-width: 50px;
  margin: 10px;
}
</style>
  