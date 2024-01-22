# Introduction au module `path` de Node.js

Le module `path` est un module intégré au coeur de Node.js (*vous n'avez donc pas à l'installer via NPM*) qui fournit des utilitaires pour travailler avec les chemins de fichiers et de répertoires de manière portable, indépendante de la plateforme.

Il simplifie la manipulation des chemins en fournissant des méthodes pour construire, analyser et transformer des chemins de fichiers.

Lorsque vous travaillez avec des fichiers et des répertoires dans une application Node.js, il est essentiel de prendre en compte les différences entre les systèmes d'exploitation en ce qui concerne la manière dont les chemins sont représentés. Certains systèmes utilisent des barres obliques (`/`), tandis que d'autres utilisent les anti-slashs (`\`). De plus, la gestion des caractères spéciaux et des chemins absolus ou relatifs peut varier.