import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double heigth, base, ray, hipotenusa, pi, area, perimetro, sqrt;
        int option;

        pi = 3.14;

        Scanner in = new Scanner(System.in);

        System.out.println("--------------------" +
                "\n MENU" +
                "\n Escolha uma das opções Abaixo" +
                "\n 1. Circulo" +
                "\n 2. Triângulo Retângulo" +
                "\n 3. Retângulo" +
                "\n --------------------");
        System.out.println("Escolha uma opção: " +
                "\n --------------------");
        option = in.nextInt();

        switch(option) {
            case 1:
                System.out.println("Digite o valor do Raio: ");
                ray = in.nextDouble();

                System.out.println("--------------------" +
                        "\n Raio:" + ray + "\n --------------------");

                perimetro = 2*pi*ray;

                area = pi * (ray*ray);

                System.out.println("Perimetro = " + perimetro +
                        "\n Area = " + area);
                break;
            case 2:
                System.out.println("Digite o valor da Base e Da altura: ");
                base = in.nextDouble();
                heigth = in.nextDouble();

                System.out.println("--------------------" +
                        "\n Base = " + base +
                        "\n Altura = " +  heigth +
                        "--------------------");
                hipotenusa = Math.sqrt((base*base) + (heigth*heigth));
                perimetro = base + heigth + hipotenusa;

                area = hipotenusa + base + heigth;

                System.out.println("Perimetro = " + perimetro +
                        "\n Area = " + area);
                break;
            case 3:
                System.out.println("Digite o valor da Base e Da altura: ");
                base = in.nextDouble();
                heigth = in.nextDouble();

                System.out.println("--------------------" +
                        "\n Base = " + base +
                        "\n Altura = " +  heigth +
                        "--------------------");
                perimetro = (base *2) + (heigth * 2);
                area = base * heigth;

                System.out.println("Perimetro = " + perimetro +
                        "\n Area = " + area);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}