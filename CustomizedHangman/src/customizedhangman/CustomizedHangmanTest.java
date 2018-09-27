/**
 * Test class for CustomizedHangman
 * Focus: module testing, practice JUnit
 */

package customizedhangman;

import static org.junit.Assert.*;
import org.junit.*;

public class CustomizedHangmanTest 
{
   
	 CustomizedHangman ch = new CustomizedHangman("test", 5);
   @Before
   public void setUp()
   {
	ch.sticksRemaining = 5;
   }
	
   @After
   public void tearDown()
   {
    
   }
     
   @Test
   public void getSticksRemainTest()
   {
	   assertEquals(ch.getSticksRemaining(), ch.sticksRemaining);
	   
   }
   @Test
   public void isDeadZeroCase() {
	   ch.sticksRemaining = 0;
	   assertTrue(ch.isDead());
	   
   }
   @Test
   public void getNameTest() {
	   ch.setName("testing");
	   assertEquals(ch.name, ch.getName());
   }
   @Test
   public void zeroCaseLostStickTest() {
	   ch.lostStick();
	   ch.lostStick();
	   ch.lostStick();
	   ch.lostStick();
	   ch.lostStick();
	   ch.lostStick();
	   assertTrue(ch.getSticksRemaining() == 0);//This should be -1 since the error in the code will make the lostSticks method subtract one more
	   
   }
   
}
