package Ex3ContaBancaria;


public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInfo() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }
}


/*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebeuma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criarum sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiriaacompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizadae automatizada.Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema degerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. Osistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores nosistema. Dica:“Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel`do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitira manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,subir de nível e exibir as informações do jogador.*/

