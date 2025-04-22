public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int tempNumber = numbers.length -1;

        while (tempNumber >= 0) {
            System.out.println(numbers[tempNumber]);
            tempNumber--;
        }
    }
}