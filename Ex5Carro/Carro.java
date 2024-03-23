public class Carro {
    private String marca, modelo, placa;
    private int ano, velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public void acelerar() { velocidadeAtual += 10; }

    public void frear() {
        velocidadeAtual = Math.max(0, velocidadeAtual - 10);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPlaca: " + placa + "\nVelocidade Atual: " + velocidadeAtual);
    }
}











/*Em uma tranquila cidade conhecida por sua paixão por automobilismo, um grupo de entusiastas decarros clássicos decide organizar um evento para exibir seus veículos. Para tornar o evento maisinteressante, eles planejam criar um sistema que permita aos participantes registrarem seus carros,incluindo informações detalhadas e a capacidade de controlar algumas funcionalidades dos carros, comoa velocidade.Motivado por esse evento de carros clássicos, o desafio é desenvolver uma classe `Carro` em Java,aplicando os princípios da orientação a objetos. Este sistema deve permitir aos usuários criarem objetos`Carro` com informações como marca, modelo, ano e velocidade atual. Além disso, os carros devem termétodos que permitam acelerar e frear, ajustando a velocidade atual de acordo com a ação realizada.Dica:“Desenvolva a classe ‘Carro’ com atributos privados para ‘marca’, ‘modelo’, ‘ano’, ‘placa’ e ‘velocidadeAtual’.Implemente um construtor para inicializar os atributos do carro quando um novo objeto é criado. Adicione métodospúblicos para `acelerar()`, que aumenta a velocidade do carro, e `frear()`, que diminui a velocidade. Não esqueça deincluir um método para exibir as informações do carro, refletindo a importância da encapsulação e da interaçãoentre os objetos em um programa orientado a objetos.*/