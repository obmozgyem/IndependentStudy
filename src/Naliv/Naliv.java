package Naliv;

public class Naliv {
    public static void main(String[] args) {

        Integer x=128;
        Integer y = 128;
        System.out.println(x.equals(y));
        System.out.println(x==y);


        double firstLevelWater = 0.94;
        double lastLevelWater = 0.90;
        int min = 180;



        double timeForMin = (double) min / 1440;

        double level = firstLevelWater / lastLevelWater;

        double coefficient = 0.036;


        double result = coefficient * ((Math.log10(level)) / timeForMin);
        System.out.println(result);


    }
}
