package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel1 {
	
	@Test
	private void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
    
		System.out.println("classB test1");
	}
	@Test
	private void test2() {
      
		WebDriverManager.firefoxdriver().setup();
		WebDriver d= new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		System.out.println("classB test2");
	}

}
