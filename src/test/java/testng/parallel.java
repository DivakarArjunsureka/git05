package testng;

import org.testng.annotations.Test;

public class parallel extends Baseclass {
	
	@Test
	private void test1() {
		BrowserLauncher("https://www.facebook.com/");
		System.out.println("classA test1");

	}
	@Test
	private void test2() {
		BrowserLauncher("https://www.flipkart.com/");
		System.out.println("classA test2");

	}
	@Test
	private void test3() {
		BrowserLauncher("https://www.google.com/");
		System.out.println("classA test3");

	}
	

}
