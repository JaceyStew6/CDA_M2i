<template>
  <div 
    id="app"
    class="characters-list text-slate-600"
  >
  <header >
      <PageHeader />
    </header>


    <main class="max-w-5xl modals-container relative mx-auto mt-4 p-6">
      <RouterView/>
    </main>

    <footer v-if="routeName !== 'login'">
      <PageFooter />
    </footer>
  </div>
</template>

<script setup>
  import PageHeader from './components/PageHeader.vue'
  import PageFooter from './components/PageFooter.vue'
  import { useStoreCharacters } from '@/stores/storeCharacters'
  import { useRoute } from 'vue-router'

  const storeCharacters = useStoreCharacters();

</script>
