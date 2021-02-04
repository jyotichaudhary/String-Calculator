package Case1;
/*
 * Requirement : The method can take 0, 1 or 2 numbers separated by comma (,).
 */


import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class StringCalculatorTest {

    
    @Test(expectedExceptions = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
        AssertJUnit.assertTrue(true);
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        AssertJUnit.assertTrue(true);
    }
    @Test(expectedExceptions = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
        AssertJUnit.assertTrue(true);
    }
    
    
    
}
