import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MathsTest {

	private Object expected;

	@Test
	public void testAdd() {
           int a = 5;
           int b = 6;
           int expected = 11;
           int actual = Maths.add(a,b);
           
		   Assert.assertEquals(" Add Test ", expected, actual);
		   
		
	}
	@Test
	public void testSubtract() {
           int a = 5;
           int b = 2;
           int expected = 3;
           int actual = Maths.subtract(a,b);
           
		   Assert.assertEquals(" Subtract Test ", expected, actual);
		   
}
	@Test
	public void testDivide() {
           double a = 5;
           double b = 2;
           double expected = 2.5;
           double actual = Maths.divide(a,b);
           
		   Assert.assertEquals( expected, actual, 0.001);
		   
}
}
