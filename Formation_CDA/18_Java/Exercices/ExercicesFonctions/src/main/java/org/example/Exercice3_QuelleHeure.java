package org.example;

public class Exercice3_QuelleHeure {

    //Écrire une fonction quelle_heure
    //Cette fonction aura un paramètre heure de type str
    //Ce paramètre aura "12h00" comme valeur par défaut
    //La fonction ne retournera aucun résultat mais affichera l'heure directement
    //exemple : quelle_heure() => résultat : "il est 12h00"
    //exemple : quelle_heure("14h00") => résultat : "il est 14h00"

    //Première soluce
    /*public static String quelleHeure(String ...heure){
        var hour = "12h00";
        for (var item : heure) {
            hour = item;
        }
//        System.out.println(hour);
        return (String) "Il est " + hour;
    }*/

    //-----------------------
    //Seconde soluce
    public static void quelleHeure(){
        System.out.println("Il est 12h00");
    };

    public static void quelleHeure(String heure){
        System.out.println("Il est " + heure);
    };

    public static void main(String[] args) {
        quelleHeure();
        quelleHeure("14h00");
    }
}
