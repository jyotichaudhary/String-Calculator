package Case8;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * Requirement :Numbers bigger than 1000 should be ignored
*/



public class StringCalculatorTest {

    
	 @Test
	    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
	        Assert.assertEquals(3+1000+6, StringCalculator.add("3,1000,1001,6,1234",","));
	    }
    
    
    
}
