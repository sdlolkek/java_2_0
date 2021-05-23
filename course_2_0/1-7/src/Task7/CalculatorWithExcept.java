package Task7;

public class CalculatorWithExcept {
    /**
     * @author Elizaveta Kornakova
     * @version 4.0
     * @see #calculateSum()
     * @see #calculateMinus()
     * @see #calculateMultiply()
     * @see #calculateDivide() обрабатывает ошибку деления на ноль с помощью MyExceptions
     * @see #oper1 первое введенное число
     * @see #oper2 второе введеное число
     * @see MyExceptions() мой класс для обработки ошибки деления на ноль
     *
     */
        private float oper1;
        private float oper2;

        public CalculatorWithExcept(float oper1, float oper2) {
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
            System.out.printf("%.4f \n", oper1 - oper2);
        }

        public void calculateDivide() throws MyExceptions {
            if (oper2 != 0) {
                System.out.printf("%.4f \n", oper1 / oper2);
            } else {
                throw new MyExceptions("Эй, ты забыл? На ноль делить нельзя!");
            }
        }

        public void calculateMultiply() {
            System.out.printf("%.4f \n", oper1 * oper2);
        }
    }


