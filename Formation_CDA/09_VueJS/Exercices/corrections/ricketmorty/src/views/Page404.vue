<template>
<img src="../images/404.jpg" alt="" class="px-0 my-0" @click="back">
  </template>
  
  <style>
 
  </style>

  <script setup>

import {useRouter} from 'vue-router';

const router = useRouter();

function back(){
    router.push('/caracteres')
}

</script>
  