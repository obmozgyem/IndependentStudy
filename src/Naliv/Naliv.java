package Naliv;

public class Naliv {
    public static void main(String[] args) {

        double firstLevelWater = 1.10;
        double lastLevelWater = 0.92;
        int min = 25;


        double timeForMin = (double) min / 1440;
        double p0 = 0.0635; //диаметр трубы

        double level = firstLevelWater / lastLevelWater;

        //   double coefficient = 0.57; //глина и суглинок!!!
        double coefficient = 1.45; //пески и супеси!!!!


        double result = (coefficient * p0) * ((Math.log10(level)) / timeForMin);
        System.out.println(timeForMin);
        System.out.println(result);


    }
}
