```powershell
# Je vérifie les images présentes
docker images

# Alpine est déjà présente, donc je crée un container tout en ouvrant le terminal Linux grâce à la commande -it
docker run -it alpine

# -------
# Avant d'ajouter Git, bien penser à mettre à jour le gestionnaire de packages
# -------

# J'ajoute git
apk add git

# -------
# Penser à se placer dans le répertoire souhaité avant de cloner le repo Git
# Exemple
cd /root
# -------

# Je clone mon repo Git 
git clone https://github.com/RoxanePouchain/Pokemon-App---React-Native.git

# Je me déplace dans le répertoire de mon projet
cd Pokemon-App---React-Native/

# J'ajoute Nano
apk add nano

# J'ouvre mon readme avec Nano, j'ajoute une ligne, sauvegarde avec ctrl+s et quitte avec ctrl+x
nano README.md

# J'importe le fichier modifié localement depuis le terminal Windows
docker cp relaxed_booth:/Pokemon-App---React-Native/README.md "C:\Users\Administrateur\Desktop"

## Bonus
# Nommer un container lors de sa création
docker run --name container_perso -it alpine ## Attention, toutes les options doivent se placer avant le nom de l'image
```