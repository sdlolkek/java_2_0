package Task5;

public class TryCalculator {
    public static void main(String[] args) {
        Calculator myCal = new Calculator(30.6f, 50);
        float[] whatInside = myCal.getOper();
        for (float element : whatInside){
            System.out.println(element);
        }
        myCal.calculateDivide();
        myCal.calculateMultiply();
        myCal.calculateMinus();
        myCal.calculateSum();
    }
}
