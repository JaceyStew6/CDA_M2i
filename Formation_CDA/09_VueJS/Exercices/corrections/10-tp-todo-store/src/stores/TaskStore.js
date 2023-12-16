import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useTaskStore = defineStore('taskStore', () => {
  const tasks = ref([]);
  const filter = ref('all');

  const favs = computed(() => tasks.value.filter(t => t.isFav));
  const favCount = computed(() => tasks.value.reduce((p, c) => c.isFav ? p + 1 : p, 0));
  const totalCount = computed(() => tasks.value.length);
  const getTasksByFilter = computed(() => {
    if (filter.value === 'favs') {
      return favs.value;
    }
    return tasks.value;
  });

  function setTasks(newTasks) {
    tasks.value = newTasks;
  }

  function setFilter(newFilter) {
    filter.value = newFilter;
  }

  function addTask(task) {
    tasks.value.push(task);
  }

  function deleteTask(id) {
    tasks.value = tasks.value.filter(t => t.id !== id);
  }

  function toggleFav(id) {
    const task = tasks.value.find(t => t.id === id);
    if (task) {
      task.isFav = !task.isFav;
    }
  }


  function getTasks() {
    return tasks.value;
  }

  return { tasks, filter, favs, favCount, totalCount, getTasksByFilter, setTasks, setFilter, addTask, deleteTask, toggleFav, getTasks };
});
