<!-- PROJECT SHIELDS -->
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
    <img src="./Logo Polar Fox Games.png" alt="Logo" width="80" height="80">

  <h3 align="center">Project Management Application</h3>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

![Interface Screenshot][interface-screenshot]

As part of a study project, we were asked to create a complete application, connecting a backend to a frontend.

It is a project management application that allows users to create, manage and track the progress of different projects and related tasks. The application includes a user interface that communicates with a backend via a REST API. The backend stores data in a relational database.

### Built With

Front-end languages and tools

* [![Vue][Vue.js]][Vue-url]
* [![HTML][Html.dev]][Html-url]
* [![CSS][CSS.dev]][CSS-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]

Back-end languages and tools

* [![Node][Node.js]][Node-url]
* [![Express][Express.js]][Express-url]
* [![Sequelize][Sequelize.js]][Sequelize-url]
* [![MySQL][MySql]][MySQL-url]


## Getting Started

### Prerequisites

You should first install Node Package Manager on your device
* npm
  ```sh
  npm install npm@latest -g
  ```

### Installation

_Below is how you can import the project and configure it._

1. Clone the repo
   ```sh
   git clone https://github.com/JaceyStew6/Project-Management-Application.git
   ```
2. Install NPM packages for both back-end and front-end parts
   ```sh
   npm install
   ```

3. Install Nodemon for the API, which will enables to automatically restarting the node application when file changes in the directory are detected

   ```sh
   npm install -g nodemon
   ```

For the back-end (API) part, you should have those packages installed in you node_module folder :
```json
  "dependencies": {
    "bcrypt": "^5.1.1",
    "express": "^4.18.2",
    "jsonwebtoken": "^9.0.2",
    "mysql2": "^3.9.1",
    "sequelize": "^6.36.0"
  }
```
For the front-end part, you should have those packages installed in you node_module folder :

```json
  "dependencies": {
    "axios": "^1.6.7",
    "bootstrap": "^5.3.2",
    "pinia": "^2.1.7",
    "vue": "^3.4.15",
    "vue-router": "^4.2.5"
  }
```
_The dependencies can be found in the `package.json` file_.


4. Link your database to the API in the file `config/db.js`
```js
const sequelize = new Sequelize("your_bdd", "root", "password", {
    host: "localhost",
    dialect: "mysql",
});
```

5. Run the API
```sh
npm start
```

5. Run the front-end interface
```sh
npm run dev
```

6. Compile and Minify front-end for Production
```sh
npm run build
```

## Contact

Project Link: [https://github.com/JaceyStew6/Project-Management-Application.git](https://github.com/JaceyStew6/Project-Management-Application.git)





<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/p-roxane/
[interface-screenshot]: ./Documentation%20projet/Captures%20d'ecran/Auth-view.png
<!-- front-end links -->
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Html.dev]:   https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white
[Html-url]: https://developer.mozilla.org/fr/docs/Web/HTML
[CSS.dev]: https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white
[CSS-url]: https://developer.mozilla.org/fr/docs/Web/CSS
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
<!-- back-end links -->
[Node.js]: https://img.shields.io/badge/Node.js-43853D?style=for-the-badge&logo=node.js&logoColor=white
[Node-url]: https://nodejs.org/en
[Express.js]:  https://img.shields.io/badge/Express.js-404D59?style=for-the-badge
[Express-url]: https://expressjs.com/fr/
[Sequelize.js]: https://img.shields.io/badge/sequelize-323330?style=for-the-badge&logo=sequelize&logoColor=blue
[Sequelize-url]: https://sequelize.org/
[MySql]: https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white
[MySQL-url]: https://www.mysql.com/fr/