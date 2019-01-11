package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Facebooktitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\Driver\\geckodriver-v0.23.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",path);// static method
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String actualTitle= driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

	}


