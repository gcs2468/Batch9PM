package testngclasses;

import org.testng.Reporter;
import org.testng.annotations.*;


public class TestNGDemoOne extends TestNGDemo {

    @Test
	public void m1() {
		Reporter.log("I am @Test annotated method m1", true);
	}

	@Test
	public void m2() {
		Reporter.log("I am @Test annotated method m2", true);
	}



	public void m7() {
		Reporter.log("I am method 7", true);
	}



}
