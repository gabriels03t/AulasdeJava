package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        System.out.println("Informações do Livro 1:");
        livro1.exibirInfo();
        System.out.println();

        System.out.println("Informações do Livro 2:");
        livro2.exibirInfo();
    }
}

