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
    - int
    - byte
    - short
    - long (très très grand entier)
- Décimaux
    - float
    - double
- boolean (c'est en fait un tiny int qui vaut entre 0 et 1)
- char


*Les variables de référence aux objets peuvent posséder des méthodes.*



Au niveau du SDK, on a des fonctionnalités qui font partie du JDK.

```java
System.out  //classe System qui utilise par exemple la fonction .out
```

### Tableau

En Javascript c'est plutôt une structure chaînée qui n'a pas de limite de taille. Seulement, si on ne lui donne pas le type, en bas niveau, le programme ne va pas savoir combien d'adresses mémoire il va devoir réserver. Chaque élément contient l'adresse vers lui-même ainsi que vers l'élément suivant. En JS, on a pas vraiment la possibilité d'implémenter un tableau bas niveau.

En Java, on a au contraire une implémentation bas niveau, même si on ne gère pas directement les adresses mémoire (gérées par la garbage collector). En Java, un tableau doit être typé. Si on indique qu'on veut un tableau d'entier par exemple, ce sera forcément composé uniquement d'entier. Aussi, il ne peut pas être illimité. Quand on crée un tableau, il faut obligatoirement lui fournir le type et la taille. Ainsi, la place mémoire est déjà réservée, même s'il n'y a pas encore de valeurs allouées. 