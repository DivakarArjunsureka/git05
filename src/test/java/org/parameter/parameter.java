package org.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testng.Baseclass;

public class parameter extends Baseclass {
	
	
	@Parameters({"user123","pass123"})
	@Test
	private void login(String username,String password) {
		
      BrowserLauncher("https://en-gb.facebook.com/");
		  
		findelementID("email").sendKeys(username);
		findelementID("royal_pass").sendKeys(password);
		

	}

}
