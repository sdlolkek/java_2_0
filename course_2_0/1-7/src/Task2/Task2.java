/**
 * @author Elizaveta Kornakova
 * @version Calculator 1.0
 */
package Task2;
import java.util.Scanner;
public class Task2 {
    /*
    В первой простейшей версии калькулятора в первом задании использую только один метод main.
    Несколько методов (+,-,/,*) появятся в следующих заданиях
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float num1 = in.nextFloat();
        System.out.println("Введите второе число:");
        float num2 = in.nextFloat();
        System.out.println("Введите символ операции");
        float res1, res2, res3, res4;
        String oper = in.next();
        switch (oper) {
            case "+":
                res1 = num1 + num2;
                System.out.printf("%.4f \n", res1);
                break;
            case "-":
                res2 = num1 - num2;
                System.out.printf("%.4f \n", res2);
                break;
            case "*":
                res3 = num1 * num2;
                System.out.printf("%.4f \n", res3);
                break;
            case "/":
                if (num2 != 0.0 ) {
                    res4 = num1 / num2;
                    System.out.printf("%.4f \n", res4);
                }
                else {
                    System.out.println("Эй! Делить на ноль нельзя! Ты что, забыл?");
                }
                break;
        }
    }
}