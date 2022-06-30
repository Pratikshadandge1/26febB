package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class LoginPage extends Testbase {
	
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kitelogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodalogo;
    @FindBy(xpath="//input[@type=\"text\"]")private WebElement useridtextbox;
    @FindBy(xpath="//input[@type=\"password\"]")private WebElement passwordtextbox;
    @FindBy(xpath="//button[@type=\"submit\"]")private WebElement logginbtn;
    @FindBy(xpath="//input[@type=\"password\"]")private WebElement paaswordtextbox;
    @FindBy(xpath="//button[@type=\"submit\"]")private WebElement continuebtn;
    @FindBy(xpath="//span[@class='nickname']")private WebElement nicknamelable;
  
       public LoginPage() 
        {
		PageFactory.initElements(driver,this);
        }

	 
      public String verifytitle() 
	    {
		return driver.getTitle();
	    }

     
      public boolean verifykitelogo() 
        {
    	 return kitelogo.isDisplayed();
        }
     
     
     public boolean verifyzerodalogo()
    	 {
         return zerodalogo.isDisplayed();
    	 }
     
  
	  
     public String Logintoapp() throws IOException, InterruptedException
       {
	 
    	 useridtextbox.sendKeys(readpropertyFile("username"));
    	 passwordtextbox.sendKeys(readpropertyFile("password"));
    	 logginbtn.click();
    	 Thread.sleep(1000);
    	 paaswordtextbox.sendKeys(readpropertyFile("pin"));
    	 continuebtn.click();
         Thread.sleep(1000);
         return nicknamelable.getText();
       
       }
    	 
     	 
    	 
     
		
	


		
	}




