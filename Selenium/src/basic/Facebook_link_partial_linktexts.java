package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_link_partial_linktexts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		////////Linktext////////
		
    	driver.findElement(By.linkText("Forgotten account?")).click();
    	driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
//		String abc=driver.findElement(By.className("_52lr fsm fwn fcg")).getText();
//		System.out.println(abc); //shows error as may be the class name is same for some other label
//		 
		
	}

}
