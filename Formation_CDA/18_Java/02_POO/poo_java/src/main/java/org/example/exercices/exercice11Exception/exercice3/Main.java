package org.example.exercices.exercice11Exception.exercice3;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        try{
            int element = getElement(tableau,4);
            System.out.println("Element recupere : "+ element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Erreur : Index hors limites. !!!");
        }


    }

    public static int getElement(int[] tableau, int index){
        return tableau[index];
    }
}
