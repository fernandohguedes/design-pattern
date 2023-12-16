package strategy.calculator;

public class Cliente {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,2);

        /* Operação de adição */
        System.out.println(calculator.getResult("+"));

        /* Operação de Subtração */
        System.out.println(calculator.getResult("-"));

        /* Operação de multiplicação */
        System.out.println(calculator.getResult("*"));

        /* Operação de divisão */
        System.out.println(calculator.getResult("/"));

    }
}
