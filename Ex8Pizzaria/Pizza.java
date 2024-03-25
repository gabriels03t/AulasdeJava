class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;

    public Pizza(String nome, double valor, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return nome + " - R$" + valor + " - Ingredientes: " + ingredientes;
    }
}