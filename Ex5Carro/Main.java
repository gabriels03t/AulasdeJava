import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("Deseja acelerar ou frear o carro? (Digite 'acelerar' ou 'frear'):");
        String acao = scanner.nextLine().trim().toLowerCase(); // Converter para minúsculas

        Carro carro1 = new Carro(marca, modelo, ano, placa);

        if (acao.equals("acelerar")) {
            System.out.println("Quantidade para acelerar:");
            int quantidade = scanner.nextInt();
            carro1.acelerar(quantidade);
        } else if (acao.equals("frear")) {
            System.out.println("Quantidade para frear:");
            int quantidade = scanner.nextInt();
            carro1.frear(quantidade);
        }

        // Exibindo informações do carro
        System.out.println("\nInformações do carro:");
        System.out.println("Ação: " + acao);
        carro1.exibirInformacoes();
    }
}