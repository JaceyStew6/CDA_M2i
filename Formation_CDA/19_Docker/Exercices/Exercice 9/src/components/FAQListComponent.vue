<script setup>
import { ref } from 'vue';
import faq from '@/data/faq.json'

const faqData = ref(faq);

</script>

<template>
    <div class="flex-container">
        <div class="card" v-for="f of faqData">
            <h2 class="card-title">{{ f.question }}</h2>
            <p class="card-response">{{ f.response }}</p>
            <hr/>
        </div>

    </div>
</template>

<style scoped>
.flex-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}

.card {
    text-align: center;
    max-width: 70rem;
    margin: 1rem;
    /* margin-top: 0; */
    margin-bottom: 0;
    background-color: rgb(28, 28, 28);
    color: rgb(230, 230, 230);
    border: none;
}

.card-response {
    color: rgb(204, 204, 204);
}

hr {
    color: rgb(204, 204, 204);
}
</style>