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

Les boucles  

	- while (tant que): on y répète les instructions tant qu'une certaine condition est réalisée
	- do while (jusqu'à): on y répète des instructions jusqu'à ce qu'une certaine condition soit réalisée
	- for (pour): on y répète des instructions en faisant évoluer un compteur entre une valeur initiale et une valeur finale



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

**Corrigé de l'exercice**

```bash
FONCTIONS_UTILISEES

VARIABLES
age EST_DU_TYPE NOMBRE
categorie EST_DU_TYPE CHAINE
DEBUT_ALGORITHME
AFFICHER "Indiquez l'âge de votre enfant"
LIRE age


SI (age < 3 ET age >= 18) ALORS
	DEBUT_SI
		 AFFICHER "Vous ne pouvez pas inscrire votre enfant"
	FIN_SI
	SINON
			DEBUT_SINON
			SI (age >= 3 ET age <= 6) ALORS
					DEBUT_SI
					categorie PREND_LA_VALEUR "baby"
					FIN_SI
					SINON
						DEBUT_SINON
						SI (age == 7 OU age == 8) ALORS
							DEBUT_SI
							categorie PREND_LA_VALEUR "poussin"
							FIN_SI
							SINON
									DEBUT_SINON
									SI (age == 9 OU age == 10) ALORS
										DEBUT_SI
										categorie PREND_LA_VALEUR "pupille"
										FIN_SI
										SINON
										 	DEBUT_SINON
										 	SI (age == 11 OU age ==12) ALORS
										 		DEBUT_SI
										 		categorie PREND_LA_VALEUR "minime"
										 		FIN_SI
										 		SINON
										 				DEBUT_SINON
										 				categorie PREND_LA_VALEUR "cadet"
										 				FIN_SINON
										 	FIN_SINON
									FIN_SINON
						FIN_SINON
					
			FIN_SINON

AFFICHER categorie	
	
FIN_ALGORITHME
```



* Ecrire un programme qui détermine la taille d'un vêtement en fonction du poids et de la taille*

```bash
FONCTIONS_UTILISEES

VARIABLES
taille EST_DU_TYPE NOMBRE
poids EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Indiquez votre taille en cm"
LIRE taille
AFFICHER "Indiquez votre poids en kg"
LIRE poids

SI ((poids < 43 OU poids > 77) OU (taille <145 OU taille >= 186)) ALORS
	DEBUT_SI
		 AFFICHER "Il n'y a aucune taille correspondante"
	FIN_SI

	SINON
		DEBUT_SINON
			SI (poids <= 47 ET taille < 172) ALORS
				DEBUT_SI
				AFFICHER "Taille 1"
				FIN_SI			
						
				SINON
					DEBUT_SINON
						SI (poids <= 47 ET taille >= 172) ALORS
							DEBUT_SI
							AFFICHER "Il n'y a aucune taille correspondante"
							FIN_SI
											
					SINON
						DEBUT_SINON
							SI (poids <= 53 ET taille < 169) ALORS
								DEBUT_SI
								AFFICHER "Taille 1"
								FIN_SI							
													
					SINON
						DEBUT_SINON
							SI (poids <= 53 ET taille < 183) ALORS
								DEBUT_SI
								AFFICHER "Taille 2"
								FIN_SI
													
					SINON
						DEBUT_SINON
							SI (poids <= 53 ET taille >= 183) ALORS
								DEBUT_SI
								AFFICHER "Il n'y a aucune taille correspondante"
								FIN_SI
														
					SINON
						DEBUT_SINON
							SI (poids <= 59 ET taille < 166) ALORS
								DEBUT_SI
								AFFICHER "Taille 1"
								FIN_SI
														
					SINON
						DEBUT_SINON
							SI (poids <= 59 ET taille < 178) ALORS
								DEBUT_SI
								AFFICHER "Taille 2"
								FIN_SI

					SINON
						DEBUT_SINON
							SI (poids <= 59 ET taille >= 178) ALORS
								DEBUT_SI
								AFFICHER "Taille 3"
								FIN_SI
																
																
					SINON
						DEBUT_SINON
							SI (poids <= 65 ET taille < 163) ALORS
								DEBUT_SI
								AFFICHER "Taille 1"
								FIN_SI
														
					SINON
						DEBUT_SINON
							SI (poids <= 65 ET taille < 175) ALORS
								DEBUT_SI
								AFFICHER "Taille 2"
								FIN_SI

					SINON
						DEBUT_SINON
							SI (poids <= 65 ET taille >= 175) ALORS
								DEBUT_SI
								AFFICHER "Taille 3"
								FIN_SI
																		
																		
					SINON
						DEBUT_SINON
							SI (poids <= 71 ET taille < 160) ALORS
								DEBUT_SI
								AFFICHER "Il n'y a aucune taille correspondante"
								FIN_SI
														
					SINON
						DEBUT_SINON
							SI (poids <= 71 ET taille < 172) ALORS
								DEBUT_SI
								AFFICHER "Taille 2"
								FIN_SI

					SINON
						DEBUT_SINON
							SI (poids <= 71 ET taille >= 172) ALORS
								DEBUT_SI
								AFFICHER "Taille 3"
								FIN_SI
							
					SINON
						DEBUT_SINON
							SI (poids <= 77 ET taille < 163) ALORS
								DEBUT_SI
								AFFICHER "Il n'y a aucune taille correspondante"
								FIN_SI

					SINON
						DEBUT_SINON
							SI (poids <= 77 ET taille >= 163) ALORS
								DEBUT_SI
								AFFICHER "Taille 3"
								FIN_SI
															
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
							FIN_SINON
					FIN_SINON
				FIN_SINON
		FIN_SINON
FIN_SINON

FIN_ALGORITHME
```
---   

## Structures itératives: les boucles


- **while** (tant que): on y répète les instructions tant qu'une certaine condition est réalisée. La condition est évaluée avant chae itération (et avant le passage dans le jeu d'instruction) et on va boucler tant que l'instruction est vraie. Il faut que la conditions soit évolutive pour ne pas tomber dans une boucle infinie.
- **do while** (jusqu'à): on y répète des instructions jusqu'à ce qu'une certaine condition soit réalisée (la condition est évaluée après chaque itération). On joue d'abord les instructions puis on rentre dans la condition (on boucle après avoir joué au moins une fois les instructions).
- **for** (pour): on y répète des instructions en faisant évoluer un compteur entre une valeur initiale et une valeur finale (le nombre d'itérations dans une boucle `for` est connu avant le début de la boucle). Un compteur est une variable qui doit être déclarée. Le **pas** est un entier qui peut être positif ou négatif (très souvent, on va le faire avancer par pas de 1)

### Exemple syntaxe pour la bloucle *for*  

***Pour** compteur **allant de** initiale à finale **par pas** valeur du pas  
instructions  
**FinPour***

---

### Exercice

*Ecrire un algortihme qui demande à l'utilisateur d'écrire un nombre compris entre 1 et 3 jusqu'à ce que la réponse convienne.*

```bash
FONCTIONS_UTILISEES

VARIABLES
n EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Ecrivez un nombre compris entre 1 et 3"
LIRE n

TANT_QUE (n<1 OU n>3) FAIRE
		DEBUT_TANT_QUE
			AFFICHER "Résultat non valide"
			LIRE n
		FIN_TANT_QUE	
	
AFFICHER n
	
FIN_ALGORITHME
```


*Déterminer combien d'années il faudra pour doubler le capital investi.*

```bash
FONCTIONS_UTILISEES

VARIABLES
capital EST_DU_TYPE NOMBRE
taux EST_DU_TYPE NOMBRE
annee EST_DU_TYPE NOMBRE
somme EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Indiquez le capital initial:"
LIRE capital
AFFICHER "Indiquez le taux fixe en pourcentage:"
LIRE taux
annee PREND_LA_VALEUR 0


TANT_QUE (somme < capital*2) FAIRE
		DEBUT_TANT_QUE
			annee PREND_LA_VALEUR annee + 1	
			somme PREND_LA_VALEUR capital*pow(1+taux/100,annee)
		FIN_TANT_QUE	
	
AFFICHER "Il faut "
AFFICHER annee
AFFICHER " ans pour doubler le capital"
	
FIN_ALGORITHME
```


## Boucles imbriquées

Exemple de boucle imbriquée :

```
Pour i allant de 1 à 5  
	Pour j allant de 1 à i  
		Ecrire ("O")

	FinPour
	Ecrire("X")
FinPour 
```

### Exercice

*Ecrire l'algorithme permettant d'afficher la table de multiplication de 9*

```bash
FONCTIONS_UTILISEES

VARIABLES
tableNeuf EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME

POUR i ALLANT_DE 0 A 10
	DEBUT_POUR
		tableNeuf PREND_LA_VALEUR i * 9
		AFFICHER* tableNeuf
	FIN_POUR

FIN_ALGORITHME
```


*Ecrire un algorithme qui demande successivement 6 nombres à l'utilisateur et qui lui dit ensuite quel était le plus grand parmi ces 6 nombres.*

```bash
FONCTIONS_UTILISEES

VARIABLES
nb EST_DU_TYPE NOMBRE
nbBefore EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME

POUR i ALLANT_DE 1 A 6

	DEBUT_POUR

		AFFICHER " Veuillez rentrer un nombre"
		LIRE nb
		
		SI (nb > nbBefore) ALORS
			DEBUT_SI
			 nbBefore PREND_LA_VALEUR nb
			 	AFFICHER nbBefore
			 	AFFICHER " Ce nombre est le plus grand"
			FIN_SI

	FIN_POUR  
	
AFFICHER "Le nombre le plus grand est "
AFFICHER nbBefore
FIN_ALGORITHME
```