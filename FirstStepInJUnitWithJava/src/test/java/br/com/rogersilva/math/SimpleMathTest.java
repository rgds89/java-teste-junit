package br.com.rogersilva.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
	
	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double result = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		
		Assertions.assertEquals(expected, result, "The testSum() did not produce expected result");
	}

}
