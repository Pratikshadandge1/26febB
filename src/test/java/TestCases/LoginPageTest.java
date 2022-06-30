package TestCases;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Page.LoginPage;

     public class LoginPageTest extends Testbase {

	 LoginPage login;
	
     @BeforeMethod

    public void setup() throws IOException {
	 Initialization();
	  login= new LoginPage();
     }

    @Test
 
     public void verifytitiletest()
    {
    	String title = login.verifytitle();
        Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
    }


        @Test
         public void verifykitelogotest()
       {
	    boolean value = login.verifykitelogo();
       Assert.assertEquals(value, true);
       }



         @Test
       
         public void verifyzerodsalogotest() 
         {
    	  boolean value = login.verifyzerodalogo();
    	  Assert.assertEquals(value, true);
         }

          @Test
       
         public void logintoapptest() throws IOException, InterruptedException {
    	   
    	   String nickname = login.Logintoapp();
       Assert.assertEquals(nickname ,"Pratiksha");
          }

     
       @AfterMethod
       public void exist()
      {
	     driver.quit();
      }




}
