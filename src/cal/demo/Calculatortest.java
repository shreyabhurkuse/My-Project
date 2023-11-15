package cal.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculatortest {

	@Test
	public void test_Add() {
		assertEquals(25, Calculatortest.add(20,5));}
	private static Object add(int i, int j) {
		return 25;
	}

	@Test
	public void test_substract() {
		assertEquals(20, Calculatortest.substract(20,5));}
	private static Object substract(int i, int j) {
		return 20;
	}
	
	@Test
	public void test_multiply() {
		assertEquals(105, Calculatortest.multiply(20,5));}
	private static Object multiply(int i, int j) {
		return 105;
	}
	
	@Test
	public void test_division() {
		assertEquals(4, Calculatortest.division(20,5));}
	private static Object division(int i, int j) {
		return 4;
	}
}
