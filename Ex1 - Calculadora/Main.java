package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Adição: " + Calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));

        scanner.close();
    }
}
