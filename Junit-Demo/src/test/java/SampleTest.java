import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTestPass() {
		int a=2;
		int b=1;
		assertTrue(a+b == 3);
	}
	@Test
	public void simpleTestFails() {
		int a=2;
		int b=2;
		assertTrue(a+b == 4);
	}
	
}
