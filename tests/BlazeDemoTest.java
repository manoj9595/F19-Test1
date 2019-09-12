import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestSingleInputField() throws InterruptedException {
	

		// 1. Configure Selenium to talk to Chrome
		System.setProperty("webdriver.chrome.driver","/Users/manoj/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		// 2. Enter the website you want to go to
		String baseUrl = "http://blazedemo.com/";

		// 3. Open Chrome and go to the base url;
		driver.get(baseUrl);
		
		WebElement form = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
	}

}
