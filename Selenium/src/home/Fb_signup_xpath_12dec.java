package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Fb_signup_xpath_12dec {
	public static void main(String []ar) throws InterruptedException
	{
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Firstname
		driver.findElement(By.xpath("//input[contains(@name,'firstname')] [contains(@aria-label,'First name')]")).sendKeys("Arushi");
		
		//Surname
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Sur')]")).sendKeys("Verma");
		
	  //Mobile number or email address
		driver.findElement(By.xpath("//input[@aria-label ='Mobile number or email address' or @name='reg_email__'] ")).sendKeys("arushiverma08@gmail.com");
		
		//re-enter email address
		driver.findElement(By.xpath("//input[@aria-label ='Re-enter email address' or @name='reg_email_confirmation__']")).sendKeys("arushiverma08@gmail.com");
		
		//Password field
		driver.findElement(By.xpath("//input[starts-with(@autocomplete,'new-')] " )).sendKeys("Hey!howareyou");
		
		//Day checkbox
		Select day= new Select(driver.findElement(By.xpath("//select[@title ='Day' and @aria-label='Day']")));
		day.selectByIndex(16);
		
		//Month checkbox
		Select month= new Select(driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]")));
		month.selectByValue("5");
		
		//Year checkbox
		Select year= new Select(driver.findElement(By.xpath("//select[contains(@aria-label,'Year')]")));
		year.selectByVisibleText("1997");
		
		//Radio buttons
		driver.findElement(By.xpath("//input[@name='sex' and @type='radio' and @ value='1']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
