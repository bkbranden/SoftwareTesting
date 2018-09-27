// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// JUnit for Calc.java

// For Software testing class activity, 13-Sep-2018
// Adapted from DataDrivenCalcTest.java

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DataDrivenCalculatorTest
{
   public int a, b, sum;

   public DataDrivenCalculatorTest (int a, int b, int sum)
   {
      this.a = a;
      this.b = b;
      this.sum = sum; 
   }

  @Parameters
  public static Collection<Object[]> calcValues()
  {
     return Arrays.asList (new Object [][] {{2, 3, 5}}); 
  }

  @Test
  public void additionTest()
  {
     assertTrue ("Addition Test", sum == Calculator.add (a,b));
  }
}

