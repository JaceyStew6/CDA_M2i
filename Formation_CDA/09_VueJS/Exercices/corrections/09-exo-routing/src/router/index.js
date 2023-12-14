import { createRouter, createWebHistory } from 'vue-router';
import Customers from '../views/Customers.vue';
import CustomerDetails from '../views/CustomerDetails.vue';

const routes = [
  {
    path: '/',
    redirect: '/customers'
  },
  {
    path: '/customers',
    name: 'customers',
    component: Customers
  },
  {
    path: '/customerdetails/:id',
    name: 'customerdetails',
    component: CustomerDetails,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
