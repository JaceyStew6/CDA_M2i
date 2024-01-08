- Employé
    - num_employe
    - nom_employe
    - prenom_employe
    - poste_employe

- Client
    - num_client
    - raison_sociale_client
    - localisation

- PME
    - SIRET
    - raison_sociale_PME
    - localisation

- Prestation
    - num_contrat
    - description_intervention
    - date_debut_intervention
    *Attention: données calculées donc pas dans MCD*
    - nbr_employes_prevus
    - nbr_jours_prestations

- Qualification
    - num_qualification
    - type_qualification
    - TJM


**Relations**

- **Un client demande une prestation**
- **Une PME fournit une prestation**
- **Une PME s'adresse à un ou plusieurs clients**
- **Une prestation est faite par un ou plusieurs employés**
- **Une prestation est faite en fonction d'une qualification**
- **Un employé a une qualification**
