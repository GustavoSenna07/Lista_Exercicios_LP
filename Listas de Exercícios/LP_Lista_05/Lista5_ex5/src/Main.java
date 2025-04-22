public class Main {
    public static void main(String[] args) {
        int [] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] v2 = new int [10];
        int indexV2 = 0;

        for (int i = v1.length; i > 0; i--) {
            v2[indexV2] = v1[i-1];
            indexV2++;
        }

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " - ");
        }

        System.out.println("\n---------");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " - ");
        }
    }
}