package Page;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class DashboardPage extends Testbase{

	
	@FindBy(xpath="//span[text()='PB']")private WebElement avtaricon;
	@FindBy(xpath="//h4[@class='username']")private WebElement username;
	@FindBy(xpath="//div[@class='email']")private WebElement email;
	
	@FindBy(xpath="//button[text()='Start investing ']")private WebElement startinvestingbtn;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement searchbar;
	@FindBy(xpath="//li[@class='search-result-item selected']")private WebElement selectshare;
	@FindBy(xpath="//button[text()='Create GTT ']")private WebElement creategttbutn;
	@FindBy(xpath="//input[@label='Trigger price']")private WebElement triggerpricebTextbox;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement qtytextbox;
	@FindBy(xpath="//input[@label='Price']")private WebElement pricetextbox;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement canclebtn;


	public  DashboardPage() 
	{
		PageFactory.initElements(driver, this);
		
    }
	
	public String verifyusername() throws InterruptedException 
	{
		avtaricon.click();
		Thread.sleep(2000);
		return username.getText();
	}

    public String verifyemailid() throws InterruptedException 
    {
    	avtaricon.click();
    	Thread.sleep(1000);
	 return email.getText();
    
    }

    
    public void placegttorder() throws InterruptedException, EncryptedDocumentException, IOException 
    {
    	
    	
    	startinvestingbtn.click();
    	Thread.sleep(2000);
    	searchbar.sendKeys(readexcelfile(0, 0));
    	Thread.sleep(1000);
    	selectshare.click();
    	Thread.sleep(1000);
    	creategttbutn.click();
    	Thread.sleep(1000);
    	
    	triggerpricebTextbox.clear();
    	triggerpricebTextbox.sendKeys(readexcelfile(0, 1));
        Thread.sleep(1000);
    	qtytextbox.sendKeys(readexcelfile(0, 2));
    	Thread.sleep(1000);
    	qtytextbox.clear();
    	 pricetextbox.sendKeys(readexcelfile(0, 3));
    	 Thread.sleep(1000);
    	 canclebtn.click();
    
    }
}
