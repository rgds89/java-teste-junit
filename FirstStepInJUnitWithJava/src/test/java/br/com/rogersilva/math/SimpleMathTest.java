package br.com.rogersilva.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
	
	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		Double result = math.sum(6.2D, 2D);
		double expected = 8.2D;
		Assertions.assertEquals(expected, result);
	}

}
