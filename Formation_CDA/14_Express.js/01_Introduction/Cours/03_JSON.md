# JSON: JavaScript Object Notation

JSON est un format léger d'échange de données qui est facile à lire et à écrire pour les humains, et facile à analyser et à générer pour les machines. Il est souvent utilisé pour la transmission de données entre un serveur et un client web.

### JSON.parse()

La fonction `JSON.parse()` est utilisée pour convertir une chaîne JSON en un objet JavaScript. Voici comment vous pouvez l'utiliser :

```jsx
const jsonString = '{"name": "John", "age": 30, "city": "New York"}';
const jsonObject = JSON.parse(jsonString);

console.log(jsonObject);
// Output: { name: 'John', age: 30, city: 'New York' }

```

Dans cet exemple, `jsonString` est une chaîne de caractères représentant un objet JSON. `JSON.parse()` analyse cette chaîne et retourne un objet JavaScript correspondant.

### JSON.stringify()

La fonction `JSON.stringify()` fait l'inverse de `JSON.parse()`. Elle prend un objet JavaScript et le convertit en une chaîne JSON :

```jsx
const jsonObject = { name: 'John', age: 30, city: 'New York' };
const jsonString = JSON.stringify(jsonObject);

console.log(jsonString);
// Output: '{"name":"John","age":30,"city":"New York"}'

```

Ici, `jsonObject` est un objet JavaScript, et `JSON.stringify()` le convertit en une chaîne JSON.

### Exemple combiné :

```jsx
const originalObject = { name: 'Alice', age: 25, city: 'London' };
const jsonString = JSON.stringify(originalObject);

// Sending the JSON string to a server, storing in a database, etc.

const receivedString = '{"name":"Bob","age":28,"city":"Paris"}';
const receivedObject = JSON.parse(receivedString);

console.log(receivedObject);
// Output: { name: 'Bob', age: 28, city: 'Paris' }

```

Ces fonctions sont particulièrement utiles dans des scénarios où vous avez besoin d'envoyer des données entre un client et un serveur, ou pour stocker des données structurées de manière lisible dans un fichier.