package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("Aru!");
		driver.findElement(By.cssSelector("input[name^='first']" )).sendKeys("Arushi");
		//driver.findElement(By.cssSelector("input[name,'first']")).sendKeys("Arushi");
		driver.findElement(By.cssSelector("input[aria-label$='rname']")).sendKeys("Verma");
//		driver.findElement(By.cssSelector("#='email'")).sendKeys("Aru!");
		Thread.sleep(5000);
		driver.close();

	}

}
