package weekendtest2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void test() {
		Powerof10 po=new Powerof10();
		String result=po.get(6);
		assertEquals("million",result);
		
	}
	@Test
	public void test1()
	{
		Powerof10 po=new Powerof10();
		String result1=po.get(9);
		assertEquals("billion",result1);
	}
	@Test
	public void test2()
	{
		Powerof10 po=new Powerof10();
		String result=po.get(8);
		assertEquals("",result);
	}
 
}
