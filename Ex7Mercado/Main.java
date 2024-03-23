import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();

        estoque.add(new Produto("Arroz", 1, 10.0, 50));
        estoque.add(new Produto("Feijão", 2, 8.0, 40));
        estoque.add(new Produto("Azeite", 3, 15.0, 30));

        for (Produto produto : estoque) { produto.atualizarEstoque(5); }

        Produto produtoRemovido = estoque.remove(0);
        System.out.println("Produto removido: " + produtoRemovido.getNome());

        System.out.println("\nRelatório de Estoque:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade em Estoque: " + produto.getQuantidadeEstoque() + ", Valor Total em Estoque: " + produto.calcularValorTotal());
        }
    }
}
