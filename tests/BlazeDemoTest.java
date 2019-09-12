//Name: Manoj Kumar Goud Anapurapu
//Id no - C0743896

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		WebElement testDropDown = driver.findElement(By.name("fromport"));
		Select fromport = new Select(testDropDown); 
		// trial and error 
	}

}
