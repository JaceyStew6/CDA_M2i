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

### Exercice: 

*Ecrire un algorithme qui demande un nombre entier à l'utilisateur, puis qui teste et affiche s'il est divisible par 3*

```
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

```
FONCTIONS_UTILISEES
VARIABLES
A EST_DU_TYPE NOMBRE
PRIX EST_DU_TYPE NOMBRE
DEBUT_ALGORITHME
AFFICHER "Entrer le nombre de copies souhaitées:"
LIRE A
SI (A<10) ALORS
	DEBUT_SI
		 PRIX PREND_LA_VALEUR 0.5*A
	FIN_SI
		
	SINON
		SI (A>9 ET A<21) ALORS
			DEBUT_SI
				 PRIX PREND_LA_VALEUR 0.4*A
			FIN_SI
		SINON	
			SI (A>20) ALORS
			DEBUT_SI
				 PRIX PREND_LA_VALEUR 0.3*A
			FIN_SI		
AFFICHER "Le prix total est de "
AFFICHER PRIX
FIN_ALGORITHME
```