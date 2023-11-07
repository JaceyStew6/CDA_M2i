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

Structures itératives (les boucles)

	- while (tant que): on y répète les instructions tant qu'une certaine condition est réalisée
	- do while (jusqu'à): on y répète des instructions jusqu'à ce qu'une certaine condition soit réalisée
	- for (pour): on y répète des instructions en faisant évoluer un compteur entre une valeur initiale et une valeur finale



---

### Exercices

*Déterminer le montant d'un capital c placé à un taux fixe t pendant un nombre d'années. On suppose que c, t, n sont lus.*

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
nbMax EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME

POUR i ALLANT_DE 1 A 6

	DEBUT_POUR

		AFFICHER " Veuillez rentrer un nombre"
		LIRE nb
		
		SI (nb > nbMax OU i == 1) ALORS
			DEBUT_SI
			 nbMax PREND_LA_VALEUR nb
			FIN_SI

	FIN_POUR  
	
AFFICHER "Le nombre le plus grand est "
AFFICHER nbMax
FIN_ALGORITHME
```


*Ecrire un algorithme qui demande un nombre de départ et qui calcule la somme des entiers jusqu'à ce nombre.*

```bash 
FONCTIONS_UTILISEES

VARIABLES
userNb EST_DU_TYPE NOMBRE
sum EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME
AFFICHER "Insérez un nombre"
LIRE userNb
sum PREND_LA_VALEUR 0

POUR i ALLANT_DE 1 A userNb  #Avec une boucle FOR
	DEBUT_POUR
		sum PREND_LA_VALEUR sum + i	
	
	FIN_POUR

AFFICHER "La somme des entiers jusqu'à "
AFFICHER userNb
AFFICHER " est "	
AFFICHER sum

FIN_ALGORITHME
```
*Solution alternative*

```bash
FONCTIONS_UTILISEES

VARIABLES
userNb EST_DU_TYPE NOMBRE
sum EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Insérez un nombre"
LIRE userNb
sum PREND_LA_VALEUR 0

TANT_QUE (i < userNb) FAIRE  #Avec une boucle WHILE
	DEBUT_TANT_QUE
		i PREND_LA_VALEUR i + 1		
		sum PREND_LA_VALEUR sum + i	
	FIN_TANT_QUE
	
AFFICHER "La somme des entiers jusqu'à "
AFFICHER userNb
AFFICHER " est "	
AFFICHER sum

FIN_ALGORITHME
```


*Ecrire un algorithme qui permet d'afficher les tables de multiplication des nombres de 1 à 10 d'un seul coup*

```bash
FONCTIONS_UTILISEES

VARIABLES
table EST_DU_TYPE NOMBRE
result EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME

POUR table ALLANT_DE 1 A 10
	DEBUT_POUR
		AFFICHER* "------"
		AFFICHER "Table de "
		AFFICHER* table
		AFFICHER* "-------"

		POUR i ALLANT_DE 1 A 10
			DEBUT_POUR
				result PREND_LA_VALEUR table * i
				AFFICHER table
				AFFICHER "x"
				AFFICHER i
				AFFICHER "="
				AFFICHER result
				AFFICHER* " "
			FIN_POUR
	FIN_POUR

FIN_ALGORITHME
```


*Alternative avec une seule boucle **WHILE** et des structures conditionnelles*

```bash
FONCTIONS_UTILISEES

VARIABLES
table EST_DU_TYPE NOMBRE
result EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME
table PREND_LA_VALEUR 1

TANT_QUE (table < 11) FAIRE
	DEBUT_TANT_QUE
		SI (i < 10) ALORS
			DEBUT_SI
				i PREND_LA_VALEUR i + 1				
				result PREND_LA_VALEUR table * i
				AFFICHER table
				AFFICHER "x"
				AFFICHER i
				AFFICHER "="
				AFFICHER result
				AFFICHER* " "
			FIN_SI
		SINON
			DEBUT_SINON
					i PREND_LA_VALEUR i - i
					table PREND_LA_VALEUR table + 1
				FIN_SINON
			
	FIN_TANT_QUE

FIN_ALGORITHME
```


*Solution alternative avec une boucle **FOR***

```bash
FONCTIONS_UTILISEES

VARIABLES
i EST_DU_TYPE NOMBRE
j EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME
j PREND_LA_VALEUR 1

POUR i ALLANT_DE 1 A 10
	DEBUT_POUR
		SI (j <= 10) ALORS
				DEBUT_SI
				SI (i == 1) ALORS
					DEBUT_SI
					AFFICHER* "-----"
					AFFICHER "table de "
					AFFICHER* j
					AFFICHER* "-----"
					FIN_SI
					SI (i < 10) ALORS
						DEBUT_SI
						AFFICHER j
						AFFICHER " x "
						AFFICHER i
						AFFICHER " = "
						AFFICHERCALCUL* j*i
						FIN_SI
						SINON
								DEBUT_SINON
								AFFICHER j
								AFFICHER " x "
								AFFICHER i
								AFFICHER " = "
								AFFICHERCALCUL* j*i
								j PREND_LA_VALEUR j + 1
								i PREND_LA_VALEUR 0
								FIN_SINON
				FIN_SI
				SINON
						DEBUT_SINON
						i PREND_LA_VALEUR 10
						FIN_SINON
	FIN_POUR

FIN_ALGORITHME
```

*La ville de Tourcoing a un taux d'accroissement de 0.89%. Ecrire un algorithme donnant le nombre d'années nécessaires pour atteindre 120 000 habitants. On sait qu'en 2015 la ville de Tourcoing comptait 96 809 habitants.*

```bash
FONCTIONS_UTILISEES

VARIABLES
hab EST_DU_TYPE NOMBRE
n EST_DU_TYPE NOMBRE
nInit EST_DU_TYPE NOMBRE
nFinal EST_DU_TYPE NOMBRE

DEBUT_ALGORITHME
n PREND_LA_VALEUR 1
nInit PREND_LA_VALEUR 2015
hab PREND_LA_VALEUR 96809

TANT_QUE (hab < 120000) FAIRE
	DEBUT_TANT_QUE
		hab PREND_LA_VALEUR hab * (1+0.89/100)
		SI (hab < 120000) ALORS
			DEBUT_SI
			n PREND_LA_VALEUR n + 1
			FIN_SI
	FIN_TANT_QUE

AFFICHER "Il faudra "	
AFFICHER n
AFFICHER " années pour atteindre les 120 000 habitants"

AFFICHER " Ce nombre sera atteint en "
AFFICHERCALCUL nFinal = nInit + n

FIN_ALGORITHME
```

*Ecrire un programme qui permet de saisir les notes des élèves et qui permet d'afficher un menu indiquant la plus petite note, la plus grande note et la moyenne*

```bash
FONCTIONS_UTILISEES

VARIABLES
nbUser EST_DU_TYPE NOMBRE
nbMax EST_DU_TYPE NOMBRE
nbMin EST_DU_TYPE NOMBRE
nbSum EST_DU_TYPE NOMBRE
userChoice EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
nbSum PREND_LA_VALEUR 0
POUR i ALLANT_DE 1 A 3
	DEBUT_POUR
		AFFICHER "Veuillez saisir la note n°"
		AFFICHER i
		LIRE nbUser
		nbSum PREND_LA_VALEUR nbSum + nbUser
		
		SI (i == 1) ALORS
			DEBUT_SI
			nbMax PREND_LA_VALEUR nbUser
			nbMin PREND_LA_VALEUR nbUser
			FIN_SI
	SINON
		DEBUT_SINON
		SI (nbMin > nbUser) ALORS
			DEBUT_SI
			nbMin PREND_LA_VALEUR nbUser
			FIN_SI
			SINON
				DEBUT_SINON
				SI (nbMax < nbUser) ALORS
					DEBUT_SI
					nbMax PREND_LA_VALEUR nbUser
					FIN_SI
				FIN_SINON
		FIN_SINON
			
	FIN_POUR


userChoice PREND_LA_VALEUR -1

TANT_QUE (userChoice != 0) FAIRE
	DEBUT_TANT_QUE
	AFFICHER* "1. Afficher la plus petite note"	
	AFFICHER* "2. Afficher la plus grande note"
	AFFICHER* "3. Afficher la moyenne des notes"
	AFFICHER* "0. Quitter"	
	LIRE userChoice
	
	SI (userChoice == 1) ALORS
		DEBUT_SI
		AFFICHER "La plus petite note est "
		AFFICHER* nbMin
		FIN_SI
	SI (userChoice == 2) ALORS
		DEBUT_SI
		AFFICHER "La plus grande note est "
		AFFICHER* nbMax
		FIN_SI
	SI (userChoice == 3) ALORS
		DEBUT_SI
		AFFICHER "La moyenne des notes est "
		AFFICHERCALCUL* nbSum / (i-1)
		FIN_SI
	FIN_TANT_QUE


FIN_ALGORITHME
```

## Les fonctions et procédures

Deux types de programmation:
- procédurale (linéaire)
- fonctionnelle (modulaire) : on a des groupes d'instructions isolés qu'on va désigner par un nom (fonction)

*Créer une fonction qui permet de demander deux nombres à un utilisateur et de renvoyer le plus grand des deux*

```bash
FONCTIONS_UTILISEES
FONCTION plusGrandNombre(nb1, nb2)
VARIABLES_FONCTION
		DEBUT_FONCTION	
		
		SI (nb1 > nb2) ALORS
				DEBUT_SI
				RENVOYER nb1
				FIN_SI
		SINON
			DEBUT_SINON
				RENVOYER nb2
			FIN_SINON		

		FIN_FONCTION


VARIABLES
nb1 EST_DU_TYPE NOMBRE
nb2 EST_DU_TYPE NOMBRE
result EST_DU_TYPE CHAINE

DEBUT_ALGORITHME #Bien séparer l'affichage de la résolution logique

AFFICHER "Veuillez entrer un premier nombre"
LIRE nb1

AFFICHER "Veuillez entrer un second nombre"
LIRE nb2

result PREND_LA_VALEUR plusGrandNombre(nb1, nb2)
AFFICHER "Le plus grand nombre est "
AFFICHER result

FIN_ALGORITHME
```


## Les procédures

Exactement la même chose qu'une fonction sauf qu'elle ne retourne pas de résultat (comme une fonction sans return).

Une procédure s'écrit en dehors du programme principal. Une procédure peut ne pas avoir de paramètres.

Une procédure peut par exemple servir à l'affichage.


Il existe deux modes de transmission de paramètres dans les langages de programmation:
- La transmission par valeur n'impactera pas le code principal (la référence de base). La valeur restera intacte. Ce mode de paramètre effectif ne subit aucune modification.
- La transmission par adresse (ou par référence) impactera le code principal.

**Attention: le paramètre effectif doit être une variable (et non une valeur) lorsqu'il s'agit d'une transmission par adresse.**     

---

Existe deux types de portée pour les variables:
- variable globale : disponible dans tout le code
- variable locale: disponible dans le cadre de la fonction qui l'appelle et est limitée à la durée d'exécution de la fonction. Favoriser ce mode là. Permet de laisser son code propre et épuré. **Par contre attention: sa valeur est tuée à la fin de l'exécution de la fonction (si on a besoin de garder la valeur pour plus tard dans le code, il faut alors la stocker dans une variable globale).**


*Exemple de menu avec création d'une procédure*

```bash
FONCTIONS_UTILISEES
FONCTION menu () #création de la procédure
VARIABLES_FONCTION
userChoice EST_DU_TYPE NOMBRE
	DEBUT_FONCTION
	userChoice PREND_LA_VALEUR -1

TANT_QUE (userChoice != 0) FAIRE
	DEBUT_TANT_QUE
	AFFICHER* "1. Afficher la plus petite note"	
	AFFICHER* "2. Afficher la plus grande note"
	AFFICHER* "3. Afficher la moyenne des notes"
	AFFICHER* "0. Quitter"	
	LIRE userChoice
	
	SI (userChoice == 1) ALORS
		DEBUT_SI
		AFFICHER "La plus petite note est "
		AFFICHER* nbMin
		FIN_SI
	SI (userChoice == 2) ALORS
		DEBUT_SI
		AFFICHER "La plus grande note est "
		AFFICHER* nbMax
		FIN_SI
	SI (userChoice == 3) ALORS
		DEBUT_SI
		AFFICHER "La moyenne des notes est "
		AFFICHERCALCUL* nbSum / (i-1)
		FIN_SI
	FIN_TANT_QUE
	FIN_FONCTION

VARIABLES
nbUser EST_DU_TYPE NOMBRE
nbMax EST_DU_TYPE NOMBRE
nbMin EST_DU_TYPE NOMBRE
nbSum EST_DU_TYPE NOMBRE
i EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
nbSum PREND_LA_VALEUR 0
POUR i ALLANT_DE 1 A 3
	DEBUT_POUR
		AFFICHER "Veuillez saisir la note n°"
		AFFICHER i
		LIRE nbUser
		nbSum PREND_LA_VALEUR nbSum + nbUser
		
		SI (i == 1) ALORS
			DEBUT_SI
			nbMax PREND_LA_VALEUR nbUser
			nbMin PREND_LA_VALEUR nbUser
			FIN_SI
	SINON
		DEBUT_SINON
		SI (nbMin > nbUser) ALORS
			DEBUT_SI
			nbMin PREND_LA_VALEUR nbUser
			FIN_SI
			SINON
				DEBUT_SINON
				SI (nbMax < nbUser) ALORS
					DEBUT_SI
					nbMax PREND_LA_VALEUR nbUser
					FIN_SI
				FIN_SINON
		FIN_SINON
			
	FIN_POUR

APPELER_FONCTION menu() #appel de la procédure

FIN_ALGORITHME
```

## Les tableaux

Une variable ne peut stocker qu'une seule valeur. Les tableaux palient à ce problème, puisqu'il s'agit d'une variable qui stocke plusieurs valeurs.

Un tableau se déroule sous un seul axe et stocke un enchainement de valeurs.
Un tableau est une structure de données qui permet de rassemble un ensemble de variables/éléments de même type (excpetion faite du Javascript) désignés par un identificateur unique.  

*Exemple de syntaxe:*   
 `notes = [11, 4, 6, 14]`

 La déclaration d'un tableau s'effectue en précisant le type de ses éléments et sa dimension (le nombre de ses éléments). Quand on fait un tableau, on alloue un espace de stockage mémoire, c'est pourquoi il est important de définir sa taille à la base. Cela est toutefois de moins en moins le cas dans beaucoup de langages.

 L'accès aux éléments d'un tableau se fait au moyen de l'indice. Selon les langages, le premier indice est soit 0 (le plus courant), soit 1.

 *Exemple de syntaxe pour chercher l'élément en troisième position:*  
 `notes[2]`
 
   