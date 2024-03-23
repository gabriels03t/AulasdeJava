public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }

    public int getCodigo() { return codigo; }

    public double getPreco() { return preco; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    public void atualizarEstoque(int quantidade) { quantidadeEstoque += quantidade; }

    public void removerDoEstoque(int quantidade) { quantidadeEstoque -= quantidade; }

    public double calcularValorTotal() { return preco * quantidadeEstoque; }
}

















/*Um empreendedor que gerencia um mercado local percebe a necessidade de um sistema para gerenciaro estoque de produtos em sua loja. Ele deseja desenvolver um programa em Java que seja capaz deregistrar informações sobre os produtos disponíveis, controlar as quantidades em estoque e fornecerfuncionalidades básicas de gerenciamento de estoque. O sistema proposto deve permitir que cadaproduto seja identificado por seu nome, um código único, um preço e a quantidade em estoque.Os funcionários do mercado devem ser capazes de adicionar novos produtos ao estoque, atualizar asinformações de um produto existente e remover produtos do estoque quando necessário. Para facilitaro gerenciamento do mercado, o sistema também deve ser capaz de gerar relatórios sobre o estoqueatual, incluindo informações como os produtos disponíveis, a quantidade em estoque e o valor total emestoque.Dica:“Como já deve ter entendido com os últimos exercícios, aqui você pode criar uma classe Produto que contémas informações sobre cada item do mercado, entre nome, código do produto, quantidade em estoque e preço.Neste caso, não é necessário criar uma classe Mercado para gerenciar o estoque individual de cadas mercadoe pode-se utilizar a própria Main que faz o programa funcionar para isso.”*/