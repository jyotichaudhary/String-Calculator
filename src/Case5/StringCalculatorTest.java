package Case5;
/*
 * Requirement : Allow the Add method to handle new lines between numbers (instead of commas).
*/

import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCalculatorTest {

	@Test
	public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
	    Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
	}
    
  
    
}
