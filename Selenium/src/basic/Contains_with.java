package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_with {
	public static void main(String ar[])
	{
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains (@id,'pass')]")).sendKeys("Verma");
		//driver.findElement(By.xpath("//a[starts-with(@href,'/legal/terms')]")).click();
		driver.findElement(By.xpath("//input[@aria-required='true'][@aria-label='Surname']/preceding::input[@name='firstname']")).sendKeys("VERMA");
		driver.findElement(By.xpath("//input[@type='radio'][@name='sex']/following::input[@value='2']")).click();
		
		//driver.findElement(arg0)
		
		
	}

}
