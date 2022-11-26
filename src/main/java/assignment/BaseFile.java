package assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseFile {
	public static WebDriver driver =null;
	public static WebDriverWait wait=null;
	public static PageObject contactUs_Page= null;

	@BeforeSuite
	public void initSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver",  "/Users/ankitagovind/Downloads/chromedriver");
//		System.setProperty("webdriver.chrome.driver",  
//				System.getProperty(("user.dir")+"src/test/resources/driver/chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://www.stibosystems.com/");
        wait= new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();}
	@BeforeTest
	public void launching() throws IOException {
		contactUs_Page= PageFactory.initElements(driver, PageObject.class);}
}
