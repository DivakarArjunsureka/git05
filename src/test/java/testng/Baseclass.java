package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
public static WebDriver d;
	
	public static void BrowserLauncher(String url) {
	WebDriverManager.chromedriver().setup();
	
    d= new ChromeDriver();
	d.get( url);
	d.manage().window().maximize();

    }
	//1
	public static WebElement findelementID(String Id) {
		
		WebElement findElement = d.findElement(By.id("email"));
		return findElement;
	
	}
    public static WebElement findelementID1(String Id) {
		
		WebElement findElement1 = d.findElement(By.id("pass"));
		return findElement1;
	
	}
	//2
	public static void sendvalues( WebElement findElement,String data) {
		findElement.sendKeys(data);

	}
	//3
	public static WebElement findelementxpath(String Xpath) {
		
		WebElement element = d.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		return element;

	}
	//4
	public void sendvalue11(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	//5
	public boolean isDisplay(WebElement element) {
	     boolean displayed = element.isDisplayed();
	      return displayed;
		}
	//6
	
	public boolean isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}
	//7
	public boolean isselected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}
	//8
	public Alert Alertclickok() {
		Alert alert=d.switchTo().alert();
		alert.accept();
		return alert;
	}
	//9
	public Alert Alertcancel() {
		Alert alert=d.switchTo().alert();
		alert.dismiss();
		return alert;

	}
	//10
	public Actions Actionkeydown() {
		Actions action= new Actions(d);
		action.keyDown(Keys.SHIFT);
		return action;
		}
	//11
	
	public Actions ActionUp() {
		Actions action=new Actions(d);
		action.keyUp(Keys.SHIFT);
		return action;
	    }
	//12
	
	public Actions Actionsendkeys() {
		Actions action= new Actions(d);
		action.sendKeys("Divkar");
		return action;
	}
	//13
	public void click(WebElement element) {
		element.click();
		
	}
	//14
	public WebElement idName(WebElement element,String a) {
		WebElement find = d.findElement(By.name("pass"));
		return find ;

	}
	//15
	
	public void WindowChild(String child ) {
		d.switchTo().window(child);

	}
	//16
	
	public void SwitchFrame(String Frameid) {
	d.switchTo().frame(Frameid);

	}
	//17
	public void DropdownText(WebElement element,String a) {
		Select sel= new Select(element);
		sel.deselectAll();

	}
	//18
	public void DropdownValue(WebElement element,String a) {
		Select sel= new Select(element);
		sel.deselectByValue(a);
	}
	//19
	public void DropdownIndex(WebElement element,int index) {
		Select sel= new Select(element);
		sel.deselectByIndex(0);
	}
	//20
		public void Dropdownattribute(WebElement element,String attribute) {
			Select sel= new Select(element);
			sel.deselectByVisibleText(attribute);
		}
	//21	
		public void deselectAll(WebElement element) {
			Select sel= new Select(element);
			sel.deselectAll();
		}
    //22

	
		public void doubleClick(WebElement element) {
			Actions actions = new Actions(d);
			actions.doubleClick(element);
		}
		//23

		public void contextClick(WebElement element) {
			Actions actions = new Actions(d);
			actions.contextClick(element);
		}
      //24
		public String getAttributevalue(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			return attribute;
		}
    //25
		public String getTextValue(WebElement element,String a) {
			String text = element.getText();
			return text;
		}
		//26
//
//		public void assertEquals(String msg, String expected, String actual) {
//			Assert.assertEquals(msg, expected, actual);

//		}
//		public Row getRow( Sheet sheet,int index) {
//			Row row = sheet.getRow(index);
//			return row;
//		}
//
//		public Cell getCell(Row row, int index) {
//			Cell cell = row.getCell(index);
//			return cell;
//		}
      //27
		public static void closeCurrentWindow() {
			d.close();
		}
     //28
		public static void quitWindow() {
			d.quit();
		}
	

}
