package Ex4Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("João");

        jogador.aumentarPontuacao(100);
        jogador.subirNivel();

        jogador.exibirInformacoes();
    }
}

