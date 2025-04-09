import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fah, celsius;

        for(int i = -80; i <= 80; i++) {
            fah = i;
            celsius = (fah - 32) * 5 / 9;
            System.out.println("Fahrenheit = " + fah + "Fº" +
                    "\nCelsius = " + celsius + "Cº" +
                    "\n -----------------");
        }


    }
}