<script setup>
import { ref } from 'vue';
import prices from '../data/prices.json'

const pricesData = ref(prices); 
</script>

<template>
    <div class="flex-content">
        <div class="card" v-for="p of pricesData">
            <img :src="p.image.url" :alt="p.image.alt" class="priceImg">
            <h2 class="card-title">{{ p.title }}</h2>
            <div class="card-desc">
                <p>{{ p.nbr_animal }}</p>
                <p>{{ p.time }}</p>
                <p>{{ p.distance }}<span class="precision">{{ p.precision }}</span></p>
                <p>{{ p.supp_price }}</p>
            </div>

        </div>
    </div>
</template>

<style scoped>
.flex-content {
    display: flex;
    flex-direction: column;
    justify-content: center;
    text-align: center;
    align-items: center;
}

.card {
    text-decoration: none;
    border: none;
    border-radius: 10px;
    color: var(--vt-c-white-mute);
    background-color: rgba(51, 51, 51, 0.75);
    width: 22rem;
    margin: 2rem;
    overflow: hidden;
}

.card-title {
    text-align: center;
}

.priceImg {
    height: 14.5rem
}

.card-desc {
    margin-left: 8px;
    margin-right: 8px;
}

.precision {
    font-size: 12px;
}

/*  Appareils larges (ordinateurs portables/ordinateurs de bureau, 900 pixels et plus) */
@media only screen and (min-width: 1249px) {
    .flex-content {
        display: flex;
        flex-direction: row;
        justify-content: center;
    }

    .card {
        margin: 1rem;
    }
}

/* Appareils trés larges (ordinateurs portables grands et ordinateurs de bureau, 1200 pixels et plus) */
@media only screen and (min-width: 1250px) {
    .card {
        margin: 1.5rem;
    }
}


@media only screen and (min-width: 1700px) {
    .card {
        margin: 3rem;
    }
}
</style>