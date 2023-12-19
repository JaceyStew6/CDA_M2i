<script setup>
import { ref } from 'vue';
import { defineProps } from 'vue';

const props = defineProps(['characterCard', 'id'])

const currentCharacter = ref({});

const setCurrentCharacter = (character) => {
    currentCharacter.value = character;
    console.log(currentCharacter.value);
};

</script>

<template>
    <!-- card component -->
    <div class="card" style="width: 16rem;" data-bs-toggle="modal" :data-bs-target="'#characterModal' + props.characterCard.id" @click="setCurrentCharacter(props.characterCard)">
        <img class="card-img-top" :src="characterCard.image" alt="character-image">
        <div class="card-body">
            <h5 class="card-title">{{ characterCard.name }}</h5>
            <p class="card-text"><span>Species : </span> {{ characterCard.species }} </p>
        </div>
    </div>

    <!-- modale -->
    <div v-if="currentCharacter" class="modal" :id="'characterModal' + props.characterCard.id" tabindex="-1">
        <div class="modal-dialog modal-dialog-centered modal-lg">
            <div class="modal-content">
                <!-- Modal body -->
                <div class="modal-body">
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                    <img class="card-img-top" :src="currentCharacter.image" alt="character-image">

                    <h1>{{ currentCharacter.name }}</h1>
                    <p><span>Status : </span>{{ currentCharacter.status }}</p>
                    <p><span>Species : </span>{{ currentCharacter.species }}</p>
                    <p><span>Type : </span>{{ currentCharacter.type }}</p>
                    <p><span>Gender : </span>{{ currentCharacter.gender }}</p>
                    <p><span>Origin : </span>{{ currentCharacter.origin?.name }}</p>
                    <p><span>Location : </span>{{ currentCharacter.location?.name }}</p>
                    <p><span>Created : </span>{{ currentCharacter.created }}</p>

                </div>

            </div>
        </div>
    </div>
</template>


<style scoped>
.card {
    text-decoration: none;
    border: solid 1px lightgray;
    border-radius: 10px;
    padding-left: 5px;
    padding-right: 5px;
    padding-top: 5px;
    /* overflow: hidden; */

    /* display: grid; */
    /* grid-template: 8fr 1fr / 1fr; */

}

.card-title {
    display: block;
    /* color: transparent; */
    position: relative;
    transition: left 400ms ease,
        color 400ms ease;
}

.card:hover>.card-title {
    left: 0;
    color: yellowgreen
}

/* .card-picture>img {
    height: 100%;
    width: 100%;
    object-fit: cover;
    transition: filter 200ms ease;
    filter: grayscale(1);
} */
/* 
.card:hover>.card-picture>img {
    filter: grayscale(0);
} */
</style>