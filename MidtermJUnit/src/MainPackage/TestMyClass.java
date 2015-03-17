package MainPackage;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class TestMyClass {
	
	//sets up and tears down first and last thing
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//sets up and tears down between each individual test
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//tests the ReturnTrue method
	@Test
	public void testReturnTrue() {
		assertTrue("This should always be true: ", MyClass.ReturnTrue());
	}

	//tests the AddTwoNumbers method
	@Test
	public void testAddTwoNumbers() {
		assertEquals("6 + 7 = 13", 13, MyClass.AddTwoNumbers(6, 7));
		assertEquals("9 + (-5) = 4", 4, MyClass.AddTwoNumbers(9, -5));
		assertEquals("7 + 2 = 9", 9, MyClass.AddTwoNumbers(7, 2));
		assertEquals("15 + 7 = 23", 23, MyClass.AddTwoNumbers(15, 7));

	}

}
