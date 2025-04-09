public class Main {
    public static void main(String[] args) {
        int number = 4;
        int divisable;
        for(int i = 4; i <= 204; i++) {
            if(number % 4 == 1) {
                divisable = number;
                System.out.println("O numero " + (divisable-1) + " é Divisivel por 4" +
                        "\n -------------------");
                number++;
            }
            else {
                number++;
            }

        }
    }
}