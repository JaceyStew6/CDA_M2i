# Les formulaires en HTML

Pour ouvrir et fermer un formulaire, on applique les balises `<form></form>` (de type bloc). Cette balise contiendra beaucoup d'attributes importants pour notre Javascript. Mais nous allons d'abord voir le placement des inputs en HTML.

## Les inputs

En HTML, les éléments `<input>` sont utilisés pour collecter des données entrées par les utilisateurs. Il existe plusieurs types d'inputs couramment utilisés pour différents types de données et interactions.

**Attention: les inputs sont de type inline!**

Si je veux rendre l'un de mes input **obligatoire**, j'utilise l'attribut `required`.

1. **Texte (`text`):** Ce type d'input permet aux utilisateurs de saisir du texte libre, comme des noms, des adresses, des commentaires, etc.

```html
<input type="text" placeholder="Votre nom" name="nom"> <!--le placeholder permet de donner du contexte pour l'utilisateur et le développeur, notamment avec le name-->
```

2. **Mot de passe (`password`):** Utilisé pour collecter des mots de passe, ce type masque les caractères saisis. **Attention, ça ne crypte pas les caractères!**

```html
<input type="password" placeholder="Votre mot de passe" name="password"> 
```

3. **Cases à cocher (`checkbox`):** Les cases à cocher permettent aux utilisateurs de sélectionner plusieurs options parmi un groupe d'éléments.

```html
<input type="checkbox" name="sport" value="football"> Football <!--le name sera identique pour les checkbox qu'on veut rattacher ensemble-->
<input type="checkbox" name="sport" value="basketball"> Basketball
```

Le `name` servira à regrouper des checkbox autour d'une thématique commune. C'est l'attribut `value` qui nous retournera la valeur de nos checkboxes indépendantes.

4. **Boutons radio (`radio`):** Les boutons radio permettent aux utilisateurs de ne sélectionner qu'une seule option parmi un groupe d'éléments. C'est là aussi l'attribut `name` qui permet de rattacher les éléments entre eux.

```html
<input type="radio" name="sport" value="football"> Football
<input type="radio" name="sport" value="basketball"> Basketball
```

5. **E-mail (`email`):** Utilisé pour collecter des adresses e-mail. Il vérifie la validité de la syntaxe de l'adresse saisie (ne vérifie que le `@`). La vérification n'est faite qu'au moment de l'envoi du formulaire.

```html
<input type="email" placeholder="Votre email" name="sport">
```

6. **Date (`date`):** Utilisé pour collecter des dates, il affiche un sélecteur de date. Attention, il est en anglais par défaut.

```html
<input type="date" name="date">
```

7. **Numérique (`number`):** Ce type d'input permet aux utilisateurs de saisir des valeurs numériques.
Les lettres ne sont pas prises en compte.
On peut y ajouter les attributs `min` et `max` pour définir un nombre minimum et un nombre maximum et on peut choisir le pas (par défaut de 1) avec l'attribut `step`.

```html
<input type="number" name="quantite" min="0" max="10" step="1">
```

8. **URL (`url`):** Utilisé pour collecter des URLs (adresses de sites web), il vérifie la validité de la syntaxe saisie.

```html
<input type="url" placeholder="Votre lien" name="URL_web">
```
