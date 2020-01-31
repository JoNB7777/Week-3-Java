package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	@Test
	public void multiplyTestWithTwoTwos() {
		assertEquals(4, calculator.multiply(2,  2));
	}
	
	@Test
	public void multiplyTestWithTwoAndThree() {
		assertEquals(6, calculator.multiply(3,  2));
	}
	
	@Test
	public void addTwoAndFiveTest() {
		assertEquals(7, calculator.add(2, 5));
	}
	
	@Test
	public void subtractTwoFomSevenTest() {
		assertEquals(5, calculator.subtract(7,  2));
	}
	
	@Test
	public void divideNineByThreeTest() {
		assertEquals(3, calculator.divide(9, 3), 0.00001);
	}
	
	@Test
	public void divideTwelveByFiveTest() {
		assertEquals(2.4, calculator.divide(12, 5), 0.00001);
	}
	
	@Test
	public void divideFourByThreeTest() {
		assertEquals(1.33333, calculator.divide(4, 3), 0.00001);
	}
	
	@Ignore
	@Test
	(expected = ArithmeticException.class)
	public void divideByZeroTest() {
		Calculator calculator = new Calculator();
		calculator.divide(7, 0);
	}
	

}
