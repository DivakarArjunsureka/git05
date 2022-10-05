package org.parameter;

import org.testng.annotations.Test;

public class dependsmethod {
	
	@Test(dependsOnMethods = "test2")
	private void test1() {
		System.out.println("classA test1");

	}
	@Test(dependsOnMethods = "test3")
	private void test2() {
		System.out.println("classA test2");

	}
	@Test
	private void test3() {
		System.out.println("classA test3");
}

}
