public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value;

        for (int i = 0; i < numbers.length; i++) {
            value = numbers[i];
            if(value % 2 == 1) {
                value+=2;
                System.out.println("Index par = " + i + " Numero: " + numbers[i] + " + 2 = " + value);
            }
            else {
                value *= 2;
                System.out.println("Index impar = " + i + " Numero: " + numbers[i] + " * 2 = " + value);
            }
        }
    }
}