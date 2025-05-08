import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Tamanho da primeira matriz (A)
        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = in.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = in.nextInt();

        // Tamanho da segunda matriz (B)
        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = in.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = in.nextInt();

        // Validação da multiplicação
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar: o número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
            return;
        }

        // Criação das matrizes
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB]; // resultado

        // Preenchendo matriz A
        System.out.println("\nDigite os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = in.nextInt();
            }
        }

        // Preenchendo matriz B
        System.out.println("\nDigite os valores da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = in.nextInt();
            }
        }

        // Multiplicação das matrizes
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibindo resultado
        System.out.println("\nResultado da Matriz (A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\n");
            }
            System.out.println();
        }
    }
}