package org.parameter;

import org.testng.annotations.Test;

public class dclassA {
	
	@Test(groups = "Reg",dependsOnGroups = "Smoke")
	private void test1() {
		System.out.println("classA test1 Reg");

	}
	@Test(groups = "Smoke",dependsOnGroups = "sanity")
	private void test2() {
		System.out.println("classA test2 Smoke");

	}
	@Test(groups = "sanity")
	private void test3() {
		System.out.println("classA test3 sanity");
}

}
