# Exercice 7

Comme pour l'exercice 6 on souhaite créer un dockerfile mais qui cette fois-ci ira chercher le projet web sur github si vous n'avez pas de repo public contenant un projet web vous pouvez utiliser https://github.com/withaarzoo/3D-Rotate-Tube .

## Solution

```dockerfile
# Image choisie: httpd (apache)

# Mon Dockerfile


# Créer le dockerfile
docker build -t mygitproject .

# Commande pour tester l'image (prise dans la doc httpd)
docker run -dit --name my-git-app -p 8085:80 mygitproject

```