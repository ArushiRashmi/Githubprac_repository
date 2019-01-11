package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_byids_sendkeys {
	
	 public static void main(String ar[]) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		////////////////////SEND KEYS////////////////////////
		driver.findElement(By.id("email")).sendKeys("Arushi");// Sends "ARUSHI" in the EMAIL /PHONE NUMBER field
		driver.findElement(By.id("pass")).sendKeys("abcdefgh");// Sends" abcdefgh" in the password field
		
		

	}

}
