package Case7;
/*
 * Requirement :Negative numbers will throw an exception
 */


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;



public class StringCalculatorTest {
	@Test(expectedExceptions = RuntimeException.class)
	public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
	    StringCalculator.add("3,-6,15,18,46,33",",");
	}
	@Test
	public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
	    RuntimeException exception = null;
	    try {
	        StringCalculator.add("3,-6,15,-18,46,33",",");
	    } catch (RuntimeException e) {
	        exception = e;
	    }
	    Assert.assertNotNull(exception);
	    AssertJUnit.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}
}
