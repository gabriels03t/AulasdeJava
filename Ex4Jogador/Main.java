package Ex4Jogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de jogadores!");

        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("Digite a pontuação do jogador:");
        int pontuacao = scanner.nextInt();

        System.out.println("Digite o nível do jogador:");
        int nivel = scanner.nextInt();

        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        jogador.exibirInformacoes();

        jogador.aumentarPontuacao(50);
        jogador.subirNivel();

        System.out.println("\nInformações atualizadas do jogador:");
        jogador.exibirInformacoes();

        scanner.close();
    }
}
