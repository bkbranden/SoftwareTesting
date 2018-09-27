// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// JUnit for Calc.java

// For Software testing class activity, 13-Sep-2018
// Adapted from CalcTest.java

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest
{
   @Test
   public void testAdd()
   {
      assertTrue ("Calc sum incorrect", 5 == Calculator.add (2, 3));
   }
   
   @Test
   public void testAddNeg() {
	   assertTrue("Calc sum incorrect", 0 == Calculator.add(2, -2));
   }
}
