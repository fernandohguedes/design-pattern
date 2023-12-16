package strategy.calculator;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /*
    * Nesse modelo de estratégia definimos a regra de negócio de acordo com o operador que estamos recebendo do cliente
    * através disso o programa efetua o calculo e retorno valor obtido com a operação.
    */
    public int getResult(String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
