import Calculator.CalculatorWithExcept;
import Calculator.MyExceptions;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.fail;

public class CalculatorTests {
    @Test
    public void checkSumResult1(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(12,14);
        Assert.assertEquals(26.0f,myCaly.calculateSum(),0);
    }

    @Test
    public void checkSumResult2(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-13,-7);
        Assert.assertEquals(-20.0f,myCaly.calculateSum(),0);
    }

    @Test
    public void checkMinusResult1(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(9,13);
        Assert.assertEquals(-4.0f,myCaly.calculateMinus(),0);
    }

    @Test
    public void checkMinusResult2(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(12,10);
        Assert.assertEquals(2.0f,myCaly.calculateMinus(),0);
    }

    @Test
    public void checkMultiplyResultNull(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(12,0);
        Assert.assertEquals(0.0f,myCaly.calculateMultiply(),0);
    }

    @Test
    public void checkMultiplyResultPositive(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(12.5f,4);
        Assert.assertEquals(50.0f,myCaly.calculateMultiply(),0);
    }

    @Test
    public void checkMultiplyResultOneNegative(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-12.5f,3);
        Assert.assertEquals(-37.5f,myCaly.calculateMultiply(),0);
    }

    @Test
    public void checkMultiplyResultAllNegative(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-12.5f,-3);
        Assert.assertEquals(37.5f,myCaly.calculateMultiply(),0);
    }

    @Test
    public void checkMultiplyResultOne(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-12.5f,1);
        Assert.assertEquals(-12.5f,myCaly.calculateMultiply(),0);
    }

    @Test
    public void checkDivisionResultOne(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-12.5f,1);
        Assert.assertEquals(-12.5f,myCaly.calculateDivide(),0);
    }

    @Test
    public void checkDivisionResultAllPositive(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(12.5f,5);
        Assert.assertEquals(2.5f,myCaly.calculateDivide(),0);
    }

    @Test
    public void checkDivisionResultAllNegative(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-24.4f,-2);
        Assert.assertEquals(12.2f,myCaly.calculateDivide(),0);
    }

    @Test
    public void checkDivisionResultOneNegative(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(-47,2);
        Assert.assertEquals(-23.5f,myCaly.calculateDivide(),0);
    }

    @Test
    public void checkDivisionResultFirstNull(){
        CalculatorWithExcept myCaly = new CalculatorWithExcept(0,-2);
        Assert.assertEquals(0,myCaly.calculateDivide(),0);
    }



   /* @Test
    public void checkDivisionResultLastNull(){
        try {
            CalculatorWithExcept myCaly = new CalculatorWithExcept(-2,0);
            myCaly.calculateDivide();
            fail();
        }
        catch(MyExceptions ex){
            Assert.assertEquals("Эй, ты забыл? На ноль делить нельзя!", ex.getMessage());
        }


    }

    */
}


