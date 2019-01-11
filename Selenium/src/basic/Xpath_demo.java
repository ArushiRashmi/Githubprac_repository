package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", path);
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Arushi");
    //driver.findElement(arg0)
    
	}

}
