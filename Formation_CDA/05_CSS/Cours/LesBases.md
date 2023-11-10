# Introduction au CSS

## Qu'est-ce que le CSS ?

>Le CSS, acronyme de Cascading Style Sheets est un langage informatique de feuille de style utilisé pour décrire la présentation d'un document HTML. Il permet de contrôler l'apparence, la mise en page et le design des éléments HTML sur une page web.

## Pourquoi utiliser le CSS ?

- **Séparation des préoccupations :** Le CSS permet de séparer la structure HTML du style, ce qui améliore la maintenabilité et la réutilisabilité du code.
- **Contrôle visuel :** Il offre un contrôle précis sur la couleur, la taille, la police, la mise en page et d'autres aspects visuels d'une page web contrairement au HTML.
- **Adaptabilité :** Le CSS permet de créer des designs réactifs pour s'adapter à différentes tailles d'écran et dispositifs.

## Syntaxe de base du CSS

```css
sélecteur {
    propriété: valeur;
}
```

- **Sélecteur:** C'est l'outil qui nous permet de cibler les éléments HTML auxquels vous souhaitez appliquer des styles.
- **Propriété:** Spécifie ce que vous souhaitez changer (par exemple, la couleur du texte).
- **Valeur:** Définit la valeur de la propriété (par exemple, "red" pour la couleur du texte).

*Si je souhaite transformer tous mes titres de niveau 1 (h1) en texte rouge:*

```css
h1 {
    color: red;
}
```

## Trois types d'insertion de style dans le HTML

### Inline CSS

L'inline CSS consiste à définir les styles directement dans l'élément HTML lui-même à l'aide de **l'attribut** `style`. Si on a peu de styles à appliquer (pour de la stylistique légère), favoriser ce mode d'insertion.

```html
<p style="color: blue">Ce texte est en bleu</p> 
```

### Internal CSS (Style intégré)

Le style intégré consiste à incorporer les styles CSS dans l'en-tête (head) de ma page HTML à l'aide de la **balise** `<style>`. Le fait de mettre la balise `<style>` dans le head se fait plutôt par convention, même si cela rend le code plus lisible.

```html
<!DOCTYPE html>
<html>
    <head>
        <style>
            p {
                color: green;
            }
        </style>
    </head>
    <body>
        <p>Ce texte est en vert.</p>
    </body>
</html>
```

### External CSS (Style externe)

Le style externe consiste à placer les styles CSS dans un fichier séparé qui possède l'extension `.css`, puis à lier ce fichier à la page HTML à l'aide de la balise `<link>` dans l'en-tête (head) de notre HTML.

**index.html:** 

```html
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="./styles.css"/>
    </head>
    <body>
        <p>Ce texte est en vert.</p>
    </body>
</html>
```

**styles.css:**

```css
p {
    color: green;
}
```

## Sélecteurs et priorités

### Sélecteurs CSS
Les sélecteurs sont des motifs qui ciblent les éléments HTML spécifiques pour leur appliquer des styles. Les types de sélecteurs courants incluent:

>- Sélecteurs de type (`p`, `h1`, `div`, etc.)
>- Sélecteurs de classe (`.ma-classe`)
>- Sélecteurs d'identifiant (`#mon-id`)
>- Sélecteurs de relation (`nav > a`, `div + p`)

### Priorité des styles

Lorsque vous utilisez plusieurs règles pour styler un élément HTML, il est essentiel de comprendre comment la priorité des styles est déterminée. La priorité des styles est définie par trois principaux facteurs:

#### Facteurs d'importance
L'importance des styles est évaluée en fonction de leur origine. Voici comment elle est classée de la plus élevée à la plus faible:

- **Styles déclarés avec `!important`:** Les règles CSS qui utilisent `!important` ont la priorité absolue. Elles seront appliquées même si d'autres styles sont déclarés après.

```css
p {
    color: blue !important;
}
```

- **Styles définis directement dans l'attribut `style`:** Les styles inline (définis directement dans l'élément HTML) ont une priorité plus élevée que les autres styles.

- **Styles intégrés au document:** Dans l'ordre des priorités, vient ensuite le style injecté en interne dans l'en-tête (head).

- **Styles dans un fichier CSS externe:** Les styles définis dans un fichier CSS externe sont moins prioritaires que les deux précédents.


#### Spécificités de sélecteur

La spécificité du sélecteur détermine laquelle des règles CSS est appliquée lorsque plusieurs règles ciblent le même élément.

- **Sélecteur d'identifiant:** Chaque identifiant ciblé dans le sélecteur ajoute 100 points de priorité à la spécificité.

- **Sélecteur de classe:** Chaque classe ciblée dans le sélecteur ajoute 10 point à la spécificité.

- **Sélecteur de type:** Chaque élément ciblé dans le sélecteur de type a une spécificité de base de 1.

- **Sélecteur de relation**: Les sélecteurs de relation tels que `>` (enfant direct) ou `+` (voisin direct) n'affectent pas directement la spécificité.

```css
/* Spécificité: 001 (sélecteur de type) */
p {
    color: blue;
}

/* Spécificité: 100 (sélecteur d'identifiant) */
p#unique {
    color: green; 
}

/* Spécificité: 010 (sélecteur de classe) */
p.special {
    color: red;
}
```

#### Ordre de déclaration

Si deux règles ont strictement la même importance et la même spécificité, l'ordre de déclaration détermine quelle règle sera appliquée. C'est la règle déclarée en dernier dans notre code qui l'emporte.

```css
p {
    color: blue;
}

p {
    color: red;  /*C'est la couleur rouge qui sera retenue*/
}
```

En comprenant ces trois aspects de la priorité des styles, vous pouvez résoudre plus facilement les conflits de style et garantir que vous pages web s'affichent correctement.


## Les Pseudo-Classes

Les pseudo-classes en CSS sont des sélecteurs spéciaux qui permettent de cibler les éléments HTML en fonction de leur état ou de leur position dans la structure de document. Elles sont précédées de deux points (`:`) dans les règles CSS. Nous allons en voir plusieurs:

### Les Pseudo-Classes de base

1. **:hover**: Cette pseudo classe permet de cibler un élément lorsque la souris le survole. Surtout utilisé sur les boutons et les liens. Par exemple, vous pouvez changer la couleur d'un lien lorsqu'il est survolé par la souris.

2. **:active**: Cette peudo-classe cible un élément au moment où il est activé, généralement lorsque l'utilisateur clique dessus. Vous pouvez l'utiliser pour créer un effet de clic visuel.

3. **:focus**: Cible un élément lorsqu'il obtient le focus, généralement après avoir été cliqué ou lors de la navigation au clavier. Il est couramment utilisé pour styliser les champs de formulaire lorsqu'ils sont sélectionnés.


### Les Pseudo-Classes de lien

1. **:link**: Cible les liens non visités, c'est à dire les liens vers lesquels l'utilisateur n'a pas encore navigué.

2. **:visited**: Cible les liens déjà visités par l'utilisateur.

### Les Pseudo-Classes de position

1. **:first-child**:Cible le premier élément enfant par rapport à un parent. Vouspouvez l'utiliser pour, par exemple, ajouter des styles spéciaux au premier élément d'une liste.

2. **:last-child**: Cible le dernier élément enfant d'un parent.

3. **:nth-child(*n*)**: Cette pseudo-classe permet de cibler un élément enfant en fonction de sa position définie entre parenthèses. On peut cibler plusieurs enfants dans une même `:nth-child()`. Vous pouvez utiliser des formules comme `:nth-child(odd)` ou `:nth-child(even)` pour cibler des éléments pairs et impairs.

**Attention à la syntaxe:**

```css

/* tous les enfants auxquels on applique la pseudo-classe, ici orange */
orange:only-child
/* tous les enfants uniques d'un parent, ici une plate */
plate :only-child
/* tout se joue dans l'espace qu'il y a entre le sélecteur et la pseudo-classe */
```

### Les Pseudo-Classes de formulaires

1. **:checked**: Cible les éléments d'entrée (comme les cases à cocher ou les boutons radio) qui sont cochés ou sélectionnés.

2. **:disabled**: Cible les éléments d'entrée qui sont désactivés.


>*S'entrainer sur [CSS Diner](https://flukeout.github.io/) pour travailler la logique et la syntaxe!*

## Les propriétés CSS

Le CSS offre un large éventail de propriétés pour contrôler l'apparence et la mise en page des éléments HTML. Voici quelques-unes des propriétés couramment utilisées:

### Les propriétés de texte

1. **`font-family`:** Cette propriété permet de spécifier la famille de police utilisée pour afficher du texte dans un élément HTML. Elle peut être définie avec une liste de nom de police, séparés par des virgules, pour spécifier des alternatives en cas d'indisponibilité de la première police. Toujours laisser `serif` ou `sans-serif` en dernier choix, car c'est LA police qui se trouve partout.

2. **`font-size`:** Cette propriété détermine la taille de la police utilisée pour le texte à l'intérieur d'un élément. Elle peut être définie en pixels (`px`), points (`pt`), en pourcentages (`%`), ou d'autres unités de mesures (`em`, `rem`...). Pour des polices on utilisera essentiellement le `rem`.

    >La taille par défaut sur un site est de 16px. Donc si on prend 1.5 rem, on prendra une police de 24px.   
    Il n'est pas recommandé de modifier la taille de la police par défaut.

3. **`font-weight` :** Cette propriété détermine l'épaisseur de la police utilisée pour le texte à l'intérieur d'un élément. Elle peut être définie avec des valeurs telles que `normal`, `bold`, `bolder`, `lighter`, ou des numériques pour des épaisseurs spécifiques.

    >Le "niveau de gras" par défaut est de 400. On évolue par pas de 100. 

4. **`font-style` :** Cette propriété permet de définir le style de la police, tel que `normal` (par défaut), `italic`, ou `oblique` (le `oblique` est rarement géré par les polices).

5. **`color` :** Cette propriété définit la couleur du texte à l'intérieur d'un élément HTML. Vous pouvez utiliser des noms de couleurs, des codes hexadécimaux, ou des valeurs `rgb` pour définir la couleur.

6. **`line-height` :** La propriété `line-height` contrôle la hauteur de ligne, c'est à dire l'espace vertical entre les lignes de texte. Elle peut être définie en tant que valeur numérique ou en pourcentage de la taille de la police. 
    >Sa valeur de base est 1.2. On privilégiera une taille entre 1.4 et 1.7 pour une lecture confortable.

7. **`text-align` :** Cette propriété règle l'alignement horizontal du texte à l'intérieur de son parent. Les valeurs courantes sont `left`, `right`, `center` et `justify`. **Attention: ne sert qu'à centrer du texte au sein de son bloc**

8. **`text-transform` :** Cette propriété permet de modifier la casse du texte. Vous pouvez l'utiliser pour mettre en majuscules (`uppercase`), en minuscules (`lowercase`), ou pour capitaliser la première lettre de chaque mot (`capitalize`).

9. **`text-decoration` :** Cette propriété contrôle la décoration du texte, telle que les soulignements (`underline`), les surlignements (`overline`), et les mots barrés (`line-through`). Elle peut également être utilisée pour supprimer ces décorations si elles sont mises par défaut en mettant la valeur `none`.