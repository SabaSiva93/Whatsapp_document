package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
	public void getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saba Siva\\eclipse-workspace\\Adacitin\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();

	}
	
	public void getUrl(String data) {
		driver.get(data);
		driver.manage().window().maximize();
	}
	
	public void enterTxt(WebElement element, String data) {
		element.sendKeys(data);

	}
	public void butnClick(WebElement element) {
		element.click();

	}
	
}
