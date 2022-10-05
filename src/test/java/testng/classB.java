package testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classB {
	@BeforeSuite()
	private void test1() {
		System.out.println("test1 classA @BeforeSuite ");

	}

	@AfterSuite
	private void test2() {
		System.out.println("test2 classA @AfterSuite ");

	}

	@BeforeTest
	private void test3() {
		System.out.println("test3 classA  @BeforeTest");

	}

	@AfterTest
	private void test4() {
		System.out.println("test4 classA @AfterTest");

	}
	@BeforeClass
	private void test5() {
		System.out.println("test5 classA @BeforeClass ");

	}
	@AfterClass
	private void test6() {
		System.out.println("test6 classA @AfterClass ");

	}
	@BeforeMethod
	private void test7() {
		System.out.println("test4 classA @BeforeMethod");

	}
	@AfterMethod
	private void test8() {
		System.out.println("test4 classA @AfterMethod ");

	}
   @Test
   private void test9() {
	System.out.println("test4 classA @test ");

}

}
