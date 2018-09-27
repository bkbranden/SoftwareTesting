package customizedhangman;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;


public class setTest 
{
   Set s = new HashSet();

   @Before 
   public void setUp() 
   {
      s = new HashSet();
      s.add("cat");
      s.add("dog");
   }

   @Test 
   public void test1() 
   {
      s.add("cat");
      assertTrue("Size of s is still 2", s.size()==2);
   }

   @Test 
   public void test2() 
   {
      s.remove("cat");
      assertTrue("Size of s is now 1", s.size()==1);
      s.add("elephant");
      assertTrue("Size of s is now 2", s.size()==2);
   }
   
   /* Yes the first test passes
    * The second test passes as well
    * The assertTrue statements that are supposed to return something when it is false
    * is set to returning the true expected output. Should return something that is false
    *  Test 2 false cases should be changed to something that is not equal to the actual s.size()
    */
    
}