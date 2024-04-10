package org.example.exociternes;

public class WaterTank {

    //Attributs
    private int emptyWeigth;
    private int fullCapacity;
    private int fillingLevel;
    //Attribut pour la totalité des volumes des citernes d'eau
    private static int totalWaterTankVolume;

    //Constructeur
    public WaterTank() {
        this(20, 50, 0);
    }

    public WaterTank(int emptyWeigth, int fullCapacity, int fillingLevel) {
        this.emptyWeigth = emptyWeigth;
        this.fullCapacity = fullCapacity;
        this.fillingLevel = fillingLevel;
        totalWaterTankVolume += this.fillingLevel;
    }

    //Méthode poids total de la citerne
    public int totalWeigth(int waterTankNbr) {
        int totalWeigth = this.emptyWeigth + this.fillingLevel;
        System.out.println("Poids total de la citerne " + waterTankNbr + ": " + totalWeigth);
        return totalWeigth;
    }

    //Méthode remplissage de la citerne avec un nombre de litres d'eau
    public int fillingWaterTank(int waterTankNbr, int waterQuantityToAdd) {
        this.fillingLevel += waterQuantityToAdd;
        if (this.fillingLevel <= this.fullCapacity) {
            System.out.println("Quantité d'eau dans la citerne " + waterTankNbr + " après l'ajout de " + waterQuantityToAdd + " litres : " + this.fillingLevel + "/" + this.fullCapacity);
//            totalWaterTankVolume += this.fillingLevel;
            setTotalWaterTankVolume(getTotalWaterTankVolume() + this.fillingLevel);
        } else if (this.fillingLevel > this.fullCapacity) {
            System.out.println("Quantité d'eau dans la citerne " + waterTankNbr + " après l'ajout de " + waterQuantityToAdd + " litres : " + this.fullCapacity + "/" + this.fullCapacity);
            int surplus = this.fillingLevel - this.fullCapacity;
            System.out.println("Excès d'eau récupéré dans la citerne " + waterTankNbr + ": " + surplus);
            this.fillingLevel = this.fullCapacity;
//            totalWaterTankVolume += waterQuantityToAdd - surplus;
            setTotalWaterTankVolume(getTotalWaterTankVolume() + waterQuantityToAdd - surplus);
        }
        return this.fillingLevel;
    }

    //Méthode pour vider la citerne d'un nombre de litres d'eau
    public int drainWaterTank(int waterTankNbr, int waterQuantityToDrain) {
        int availableWater = this.fillingLevel;
        if (availableWater < waterQuantityToDrain) {
            System.out.println("Quantité d'eau dans la citerne " + waterTankNbr + " après tentative de retrait de " + waterQuantityToDrain + " litres :  0/" + this.fullCapacity);
            System.out.println("Quantité d'eau récupérée dans la citerne " + waterTankNbr + ": " + availableWater);
//            totalWaterTankVolume -= availableWater;
            setTotalWaterTankVolume(getTotalWaterTankVolume() - availableWater);
            this.fillingLevel = 0;
        } else {
            this.fillingLevel -= waterQuantityToDrain;
            System.out.println("Quantité d'eau dans la citerne " + waterTankNbr + " après le retrait de " + waterQuantityToDrain + " litres : " + this.fillingLevel + "/" + this.fullCapacity);
//            totalWaterTankVolume = this.fillingLevel;
            setTotalWaterTankVolume(getTotalWaterTankVolume() - waterQuantityToDrain);
        }
        return this.fillingLevel;
    }

    public int getFillingLevel() {
        return fillingLevel;
    }

    public static int getTotalWaterTankVolume() {
        return totalWaterTankVolume;
    }

    public static void setTotalWaterTankVolume(int totalWaterTankVolume) {
        WaterTank.totalWaterTankVolume = totalWaterTankVolume;
    }
}
