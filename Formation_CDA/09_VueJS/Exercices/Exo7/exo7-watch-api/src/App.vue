<script setup>

import { ref, watchEffect } from 'vue';

let hyruleId = ref(1);
let objectHyrule = ref(null);
// let objectHyruleData = ref(null);

watchEffect(async () => {
  const response = await fetch(
    `https://botw-compendium.herokuapp.com/api/v3/compendium/entry/${hyruleId.value}`
  )
  objectHyrule.value = await response.json();
  console.log(objectHyrule.value);
  objectHyrule.value = objectHyrule.value.data;
})

</script>

<template>

  <input type="text" @keyup.enter="hyruleId = $event.target.value">
  <div v-if=objectHyrule>
    <p>{{ objectHyrule.name }}</p>
    <p>{{ objectHyrule.id }}</p>
  </div>

</template>

<style scoped>

</style>
