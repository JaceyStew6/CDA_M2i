## Indispensable avant la programmation:

- Apprendre les concepts de base de la programmation et des algorithmes


## Variables

- Type numérique (entier ou réel):
    - Quand on débute, on évite les types de variable optimisés. On évite les bytes et entiers courts pour les variables de type numérique. Préférer un **entier long**.
- Type logique ou booléen: deux valeurs Vrai ou Faux
- Type caractère: lettre majuscule, minuscule, chiffres, symboles...
- Type chaîne de caractère: toute suite de caractères (qu'on place entre guillemets "").

## Déclaration de variables

- Une variable doit être **déclarée** au préalable (déclarer une variable = réserver un espace mémoire au préalable dans l'ordinateur. ex: `var nb1`).

- Pour le pseudo-code, on déclare une variable suivant le forme suivante:
`Variables  liste d'identificateur : type`

En pseudo-code l'affectation se note avec le signe <- .  
`var <- e` attribue la valeur e à la variable.

Une **affectation** a pour but d'attribuer une valeur à une variable déclarée au préalable.

**ATTENTION: Pour éviter tout problème, il est préférable d'initialiser les variables déclarées (faire une déclaration + une affectation).**

---

### Exercices (avec Algobox): 

*Ecrire un algorithme qui demande un nombre entier à l'utilisateur, puis qui teste et affiche s'il est divisible par 3*

```bash
FONCTIONS_UTILISEES
VARIABLES
A EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Entrer un nombre entier"
LIRE A
SI (A%3==0) ALORS
	DEBUT_SI
		AFFICHER "divisible"
	FIN_SI
		
	SINON
		DEBUT_SI
		AFFICHER "non divisible"
	FIN_SI
FIN_ALGORITHME
```


*Ecrivez un algorithme qui demande à l'utilisateur le nombre de photocopies effectuées, qui calcule et affiche le prix à payer.*

```bash
FONCTIONS_UTILISEES
VARIABLES
nbCopies EST_DU_TYPE NOMBRE
prixTotal EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Entrer le nombre de copies souhaitées:"
LIRE nbCopies
SI (nbCopies<10) ALORS
	DEBUT_SI
		 prixTotal PREND_LA_VALEUR 0.5*nbCopies
	FIN_SI
		
	SINON
		SI (nbCopies>=9 ET nbCopies<21) ALORS 
			DEBUT_SI
				 prixTotal PREND_LA_VALEUR 0.4*nbCopies
			FIN_SI
		SINON	
			SI (A>20) ALORS
			DEBUT_SI
				 prixTotal PREND_LA_VALEUR 0.3*nbCopies
			FIN_SI		
AFFICHER "Le prix total est de "
AFFICHER prixTotal
FIN_ALGORITHME
```

---

### Schématisation

Variables   
	+ Opérateurs  
    
		- arithmétiques
		- logiques
		- comparaison
		- concaténation

Structures conditionnelles  

	- Si ...(condition) alors   
	instructions  
	(option) Sinon



---

### Exercices

*Déterminer le montant d'un capital c placé à un taux fixe t pendant un nombre d'années. On sippose que c, t, n sont lus.*

```bash
FONCTIONS_UTILISEES

VARIABLES
c EST_DU_TYPE NOMBRE
t EST_DU_TYPE NOMBRE
n EST_DU_TYPE NOMBRE
s EST_DU_TYPE NOMBRE
gain EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Indiquez la somme investie:"
LIRE c
AFFICHER "Indiquez le taux fixe en pourcentage:"
LIRE t
AFFICHER "Indiquez le nombre d'années:"
LIRE n

s PREND_LA_VALEUR c*pow(1+t/100,n)
AFFICHER "Votre capital actuel est de "
AFFICHERCALCUL round(s)
AFFICHER " euros"

gain PREND_LA_VALEUR s-c

SI (gain<0) ALORS
	DEBUT_SI
		 AFFICHER "Vous enregistrez une baisse de capital de "
		 AFFICHER gain
		 AFFICHER " euros"
	FIN_SI
		
	SINON
		SI (gain==0) ALORS 
			DEBUT_SI
				 AFFICHER "Vous êtes à l'équilibre"
			FIN_SI
		SINON	
			SI (gain>0) ALORS
			DEBUT_SI
				AFFICHER "Vous enregistrez un gain de capital de "
		 		AFFICHER gain
			 	AFFICHER " euros"
			FIN_SI	

FIN_ALGORITHME
```


*Ecrire un algorithme qui demande l'age d'un enfant à un utilisateur pour l'informer ensuite sur sa catégorie de licence sportive.*

```bash
FONCTIONS_UTILISEES

VARIABLES
ageEnfant EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME
AFFICHER "Indiquez l'âge de votre enfant"
LIRE ageEnfant


SI (ageEnfant>=3 ET ageEnfant<=6) ALORS
	DEBUT_SI
		 AFFICHER "Catégorie Baby"
	FIN_SI
		
	SINON
		SI (ageEnfant>=7 ET ageEnfant<=8) ALORS 
			DEBUT_SI
				 AFFICHER "Catégorie Poussin"
			FIN_SI
		SINON	
			SI (ageEnfant>=9 ET ageEnfant<=10) ALORS 
			DEBUT_SI
				 AFFICHER "Catégorie Pupille"
			FIN_SI
			
			SINON
		SI (ageEnfant>=11 ET ageEnfant<=12) ALORS 
			DEBUT_SI
				 AFFICHER "Catégorie Minime"
			FIN_SI
		SINON	
			SI (ageEnfant>=13) ALORS 
			DEBUT_SI
				 AFFICHER "Catégorie Cadet"
			FIN_SI

FIN_ALGORITHME
```