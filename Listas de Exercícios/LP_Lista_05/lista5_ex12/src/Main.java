public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 1},
                {4, 1, 5},
                {7, 2, 6}
        };

        int a11 = matriz[0][0];
        int a12 = matriz[0][1];
        int a13 = matriz[0][2];

        int a21 = matriz[1][0];
        int a22 = matriz[1][1];
        int a23 = matriz[1][2];

        int a31 = matriz[2][0];
        int a32 = matriz[2][1];
        int a33 = matriz[2][2];

        int determinante = a11 * (a22 * a33 - a23 * a32)
                - a12 * (a21 * a33 - a23 * a31)
                + a13 * (a21 * a32 - a22 * a31);

        System.out.println("Determinante da matriz: " + determinante);
    }
    }
}