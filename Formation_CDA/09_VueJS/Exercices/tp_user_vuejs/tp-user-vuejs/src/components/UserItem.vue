<script setup>
import { ref, defineProps } from 'vue';

const props = defineProps({
    username: {
        type: Text,
        required: true,
    },
    email: {
        type: Text,
        required: true,
    },
    index: {
        type: Number,
        required: true,
    }
})

</script>

<template>

<li>
    <div>
       <tr>
        <td>{{ username }}</td>
        <td>{{ email }}</td>
       </tr> 
    </div>
    <div>
        <button>Edit</button>
        <button>Delete</button>
    </div>
</li>

</template>

<style scoped>

</style>