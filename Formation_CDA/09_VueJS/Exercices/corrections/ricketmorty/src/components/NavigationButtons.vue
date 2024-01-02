<template>
  <!-- Wrapper pour les boutons de pagination -->
  <div class="buttons-wrapper h-8 flex justify-center">
    <!-- Bouton 'First': Va à la première page. Désactivé si déjà sur la première page -->
    <button
      :disabled="storeCharacters.requestFilters.page === 1"
      @click="storeCharacters.goToPage(1)"
      class="px-4 rounded disabled:pointer-events-none disabled:text-slate-200 focus:outline-none border drop-shadow-sm bg-white hover:border-green-300 transition-colors duration-100 ease-in-out"
    >
      First
    </button>

    <!-- Bouton 'Previous' (<): Décrémente la page. Désactivé si sur la première page -->
    <button
      :disabled="storeCharacters.requestFilters.page <= 1"
      @click="storeCharacters.movePage(-1)"
      class="px-4 ml-5 drop-shadow-sm bg-white disabled:pointer-events-none disabled:text-slate-200 focus:outline-none border hover:border-green-300 rounded"
    >
      &lt;
    </button>

    <!-- Champ numérique pour entrer un numéro de page spécifique -->
    <input
      id="pageNumber"
      :value="storeCharacters.requestFilters.page"
      type="number"
      @focusout="onPageNumberInput"
      @keyup.enter="onPageNumberInput"
      class="w-14 mx-1 text-gray-700 rounded border border-gray-100 drop-shadow-sm bg-white focus:border-green-300 text-center outline-none transition-colors duration-200 ease-in-out"
    >

    <!-- Bouton 'Next' (>): Incrémente la page. Désactivé si sur la dernière page -->
    <button
      :disabled="storeCharacters.requestFilters.page >= storeCharacters.lastPage"
      @click="storeCharacters.movePage(1)"
      class="px-4 border drop-shadow-sm bg-white disabled:pointer-events-none disabled:text-slate-200 focus:outline-none hover:border hover:border-green-300 rounded"
    >
      &gt;
    </button>

    <!-- Bouton 'Last': Va à la dernière page. Désactivé si déjà sur la dernière page -->
    <button
      :disabled="storeCharacters.requestFilters.page >= storeCharacters.lastPage"
      @click="storeCharacters.goToPage(storeCharacters.lastPage)"
      class="px-4 ml-5 rounded drop-shadow-sm bg-white disabled:pointer-events-none disabled:text-slate-200 focus:outline-none border hover:border-green-300"
    >
      Last
    </button>
  </div>
</template>

<script setup>
import { useStoreCharacters } from '@/stores/storeCharacters';

// Utilise le store de personnages pour la gestion des données et de l'état de pagination
const storeCharacters = useStoreCharacters();


const onPageNumberInput = ({ target: { value }}) => {
  // Convertit la valeur en entier et appelle setPage avec la nouvelle valeur
  const newPage = parseInt(value, 10); // Assure que la valeur est un entier
  if (!isNaN(newPage)) {
    storeCharacters.setPage(newPage); // Utilise la méthode setPage du store
  }
}
</script>

<style scoped>
/* Styles pour enlever les boutons de spin des inputs numériques sur Webkit (Chrome, Safari) et Firefox */
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

input[type=number] {
  -moz-appearance: textfield;
}
</style>
