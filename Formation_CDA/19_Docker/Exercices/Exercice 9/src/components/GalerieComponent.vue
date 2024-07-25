<script setup>
import { ref } from 'vue';
// import { defineProps } from 'vue';
import gallery from '../data/gallery.json'
const galleryData = ref(gallery);

// const props = defineProps(['galleryView', 'id'])

// const currentImage = ref({});

// const setCurrentImage = (image) => {
//     currentImage.value = image;
//     return currentImage;
// };
</script>

<template>
    <!-- Essai avec modale -->
    <!-- <div class="flex-container">
        <div v-for="g of galleryData" class="gallery-div" @click.prevent="setCurrentImage(g.url + g.jpg)" data-toggle="modal" data-target="#imageModal">
            <img :src="g.url + g.webp" :alt="g.alt" class="img-gallery">
        </div>
    </div> -->

    <!-- modale -->
    <!-- <div v-if="currentImage" class="modal" :id="'imageModal' + galleryData.url + galleryData.jpg">
        <div class="modal-dialog modal-dialog-centered modal-lg">
            <div class="modal-content">
                <div class="img-position">
                    <img :src="currentImage.url + currentImage.jpg" :alt="currentImage.alt" class="img-gallery">
                </div>
            </div>
        </div>
    </div> -->


    <!-- Code sans génération de modale -->
    <div class="grid-container">
        <div v-for="g of galleryData" class="gallery-div" :id="g.id">
            <img :src="g.url + g.jpg" :alt="g.alt" class="img-gallery">
        </div>
    </div>
</template>

<style scoped>
.grid-container {
    justify-content: center;
    display: grid;
    margin-left: 10rem;
    margin-right: 10rem;
    grid-template-rows: auto;
    text-align: center;
}

.flex-container div {
    width: fit-content;
    display: flex;
    flex-wrap: wrap;
}

@media only screen and (max-width: 600px) {
    .grid-container {
        grid-template-columns: repeat(2, 10rem);
    }
}

/* Petits appareils (tablettes en mode portrait et grands téléphones, 600 pixels et plus) */
@media only screen and (min-width: 600px) {
    .grid-container {
        grid-template-columns: repeat(4, 10rem);
    }
}

/* Appareils moyens (tablettes en mode paysage, 768 pixels et plus) */
@media only screen and (min-width: 768px) {
    .grid-container {
        grid-template-columns: repeat(4, 10rem);
    }
}

/*  Appareils larges (ordinateurs portables/ordinateurs de bureau, 992 pixels et plus) */
@media only screen and (min-width: 992px) {
    .grid-container {
        grid-template-columns: repeat(6, 10rem);
    }
}

/* Appareils trés larges (ordinateurs portables grands et ordinateurs de bureau, 1200 pixels et plus) */
@media only screen and (min-width: 1260px) {
    .grid-container {
        grid-template-columns: repeat(8, 10rem);
    }
}

@media only screen and (min-width: 1600px) {
    .grid-container {
        grid-template-columns: repeat(10, 10rem);
    }
}

/* Photos horizontales */
#i01,
#i02,
#i05,
#i06,
#i09,
#i10,
#i11,
#i12,
#i13,
#i14,
#i15,
#i16,
#i19,
#i20,
#i23,
#i24,
#i27,
#i28,
#i29,
#i30,
#i32,
#i33 {
    grid-column: span 2;
}

/* Photos verticales */
#i03-v,
#i04-v,
#i07-v,
#i08-v,
#i17-v,
#i18-v,
#i21-v,
#i22-v,
#i25-v,
#i26-v,
#i31-v {
    grid-column: span 1;
}

.gallery-div {
    margin: 10px;
}

.img-gallery {
    max-height: 12rem;
    max-width: 20rem;
}
</style>