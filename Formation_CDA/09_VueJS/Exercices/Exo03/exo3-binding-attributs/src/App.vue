<script setup>
import { ref, computed, reactive } from 'vue';

let switchToRed = ref(false);
// let switchToBlue = ref(false);

// let blueColor = reactive(()=> {
//   return {"blue": switchToBlue.value}
// })

let redClass = computed(() => {
  return {"text-red": switchToRed.value}
});

</script>

<template>
  <div :class="redClass" @click="switchToRed = !switchToRed">
    <p>Hello world!</p>
  </div>
  <br>

  <!-- <button @click="switchToRed = !switchToRed">Rouge</button> -->

  <div >
    <p :style="{color: red}">Goodbye!</p>
  </div>
</template>

<style scoped>
.text-red {
  color: red;
}

.blue {
  color: blue;
}

</style>
