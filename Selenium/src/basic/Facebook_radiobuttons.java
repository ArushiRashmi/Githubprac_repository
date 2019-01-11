package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_radiobuttons {
	public static void main(String ar[])
	{
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[value='1'][name='sex']")).click();//For female radiobutton//clicks on the female radio button
		
		String abc=driver.findElement(By.cssSelector("input[value*='1'][name*='sex']")).getTagName();// for female radio button // gets the tagname "INPUT" and prints it
		System.out.println(abc);
		
		
	}

}
