package assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//

class Caltest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test //1, This test is testing the leapYear and making sure the value in the index gets replaced
	void calLeapYearTest() {
		int leapYear = 2016;
		assertEquals(32,Cal.cal(2, 28, 3, 31, leapYear));
	}
	
	@Test //2, This tests that the method correctly returns the days elapsed for an edge case, 0
	void calTestSameDate() {
		assertEquals(0,Cal.cal(1, 10, 1, 10, 1000));
	}
	
	@Test //3, This test is testing the date elapsed for a non-leap year
	void calRegYearTest() {
		int notLeapYear = 2017;
		assertEquals(49, Cal.cal(2, 10, 3, 31, notLeapYear));
	}
	
	@Test //4, The main method catches this, but it should be caught in cal method, but instead the cal method still calculates the days elapsed even though the year is 0
	void calZeroYearTest() {
		assertEquals("invalid year, choosing 1.", Cal.cal(2, 2, 2, 15, 0));
	}
	
	@Test //5, This is testing the day bounds of the months, the main method catches this, but cal does not
	void calDayBoundTest() {
		assertEquals("invalid month1, choosing 1.", Cal.cal(1, 40, 2, 1, 2017));
	}
	
	@Test //6, This is testing the case where the first month is greater than the second month, since this is caught in the main method, the cal method still calculates the days elapsed
	void calFirstMonthGreaterTest() {
		assertEquals("month1 must be prior or equals to month2", Cal.cal(6, 10, 5, 31, 2017));
	}
	
	@Test //7, This is testing negative inputs in the program, this should throw some exception, but does not and still calculates the days in between
	void calTestNegativeNumbers() {
		assertEquals("invalid day1, choosing 1.", Cal.cal(1, -10, 1, 15, 2017));
	}
	
	@Test //8, This tests the month 0, while it should not be valid input, the cal method still allows one to use it, resulting in a failure
	void calMonthZeroTest() {
		assertEquals("invalid month1, choosing 1.", Cal.cal(0, 10, 1, 31, 2017));
	}
	
	@Test //9, This tests if the day 1 is greater than the day 2, this should still result in a positive number, but the code outputs a negative number
	void calDay1GreaterTest() {
		assertEquals(10, Cal.cal(1, 15, 1, 5, 2017));
	}
	
	@Test //10, This should result in some exception that is thrown because of an invalid year range, but the cal method still calculates the value
	void calYearBoundTest() {
		assertEquals("invalid year, choosing 1.", Cal.cal(1, 10, 1, 15, 20000));
	}

}
