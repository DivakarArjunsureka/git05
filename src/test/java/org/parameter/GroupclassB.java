package org.parameter;

import org.testng.annotations.Test;

public class GroupclassB {

	@Test(groups = {"smoke","sanity"})
	private void test1() {
		System.out.println("classA test1");

	}
	@Test(groups =  "sanity")
	private void test2() {
		System.out.println("classA test2");

	}@Test(groups = "smoke")
	private void test3() {
		System.out.println("classA test3");
}
}