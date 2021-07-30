package CheckLinks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CheckLinksTest {
	
	WebDriver driver;
	CheckLinksPage page;

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	  driver = new ChromeDriver();
	  page = new CheckLinksPage(driver);
	  driver.get("http://www.choucairtesting.com/empleos-testing/");
	  
  }
  
  @Test
  public void f() {
	  assertTrue(page.CheckingPageLinks(), "Estos son Links Caidos");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
