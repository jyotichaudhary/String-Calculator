package Case2;
/*
 * Requirement : For an empty string the method will return 0
 */

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;


public class StringCalculatorTest {
	
@Test
public final void whenEmptyStringIsUsedThenReturnValueIs0() 
{
    AssertJUnit.assertEquals(0, StringCalculator.add(""));
}

}