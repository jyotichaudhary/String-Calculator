package Case4;
/*
 * Requirement :Allow the Add method to handle an unknown amount of numbers
 */


import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCalculatorTest {

    
	 @Test
	    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
	        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
	    }
    
    
    
}
