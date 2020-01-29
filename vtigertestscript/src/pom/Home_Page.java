package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Base_Page;

public class Home_Page extends Base_Page
{
	//Declaration
	@FindBy(xpath="//a[text()='Products']")
	private WebElement clickproducts;
	
	@FindBy(xpath="//a/img[@title='Create Product...']")
	private WebElement createnewproduct;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement organizationname;
	
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement savebutton;
	
	//intialization
	
	public Home_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//utilization
	public void productlink()
	{
		clickproducts.click();
	}
	public void createproduct()
	{
		createnewproduct.click();
	}
	public void orgName()
	{
		organizationname.sendKeys("it");
	}
	
	public void saveProduct()
	{
		savebutton.click();
	}

}
