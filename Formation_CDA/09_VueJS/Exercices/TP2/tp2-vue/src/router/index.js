import { createRouter, createWebHistory } from "vue-router";
import CustomerView from '../views/CustomerView.vue';
import CustomerDetails from '../views/CustomerDetails.vue';
import NotFoundView from '../views/NotFoundView.vue';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {path: '/', component : CustomerView},
        {path: '/:pathMatch(.*)', redirect : '/not-found'},
        {path: '/not-found', component : NotFoundView},
        {path: '/customer', component : CustomerView},
        {path: '/customer/:customerId', component : CustomerDetails}
    ]
});

export default router;