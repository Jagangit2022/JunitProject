package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@BeforeAll
	public static void method3() {
		System.out.println("Inside before All");
	}
	
	@BeforeEach
	public void method1() {
		System.out.println("Inside before Each");
	}
	
	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4,5));
		assertTrue(true);
		
		String[] array1= {"one","two","three"};
		String[] array2= {"one","two","three"};
		
		assertArrayEquals(array1,array2);
		
		System.out.println("Inside add Test1");
	}
	
	@Test
	public void subTest1() {
		
		assertEquals(1,Calculator.sub(5,4));
		System.out.println("Inside sub Test1");
	}

	@AfterEach
	public void method2() {
		System.out.println("Inside after Each");
	}
	
	@AfterAll
	public static void method4() {
		System.out.println("Inside after All");
	}
}
