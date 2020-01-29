package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Base_Page;
import genric.FileLib;

public class Login_Page extends Base_Page 
{
	//Declaration
	@FindBy(name="username")
	private WebElement user_name;
	
	@FindBy(name="userpassword")
	private WebElement user_password;
	
	@FindBy(id="submit")
	private WebElement submitButton;
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//utilization
	public void setUserName(String un)
	{
		user_name.sendKeys(un);
		
	}
	public void setpassword(String pwd)
	{
		user_password.sendKeys(pwd);
		
	}
	public void clickLOgin()
	{
		submitButton.click();
	}
	/**
	 * business method for login
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password)
	{
		user_name.sendKeys(userName);
		user_password.sendKeys(password);
		submitButton.click();
	}
	public void verifyloginpage(WebDriver driver,String lp_title)
	{
		VerifyTitle(driver,lp_title);
	}
	
	

}
