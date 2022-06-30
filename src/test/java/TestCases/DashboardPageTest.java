package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Page.DashboardPage;
import Page.LoginPage;

public class DashboardPageTest extends Testbase {

	
	DashboardPage dash;
	LoginPage login;
	
	@BeforeMethod
	
	public void setup() throws IOException, InterruptedException
	{
		Initialization();
		dash=new DashboardPage();
		 login=new  LoginPage();
          login.Logintoapp();
	}

      @Test
      public void verifyusernametest() throws InterruptedException 
      {
    	  String value = dash.verifyusername();
      Assert.assertEquals("Pratiksha Bharat Dandge", value);
      }

      @Test
      
      public void verifyemailidtest() throws InterruptedException
      {
    	  String value1 = dash.verifyemailid();
     Assert.assertEquals("pratikshabdandge@gmail.com", value1);
      }
      
      
      @Test(enabled=false)
      
       public void placegttordertest() throws InterruptedException, EncryptedDocumentException, IOException 
      {
    	dash.placegttorder();  
      }
      
     @AfterMethod
      public void exist() 
     {
    	 driver.quit();
     }

}
