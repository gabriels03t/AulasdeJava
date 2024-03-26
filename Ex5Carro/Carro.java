class Carro {
    private String marca, modelo, placa;
    private int ano, velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    // Método para acelerar o carro
    public void acelerar(int aumentoVelocidade) {
        this.velocidadeAtual += aumentoVelocidade;
    }

    // Método para frear o carro
    public void frear(int diminuicaoVelocidade) {
        if (this.velocidadeAtual - diminuicaoVelocidade >= 0) {
            this.velocidadeAtual -= diminuicaoVelocidade;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }
}