package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseFile{
	@Test
	public void userContact() throws InterruptedException {
	//Accept cookies page
		contactUs_Page.getAccept_cookies().click();
	//Click on Book Demo button
		contactUs_Page.getBook_demo().click();
	//Handled multiple windows
		Set<String> winIds= driver.getWindowHandles();
		Iterator<String> itr= winIds.iterator();
		String fWindow= itr.next();
		String sWindow= itr.next();
		driver.switchTo().window(sWindow);
	//Scroll down
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,600)", "");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='message']")));
	//Insert some message Your Message box
	    contactUs_Page.getT_box().sendKeys("this is dummy text to insert");
	//Select any country form drop down
		Select sc=new Select (contactUs_Page.getCountry());
		sc.selectByValue("Denmark");
	//Click Send button
		contactUs_Page.getS_button().click();
	//Scroll up
		js.executeScript("window.scrollBy(0,-600)", "");
        Assert.assertEquals( contactUs_Page.getF_tbox().getText(), "Please complete this required field.", "not match");
    //Click on Logo page
        contactUs_Page.getLogo().click();
        String actualTitle = "Master Data Management | Enterprise MDM solutions | Stibo Systems";
    //Verify the title 
        Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
        driver.quit();
      
      
	}

}
