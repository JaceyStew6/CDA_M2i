<script setup>
import {inject} from 'vue';
import {useRoute, useRouter} from 'vue-router';

const {customers} = inject('customers');

const route = useRoute();
const router = useRouter();

const {customerId} = route.params

const customerFound = customers.value.find(c=>c.id === customerId);

if(!customerFound){
    router.push('/not-found')
}

</script>

<template>
<h1>Détails clients</h1>

<div>
    <h3>{{ customerFound?.name }}</h3>
    <ul>
        <li>Name : {{ customerFound?.name }}</li>
        <li>Email : {{ customerFound?.email }}</li>
        <li>Phone : {{ customerFound?.phone }}</li>
        <li>City : {{ customerFound?.city }}</li>
        <li>State : {{ customerFound?.state }}</li>
        <li>Country : {{ customerFound?.country }}</li>
        <li>Organization : {{ customerFound?.organization }}</li>
        <li>Job profile : {{ customerFound?.jobProfile }}</li>
        <li>Additional info : {{ customerFound?.additionalInfo }}</li>
    </ul>
</div>

</template>

<style scoped>

</style>