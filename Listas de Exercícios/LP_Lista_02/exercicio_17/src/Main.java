import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialSpeed, acceleration, time, speed;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Velocidade inicial (m/s): ");
        initialSpeed = in.nextDouble();

        System.out.println("Digite a Aceleração (m/s^2): ");
        acceleration = in.nextDouble();

        System.out.println("Digite o Tempo (s): ");
        time = in.nextDouble();

        speed = initialSpeed + acceleration * time;
        System.out.println("A velocidade é de: " + speed + "m/s");
    }
}