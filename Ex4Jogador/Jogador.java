package Ex4Jogador;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void aumentarPontuacao(int pontos) {
        pontuacao += pontos;
    }

    public void subirNivel() {
        nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}







/*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada e automatizada.
Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome, pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no sistema.
Dica: 
“Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel` do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitir a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação, subir de nível e exibir as informações do jogador.”*/

