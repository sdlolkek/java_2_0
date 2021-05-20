package Java2Task1;
import java.util.Scanner;
public class Java2Task1 {
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
            case "%":
                res4 = num1 / num2;
                System.out.printf("%.4f \n", res4);
                break;
        }
    }
}
