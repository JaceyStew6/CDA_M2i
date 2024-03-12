# React Native
## Astuces et bonnes pratiques

- `.map()` permettant de parcourir une liste fonctionne mais c'est une mauvaise pratique de l'utiliser en React Native. On va plutôt lui préférer un component `<FlatList/>` qui peut contenir des props.

```jsx
<View>
    <FlatList
        data={tab} //où est-ce qu'on récupère
        renderItem={(itemData) => { //Comment est-ce qu'on rend
            return(
                <View>
                    <Text>{itemData.item.text} {itemData.item.id}</Text>
                </View>
            )
        }}
        keyExtractor={(item, index) => {
            return index;
        }}
    />
</View>
```

On récupère ici les données d'un tableau `tab` qu'on a déclaré au préalable.



- Déclarer les states (`useState()`) tout en haut (juste après l'export) fait partie des bonnes pratiques.