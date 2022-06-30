package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testbase {

	
	 
	public static WebDriver driver ;
	
	 public String readpropertyFile(String value) throws IOException  
	 {
	  Properties prop =new Properties();
	  FileInputStream file= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\framework\\Book1.xlsx");
	  prop.load(file);
	  return prop.getProperty(value);
	 }
	 
	 
	 public  void Initialization () throws IOException
	{
	   ChromeOptions o = new ChromeOptions(); 
	   o.addArguments("--disable-notifications");
       System.setProperty("Webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver(o);
        driver.manage().window().maximize();
        driver.get(readpropertyFile("url"));
        driver.manage().deleteAllCookies();
       
         
	//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}


	public String readexcelfile(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\framework\\Testdata\\Book1.xlsx");
	 Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = excelsheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	return value;
	}
	 
	

}
