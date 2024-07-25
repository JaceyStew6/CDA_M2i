<script setup>
</script>

<template>
  <main>
    <div class="full">
      <img src="/pictures/homeview/DSC05276-LR PS-1920x555.jpg" alt="photo d'illustration" class="main-pic">

      <article>
        <h2>Photographe pour chiens, chats et NAC dans le Nord-Pas-de-Calais</h2>
        <p>Je vous propose des séances photo pour sublimer votre animal et immortaliser le lien qui vous unit à lui</p>
        <RouterLink to="/tarifs" class="btn-tarifs btn">En savoir plus...</RouterLink>
      </article>
    </div>
  </main>
</template>

<style scoped>
img {
  max-width: 100%;
  height: auto;
}

article {
  display: flex;
  flex-direction: column;
  font-size: 22px;
  height: auto;
  text-align: center;
  padding-top: 1.5rem;
  align-items: center;
}

article h2 {
  font-size: 36px;
  font-weight: 500;
  margin-bottom: 1rem;
}

article p {
  margin: 1rem;
}

.btn-tarifs {
  color: var(--vt-c-white-mute);
  background-color: var(--background-black-mute);
  width: 10rem;
  margin: 1.5rem;
  border: 1px solid var(--vt-c-white-mute);
}

@media only screen and (max-width: 624px) {
  .full {
    text-align: center;
  }

  img {
    height: 500px;
    object-fit: cover;
    object-position: -380px;
  }
}

@media only screen and (min-width: 624px) {
  img {
    height: 555px;
    object-fit: cover;
    object-position: -260px;
  }
}

@media only screen and (min-width: 1000px) {
  img {
    height: 555px;
    object-fit: cover;
    object-position: left;
  }
}

@media only screen and (min-width: 1900px) {
  img {
    width: 100%;
    height: 100%;
  }
}
</style>