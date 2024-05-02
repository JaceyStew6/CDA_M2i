# Le Design Pattern

Permet de suivre une structure/une méthodologie pour répondre à des problématiques.  
Dans la POO on va nécessairement rencontrer des problèmes. Pour y palier, on va mettre en place des méthodologies/des structures de conception.

## Méthodologie de résolution de problèmes dans la POO

Les problématiques vont différer en fonction du langage, puisque la façon de faire de la POO va différer.

Par exemple, la POO entre Java et Javascript est différente. En JS, chaque objet est prototypé (on a la définition de l'objet et son prototypage).


## Design Pattern de construction
### Builder

Quand on a une problématique pendant la construction. Par exemple si on peut construire notre objet de *n* façons, on va pouvoir utiliser un `builder` pour palier à ce problème.

Il y a des builders déjà existants, comme le `StringBuilder`. Mais on peut aussi créer les nôtres.

### Abstract Factory

Abstract Factory est un modèle de conception créationnel qui résout le problème de la création de familles de produits entières sans spécifier leurs classes concrètes.

Le but est de séparer et de permettre une évolutivité dans le temps, avec le minimum de dette technique possible.

Permet de créer des objets via une Factory et donc en dehors de l'objet "principal". Partir du principe que des objets possèdent eux même des sous objets. On va les construire via des factory.


https://www.baeldung.com/java-abstract-factory-pattern  
https://refactoring.guru/design-patterns/abstract-factory/java/example


Le `Builder` et le `Factory` sont les patterns de construction les plus utilisés.


## Design Pattern de comportement

### Observable

Créer un observable et des observeurs permet d'éviter d'ajouter sans cesse des modifications à l'observable. 
Il faut que les observers s'actualisent par rapport à l'observable, tout en étant "indépendant". Dans l'observable, il faudrait qu'on récupère une liste d'observers. Les observers doivent respecter la même interface.

Ex: une station météo, n'a pour but que d'actualiser la météo et non pas de gérer les périphériques à utiliser par exemple. Ainsi, une station météo sera un observable et les périphériques, tels que téléphone, tablette... seront des observers (qui sont une interface). 

*Voir démo pour plus de détails.*

Il faut un `Subject` pour mettre en place un observateur, ainsi qu'un `Observer` qui sont tous les deux des `interfaces`.  
Le Subject apporte les modifications et l'Observer est celui qui écoute.


## Design Pattern de Strategie

Il s'agit en fait d'un pattern qui se base sur la notion d'injection de dépendances. La stratégie est de découpler et de rendre les stratégies interchangeables.

Il faut donc définir une interface de strategie





### Singleton