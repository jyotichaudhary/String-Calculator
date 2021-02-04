package Case6;
/*
 * Requirement : Support different delimiters
 */


import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCalculatorTest {

	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	    Assert.assertEquals(3+6+15, StringCalculator.add("//;n3;6;15"));
	}
    
    
    
}
