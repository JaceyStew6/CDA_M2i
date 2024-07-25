<script setup>

</script>

<template>
    <main>
        <h1 class="titre-a-propos">A propos</h1>
        <div class="photo-portrait">
            <img src="\public\pictures\aPropos\PhotopresentationCarree.jpg" alt="Photo portrait">
        </div>
        <div class="about-desc">
            <p>Je m'appelle Morgane,<br> je pratique la photographie depuis 2013.<br><br> Passionnée par les animaux depuis
                mon plus jeune âge, j'ai naturellement choisi de me spécialiser dans la photographie animalière.<br>
                J'ai commencé par sillonner champs et forêts pour photographier des animaux sauvages, avant de tourner
                mon objectif vers les animaux domestiques.<br> Ils nous apportent tant et j'ai à cœur de leur rendre
                hommage par des photos qui reflètent leur personnalité singulière.</p>
        </div>
        <div class="photo-credit">
            <p>Crédit photographie: Alice Petit</p>
        </div>
    </main>
</template>



<style scoped>
body {
    height: auto;
}

main {
    display: flex;
    flex-direction: column;
    /* min-height: 90vh; */
    /* border-top: solid 1px rgba(169, 169, 169, 0.726); */
}

.titre-a-propos {
    text-align: center;
    margin-top: 2rem;
    margin-bottom: 2rem;
    font-size: 36px;
}

.photo-portrait {
    margin-top: 3rem;
    margin-bottom: 2rem;
    text-align: center;
}

img {
    min-width: 150px;
    width: 15%;
    border-radius: 50%;
}

.about-desc {
    margin-top: 2rem;
    text-align: center;
}

.photo-credit {
    margin-top: 5%;
    /* margin-bottom: 5%; */
    text-align: center;
}


@media only screen and (max-width: 624px) {
    .about-desc {
        margin-left: 2rem;
        margin-right: 2rem;
        font-size: 16px;
    }
}

@media only screen and (min-width: 624px) {
    .about-desc {
        margin-left: 5rem;
        margin-right: 5rem;
        font-size: 16px;
    }
}

@media only screen and (min-width: 1000px) {
    .about-desc {
        margin-left: 10rem;
        margin-right: 10rem;
        font-size: 18px;
    }
}

</style>