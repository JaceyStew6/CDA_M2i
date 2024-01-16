# Borne de chargement de titre de transport Navigo

## Question 1: Pour charger son titre, le client dépose son titre et suit les instructions indiquées. Quel est l'acteur et l'action dans ce cas d'utilisation?

Acteur: client  
Action: charger pass Navigo

## Question 2: Jojo, dont le métier est technicien à la RATP, veut charger le Navigo de son fils. Pour modéliser cette activité de Jojo, doit-on définir un nouvel acteur?

Non, ça fait de lui un client.

## Question 3: Lorsque Jojo vient avec ses outils pour réparer la borne en cas de panne, est-il considéré comme un nouvel acteur? Comment modélise-t-on cela?

**Clients**  (Acteur)  
- Charger pass Navigo  
    - poser carte  
    - choisir forfait  
    - valider forfait  
    - payer  
        - carte bancaire -> banque  
        - espèces

**Techniciens** (Acteur)

- Réparer la borne
    - Utiliser des outils
    - Teste la borne


## Question 4: Certains agents RATP qui ne sont pas des techniciens sont aussi qualifiés pour opérer des opérations de maintenance en plus des opérations habituelles des techniciens telle que le remplacement de certaines pièces et produits. Ils sont donc techniciens en plus d'être agents. Comment modéliser cela?

**technicien (spécialisation)-> agent**
- Réparer la borne
    - Utiliser des outils
    - Teste la borne

- plus

    - Remplacement de pièces
    - Remplacement de produits

