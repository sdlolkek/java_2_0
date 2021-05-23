/**
 * @author Elizaveta Kornakova
 * В этом классе представлено решение задачи 3
 * Если пользователь вводит 1, то работает калькулятор:
 * @see Task3.Calculator описывает работу калькулятора
 * Если пользователь вводит 2, то работает массив:
 * @see Task3.Massive описывает то, как найти самое длинное слово в массиве
 */
package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число (1 -- калькулятор, 2 -- массив)");
        int chislo = in.nextInt();

        if (chislo == 1){
            Calculator caly = new Calculator();
            caly.startCalculate();
        }
        else {
            Massive myMassy = new Massive();
            myMassy.findLongestWord();
        }



    }
}
