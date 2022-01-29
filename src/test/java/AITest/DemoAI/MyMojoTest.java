package AITest.DemoAI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.epam.healenium.SelfHealingDriver;

public class MyMojoTest {
	
	
	//public static String remote_url_chrome = "http://localhost:4445/wd/hub";
	public WebDriver driver;
	
	
	  
	  @BeforeMethod
	public void testInit() {
		  //System.setProperty("webdriver.chrome.driver","src/main/resources/selenium.driver/chromedriver");
		//  WebDriver driver = new ChromeDriver(); // declare delegate
			// driver = SelfHealingDriver.create(delegate); // create Self-healing driver
		}
	
	
  @Test
  public void f() throws InterruptedException {
	  
	
		 
	  
	  
      WebDriver driver=new ChromeDriver();
	  
     
	  driver.get("https://staging.k8s-sailor.com/dashboard/login");
	  
	  
	  //re.capTest(); 
	  Thread.sleep(500);
	  driver.findElement(By.name("email")).sendKeys("parekh.amit@zeals.co.jp");
	  //re.check(driver, "login-check");
	  //re.capTest();  // To make a test fail in case of difference
	  
	  
	  
	  
  }
  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
	 // re.cap();
	  
  }
  
}
