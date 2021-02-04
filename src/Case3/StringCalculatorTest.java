package Case3;
/*
 * Requirement : Method will return their sum of numbers
 */


import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class StringCalculatorTest {

    
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    Assert.assertEquals(3, StringCalculator.add("3"));
	}

	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, StringCalculator.add("3,6"));
	}
    
    
}
