package assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
	
	public WebElement getAccept_cookies() {
		return accept_cookies;
	}
	public WebElement getBook_demo() {
		return book_demo;
	}
	public WebElement getT_box() {
		return t_box;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getS_button() {
		return s_button;
	}
	public WebElement getF_tbox() {
		return f_tbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	@FindBy(xpath="//div[@class='coi-button-group']//button[@aria-label='Accept all']")
	private WebElement accept_cookies;
	@FindBy(xpath="//div[@class='sb-big-hero-content-links']//a[contains(text(), 'BOOK A DEMO')]")
	private WebElement book_demo;
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement t_box;
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement s_button;
	@FindBy(xpath="//fieldset[@class='form-columns-2']//div[@class='hs_firstname hs-firstname hs-fieldtype-text field hs-form-field']//ul//li//label")
	private WebElement f_tbox;
	@FindBy(xpath="//a[@class='sb-nav-logo']")
	private WebElement logo;
	
	


}
