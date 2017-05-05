package weekendtest2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle t=new Triangle(2, 3, 4);
		boolean result=t.isTriangle();
		assertEquals(true,result);
	}
	@Test
	public void test1() {
		Triangle t=new Triangle(2,-3, 4);
		boolean result1=t.isTriangle();
		assertEquals(false,result1);
	}
	
	@Test
	public void test2() {
		Triangle t=new Triangle(4,5,6);
		double result1=t.getAngle(6);
		assertEquals(1.445468495626831,result1,0);
	}
	


}
