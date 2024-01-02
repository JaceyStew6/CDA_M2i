// useEpisodeStore.js
import { defineStore } from 'pinia';
import { ref } from 'vue';
import axios from 'axios';

export const useLocationStore = defineStore('location', () => {
  const locations = ref([]);
  const isLoading = ref(false);
  const fetchLocations = async () => {
    isLoading.value = true;
    try {
      const response = await axios.get('https://rickandmortyapi.com/api/location');
      locations.value = await Promise.all(response.data.results.map(async location => {
        const characters = await Promise.all(
          location.residents.map(url => axios.get(url))
        );
        location.residents = characters.map(res => res.data);
        console.log( location.residents);
        return location;
      }));
    } catch (error) {
      console.error('Error fetching locations:', error);
    }finally{
        isLoading.value = false;
    }
  };

  return { locations, isLoading, fetchLocations };
});
