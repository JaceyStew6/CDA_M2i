<script setup>

</script>

<template>
    <header>
        <nav class="navbar">
            <img src="../../public/logo/Logo_mk3-blanc.svg" alt="">
            <ul>
                <li>
                    <RouterLink to="/">Accueil</RouterLink>
                </li>
                <li>
                    <RouterLink to="/portfolio">Portfolio</RouterLink>
                </li>
                <li>
                    <RouterLink to="/prestations">Prestations</RouterLink>
                </li>
                <li>
                    <RouterLink to="/a-propos">A propos</RouterLink>
                </li>
                <li>
                    <RouterLink to="/contact">Contact</RouterLink>
                </li>
            </ul>
        </nav>
    </header>
</template>

<style scoped>

nav {
    background-color: rgb(10, 140, 180);
    margin: 0;
    color: rgb(253, 249, 242);
    height: 5em;
    /* margin-bottom: 1rem; */
    font-size: 16px;
    padding: 1rem;
    /* margin-bottom: 10px; */
}

</style>