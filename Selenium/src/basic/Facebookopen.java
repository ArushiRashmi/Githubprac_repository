package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookopen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("Arushi");
//		driver.findElement(By.className("inputtext")).sendKeys(" Why");
		driver.findElement(By.className("inputtext")).sendKeys("Arushi");
		driver.findElement(By.name("pass")).sendKeys("123456789");
		Thread.sleep(10000);
		

	}

}
