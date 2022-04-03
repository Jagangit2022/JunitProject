package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class AssumtionsExample {
	
	@BeforeAll
	public static void SetUp() {
		System.setProperty("ENV", "PROD");
	}
	
	@Test
	public void test1() {
		
		assertTrue("DEV".equalsIgnoreCase(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrom("madam"));
		assertTrue(StringFunctions.isPalindrom("racecar"));
	}


}
