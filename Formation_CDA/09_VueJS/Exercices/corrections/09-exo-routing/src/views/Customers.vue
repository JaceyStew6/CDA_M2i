<style scoped>

.addmargin {
    margin-top: 10px;
    margin-bottom: 10px;
}

.vue-logo-back {
    background-color: black;
}

</style>

<template>

<div class="home">
    <div class="vue-logo-back">
        <img src="../assets/vue.svg" width="100px" height="100px">
    </div>
    <div class="col-md-6 centeralign mt-4">
        <h1>Cette page affiche la liste des clients</h1>
        <p>Cliquer sur une carte affiche le nom en dessous.</p>
        <p>Cliquer sur 'Plus de détails' redirige vers une nouvelle page qui affiche les informations du client</p>
        <div class="card centeralign addmargin" style="width: 18rem;" v-for="customer in customerlist" :key="customer.id">
            <div class="card-body" v-on:click="setSelectedCustomer(customer.name)">
                <h5 class="card-title">{{customer.name}}</h5>
                <p class="card-text">{{customer.email}}</p>
                <p class="card-text">{{customer.phone}}</p>

                <a class="btn btn-primary" @click="goToDetailsPage(customer.id, $event)">
    <span style="color:white">Cliquer pour plus de détails</span>
</a>
            </div>
        </div>
    </div>
    <Display v-if="selectedCustomer!=''" :selectedCustomer="selectedCustomer" />
</div>

</template>

<script setup>
import { ref, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import Display from '../components/Display.vue';
import axios from 'axios';

const customerlist = ref([]);
const selectedCustomer = ref('');
const router = useRouter(); 

onMounted(async () => {
    try {
        const response = await axios.get("/assets/samplejson/customerlist.json");
        customerlist.value = response.data;
        console.log(response.data);
    } catch (error) {
        console.error(error);
    }
});

const setSelectedCustomer = (name) => {
    selectedCustomer.value = name;
};

const goToDetailsPage = (id, event) => {
    event.preventDefault(); 
    router.push("/customerdetails/" + id);
};
</script>


