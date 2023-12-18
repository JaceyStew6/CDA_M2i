<script>
export default {
    name: 'Card',
    props: ['characterCard']
}

</script>

<template>
    <div class="card" style="width: 18rem;">
        <img class="card-img-top" :src="characterCard.image" alt="">
        <div class="card-body">
            <h5 class="card-title">{{ characterCard.name }}</h5>
            <span class="card-text">{{ characterCard.species }} </span>
        </div>
    </div>
</template>

<style scoped>
.card {
    text-decoration: none;
    border: solid 1px grey;
    border-radius: 10px;
    /* overflow: hidden; */

    display: grid;
    align-content: center;
    /* grid-template: 8fr 1fr / 1fr; */

    /* background-color: black; */
}

.card-title {
    display: block;
    color: transparent;
    padding: 1ch 2ch;
    position: relative;
    left: 120%;
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