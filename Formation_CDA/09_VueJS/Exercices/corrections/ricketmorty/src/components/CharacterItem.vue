<template>
  <!-- Container général pour l'élément de personnage avec style de base -->
  <div class="p-1 sm:p-2 border rounded-md drop-shadow-sm border-gray-200 bg-white">
    <!-- Modal pour afficher les détails du personnage, activé par un état réactif -->
    <ModalCharacterItem
      v-if="modals.characterItem"
      v-model:characterModal="modals.characterItem"
      :character="character"
    />
    <!-- Lien pour activer le modal de personnage. @click.prevent empêche le comportement par défaut du lien et bascule l'état du modal -->
    <a href="/" @click.prevent="modals.characterItem = !modals.characterItem">
      <!-- Container pour l'image du personnage -->
      <div class="mb-3 object-cover object-center rounded overflow-hidden">
        <!-- Image de remplacement jusqu'à ce que l'image principale soit chargée -->
        <img :class="{ hidden: imgLoaded}" src="@/images/avatar_placeholder.jpeg" alt="avatar">
        <!-- Image principale du personnage avec gestion du chargement -->
        <img :class="{ hidden: !imgLoaded}" :src="character.image" alt="avatar" @load="imgLoaded = true">
      </div>
      <!-- Nom du personnage -->
      <h2 class="character-name text-gray-800 text-xl font-semibold leading-snug">{{ character.name }}</h2>
      <!-- Espèce du personnage -->
      <div class="text-sm mb-2">
        <span class="text-green-500 capitalize">Species:</span>
        <span>{{ character.species }}</span>
      </div>
    </a>
  </div>
</template>
<script setup>
import { reactive, ref } from 'vue';
import ModalCharacterItem from '../components/ModalCharacterItem.vue';

// Reçoit le personnage à afficher en tant que prop, ainsi que les filtres facultatifs.
const props = defineProps({
  character: {
    type: Object,
    required: true
  }
})

// État pour savoir si l'image du personnage a été chargée, utilisé pour afficher ou cacher l'image de remplacement.
const imgLoaded = ref(false)

// Objet réactif pour gérer l'état du modal, initialisé avec characterItem à false.
const modals = reactive({
  characterItem: false
})
</script>
