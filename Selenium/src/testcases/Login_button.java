package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[type^='submit' ")).click();
//        String abc="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110";
        String xyz=driver.getCurrentUrl();
      System.out.println(xyz);
//       if(abc.equals(xyz))
//       {
//    	   System.out.println("Test pass");
//       }
//       else
//       {
//    	   System.out.println("Fail");
//       }
//    
        if(driver.findElement(By.cssSelector("input[type^='submit'")).isEnabled())
{
	System.out.println("Test pass");
}
        else
        {
        	System.out.println("Test fail");
        }
        
	}

}
