package org.example.exociternes;

public class main {
    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank();
        WaterTank waterTank2 = new WaterTank(15, 30, 10);

        waterTank1.totalWeigth(1);
        waterTank2.totalWeigth(2);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Quantité d'eau dans la citerne 1: " + waterTank1.getFillingLevel() );
        System.out.println("Quantité d'eau dans la citerne 2: " + waterTank2.getFillingLevel() );
        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalWaterTankVolume());
        System.out.println("-----------------------------------------------------------");
        waterTank1.fillingWaterTank(1, 12);
        waterTank2.fillingWaterTank(2, 25);
        waterTank2.drainWaterTank(2, 35);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Quantité d'eau dans la citerne 1: " + waterTank1.getFillingLevel() );
        System.out.println("Quantité d'eau dans la citerne 2: " + waterTank2.getFillingLevel() );
        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalWaterTankVolume());
    }
}
