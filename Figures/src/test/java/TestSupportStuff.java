import static org.junit.Assert.*;

import org.junit.Test;

public class TestSupportStuff {

	@Test
	public void getRandomNumberWith2Decimals_ReturnsValidNumbers() {
		for(int i = 0;i < 10;i++) {
		String operator = String.valueOf(SupportStuff.getRandomNumberWith2Decimals());
		assertTrue(operator.charAt(operator.length()-3) == '.' || operator.charAt(operator.length()-2) == '.');
	
		}
	}
	
	

}
