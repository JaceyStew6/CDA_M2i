<template>
<CharacterFilters />

<NavigationButtons class="my-6" />
  <section class="h-full">
    <div class="mx-auto">
      <div
        v-if="storeCharacters.charactersLoading"
        class="text-gray-200 text-2xl max-w-full flex justify-center items-center"
      >
        Characters loading...
      </div>

      <div
        v-else-if="storeCharacters.charactersCount > 0"
        class="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 justify-items-center gap-4 md:gap-6"
      >
        <CharacterItem
          v-for="character in storeCharacters.characterItems"
          :key="character.id"
          :character="character"
        />
      </div>

      <div
        v-else
        class="text-gray-200 text-2xl max-w-full flex justify-center items-center"
      >
        No characters found...
      </div>
    </div>
  </section>
  <NavigationButtons class="my-6" />
</template>

<script setup>



import CharacterItem from '../components/CharacterItem.vue';
  import { useStoreCharacters } from '../stores/storeCharacters'
  import CharacterFilters from '../components/CharacterFilters.vue'
  import NavigationButtons from '../components/NavigationButtons.vue'

 const storeCharacters = useStoreCharacters()

</script>

