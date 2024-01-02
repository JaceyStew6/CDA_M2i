<template>
  <!-- Teleport pour déplacer le contenu modal à un endroit spécifique dans le DOM, souvent pour gérer les z-index ou pour s'assurer qu'il est hors de certaines limites de container -->
  <teleport to=".modals-container">
    <!-- Section du modal qui s'affichera par-dessus le reste du contenu de l'application -->
    <section class="modal-background absolute p-3 z-10 top-0 left-0 w-full h-full text-gray-600 bg-white bg-opacity-70 flex justify-center items-center">
      <!-- Lien pour fermer le modal, appelant closeModal() -->
      <a ref="characterModalRef" href="" @click.prevent="closeModal()">
        <!-- Container pour le contenu du modal, centré et stylisé -->
        <div class="modal-container p-3 sm:p-5 fixed top-1/2 left-1/2 -translate-y-1/2 -translate-x-1/2 max-w-xs w-full sm:max-w-3xl flex flex-col sm:flex-row rounded-md border border-gray-200 bg-white drop-shadow-2xl">
          <!-- Image du personnage -->
          <img class="object-cover object-center rounded drop-shadow-md" :src="character.image" alt="character">
          <!-- Détails du personnage -->
          <div class="py-2 sm:py-0 sm:pl-8 sm:pr-28">
            <!-- Nom du personnage -->
            <h2 class="text-3xl sm:text-4xl font-semibold mt-2 sm:mt-0 sm:mb-3">{{ character.name }}</h2>
            <!-- Boucle pour afficher les détails clés du personnage -->
            <div v-for="key in characterKeysFiltered" :key="key" class="text-md">
              <span class="text-green-500 capitalize">{{ key[0] }} :</span>
              <span>{{ key[1] === '' ? '-' : key[1] }}</span>
            </div>
          </div>
          <!-- Bouton de fermeture du modal -->
          <div class="h-7 w-7 sm:h-6 sm:w-6 sm:text-xs rounded-full absolute top-5 right-5 flex justify-center items-center border border-gray-300 bg-gray-50 shrink-0">
            <i class="fa-solid fa-x text-gray-500"></i>
          </div>
        </div>
      </a>
    </section>
  </teleport>
</template>

<script setup>
import { onClickOutside } from '@vueuse/core';
import { ref } from 'vue';

// Définition des props reçues par le composant.
const props = defineProps({
  character: {
    type: Object,
    required: true
  },
  characterModal: {
    type: Boolean,
    default: false
  }
})

// Permet au composant d'émettre des événements pour mettre à jour la prop 'characterModal'.
const emit = defineEmits(['update:characterModal'])

// Fonction pour fermer le modal en émettant un événement pour modifier 'characterModal'.
const closeModal = () => {
  emit('update:characterModal', false)
}

// Référence à l'élément du modal pour détecter les clics en dehors de celui-ci.
const characterModalRef = ref(null)

// Utilisation de onClickOutside de VueUse pour fermer le modal lors d'un clic en dehors de celui-ci.
onClickOutside(characterModalRef, () => closeModal())

// Filtrer et transformer les clés pertinentes du personnage pour l'affichage.
const characterKeys = ref(['status', 'species', 'type', 'gender', 'created', 'origin', 'location'])
const characterKeysFiltered = [];
for (const [key, value] of Object.entries(props.character)) {
  if (characterKeys.value.includes(key)) {
    characterKeysFiltered.push([key, value]);
    console.log(characterKeysFiltered);
  }
}

// characterKeysFiltered contient maintenant les paires [clé, valeur] filtrées.
characterKeysFiltered.forEach(i => {
  console.log(i[0], i[1]);
  if(i[0] === 'origin' || i[0] === 'location') {
    i[1] = i[1].name // Remplacer l'objet par le nom pour 'origin' et 'location'.
  }
})

// Formatage de la date de création du personnage.
let characterCreationDate = new Date(characterKeysFiltered.filter(el => el[0] === 'created')[0][1])
console.log(characterCreationDate);
characterCreationDate = new Intl.DateTimeFormat('fr-FR', {
  year: "numeric",
  month: "long",
  day: "numeric",
  hour: "numeric",
  minute: "numeric"
}).format(characterCreationDate)
characterKeysFiltered.filter(el => el[0] === 'created')[0][1] = characterCreationDate
</script>
