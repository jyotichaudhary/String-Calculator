package Case8;

import java.util.*;


import static java.util.stream.Collectors.joining;

public class StringCalculator {
	   static int add(final String numbers, final String delimiter) {
           int returnValue = 0;
           String[] numbersArray = numbers.split(delimiter);
           List negativeNumbers = new ArrayList();
           for (String number : numbersArray) {
                   if (!number.trim().isEmpty()) {
                           int numberInt = Integer.parseInt(number.trim());
                           if (numberInt < 0) {
                                   negativeNumbers.add(numberInt);
                           } else if (numberInt <= 1000) {
                                   returnValue += numberInt;
                           }
                   }
           }
           if (negativeNumbers.size() > 0) {
                   throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
           }
           return returnValue;                
   }

    
    
}
