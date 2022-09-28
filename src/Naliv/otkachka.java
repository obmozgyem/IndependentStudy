package Naliv;

public class otkachka {
    public static void main(String[] args) {
        double V=0.002; // в м3
        int minut = 17;


        double time=(double)minut/1440;


        double D=0.4;
        double l=0.3;

        double constant=2*D*l+V;
        System.out.println("Время в сутка = " + time);
        System.out.println(V /(constant*time));

    //    double result=
    }
}
