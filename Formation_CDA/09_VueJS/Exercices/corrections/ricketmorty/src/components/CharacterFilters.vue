 <template>
  <!-- Container pour l'icône de filtrage -->
  <div class="flex place-content-center my-4">
    <a href="" class="text-xl flex relative" :class="{ 'filters-icon-anim': animateIcon }"
      @click.prevent="openCloseFilters = !openCloseFilters">
      <!-- Icône de filtrage, change de couleur lorsqu'elle est active -->
      <i class="fa-solid fa-filter hover:text-green-200 transition-colors duration-100 ease-in-out"
        :class="[openCloseFilters ? 'text-green-300' : 'text-gray-300']" />
      <!-- Petit indicateur rouge si des filtres supplémentaires sont appliqués -->
      <p v-if="Object.keys(storeCharacters.requestFilters).length > 1" class="absolute" style="top: -1px; right: -1px">
        <span class="block bg-red-500 w-2 h-2 rounded-2xl" />
      </p>
    </a>
  </div>

  <!-- Wrapper pour les éléments de filtre, affiché ou caché en fonction de openCloseFilters -->
  <div class="filters-wrapper flex flex-col items-center transition-all duration-300 ease-in-out"
    :class="{ 'h-0': !openCloseFilters, 'overflow-hidden': !openCloseFilters }">
    <!-- Champ de recherche par nom -->
    <input id="characterName" v-model="selectedFilters.name" placeholder="Search by name..." type="text"
      class="w-2/5 min-w-max h-8 mt-6 rounded-2xl border border-gray-300 text-center placeholder:text-gray-300 drop-shadow-sm focus:border-green-300 focus:ring-5 focus:ring-green-200 outline-none transition-colors duration-200 ease-in-out"
      @input="setFilter('name', selectedFilters.name)" />

    <!-- Dropdowns générés pour chaque catégorie de filtre -->
    <div class="dropdown-wrapper max-w-xl grid grid-cols-2 gap-x-10 gap-y-1 mt-6">
      <label v-for="filter in filterCategoriesData" :key="filter.id" for="dropdown" class="flex">
        <span class="capitalize text-green-500 mr-2">
          {{ filter.name }}:
        </span>
        <select id="filters" v-model="selectedFilters[filter.name]"
          class="capitalize outline-0 w-full text-center text-ellipsis" name="filters"
          @change="setFilter(filter.name, selectedFilters[filter.name])">
          <option selected value="all">
            -
          </option>
          <option v-for="subFilter in filter.subFilters" :key="subFilter" :value="subFilter">
            {{ subFilter }}
          </option>
        </select>
      </label>
    </div>

    <!-- Lien pour réinitialiser les filtres -->
    <a v-if="Object.keys(storeCharacters.requestFilters).length > 1" href=""
      class="mt-4 underline text-red-400 hover:text-red-300 transition-colors duration-100 ease-in-out"
      @click.prevent="resetFilters">
      clear filters
    </a>
  </div>

  <!-- Affiche la plage d'ID des personnages actuellement affichés -->
  <div class="mt-6 flex place-content-center">
    <p class="ml-1">
      {{ idRange()[0] }} - {{ idRange()[1] }}
    </p>
    <p class="ml-2">of</p>
    <p class="text-green-400 ml-2">
      {{ storeCharacters.charactersCount }}
    </p>
  </div>
</template>

<script setup>
import { ref, watchEffect } from 'vue';
import { useStoreCharacters } from '@/stores/storeCharacters';

// Initialise le store et les états réactifs
const storeCharacters = useStoreCharacters();
const openCloseFilters = ref(false); // Contrôle l'affichage du panneau de filtre
const animateIcon = ref(false); // Contrôle l'animation de l'icône de filtre

const filterCategoriesData = storeCharacters.filterCategoriesData; // Les catégories de filtres disponibles

// Filtres sélectionnés par l'utilisateur
const selectedFilters = ref({
  name: '',
  status: 'all',
  species: 'all',
  type: 'all',
  gender: 'all'
});

// Synchronise les filtres sélectionnés avec le store
watchEffect(() => {
  Object.keys(selectedFilters.value).forEach(key => {
    if (storeCharacters.requestFilters[key]) {
      selectedFilters.value[key] = storeCharacters.requestFilters[key];
    } else {
      selectedFilters.value[key] = ' ';
    }
  });
});

// Réinitialise les filtres sélectionnés et dans le store
const resetFilters = () => {
  selectedFilters.value = {
    name: '',
    status: 'all',
    species: 'all',
    type: 'all',
    gender: 'all'
  };
  storeCharacters.resetStoreFilters();
};

// Applique le filtre sélectionné au store
const setFilter = (filterName, subFilter) => {
  storeCharacters.setStoreFilters(filterName, subFilter);
};

// Calcule la plage d'ID des personnages affichés basée sur la pagination
const idRange = () => {
  // Récupère le numéro de la page actuelle à partir des filtres de requête du store.
  const currentPage = storeCharacters.requestFilters.page;
  // Récupère le nombre total de personnages disponibles d'après le store.
  const charactersCount = storeCharacters.charactersCount;
  // Récupère le nombre de personnages actuellement affichés, ce qui peut être différent du nombre total de personnages si une pagination est en place.
  const charactersLength = storeCharacters.characterItems.length;

  // Si aucun personnage n'est actuellement affiché, retourne [0, 0] pour indiquer qu'il n'y a pas d'éléments à montrer.
  if (charactersLength === 0) {
    return [0, 0];
  }

  // Calcule et retourne un tableau de deux nombres :
  // 1. Le numéro du premier personnage affiché sur la page actuelle.
  // 2. Le numéro du dernier personnage affiché sur la page actuelle.
  // Si la page actuelle est la dernière page, il se peut qu'elle n'ait pas un nombre complet de personnages (par exemple, moins de 20), donc on utilise le minimum entre "currentPage * 20" et "charactersCount" pour s'assurer de ne pas dépasser le nombre total de personnages.
  return [
    ((currentPage - 1) * 20) + 1, // Calcule le numéro du premier personnage sur la page.
    currentPage * 20 > charactersCount ? charactersCount : currentPage * 20, // Utilise le nombre total de personnages si nous sommes à la fin de la liste, sinon le numéro du dernier personnage sur la page.
  ];
};

</script>

