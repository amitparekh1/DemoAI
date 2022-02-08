package AITest.DemoAI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyMojoTest {
	
	
	//public static String remote_url_chrome = "http://localhost:4445/wd/hub";
	public WebDriver driver1;
	private static String OS = System.getProperty("os.name").toLowerCase();
    
    public WebDriver driver;

	public void main(String[] args) {

        System.out.println(OS);

    }
	  
	  @BeforeMethod
	public void testInit() {
		  //System.setProperty("webdriver.chrome.driver","src/main/resources/selenium.driver/chromedriver");
		//  WebDriver driver = new ChromeDriver(); // declare delegate
			// driver = SelfHealingDriver.create(delegate); // create Self-healing driver
		 // WebDriverManager.chromedriver().setup();	
	  }
	
	  public void setDriver() {
	        if (isWindows()) {
	            System.setProperty(
	                    "webdriver.chrome.driver", "src\\main\\resources\\selenium.driver\\chromedriver.exe");
	        } else if (isUnix()) {
				System.setProperty(
						"webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	        } else if (isMac()) {
	            System.setProperty(
	                   "webdriver.chrome.driver", "src/main/resources/selenium.driver/chromedriver_mac_latest");
	        }
	    }
	  public static boolean isWindows() {
	        return OS.contains("win");
	    }

	    public static boolean isMac() {
	        return OS.contains("mac");
	    }

	    public static boolean isUnix() {
	        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix") || OS.contains("ubun"));
	    }

	    public static boolean isSolaris() {
	        return OS.contains("sunos");
	    }
  @Test
  public void f() throws InterruptedException {
	  
	
		 
	  
	  
      WebDriver driver=new ChromeDriver();
     // ChromeDriver driver = new ChromeDriver();
     
	  driver.get("https://staging.k8s-sailor.com/dashboard/login");
	  
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("document.body.style.zoom = '1.5'");
	  
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
