package script;

import java.io.IOException;

import org.testng.annotations.Test;

import genric.Auto_const;
import genric.Base_Test;
import genric.FileLib;
import pom.Login_Page;

public class CreateProduct extends Base_Test 
{
	
	@Test
	public void createNewCampign() throws IOException
	{
		openAppln();
		Login_Page lp=new Login_Page(driver);
		lp.clickLOgin();
		
		
	}

}
