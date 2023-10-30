# Le CLI (Interface en Ligne de Commandes)

Le CLI, ou interface en ligne de commandes, est une méthode d'interaction avec un ordinateur ou un système informatique en utilisant des commandes textuelles plutôt que des interfaces graphiques. Au lieu de cliquer sur des icônes et de naviguer à travers de menus, vous saisissez des commandes spécifiques dans une fenêtre de terminal pour effectuer des actions.

## Avantages du CLI

1. **Efficacité:** Le CLI peut être bien plau rapide pour accomplir des tâches spécifiques une fois que vous en maitrisez les commandes.

2. **Automatisation:** Les scripts et les automatisations peuvent être créés plus facilement en utilisant les commandes CLI, ce qui est fondammental pour les tâches répétitives.

3. **Environnements distants:** Vous pouvez utiliser le CLI pour intéragir avec des systèmes distants via des connexions réseau, ce qui peut être difficile voire impossible depuis une interface graphique.

4. **Précision des contrôles:** Le CLI offre souvent un contrôle plus précis sur les paramètres et les options lors de l'exécution de commandes.

## Principaux éléments du CLI:

1. **Terminal:** C'est l'interface qui vous permet de saisir des commandes. Les systèmes d'exploitation tels que Linux, MacOS et Windows ont tous leur propre terminal. 

2. **Commandes:** Ce sont les instructions que vous saisissez dans le terminal pour effectuer différentes actions. Les commandes peuvent être simples (comme `ls` pour lister les fichiers) ou complexes (`git pull origin main` pou rmettre à jour un dépot git).

3. **Options et arguments:** Les commandes peuvent être suivies d'options et d'arguments pour personnaliser leur comportement. Les options sont généralement précédées d'un tiret court (comme `-l` pour obtenir une liste détaillée) et les arguments sont les valeurs spécifiques que vous fournissez à la commande.

## Exemples de commandes CLI:

- `ls` (Linux/Mac) ou `dir` (Windows): Liste les fichiers et dossiers de notre répertoire courant
- `pwd` permet de savoir le répertoire courant où l'on se trouve dans le cas où notre terminal ne l'indique pas.
- `cd` change le répertoire courant.
    - On utilise `cd ..` pour revenir dans le dossier parent
    - On utilise la touche TAB pour auto-compléter les noms de fichiers/dossiers.
- `mkdir` crée un nouveau dossier. (par exemple: `mkdir MonDossier`)
-  `rm` (Linux/Mac), `rmdir` ou `del` (Windows): supprime des dossiers ou des fichiers.
    - l'option `-r` (recursive) ajoutée à la commande `rm` permet de supprimer non seulement le répertoire spécifié, mais aussi tous les fichiers et sous-répertoires qu'il contient.
- `cp` (linux/Mac) ou `copy` (Windows): copie des fichiers ou des dossiers.
    - Cette commande nécessite deux arguments:
        - 1er argument: nom du fichier
        - 2ème argument: sa destination.
- `mv` (Linux/Mac) ou `move` (Windows): déplace des fichiers ou des dossiers. Nécessite deux arguments (les mêmes que pour `cp`).
    - Cette commande peut aussi servir à renommer un dossier ou un fichier si mon deuxième argument est un nom de fichier à la place d'une destination.
- `touch` (Linux/Mac) suivi du nom du fichier pour créer un fichier (attention, on n'oublie pas l'extension de fichier). On peut créer facilement plusieurs fichiers de cette façon.

```bash
# Pour créer un ou plusieurs fichiers
touch fichier1.txt fichier2.txt
```


- Pour Windows (mais cela marche également sur Mac et Linux), on utilise `echo . > nomdufichier.extension`

```powershell
# Pour créer un fichier
echo . > fichier1.txt
## Pour ajouter du texte à un fichier existant (un > remplace le texte existant, deux >> ajoute du texte à la suite de l'existant)
echo "texte" >> fichier1.txt
```