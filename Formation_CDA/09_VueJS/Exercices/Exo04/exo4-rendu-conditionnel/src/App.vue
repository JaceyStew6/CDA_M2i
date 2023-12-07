<script setup>

import { ref, computed } from 'vue';

let ok = ref(true);

let numbers = ref([1, 2, 3, 4, 5])

</script>

<template>
<button>Toggle liste</button>
<button>Ajouter élément</button>
<button>Supprimer élément</button>
<button>Inverser la liste</button>

<div v-show="ok">
  <ul v-for="number in numbers">
    <li>{{ number }}</li>
  </ul>
</div>


</template>

<style scoped>

</style>
