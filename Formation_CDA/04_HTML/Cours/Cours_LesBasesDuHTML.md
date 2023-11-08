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

>`<p></p>` : Balise de paragraphe  
`<br/>` : Balise de retour à la ligne (break)  
`<hr/>` : Balise de séparateur

## Les balises de mise en forme

```html
<b>Met le texte en gras</b>
<i>Met le texte en italique</i>
<u>Souligne le texte</u>
```

On évitera d'utiliser ces trois balises, on préfèrera appliquer le style en CSS.

>`<strong></strong>` Indique l'importance d'une partie de texte (le navigateur appliquera du gras).  
`<em></em>` Met l'emphase sur une partie de texte, donc isolera un élément (le navigateur appliquera de l'italique).

>`<code></code>` Vous pouvez entourer du code avec cette balise mais ne prendra pas en compte les espacements.  
`<pre></pre>` Similaire à `<code>`. Vous pouvez entourer du code avec cette balise et celle-ci prendra en compte les espacements et toute l'indentation. Cela peut être utile si vous avez un code HTML bien formaté que vous souhaitez afficher tel quel.

## Les liens et les ancres

La balise `<a>` en HTML est utilisée pour créer des hyperliens, communément appelés liens hypertextes, dans une page web. Les liens permettent aux utilisateurs de naviguer vers d'autres pages web, de télécharger des fichiers, d'envoyer des mails ou simplement de naviguer à l'intérieur d'une même page.

### Syntaxe de base :

```html
<a href="https://www.example.com">Cliquez ici pour visiter Example.com</a>
```

### Attributs courants de la balise `<a>`:

>1. `href` : cet attribut spécifie l'URL de destination vers laquelle le lien pointe. Il peut s'agir d'une URL absolue (commençant par "https://") ou relative (par rapport à la page actuelle).

>2. `target` : Cet attribut détermine comment la page liée sera affichée. Les valeurs courantes sont:
    - `_blank` : Ouvre le lien dans une nouvelle fenêtre ou un nouvel onglet du navigateur.
    - `_self` : Ouvre le lien dans la même fenêtre ou onglet (par défaut).

### Les liens internes (les ancres):

La balise `<a>` peut également être utilisée pour créer des liens internes à une même page, généralement pour permettre aux utilisateurs de sauter vers différentes parties de la page. On va relier pour cela notre balise `<a>` à un identifiant (doit être unique);

```html
<a href="#section2">Aller à la section 2</a>
...
...
...
<h2 id="section 2">Section 2</h2>
```

### Autres utilisations:

1. **Téléchargement de fichiers:**

L'attribut `download` indique au navigateur que le lien doit être téléchargé au lieu d'être affiché.

```html
<a href="mon-fichier.pfd" download>Télécharger le fichier PDF</a>
```

2. **Liens par courriels:**

Pour envoyer vers un courriel, on spécifie dans le chemin `mailto`.

```html
<a href="mailto:contact@example.com">Envoyer un e-mail</a>
```

### Conseils:

>- Assurez-vous que les liens sont clairs et descriptifs pour les utilisateurs.
>- Vérifiez que les URLs sont valides et fonctionnent correctement.
>- Vous pouvez ajouter des attributs `title` pour fournir un texte alternatif (pour l'accessibilité) lorsque le texte du lien n'est pas suffisament descriptif.

La balise `<a>` est l'un des éléments les plus importants pour la navigation et l'interaction dans une page web et elle offre de nombreuses possibilités pour améliorer l'expérience des utilisateurs.

## Types d'éléments et flux de page (display)

En HTML, les éléments sont classés en deux catégories principales: les éléments en ligne (inline elements) et les éléments de bloc (block-level elements). Ces catégories définissent comment les éléments sont affichés et comment ils interagissent les uns avec les autres dans une page web.

1. **Eléments de bloc (Block-level Elements):**  
    Les éléments de bloc sont des éléments HTML qui créent des boites de contenu distinctes dans la page.  
    Ils commencent sur une nouvelle ligne et s'étendent sur toute la largeur disponible de leur conteneur (sauf s'ils ont une largeur spécifiée).  
    Les éléments de bloc sont souvent utilisés pour structurer la mise en page d'une page web.  
    Par exemple, des éléments comme `<div>, <h1>, <p>, <li>, <ul>, <table>` etc. sont des éléments de bloc.
    Vous pouvez appliquer des styles tels que largeur, hauteur, marges, rembourrages (padding) ces éléments pour les personnaliser selon vos besoins.

2. **Eléments en ligne (Inline Elements):**  
    Les éléments en ligne sont des éléments HTML qui ne commençent pas sur une nouvelle ligne et occupent uniquement l'espace nécessaire autour de leur contenu?  
    Ils sont utilisés pour marquer du texte ou d'autres éléments au sein d'un paragraphe ou d'un élément de bloc.  
    Les éléments en ligne n'ont généralement pas de largeur ou de hauteur spécifiées, mais ils peuvent être stylisés en termes de couleur, style de police...   
    Les éléments en ligne courants comprennent `<span>, <a>, <strong>, <em>, <img>, <br>` etc.

## Les listes

En HTML, il exite deux types de listes: les liste organisées et les listes non-organisées. Selon celle que je choisis, j'appliquerai une balise différente, `<ol>` pour une liste organisée, `<ul>` pour une liste non-organisée.

Une fois que j'ai défini mon type de liste, j'englobe chacun de ses éléments indépendants autour d'une balise `<li>`.

```html
<ul>
    <li>Ceci est une liste non-organisée</li>
</ul>


<ol>
    <li>Ceci est une liste organisée</li>
</ol>
```