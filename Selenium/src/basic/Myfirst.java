package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myfirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="E:\\Driver\\geckodriver-v0.23.0-win64\\geckodriver.exe";//exe files  
		System.setProperty("webdriver.gecko.driver",path);// static method
		 WebDriver driver = new FirefoxDriver();//webdriver is giving just the methods but not  definitions
		 //The definitions will be provided by the Firefoxdriver.
		 driver.get("http://www.facebook.com");
		 Thread.sleep(2000);
		 driver.manage().window().fullscreen();
//		 driver.quit();
//		 System.exit(0);
		 
		 

	}

}
