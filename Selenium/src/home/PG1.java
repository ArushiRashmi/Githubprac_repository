package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class PG1 {

	public static void main(String[] args) {
		
//				System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver_win32\\chromedriver.exe");
//				WebDriver driver = new ChromeDriver();FOR CHROME DRIVER
				System.setProperty("webdriver.gecko.driver","E:\\Driver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				String baseURL="http://demo.guru99.com/test/newtours/";
				String expectedTitle="Welcome: Mercury Tours";
				String actualTitle="";
				driver.get(baseURL);
				actualTitle= driver.getTitle();
//				
				if(actualTitle.equals(expectedTitle))
				{
					System.out.println("Test passed");
					}
					else
					{
						System.out.println("test failed");
					}
	}}
			
//if(actualTitle.contentEquals(expectedTitle))
//	{
//		System.out.println("Test passed");
//	}
//	else
//	{
//		System.out.println("Test failed");
//	}
	//driver.close();
//	if(actualTitle.equalsIgnoreCase(expectedTitle))
//	{
//		System.out.println("Test passed");
//	}
//	else
//	{
//		System.out.println("test failed");
//	}
