package Task7;


public class TryCalculator2 {
    public static void main(String[] args) throws MyExceptions {
        CalculatorWithExcept myCal = new CalculatorWithExcept(30.6f, 0);
        try { //обрабатываем возможную ошибку деления на ноль
            myCal.calculateDivide();
        }
        catch(MyExceptions ex){
            System.out.println(ex.getMessage());
        }
        myCal.calculateMultiply();
        myCal.calculateMinus();
        myCal.calculateSum();
    }
}
