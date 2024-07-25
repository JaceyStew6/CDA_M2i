<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<template>
  <header>
    <nav class="navbar">
      <div class="entire-logo">
        <RouterLink to="/accueil"><img class="logo" src="/logo/Logo-blancV1.svg" alt="Logo" width="60">
        </RouterLink>
        <RouterLink to="/accueil"><img class="nom-entreprise" src="/logo/texte-blancV2.svg"
            alt="Nom de l'entreprise" width="250"></RouterLink>
      </div>
      <div class="navbar-links">
        <ul>
          <li>
            <RouterLink to="/accueil">Accueil</RouterLink>
          </li>
          <li>
            <RouterLink to="/portfolio">Portfolio</RouterLink>
          </li>

          <!-- Dropdown menu -->
          <li class="nav-item dropdown">
            <RouterLink class="nav-link dropdown-toggle" to="/" id="dropdown03" data-bs-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">Prestations</RouterLink>
            <div class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdown03">
              <RouterLink class="dropdown-item" to="/tarifs">Tarifs</RouterLink>
              <RouterLink class="dropdown-item" to="/faq">FAQ</RouterLink>
            </div>
          </li>


          <li>
            <RouterLink to="/a-propos">A propos</RouterLink>
          </li>
          <li>
            <RouterLink to="/contact">Contact</RouterLink>
          </li>
        </ul>
      </div>

    </nav>
  </header>
  <main oncontextmenu="return false">
    <RouterView />
  </main>

  <footer class="footer">
    <div class="footer-text">
      <span><svg xmlns="http://www.w3.org/2000/svg" width="12" height="12" fill="currentColor" class="bi bi-c-circle"
          viewBox="0 0 16 16">
          <path
            d="M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8m15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.146 4.992c-1.212 0-1.927.92-1.927 2.502v1.06c0 1.571.703 2.462 1.927 2.462.979 0 1.641-.586 1.729-1.418h1.295v.093c-.1 1.448-1.354 2.467-3.03 2.467-2.091 0-3.269-1.336-3.269-3.603V7.482c0-2.261 1.201-3.638 3.27-3.638 1.681 0 2.935 1.054 3.029 2.572v.088H9.875c-.088-.879-.768-1.512-1.729-1.512" />
        </svg> 2024 Morgane Kodalia - Morgane Wollenberg (EI) - </span>
      <span>
        <RouterLink to="/copyrights" class="footer-links">Mentions Légales</RouterLink>
      </span>
      <span> - </span>
      <span>
        <RouterLink to="/conditions-generales-de-vente" class="footer-links">CGV</RouterLink>
      </span>
    </div>
  </footer>
</template>

<style scoped>
.navbar {
  background-color: var(--background-black-soft);
  margin: 0;
  padding: 0;
  height: 5em;
  font-size: 16px;
}

nav ul {
  display: flex;
  margin-right: 3rem;
  margin-bottom: 0%;
}

nav ul li {
  flex-direction: row;
  list-style-type: none;
  font-size: 18px;
}

nav ul li a {
  color: var(--vt-c-white-soft);
  text-decoration: none;
}

.entire-logo {
  margin-left: 1rem;
}

.logo {
  margin-left: 2rem;
  margin-right: 2rem;
}

.nom-entreprise {
  margin-left: 1rem;
  margin-top: 5px;
}

.footer-links {
  text-decoration: none;
  color: var(--background-black-soft);
}

@media only screen and (max-width: 624px) {
  .navbar {
    height: 11em;
  }

  nav ul {
    padding-left: 0rem;
    padding-right: 0rem;
  }

  nav ul li a {
    padding-left: 0.5rem;
    padding-right: 0.5rem;
  }
}

/* Petits appareils (tablettes en mode portrait et grands téléphones, 600 pixels et plus) */
@media only screen and (min-width: 624px) {
  .navbar {
    height: 10em;
  }

  nav ul {
    padding-left: 1.5rem;
    padding-right: 1.5rem;
    margin-right: 0rem;
    margin-bottom: 0%;
  }

  nav ul li a {
    padding-left: 1.2rem;
    padding-right: 1.2rem;
  }
}

/* Appareils moyens (tablettes en mode paysage, 768 pixels et plus) */
@media only screen and (min-width: 768px) {
  nav ul li a {
    padding-left: 2rem;
    padding-right: 2rem;
  }
}

/*  Appareils larges (ordinateurs portables/ordinateurs de bureau, 992 pixels et plus) */
@media only screen and (min-width: 996px) {
  .navbar {
    height: 5em;
  }

  nav ul li a {
    padding-left: 1rem;
    padding-right: 1rem;
  }
}

/* Appareils trés larges (ordinateurs portables grands et ordinateurs de bureau, 1200 pixels et plus) */
@media only screen and (min-width: 1260px) {
  nav ul {
    margin-right: 2rem;
  }

  nav ul li a {
    padding-left: 2rem;
    padding-right: 2rem;
  }
}


.footer {
  display: flex;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  width: 100%;
  height: 3vh;
  color: var(--background-black-soft);
  background-color: var(--vt-c-white-soft);
  align-items: center;
  justify-content: center;
  font-size: small;
}</style>