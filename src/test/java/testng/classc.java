package testng;

import org.testng.annotations.Test;

public class classc {
	@Test(priority=-133)
	private void test1() {
	System.out.println("test1 classA priority= -133");
	}
	
	
	@Test(priority=45)
	private void test2() {
	System.out.println("test2 classA priority=45");
	}
	
	
	@Test(priority=-65)
	private void test3() {
	System.out.println("test3 classA priority= -65");
	}
	@Test(priority=34,invocationCount = 3,enabled = false)
	private void test4() {
	System.out.println("test4 classA priority=34");
	}
	
	
	@Test(priority=-4,invocationCount = 2)
	private void test5() {
	System.out.println("test5 classA priority=-4");
	}
	
	
	@Test(priority=15)
	private void test6() {
	System.out.println("test6 classA priority=15");
	}

}
