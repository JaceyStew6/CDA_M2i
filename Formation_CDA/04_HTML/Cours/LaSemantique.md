# La sémantique en HTML

## Les balises spécifiques

`<header></header>` *(A ne pas confondre avec `<head>`)*: Utilisé pour représenter l'en-tête d'une section ou d'une page web. Il peut contenir des éléments tels que le logo, le titre de la page ou de la section, la navigation principale...  

`<nav></nav>`: Utilisée pour représenter une section de navigation dans une page web. Elle contient donc les liens vers d'autres parties du site. Il n'est pas rare de trouver une balise `<nav>` dans une balise `<header>` (c'est même la norme) même si elle peut s'employer dans d'autres contextes et plusieurs fois par page.  

`<main></main>`: Utilisé pour représenter le contenu principal d'une page web. Il devrait contenir le contenu central et unique de la page. Contient l'ensemble du contenu qui va changer d'une page à une autre. Peut prendre plusieurs des balises ci-dessous.  

`<section></section>`: Utilisé pour diviser le contenu en sections thématiques. Peut aussi être une délimitation fonctionnelle de notre site. 

`<article></article>`: Utilisé pour représenter un contenu autonome et indépendant, comme un article de blog ou une publication. Peut-être placé dans une section ou contenir une ou plusieurs sections.  

`<aside></aside>`: Utilisé pour représenter du contenu annexe ou supplémentaire qui est généralement mis en évidence à côté du contenu principal, comme des informations complémentaires, des publicités...   

`<footer></footer>`: Utilisé pour représenter le pied d'une section ou de notre page web. Il peut contenir des informations de contact, des liens de navigation supplémentaires, etc.

`<figure></figure>`: Utilisé pour encapsuler un contenu multimédia (image, vidéo, illustration...) avec une légende associée (mais facultative), la `<figcaption></figcaption>`


## Les balises génériques

`<div></div>`: Elle est principalement utilisée pour regrouper des éléments en bloc et créer une structure de page. Elle ne nécessite pas un contexte spécifique. L'accessibilité et le référencement seront fortement impactés par son utilisation. **Lui préférer des balises spécifiques lorsqu'elles sont applicables.**

`<span></span>`: Elle n'est pas une balise de bloc mais une balise en ligne. Elle sert à appliquer des styles ou modifications à une portion de texte à l'intérieur d'un élement plus large.