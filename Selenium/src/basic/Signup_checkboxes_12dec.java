package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_checkboxes_12dec {
	public static void main(String[] args)
	{
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Select day= new Select(driver.findElement(By.cssSelector("#day")));
		day.selectByIndex(16);
		Select month= new Select(driver.findElement(By.cssSelector("#month")));
		month.selectByVisibleText("May");
		Select year= new Select(driver.findElement(By.cssSelector("#year")));
		year.selectByValue("1997");
		
		
	}

}
