package etask5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SI_CITest {

	@Test
	public void testSimpleInterest() {
		SI_CI s=new SI_CI();
		assertEquals(3500.0,s.SimpleInterest(10000,7,5),0);
	}

	@Test
	public void testCompoundInterest() {
		SI_CI s=new SI_CI();
		assertEquals(14071.004226562505,s.CompoundInterest(10000,7,5),0);
	}
}
