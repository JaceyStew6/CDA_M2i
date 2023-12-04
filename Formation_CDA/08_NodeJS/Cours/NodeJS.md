# NodeJS


Javascript côté serveur. Construit sur le moteur Javascript V8 de Google Chrome.
Principalement utilisé pour créer des serveurs web.

A la base, le code JS n'était que dans le navigateur. 

NodeJS est single thread. Une appli NodeJS ne s'exécute que dans un seul processus.

Pour se rendre dans node, on inscrit `node` dans notre terminal et on arrive directement sur node. 
Si on rentre la commande `node --version`.

On peut faire du JS directement dans la console, définir des fonctions, des variables...

Faire aussi attention à la version du npm. Commande `npm --version`.
npm est un gestionnaire de package pour NodeJS.
Les packages sont disponibles sur le site npmjs.com

Pour quitter node dans le terminal:   CTRL + D


Pour initialiser un projet en NodeJS:
`npm init`
ou 
`npm init -y`


Pour installer un package: 
`npm install nomDuPackage`

Les packages peuvent être trouvés sur npmjs.com notamment.

Attention!!! Quand on fait un repository, il faut absolument **ignorer les modules nodeJS**. Il faut donc les inclure dans le `.gitignore