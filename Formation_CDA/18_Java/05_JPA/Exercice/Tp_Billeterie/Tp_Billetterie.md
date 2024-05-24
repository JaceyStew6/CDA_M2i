## Tp Billetterie

- Nous voulons créer une application de gestion de billets pour des évènements :

- nos classes seront :
    - adresse 
        - rue
        - ville 

   - Lieu (hérite de adresse) : 
        - capacité
    
   - billet :
        - numéros de place
        - client
        - Evenement
        - type de place (standard , gold, vip)


   - Evenement :
        - nom
        - lieu (One to one / embedded)
        - date
        - heure
        - nombre de place


  - Client 
        - nom
        - prénom
        - adresse (One to one / embedded)
        - age 
        - numéros de telephone


---
  
1. Réservation de Billets :

- Nos clients pourront réserver des billets pour différents événements, et chaque billet sera lié à un événement.

2. Gestion des Événements :

- Pour chaque événement, il sera possible de récupérer la liste des billets associés.

3. Interface Homme-Machine (IHM) :

- Nous souhaitons une interface utilisateur permettant de réaliser les opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) pour chaque entité.

4. Bonus : Vérification des Places Disponibles :

- Lors de la réservation d'un billet pour un événement, nous voulons vérifier si l'événement a encore des places disponibles.


