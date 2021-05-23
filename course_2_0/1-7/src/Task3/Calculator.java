package Task3;
/**
 * @author Elizaveta Kornakova
 * @version 2.0
 * @see #calculateSum()
 * @see #calculateMinus()
 * @see #calculateMultiply()
 * @see #calculateDivide()
 *
 */
import java.util.Scanner;

public class Calculator {

    /**
     * Пользователь вводит два числа и символ операции
     * В зависимости от символа, выполняется одна из операций
     */
    public void startCalculate() {
        float number1;
        float number2;
        String oper;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        number1 = in.nextFloat();
        System.out.println("Введите второе число:");
        number2 = in.nextFloat();
        System.out.println("Введите символ операции");
        oper = in.next();
        switch (oper) {
            case "+":
                this.calculateSum(number1, number2);
                break;
            case "-":
                this.calculateMinus(number1, number2);
                break;
            case "*":
                this.calculateMultiply(number1, number2);
                break;
            case "/":
                this.calculateDivide(number1, number2);
                break;
        }
    }

    /**
     *
     * @param num1 первое слагаемое
     * @param num2 второе слагаемое
     */
    public void calculateSum(float num1, float num2) {
        System.out.printf("%.4f \n", num1 + num2);
    }

    /**
     *
     * @param num1 уменьшаемое
     * @param num2 вычитаемое
     */
    public void calculateMinus(float num1, float num2) {
        System.out.printf("%.4f \n", num1 - num2);
    }

    /**
     *
     * @param num1 делимое
     * @param num2 делитель
     */
    public void calculateDivide(float num1, float num2) {
        if (num2 != 0.0 ) {
            System.out.printf("%.4f \n", num1 / num2);
        }
        else {
            System.out.println("Эй! Делить на ноль нельзя! Ты что, забыл?");
        }
    }

    /**
     *
     * @param num1 первый множитель
     * @param num2 второй множитель
     */
    public void calculateMultiply(float num1, float num2) {
        System.out.printf("%.4f \n", num1 * num2);
    }
}

