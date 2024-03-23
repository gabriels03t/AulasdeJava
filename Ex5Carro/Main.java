public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "ABC1234");

        carro1.acelerar();
        carro1.acelerar();

        carro1.frear();

        carro1.exibirInformacoes();
    }
}
