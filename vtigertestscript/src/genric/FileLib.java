package genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.google.common.collect.Table.Cell;

public class FileLib
{
	public String getDataFromProperties(String key) throws IOException 
	{
		FileInputStream fisObj =new FileInputStream("./CommonData.properties");
		Properties pObj=new Properties();
		pObj.load(fisObj);
		String value=pObj.getProperty(key);
		return value;
		
	}
	
	public static String getExcellvalue(String path,String sheet,int row,int cell)
	{
		String v="";
		try {
			FileInputStream fis =new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Cell  c=wb.getSheet(sheet).getRow(row).getCell(cell);
			v=c.toString();
		}
	catch(Exception e)
		{
			Reporter.log("path is invalid",true);
		}
		return v;
		
	}

}
