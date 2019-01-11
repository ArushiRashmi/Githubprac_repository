package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().fullscreen();
		
		driver.findElement(By.name("firstname")).sendKeys("Aru");
		driver.findElement(By.id("u_0_l")).sendKeys("Verma");
		
		driver.findElement(By.name("reg_email__")).sendKeys("Aruverma@gmail.com");
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Aruverma@gmail.com");
		
		//driver.findElement(By.name("reg_passwd__")).sendKeys("hellohowareyou!");
		
		//driver.findElement(By.id("day")).click();  //to click
		driver.findElement(By.id("day")).sendKeys("3");
		
		//driver.findElement(By.id("month")).click(); //to click
		driver.findElement(By.id("month")).sendKeys("Dec");
		
		//driver.findElement(By.id("year")).click(); //to click
		driver.findElement(By.id("year")).sendKeys("1989");
		
		driver.findElement(By.id("u_0_9")).click();
		//driver.findElement(By.partialLinkText("websubmit")).click(); //to click using partial linktext
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.findElement(By.id("email")).sendKeys("Arushi");
		
		String bcd=driver.findElement(By.id("email")).getText();
		System.out.println(bcd);
		
		String abc=driver.findElement(By.id("birthday-help")).getText();
		System.out.println(abc);


	}

}
