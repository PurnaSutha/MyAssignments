package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement usernameField=driver.findElement(By.id("username"));//locate the web element
		usernameField.sendKeys("Demosalesmanager"); //enter the username into the field,using a method sendkeys
		WebElement passwordField=driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");//enter the password into the field,using a method sendkeys
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();//locate and click on CRM/SA Link
		driver.findElement(By.linkText("Leads")).click();//locate and click on Lead TAB
		driver.findElement(By.linkText("Create Lead")).click();//locate and click on Create Lead 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Purna");//locate and click on FirstName Lead 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sutha");//locate and click on LastName Lead 
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cmpny");//locate the companyField Name
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TTL");//locate the companyField Name
        driver.findElement(By.className("smallSubmit")).click();//Click create Lead 
		System.out.println(driver.getTitle());//displaying the title of the current page
		Thread.sleep(2000);//wait for 2000ms=2 secs
		driver.close();
	}

}
