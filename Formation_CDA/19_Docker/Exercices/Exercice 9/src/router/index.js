import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue';
import AboutView from '../views/AboutView.vue';
import ContactView from '../views/ContactView.vue';
import PortfolioView from '../views/PortfolioView.vue';
import PageNotFoundView from '../views/PageNotFoundView.vue';
import PriceView from '../views/PriceView.vue';
import FAQView from '../views/FAQView.vue';
import CopyrightsView from '../views/CopyrightsView.vue'
import CGVView from '../views/CGVView.vue'



const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: HomeView },
    { path: '/accueil', component: HomeView, redirect:'/'},
    { path: '/portfolio', component: PortfolioView },
    { path: '/tarifs', component: PriceView },
    { path: '/faq', component: FAQView },
    { path: '/a-propos', component: AboutView },
    { path: '/contact', component: ContactView },
    { path: '/copyrights', component: CopyrightsView },
    { path: '/conditions-generales-de-vente', component: CGVView },
    { path: '/not-found', component: PageNotFoundView },
  ],
});

export default router;