// useEpisodeStore.js
import { defineStore } from 'pinia';
import { ref } from 'vue';
import axios from 'axios';

export const useEpisodeStore = defineStore('episode', () => {
  const episodes = ref([]);
  const isLoading = ref(false);
  
  const fetchEpisodes = async () => {
    isLoading.value = true;
    try {
      const response = await axios.get('https://rickandmortyapi.com/api/episode');
      episodes.value = await Promise.all(response.data.results.map(async episode => {
        const characters = await Promise.all(
          episode.characters.map(url => axios.get(url))
        );
        episode.characters = characters.map(res => res.data);
        console.log( episode.characters);
        return episode;
      }));
    } catch (error) {
      console.error('Error fetching episodes:', error);
    }finally{
        isLoading.value = false;
    }
  };

  return { episodes, isLoading, fetchEpisodes };
});
