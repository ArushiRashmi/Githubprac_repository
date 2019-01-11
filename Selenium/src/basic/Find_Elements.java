package basic;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("span"));
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext())
		{
		 System.out.println("Facebook has "+links.size()+"number of spans");
		 		 
		 System.out.println("Name of spans:" +it.next().getText());
		 
		 
		}
		

	}

}
