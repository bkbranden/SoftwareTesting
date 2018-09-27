package arrayOperations	;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayOperationsNumZeroTest 
{
   

@Test
   public void testNumZeroEmptyArray() 
   {
      int x[] = {};     // zero-sized array
      int n = ArrayOperations.numZero(x);
      assertEquals("0 zeros", 0, n);      
   }
   
   @Test
   public void testNumZeroArrayWithNoZeros()
   {
      int[] x = {1, 2, 3}; 
      int n = ArrayOperations.numZero(x);
      assertEquals("0 zeros in an array with no zeros", 0, n);
   }
   
   @Test
   public void testNumZeroWithZero() {
	   int[] x = {0, 2, 3, 0};
	   int n = ArrayOperations.numZero(x);
	   assertEquals("Two 0s in the array", 1, n);
   }
   
   @Test
   public void testNullArray() {
	   int[] x = null;
	   try {
		   ArrayOperations.numZero(x);
		   fail("expected NullException");
	   } catch (NullPointerException e) {}
	  
	   
   }


   @Before
   public void Setup()
   {
      // prefix actions executed before each test
   }
   
   @After
   public void Teardown()
   {
      // prefix actions executed after after tests
   }

      
}

