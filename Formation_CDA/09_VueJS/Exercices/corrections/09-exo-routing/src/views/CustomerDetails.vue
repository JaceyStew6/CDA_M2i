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
    <div class="vue-logo-back mt-4">
        <img src="/assets/vue.svg" width="100px" height="100px">
    </div>
    <div class="card" v-if="customerDetails.id">
        <div class="card-header">
          <h1> Details Clients</h1> 
        </div>
        <div class="card-body">
            <h5 class="card-title">{{customerDetails.name}}</h5>
            <p class="card-text">Name : {{customerDetails.name}}</p>
            <p class="card-text">Email : {{customerDetails.email}}</p>
            <p class="card-text">Phone : {{customerDetails.phone}}</p>
            <p class="card-text">City : {{customerDetails.city}}</p>
            <p class="card-text">State : {{customerDetails.state}}</p>
            <p class="card-text">Country : {{customerDetails.country}}</p>
            <p class="card-text">Organization : {{customerDetails.organization}}</p>
            <p class="card-text">Job Profile : {{customerDetails.jobProfile}}</p>
            <p class="card-text">Additional Info : {{customerDetails.additionalInfo}}</p>
            <a v-on:click="goToMainPage()" class="btn btn-primary"><span style="color:white">Go Back</span></a>
        </div>
    </div>


</div>

</template>

<script setup>
import { ref, onMounted } from 'vue';
import { useRouter, useRoute } from 'vue-router';
import axios from 'axios';

const customerDetails = ref({});
const router = useRouter();
const route = useRoute();

onMounted(async () => {
    try {
      console.log();
        const response = await axios.get("/assets/samplejson/customer" + route.params.id + ".json");
        console.log(response.data);
        customerDetails.value = response.data;
    } catch (error) {
        console.error(error);
    }
});

const goToMainPage = () => {
    router.push("/customers");
};
</script>