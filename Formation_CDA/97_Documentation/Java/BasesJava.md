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

Il nous faut un JDK pour faire fonctionner tout ça. Le JDK contient les bibliothèques de base et la JVM. Les bibliothèques sont du code écrit par d'autres développeurs.


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

Java fonctionne par classe. Une classe permet d'instancier un objet.

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

*Les primitives sont imutables et elles ne peuvent pas être modifiées. Leur emplacement mémoire ne change pas. En cas de modification, on a alors une nouvelle adresse mémoire qui est attribuée et la précédente est détruite par le garbage collector.*



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

***/!\ Attention! Etant donné qu'on est forcément dans une classe en Java (puisqu'orienté objet), les fonctions sont appelées des méthodes.***

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

> **Polymorphisme** = plusieurs formes pour une fonction avec un même nom/identificateur/symbol (même nom de méthode, mais avec des propriétés différentes).

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

On peut avoir autant de constructeurs différents qu'on le souhaite, tant qu'ils ont une signature différente (plus ou moins de paramètres, types différents, ordre différent des paramètres...).

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
- Méthode toString()



### Astuce:

***Pour définir le comportement qu'on veut avoir dans notre programme de manière plus claire, on peut faire un diagramme d'activité UML***

> **Debugger:** mode de lancement de notre programme qui permet de débugger notre programme. On peut y mettre des points d'arrêts qui nous permettent de nous arrêter sur une instruction ou une strucure (conditionnelle, itérative...).


## Héritage

L'héritage multiple n'est pas possible. Une classe doit hériter d'un seul et unique parent. Une classe mère peut avoir deux enfants (ou plus) mais ces deux enfants ne peuvent pas avoir un enfant ensemble. 
*voir plus en détail l'héritage en diamant.*


### Ce qu'il est possible de faire par exemple:

Une classe Animal, a deux enfants (Canidé et Félin) qui ont chacun deux enfants (Canidé: Chien, Hyenne / Félin: Chat, Tigre).


Pour indiquer qu'une classe vient du parent, on utilise la méthode `@Override`. Cela indique que cette méthode est surchargée par rapport à sa classe mère (permet de réécrire une méthode si on veut qu'elle soit différente en fonction de la classe enfant).

Par exemple:

```java
public class Animal {

    @Override
    public String toString() {
        return "Animal { méthode du parent => " + super.toString() + "}"
    }
}
```

## Abstract
Si on a une méthode abstraite, on ne peut plus l'instancier!
Classe abstraite = va essentiellement servir à l'héritage. On ne peut juste plus l'instancier et ça peut même offrir un certain niveau de sécurité.
Peut être intéressant de mettre du `Static` dans une classe `Abstract`.

**La classe mère de toutes les classes et la classe Object**


## .equals()

Si on veut comparer deux chaines de caractère il faut faire .equals(), puisque String est une classe et non un type primitif. Si on utilisait un "==", on obtiendrait alors l'emplacement mémoire de l'objet.

```java
String mot1 = "Bonjour"
String mot2 = "Bonjour"

System.out.println(mot1.equals(mot2))
```
Retournera `true`.

## final

La variable devient non modifiable une fois qu'on lui a attribué une valeur. Permet d'avoir l'équivalent d'une constante.

```java
private final int nbrPieds;
```

## Les génériques

Les génériques en Java (generics) sont un ensemble de caractéristiques du langage liées à la définition et à l'utilisation de types et de méthodes génériques. En Java, les types ou méthodes génériques diffèrent des types et méthodes ordinaires dans le fait qu'ils possèdent des paramètres de type.

Les génériques ont été introduits dans le but d'ajouter une couche supplémentaire d'abstraction sur les types et de renforcer la sécurité des types. Les génériques permettent d'accroître la lisibilité du code et surtout d'en renforcer la sécurité grâce à un typage plus exigeant. Ils permettent de préciser explicitement le type d'un objet et rendent le cast vers ce type implicite. Cette fonctionnalité est spécifiée dans la JSR 14 et intégrée dans Java 1.5.

Les génériques permettent à un type ou à une méthode d'opérer sur des objets de différents types tout en assurant la sécurité des types au moment de la compilation. Les génériques permettent de définir certains types et des méthodes pour lesquelles un ou plusieurs types utilisés sont précisés lors de leur utilisation en tant que paramètre.

Ils permettent par exemple de spécifier quel type d'objets une collection peut contenir et ainsi éviter l'utilisation d'un cast pour obtenir un élément de la collection.


> Classe générique = pour que la classe puisse s'adapter à un autre contenu que je ne connais pas.

Syntaxe pour déclarer une classe générique :

```java
//Déclaration de la classe générique
public class Boite<T> {
    private T contenu; //Attribut générique

    //Constructeur 
    public Boite(T contenu){
        this.contenu = contenu;
    }

    //Getter
    public T getContenu(){
        return contenu;
    }

    //Setter
    public void setContenu(T contenu) {
        this.contenu = contenu;
    }
}
```

---
---
## Les collections (attention: un peu en vrac)

## List
- ArrayList
- Vector


## Interface

On ne peut pas instancier une interface. Ce n'est pas une classe.
Une interface peut hériter d'une autre interface.


## Iterable

Objet, un peu comme un pointeur sur une collection, qui va nous aider à parcourir cette collection.

Il existe 3 iterable:
- boucle for améliorée (for-each)
- boucle ForEach
- boucle for ? (revérifier)

L'interface Iterator est fournie dans la bibliothèque de base.
Possible d'obtenir un iterator à partir de chaque collection.

Un iterator ne pointe sur aucun objet au départ. Il pointe sur le début de la liste.
La méthode `it.hasNext()` permet de vérifier qu'il y a un élément à la suite. 


`[Pomme, Orange]`  
 ^  
*Index au départ (devant la collection)*
Puisqu'il y a deux éléments dans le tableau, avec la méthode `it.hasNext()` on identifie qu'il y a bien un élément "Pomme" à la suite du pointeur. Il renvoie donc `true`. On itère ainsi jusqu'à ce que la méthode renvoie `false`.



## Set

Utilise le code hash pour les éléments. 
Avec SortedSet, il va mettre ces hash dans les collections et va trier les éléments par ordre alphabétique ou alphanumérique.
Existe aussi TreeSet.

## Queue
- ArrayDeque
- LinkedList
- PriorityQueue

Va utiliser un système de gestion au niveau de la rentrée et sortie des éléments.
Offre des méthodes pour venir récupérer le premier élément de la file d'attente et le dernier élément. 

Premier entré => Premier supprimé.
Un peu similaire à la méthode FIFO (First In First Out).

Méthodes avec le queue:
- add()
    - insère élément spécifié dans la file d'attente
    - si tâche réussie => add() => true
    - si se passe mal, lève une exception
- offer()
    - insère élément spécifié dans la file d'attente
    - si tâche réussie => offer() => true
    - sinon => false
- element()
- peek()
- remove()
- poll()

La file d'attente prend en charge toutes le méthodes de la collection Java.

---
---
## Les Map

Différent des collections. On ne cible plus un élément avec un index, mais avec un système de clé/valeur.

***Une Map ne peut pas contenir de clés en double.***
> Une clé = une valeur

Le Map n'est qu'une interface. Il nous faut quelque chose qui l'implémente:

- SortedMap : maintient ses mappages dans l'ordre croissant des clés.

- HashMap: classe qui implémente l'interface Map. Permet de créer un tableau dynamique d'objet de type Object qui sont identifiés par une clé.

Pour ajouter un élément dans le tableau, contrairement à une Collection de type List, on ne fait pas un `.add()` mais un `.put()`.

Pour récupérer un objet, on applique la méthode `.get()`, comme pour une Collection.

Il ne va pas directement stocker dans le tableau nos objets, mais plutôt les adresses mémoire de nos objets.


## Stream

Outil qui permet de rajouter des possibilités à nos collections (ex: filtrer, etc).

API Stream offre une nouvelle manière de parcourir les tableaux et les Collections. Nous permet d'effectuer des traitements sur des structures de données (une Collection). 

Ne modifie pas les données de la source originale, mais permet de les manipuler.
Permet de parcourir un flux de données.

Les données ne sont chargées que lorsque cela est nécessaire. Evite le chargement inutile de données, contrairement à une boucle ou un Iterator. 

Deux catégories d'opérations sur les Streams:
- **Opérations intermédiaires** : 
    - filter(Predicate)
    - distinct()
    - limit()
    - skip()
    - map()
    - flatMap()
    - sorted()
    - *effectuées de manière paresseuses et renvoient un nouveau Stream, qui retransforme en une nouvelle Collection. N'écrase pas la source*

- **Opérations terminales** : 
    - sum()
    - forEach()
    - collect()
    - reduce()
    - anyMatch(Predicate)
    - allMatch(Predicate)
    - noneMatch(Predicate)
    - findAny()
    - findFirst()
    - count()
    - *consomment le Stream en produisant un résultat final. Ne peut pas être réutilisé pour effectuer d'autres opérations. Elles peuvent renvoyer différents types, notamment void*

Permet de simplifier et d'optimiser les traitements sur les Collections et les tableaux en Java.

On peut créer un Stream de différentes manières:
- en utilisant un objet de type builder
- à partir d'un tableau grâce à la méthode `Array.stream()`
- à partir d'une collection, car l'interface Collection définit la méthode `Collection.stream()`

/!\ Un Stream n'est pas une Collection. 


### Optional

Classe introduite dans Java pour représenter une valeur qui peut être absente. Permet de rendre explicite la possibilité qu'un résultat puisse être nul (évite les erreurs de type `NullPointerException`).
Souvent utilisé en conjonction avec les Streams.

Plusieurs méthodes:

- isPresent(): vérifie si une valeur est présente
- get(): récupère la valeur si présente, sinon lance une exception.

## Exceptions

Les exceptions dont on doit se soucier sont:
- Les exceptions surveillées (obligé de les traiter. Elles sont signalées par le compilateur. Obligé de s'en occuper ou de la remonter à la méthode supérieure)
- Les exceptions non surveillées (peuvent être traitées ou non. Elles ne sont pas signalées par le compilateur.) Par exemple, le Scanner soulève une exception non surveillée.


Quand une exceptiona arrive au niveau de la JVM, cette dernière ne sait pas quoi faire et affiche donc une erreur.

Pour traiter les exceptions, on doit utiliser un `try catch`




---

## Définitions

> **Classe générique :** c'est une classe Java qui peut être réutilisée pour des objets de différents types. Prenons l'exemple de la classe ArrayList de Java 4, qui permet de stocker des objets dans une liste. Ce sont des objets qui ont un comportement qui leur permet de s'adapter à n'importe quel type.

> **Ordonnancement :** il se fait par rapport à l'adresse mémoire. Il est différent en fonction de si on utilise un Set ou un List. Le Set est plus performant. Attention, l'ordonnancement est différent du tri.