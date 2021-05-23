package Task5;
/**
 * @author Elizaveta Kornakova
 * @version 3.0
 * @see #calculateSum()
 * @see #calculateMinus()
 * @see #calculateMultiply()
 * @see #calculateDivide()
 * @see #oper1 первое введенное число
 * @see #oper2 второе введеное число
 *
 */
public class Calculator {
    private float oper1;
    private float oper2;

    public Calculator(float oper1, float oper2) {
        this.oper1 = oper1;
        this.oper2 = oper2;
    }

    public float[] getOper() {
        float[] opers = {oper1, oper2};
        return opers;
    }

    public void setOper2(float oper1, float oper2) {
        this.oper1 = oper1;
        this.oper2 = oper2;
    }

    public void calculateSum() {
        System.out.printf("%.4f \n", oper1 + oper2);
    }


    public void calculateMinus() {
        System.out.printf("%.4f \n", oper1-oper2);
    }

    public void calculateDivide() {
        if (oper2 != 0 ) {
            System.out.printf("%.4f \n", oper1/oper2);
        }
        else {
            System.out.println("Эй! Делить на ноль нельзя! Ты что, забыл?");
        }
    }

    public void calculateMultiply() {
        System.out.printf("%.4f \n", oper1*oper2);
    }
}


