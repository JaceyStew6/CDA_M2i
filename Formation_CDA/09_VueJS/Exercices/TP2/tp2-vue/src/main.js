import './assets/main.css'

import { createApp, ref } from 'vue'
import App from './App.vue'
import router from './router'
import 'bootstrap/dist/css/bootstrap.min.css'
import { v4 as uuid } from 'uuid'


const customers = ref([
    {
        id: 1,
        name: "John Smith",
        email: "jsmith@test.com",
        phone: "123456789",
        city: "bangalore",
        state: "karnataka",
        country: "India",
        organization: "Company 1",
        jobProfile: "Software Developer",
        additionalInfo: "Ce client a acheté de nombreux produits auparavant et est un client de haute valeur"
    },
    {
        id: 2,
        name: "Thomas Pierre",
        email: "thomas@test.com",
        phone: "987654321",
        city: "Lille",
        state: "Nord",
        country: "France",
        organization: "Company 2",
        jobProfile: "Software Developer",
        additionalInfo: "Achète des produits rarement."
    },
    {
        id: 3,
        name: "Tyrion",
        email: "tyrion@test.com",
        phone: "123412345",
        city: "Porto",
        state: "Sulo",
        country: "Portugal",
        organization: "Company 3",
        jobProfile: "Software Developer",
        additionalInfo: "Achète généralement beaucoup de produits."
    },
])

const app = createApp(App);
app.provide("customers", {
    customers
});

app.use(router);
app.mount("#app");