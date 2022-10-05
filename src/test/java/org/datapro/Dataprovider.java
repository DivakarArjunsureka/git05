package org.datapro;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.Baseclass;

public class Dataprovider extends Baseclass {
	
	
	@Test(dataProvider = "result")
	private void login(String username,String password) {
		BrowserLauncher("https://en-gb.facebook.com/");
		
		findelementID("email").sendKeys(username);
		findelementID("pass").sendKeys(password);
		

	}
	
	@DataProvider(name="result")
	private Object[][] Dataprovi() {
		
		Object[][] data  =new Object[3][2];
		
		//0th row
		data[0][0]="Divakar";
		data[0][1]="Divakar@2397";
		
		//1th row
		data[1][0]="Deepika";
		data[1][1]="Deepika@2397";
				
		//0th row
		data[2][0]="Sureka";
		data[2][1]="Sureka@2397";
		
		return data;
		
	}
	
	
	

}
