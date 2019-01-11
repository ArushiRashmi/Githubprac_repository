package home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Signup_usingcss_12dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[aria-label$='st name']")).sendKeys("Arushi");
		driver.findElement(By.cssSelector("input[aria-label^='Sur']")).sendKeys("Verma");
		driver.findElement(By.cssSelector("input[name$='email__'][data-type^='te']"))	.sendKeys("arushiverma08@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Re-enter')]")).sendKeys("arushiverma08@gmail.com");
		
	//	driver.findElement(By.cssSelector("input[aria-label^='Re-enter']")).sendKeys("arushiverma08@gmail.com");
		driver.findElement(By.cssSelector("input[type^='pass'][name$='swd__'")).sendKeys("hello!");
		
		
		Select day= new Select(driver.findElement(By.cssSelector("#day")));
		day.selectByIndex(16);
		Select month=new Select(driver.findElement(By.cssSelector("#month")));
		month.selectByValue("5");
		Select year= new Select(driver.findElement(By.cssSelector("#year")));
		year.selectByVisibleText("1997");
		driver.findElement(By.cssSelector("input[value*='1'][name*='sex']")).click();
		
		
		

	}

}
