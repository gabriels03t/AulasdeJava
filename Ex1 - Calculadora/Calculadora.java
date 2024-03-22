package Calculadora;

public class Calculadora {

    public static int adicionar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return -1; 
        } else {
            return (double) num1 / num2;
        }
    }
}




/*EXERCÍCIO 01:
Num mundo repleto de equações e problemas matemáticos, um estudante de programação se depara com o desafio de simplificar suas tarefas diárias. Ele percebe que, ao invés de recorrer sempre à calculadora física ou ao celular, poderia praticar suas habilidades de programação criando uma ferramenta personalizada.

Inspirado por essa necessidade, ele decide desenvolver sua própria calculadora digital em Java. Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. Além disso, ele quer garantir que a calculadora seja fácil de usar, com métodos claramente definidos para cada operação.

Dica: “Crie uma classe `Calculadora` que contenha métodos para adicionar, subtrair, multiplicar e dividir, aceitando dois números reais como parâmetros para cada método e retornando o resultado. Estes métodos devem ser estáticos. Logo, não será necessário instanciar um objeto do tipo Calculadora para poder utilizar esses métodos. Certifique-se de que a divisão por zero seja tratada de maneira a evitar erros de execução.”*/
