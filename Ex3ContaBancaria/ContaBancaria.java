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


/*Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar agerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficouevidente a necessidade de um método mais eficiente e seguro para o manejo de transaçõesbancárias, que até então eram feitas manualmente e levavam muito tempo.Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancáriosimples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contasbancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas desaldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo osprincípios da programação orientada a objetos.Dica:“Projete uma classe `ContaBancaria` que encapsule os atributos de uma conta, como `numeroConta`,`nomeTitular` e `saldo`. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dosdados. Implemente métodos para `depositar(valor)`, `sacar(valor)` e um método que retorne o `saldo` atual daconta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.”*/

