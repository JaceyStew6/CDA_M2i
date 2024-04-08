# Bases de Java

## JVM (Java Virtual Machine)

Est installé sur chaque device et on va compiler avec une version du SDK et du JDK et qui va comprendre du ByteCode, compris par la JVM, qui va l'interpréter et l'exécuter sur l'OS.

Caractéristiques:

- Fortement typée
- Tout doit être orienté objet
- La JVM gère la mémoire.
- Interprète en JIT (Just In Time). 
- La JVM peut être installée sur n'importe quel environnement (est portable)
- Elle est multithread (peut ouvrir plusieurs process).

=> Multiplateforme grâce à la JVM.


## Environnement Java

Pour que ça fonctionne, on a besoin d'un compilateur, de la JVM et de l'ensemble des librairies de base (Standard Edition : JSE ou l'Enterprise Edition aussi appelée Jakarta ou JEE).

*On a besoin d'un environnement de développement de base.*

Standard Edition comprend plusieurs versions.


## Gestion des packages

2 technos majeures en Java:
- **Maven**: se base sur une description dans un document XML (POM: Project Object Model) et va aller chercher pour nous les packages (comme npm).
- **Gradle**: se base sur une description dans un document Groovy et va aller chercher pour nous les packages sauf qu'on pourra pousser d'autant plus l'utilisation. Utilisation plus complexe que Maven.


Maven ne vient pas avec le JDK. Il faut l'installer manuellement ou via un Maven Wrapper.


### Installer Maven

On peut l'utiliser à travers l'IDE (donc dépendant de l'IDE et du projet) ou l'installer globalement pour qu'il ne soit pas dépendant de l'IDE.

Maven est l'outil de base pour pouvoir exécuter notre code.


## IntelliJ

Permet d'exécuter le code en mode run ou en mode debug. Quand le code ne marche pas, il faut exécuter en mode débug et faire des points d'arrêt.


## Base d'un projet

```java
    <groupId>org.example</groupId> //unique
    <artifactId>demo_java_base</artifactId> //nom du projet qui peut être unique. Permet de travailler en équipe sur une même fonctionnalité sans s'y perdre.
    <version>1.0-SNAPSHOT</version> //permet d'avoir un plan de continuité et de rollback
```


## Les bases du Java

**/!\ En Java, toute variable possède un type (permet d'optimiser l'espace mémoire).**

On peut avoir des variables primitives ou des variables de référence aux objets.  

### Variables primitives
- Entier
    - int (le plus utilisé)
    - byte
    - short
    - long (très très grand entier)
- Décimaux
    - float 
    - double (le plus utilisé)
- boolean (c'est en fait un tiny int qui vaut entre 0 et 1)
- char
- String (c'est une classe et non un type primitif, d'où le fait de l'écrire avec un "S" majuscule).
- Integer (c'est une classe et non un type primitif, d'où le fait de l'écrire avec un "I" majuscule. C'est comme un wrapper).

- var (plus explicite mais bel et bien typé. Prend le type de sa valeur une fois initialisée).

***Choisir le bon type permet d'attribuer le bon espace mémoire. Toutefois, on ne fait plus trop de micro optimisation dans la mesure où les pc sont beaucoup plus performants qu'avant.***

*Les variables de référence aux objets peuvent posséder des méthodes.*



Au niveau du SDK, on a des fonctionnalités qui font partie du JDK.

```java
System.out  //classe System qui utilise par exemple la fonction .out
```

### Tableau

En Javascript c'est plutôt une structure chaînée qui n'a pas de limite de taille. Seulement, si on ne lui donne pas le type, en bas niveau, le programme ne va pas savoir combien d'adresses mémoire il va devoir réserver. Chaque élément contient l'adresse vers lui-même ainsi que vers l'élément suivant. En JS, on a pas vraiment la possibilité d'implémenter un tableau bas niveau.

En Java, on a au contraire une implémentation bas niveau, même si on ne gère pas directement les adresses mémoire (gérées par la garbage collector). En Java, un tableau doit être typé. Si on indique qu'on veut un tableau d'entier par exemple, ce sera forcément composé uniquement d'entier. Aussi, il ne peut pas être illimité. Quand on crée un tableau, il faut obligatoirement lui fournir le type et la taille. Ainsi, la place mémoire est déjà réservée, même s'il n'y a pas encore de valeurs allouées. 


### Liste

Non dimensionnée et adaptable contrairement aux tableaux. Si on veut y ajouter ou retirer un élément, la liste va se réadapter et termes de taille.


### Les fonctions

Lorsqu'on crée une fonction, on lui passe des paramètres (qui sont comme des variables) qui n'existent qu'à l'intérieur de la fonction. Lors de l'appel de la fonction, on lui passe des arguments.

La fonction contient un bloc de code qui pourra être exécuté plusieurs fois et qui retourne quelque chose (avec un ou plusieurs return)

Une fonction est un procédé qu'on cherche à exécuter plusieurs fois.


En Java, tout se qu'on fait se trouve à l'intérieur d'une méthode.
En Java, les fonctions locales n'existent pas. On va ainsi travailler avec des méthodes statiques (ex: `public static void main (String[] args)`).

Si on veut créer des fonctions, on peut faire des méthodes statiques. 


ex: 

```java
//ici on a la signature de notre méthode. Notre méthode s'appelle add (c'est son symbol ou identificateur), elle prend 2 int en entrée et elle prend un int en sortie.
public static int add(int int1, int int2){
    //var result = int1 + int2; //result ici est de type int
    //return result;
    return int1 + int2; //instruction de sortie de la méthode
}

public static void main (String[] args){
    var result = add(1,2);
    System.out.println(result);
}

```

***Une fonction est typée avec son type de retour.***


Une fonction peut avoir un même nom mais avec une signature différente. Elle peut ainsi prendre plusieurs formes. Ici, il s'agit de polymorphisme paramétrique.

```java
public static int add(int int1, int int2){
}

public static int add(int int1, int int2, int int3){
}
```

Il existe aussi un autre type de polymorphisme par le type. Il faut toutefois que les paramètres d'entrée soient différents. Par exemple:

```java
public static int add(int int1, int int2, int int3){
}

public static double add(double int1, double int2, double int3){
}
```

> **Polymorphisme** = plusieurs formes pour une fonction avec un même nom/identificateur/symbol.

