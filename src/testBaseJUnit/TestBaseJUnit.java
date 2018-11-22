/**
 * 
 */
package testBaseJUnit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shah jyoti
 *
 */
public class TestBaseJUnit {

	public static WebDriver driver;
	public WebDriverWait wait;
	
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Jyoti\\workspaces\\Practice\\src\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

//		String url = "https://manipal.edu/mu.html";
//		String url = "http://www.crossword.in/";
//		String url = "http://www.apollocabs.in/contact-us.html";
		String url = "https://www.google.com/maps/";
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Navigated to URL: "+url);
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
