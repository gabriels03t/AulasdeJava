import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("João", "123456789"));
        agenda.adicionarContato(new Contato("Maria", "987654321"));
        agenda.adicionarContato(new Contato("Pedro", "456789123"));

        List<Contato> contatosEncontrados = agenda.buscarContatos("Maria");

        System.out.println("Contatos encontrados:");
        for (Contato contato : contatosEncontrados) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }
}
