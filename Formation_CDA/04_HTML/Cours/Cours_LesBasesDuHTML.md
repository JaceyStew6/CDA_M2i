# Les bases du HTML

> *Le HTML (HyperText Markup Language) est le langage de balisage utilisé pour créer et structurer le contenu d'une page web.*  
Il s'agit d'une composante fondamentale du World Wide Web, permettant aux créateurs de sites web de définir la structure et la présentation des informations affichées dans un navigateur. HTML fonctionne donc en utilisant un système de balises qui décrivent le type de contenu et sa mise en forme.

## Notions clés

1. **Balises et éléments :** *(Tags and elements)* En HTML, le contenu est structuré à l'aide de balises. Les balises sont des éléments entourés de chevrons angulaires (<>). Elles sont utilisées pour définir différents types de contenus tels que les titres, les paragraphes, les images, les liens, etc.

Si je souhaite inclure des chevrons dans mon texte qui ne soient pas considérés comme une ouverture de balise HTML, je peux utiliser le caractère d'échappement `&` avec les suffixes `lt` *(lesser than)* ou `gt` *(greater than)*.

2. **Balises ouvrantes et fermantes** *(Opening tags and closing tags)* La plupart des balises HTML ont une balise ouvrante et une balise fermante pour délimiter le contenu qu'elles affectent. La balise fermante est différente de la balise ouvrant, elle a un (/) qui se situe juste avant le nom de l'élément.

*Exemple d'une paire de balises:*

```html
<p>Ceci est un paragraphe</p>
```

3. **Balises orphelines ou auto-fermantes:** *(Self-closing tags)* Il existe cependant quelques exceptions, certaines balises n'ont pas besoin de contenir de texte, on les nomme balises orphelines (ou auto-fermantes).

*Exemple d'une balise orpheline*

```html
<hr/>
<hr> <!--Plus obligé de mettre le slash depuis quelques années, mais peut se confondre avec une balise ouvrante-->
```

4. **Hiérarchisation:** *(Nesting)* Vous pouvez imbriquer des balises les unes dans les autres pour créer une structure hiérarchique.   
Les balises internes sont contenues à l'intérieur des balises externes.

*Exemple d'imbrication de balises*

```html
<ul>
    <li>Objet 1</li>
    <li>Objet 2</li>
    <li>Objet 3</li>
</ul>
```

5. **Attributs:** Les balises peuvent avoir des attributs qui fournissent des informations supplémentaires sur l'élément. Les attributs sont toujours spécifiés à l'intérieur de la balise ouvrante.

*Exemple d'attributs*
```html
<p title="Informations supplémentaires">Ceci est un paragraphe</p>
```

6. **Structure de base:** Une page HTML commence généralement par une déclaration de type de document (`<!DOCTYPE>`) suivi d'une balise `<html>` qui va elle même contenir les balises `<head>` et `<body>`.

```html
<!DOCTYPE html>
<html lang="fr">
    <head></head>  <!--meta données-->
    <body></body>  <!--données-->
</html>
```

L'HTML fournit la structure fondamentale d'une page web mais pour définir le style et le comportement, il est souvent utilisé en combinaison avec des langages tels que le CSS (Cascading Style Sheets) pour la mise en page et Javascript pour l'interaction dynamique avec les utilisateurs.

## Les balises de base

`<h1></h1>` : Balise de titrage  

```html
<h1>Titre de niveau 1</h1>
<h2>Titre de niveau 2</h2>
<h3>Titre de niveau 3</h3>
<h4>Titre de niveau 4</h4>
<h5>Titre de niveau 5</h5>
<h6>Titre de niveau 6</h6>
```

`<p></p>` : Balise de paragraphe  
`<br/>` : Balise de retour à la ligne (break)  
`<hr/>` : Balise de séparateur

## Les balises de mise en forme

```html
<b>Met le texte en gras</b>
<i>Met le texte en italique</i>
<u>Souligne le texte</u>
```

On évitera d'utiliser ces trois balises, on préfèrera appliquer le style en CSS.

`<strong></strong>` Indique l'importance d'une partie de texte (le navigateur appliquera du gras).  
`<em></em>` Met l'emphase sur une partie de texte, donc isolera un élément (le navigateur appliquera de l'italique).

`<code></code>` Vous pouvez entourer du code avec cette balise mais ne prendra pas en compte les espacements.
`<pre></pre>` Similaire à `<code>`. Vous pouvez entourer du code avec cette balise et celle-ci prendra en compte les espacements et toute l'indentation. Cela peut être utile si vous avez un code HTML bien formaté que vous souhaitez afficher tel quel.

## Les liens et les ancres

La balise `<a>` en HTML est utilisée pour créer des hyperliens, communément appelés liens hypertextes, dans une page web. Les liens permettent aux utilisateurs de naviguer vers d'autres pages web, de télécharger des fichiers, d'envoyer des mails ou simplement de naviguer à l'intérieur d'une même page.

### Syntaxe de base :

```html
<a href="https://www.example.com">Cliquez ici pour visiter Example.com</a>
```

### Attributs courants de la balise `<a>`:

1. `href` : cet attribut spécifie l'URL de destination vers laquelle le lien pointe. Il peut s'agir d'une URL absolue (commençant par "https://") ou relative (par rapport à la page actuelle).

2. `target` : Cet attribut détermine comment la page liée sera affichée. Les valeurs courantes sont:
    - `_blank` : Ouvre le lien dans une nouvelle fenêtre ou un nouvel onglet du navigateur.
    - `_self` : Ouvre le lien dans la même fenêtre ou onglet (par défaut).