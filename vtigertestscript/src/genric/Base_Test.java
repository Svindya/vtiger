package genric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_const
{
	public WebDriver driver;
	FileLib lib=new FileLib();
	@BeforeMethod
	public void openAppln() throws IOException
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		lib.getDataFromProperties("Url");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}

}
