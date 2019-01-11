package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_logout {
public static void main(String ar[])
{
	String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--disable-notifications");
     System.setProperty("webdriver.chrome.driver", path);
     WebDriver driver=new ChromeDriver(options);
     driver.get("https://www.facebook.com");
     
	driver.findElement(By.cssSelector("#email")).sendKeys("arushiverma08@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("tujaane123na");
	driver.findElement(By.cssSelector("[aria-label='Log In']")).click();
	
}
}
