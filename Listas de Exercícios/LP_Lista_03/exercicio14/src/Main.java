import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, percentage, result, parcela, taxa, desconto, mes;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite aqui o Valor da Compra:  ");
        value = in.nextDouble();

        System.out.println("--------------------" +
                "\n MENU" +
                "\n Escolha a forma de Pagamento: " +
                "\n 1. Débito - 5% de Desconto" +
                "\n 2. Pix - 10% de Desconto" +
                "\n 3. Crédito - 2% de Taxa em até 4x, 5% em até 10x" +
                "\n --------------------");
        System.out.println("Escolha uma opção: " +
                "\n --------------------");
        option = in.nextInt();

        switch(option) {
            case 1:
                percentage = 5;
                desconto = (value*percentage)/100;
                result = value - desconto;
                System.out.println("Você recebeu 5% de Desconto, o valor foi de: R$" + value + " Para: R$" + result);
                break;
            case 2:
                percentage = 10;
                desconto = (value*percentage)/100;
                result = value - desconto;
                System.out.println("Você recebeu 10% de Desconto, o valor foi de: R$" + value + " Para: R$" + result);
                break;
            case 3:
                System.out.println("Escolha em Quantas Vezes Parcelar (Maximo 10x): ");
                parcela = in.nextDouble();

                if(parcela <= 4 && parcela > 0) {
                    System.out.println("Taxa de 2%, pelo total de " + parcela + " meses");
                    percentage = 2;
                    taxa = (value*percentage)/100;
                    result = (value)+(taxa*parcela);
                    mes = (result/parcela);
                    System.out.println("O valor foi de: R$" + value + " Para: R$" + result + "em um total de " + parcela + " vezes" +
                            "\n R$" + mes + " por Mês");
                }
                else if(parcela <= 10) {
                    System.out.println("Taxa de 5%, pelo total de " + parcela + " meses");
                    percentage = 5;
                    taxa = (value*percentage)/100;
                    result = (value)+(taxa*parcela);
                    mes = (result/parcela);
                    System.out.println("O valor foi de: R$" + value + " Para: R$" + result + " em um total de " + parcela + " vezes" +
                            "\n R$" + mes + " por Mês" );
                }
                else {
                    System.out.println("Opção Invalida");
                }
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}