import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resultado, resposta, option, score = 0;
        option = 1;

        Scanner in = new Scanner(System.in);

        while(option == 1) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    resultado = j * i;
                    System.out.println(i + " X " + j + " = ?");
                    System.out.println("Digite a Resposta: ");
                    resposta = in.nextInt();

                    if (resposta == resultado) {
                        score ++;
                        System.out.println("Você Acertou! Proxima pergunta: " +
                                "\n ------------------");
                    } else {
                        System.out.println("Fim de Jogo, Você Perdeu!" +
                                "\nA resposta era: " + resultado);
                        i = 10;
                        j = 10;
                    }
                }

                if(score >= 110) {
                    System.out.println("Parabéns, Você acertou Tudo!" +
                            "\n-------------------");
                }
            }

            System.out.println("Escolha uma Das opções: " +
                    "\n1- Jogar de Novo " +
                    "\n2- Parar de jogar" +
                    "\n------------------");
            option = in.nextInt();

            switch (option) {
                case 1:
                    option = 1;
                    score = 0;
                    break;
                case 2:
                    option = 2;
                    break;
                default:
                    option = 2;
                    break;
            }
        }
    }
}