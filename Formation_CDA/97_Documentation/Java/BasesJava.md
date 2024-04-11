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

Non dimensionnée et adaptable contrairement aux tableaux. Si on veut y ajouter ou retirer un élément, la liste va se réadapter en termes de taille.


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

## POO

La POO permet de structurer le code de manière simple et précise.

## Constructeur

**Une classe est un concept. A différencier d'un objet qui est une instance de cette classe.**

Quant on crée une classe, on a nécessairement un **constructeur par défaut** qui perdure tant que l'on a pas créé de nouveau constructeur à l'intérieur de la classe. **Dès que l'on ajoute un nouveau constructeur, quelqu'il soit, le constructeur par défaut disparait.**
On peut donc instancier une classe, même si on ne lui ajoute pas de constructeur.

Le constructeur par défaut ne fait rien, n'a aucun paramètre et ne fait aucune initialisation. Il sert juste à instancier.

Il a comme ojectif de créer une instance. Un **constructeur ne peut donc pas être statique**.

En revanche, les attributs de la classe (variables d'instances) peuvent être statiques.
Dans ce cas, ce sont des variables de classe ou statiques.
Le getter d'un attribut statique doit lui aussi être statique.
Les variables statiques sont utiles dans des cas très précis (par exemple si on veut savoir le nombre de fois où la classe a été appelée). Ce sont des variables qui sont vraies à un instant T.

*voir p.16 du cours poo*

## L'encapsulation, les Getters et Setters

Les attributs privés ne sont accessibles qu'à l'intérieur de la classe. Une méthode peut aussi être passée en "private". On va ici retrouver le principe `d'encapsulation`.

### Encapsulation

> Le principe de l'encapsulation est de s'assurer que les données "sensibles" sont cachées aux utilisateurs.

On 
- Déclare les variables/attributs de classe comme `private`
- Fournit des méthodes publiques get et set pour accéder et mettre à jour la valeur d'une variable privée

### Getters et Setters

Pour pouvoir y accéder en dehors de la classe, il faut définir dans la classe des méthodes publiques:
- Getters : 
    - accesseurs
    - lire les variables privées
    - méthodes dont le nom commence toujours par le mot 'get'. Retourne toujours le même type que l'attribut correspondant

- Setters : 
    - mutateurs
    - modifier les variables privées
    - méthodes dont le nom commence par le mot 'set'
    - toujours de type `void`

***Un attribut doit toujours être en 'private' ou 'protected'.***

Une méthode statique se réfère à la classe et non à l'instance (dans une méthode statique on ne peut donc pas utiliser `this.`)



### Dans la classe, respecter l'ordre suivant pour ses membres :
- Attributs
- Constructeur
- Méthodes
- Getters/Setters



### Astuce:

***Pour définir le comportement qu'on veut avoir dans notre programme de manière plus claire, on peut faire un diagramme d'activité UML***

> **Debugger:** mode de lancement de notre programme qui permet de débugger notre programme. On peut y mettre des points d'arrêts qui nous permettent de nous arrêter sur une instruction ou une strucure (conditionnelle, itérative...).


## Héritage

L'héritage multiple n'est pas possible. Une classe doit hériter d'un seul et unique parent. Une classe mère peut avoir deux enfants (ou plus) mais ces deux enfants ne peuvent pas avoir un enfant ensemble. 
*voir plus en détail l'héritage en diamant.*


### Ce qu'il est possible de faire par exemple:

Une classe Animal, a deux enfants (Canidé et Félin) qui ont chacun deux enfants (Canidé: Chien, Hyenne / Félin: Chat, Tigre).


Pour indiquer qu'une classe vient du parent, on utilise la méthode `@Override`.

Par exemple:

```java
public class Animal {

    @Override
    public String toString() {
        return "Animal { méthode du parent => " + super.toString() + "}"
    }
}
```


Si on a une méthode abstraite, on ne peut plus l'instancier!

**La classe mère de toutes les classes et la classe Object**