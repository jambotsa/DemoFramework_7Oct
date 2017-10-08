package ApplicationPages;


	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

	WebDriver driver;
	 
	 
	public Homepage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	 
	 
	@FindBy(xpath =".//span[class='hidden-xs][text()='Home']")
	WebElement homePageLink; 
	 
	@FindBy(xpath=".//[text()='My Account']")
	WebElement myAccountLink;
	 
	@FindBy(xpath=".//[text()='My Cart']")
	WebElement myCartLink;
	
	
	 
	@FindBy(xpath=".//[text()='Wishlist']")
	WebElement wishListLink;
	
	@FindBy(xpath="//span[text()=' Log In']")
	WebElement loginLink;
	 
	 
	public void ClickOnHomePage(){
		
		homePageLink.click();
		
	}
	
	public void clickOnMyAccount(){
		
		myAccountLink.click();
		
	}
	
	public void clickOnMyCart(){
		
		myCartLink.click();
		
	}
	
	public void clickOnwishList(){
		
		wishListLink.click();
		
	}
	
	public void clickOnLogin(){
		
		loginLink.click();
		
	}
	
	public String getApplicationTitle(){
		
		return (driver.getTitle());
	}
	
}
