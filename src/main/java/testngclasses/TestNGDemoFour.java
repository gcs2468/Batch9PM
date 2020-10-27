package testngclasses;

import org.testng.annotations.Test;

public class TestNGDemoFour extends TestNGDemoOne {
	
	@Test
	public void testMethodOne(){
		System.out.println("I am @Test annotated testMethodOne in TestNGDemoFour");
	}
	
	@Test
	public void testMethodTwo(){
		System.out.println("I am @Test annotated testMethodTwo in TestNGDemoFour");
	}
	
	public void testMethodThree(){
		System.out.println("I am @Test annotated testMethodTwo in TestNGDemoFour");
	}

}
