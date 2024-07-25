<script setup>
import PriceCardComponent from '@/components/PriceCardComponent.vue';


</script>

<template>
    <main>
        <h1 class="titre-prix">Prestations</h1>
        <PriceCardComponent />
        <p class="accroche">Vous souhaitez créer des souvenirs inoubliables avec votre plus fidèle ami ? Contactez-moi afin de réserver une séance photo !</p>
    </main>
</template>

<style scoped>

main {
    text-align: center;
}
.titre-prix {
    text-align: center;
    margin-top: 2rem;
    margin-bottom: 2rem;
    font-size: 36px;
}

.accroche {
    padding: 1rem;
    font-size: 20px;
}
</style>