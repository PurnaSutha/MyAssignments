package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();//
	driver.manage().window().maximize();//maximize the window
	driver.get("http://leaftaps.com/opentaps/control/main");//launch the url
	
    WebElement usernameField=driver.findElement(By.xpath("//input[@id='username']"));
	usernameField.sendKeys("Demosalesmanager"); //enter the username into the field,using a method sendkeys
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");//enter the password into the field,using a method sendkeys
	driver.findElement(By.xpath("//input[@value='Login']")).click();//click login button
	driver.findElement(By.xpath("//div[@id='label']/a")).click();//locate and click on CRM/SA Link
	driver.findElement(By.xpath("//a[text()='Accounts']")).click();//click on Accounts Tab
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();//locate and click on Create Account 
    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Training Test Leaf Demo ");//enter the Account Name
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");//enter the decription

     WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	 Select oindustry=new Select (industry);//creating object for industry select class
	 oindustry.selectByIndex(3);//selecting the industry as Computer Software
	 
	 WebElement owner=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	 Select oowner=new Select (owner);//creating object for ownership select class
	 oowner.selectByVisibleText("S-Corporation");//selecting the ownership as S-Corporation  using selectByVisibleText
	 
	 WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	 Select osource=new Select (source);//creating object for source select class
	 osource.selectByValue("LEAD_EMPLOYEE");//selecting the source as Employee using selectByValue
	 
	 WebElement mrketingcampaign=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	 Select omrketingcampaign=new Select (mrketingcampaign);//creating object for mrketingcampaign select class
	 omrketingcampaign.selectByIndex(6);//selecting the emarketing campaign as eCommerce Site Internal Campaign using selectByIndex
	 
	 WebElement state=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	 Select ostate=new Select (state);;//creating object for state/province select class
	 ostate.selectByValue("TX");//selecting the Texas using selectByValue
	 
    driver.findElement(By.xpath("//input[@value='Create Account']")).click();//Click create Account 
	System.out.println(driver.getTitle());//displaying the title of the current page
	Thread.sleep(2000);//2000ms=2 secs
	driver.close();
 }
}
