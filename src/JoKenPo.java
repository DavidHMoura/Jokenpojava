import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("=== JO-KEN-PÔ ===");
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("\nEscolha sua jogada:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.print("Digite o número (1-3): ");

            int escolhaJogador = lerEscolhaValida(sc);

            int escolhaComputador = rnd.nextInt(3) + 1; // 1..3

            System.out.println("\nVocê escolheu: " + nomeEscolha(escolhaJogador));
            System.out.println("Computador escolheu: " + nomeEscolha(escolhaComputador));

            int resultado = verificaVencedor(escolhaJogador, escolhaComputador);
            switch (resultado) {
                case 0 -> System.out.println("Empatou!");
                case 1 -> System.out.println("Você ganhou! 🎉");
                case -1 -> System.out.println("Computador ganhou. 😢");
            }

            System.out.print("\nQuer jogar novamente? (s/n): ");
            jogarNovamente = lerSimNao(sc);
        }

        System.out.println("\nValeu por jogar! Até a próxima.");
        sc.close();
    }

    private static int lerEscolhaValida(Scanner sc) {
        while (true) {
            String entrada = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n >= 1 && n <= 3) {
                    return n;
                } else {
                    System.out.print("Entrada inválida. Digite 1, 2 ou 3: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite 1, 2 ou 3: ");
            }
        }
    }

    private static String nomeEscolha(int n) {
        return switch (n) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            default -> "Desconhecido";
        };
    }

    private static int verificaVencedor(int jogador, int computador) {
        if (jogador == computador) return 0;

        if ((jogador == 1 && computador == 3) ||
            (jogador == 2 && computador == 1) ||
            (jogador == 3 && computador == 2)) {
            return 1;
        } else {
            return -1;
        }
    }

    private static boolean lerSimNao(Scanner sc) {
        while (true) {
            String r = sc.nextLine().trim().toLowerCase();
            if (r.equals("s") || r.equals("sim")) return true;
            if (r.equals("n") || r.equals("nao") || r.equals("não")) return false;
            System.out.print("Por favor responda 's' para sim ou 'n' para não: ");
        }
    }
}
