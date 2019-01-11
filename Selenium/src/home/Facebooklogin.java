package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseURL= "http://www.facebook.com";
		String tagName="";
		driver.get(baseURL);
		tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		//WebElement element1 = driver.findElement(By.id("email"));
		//element1.sendKeys("arushiverma08@gmail.com");
		System.exit(0);


			}

	}


