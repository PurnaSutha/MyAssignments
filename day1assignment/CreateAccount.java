package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("http://leaftaps.com/opentaps/control/main");//launch the application url
		WebElement usernameField=driver.findElement(By.xpath("//input[@id='username']"));//locate the web element
		usernameField.sendKeys("Demosalesmanager"); //enter the username into the field,using a method sendkeys
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");//enter the password into the field,using a method sendkeys
		driver.findElement(By.xpath("//input[@value='Login']")).click();//click login button
		driver.findElement(By.xpath("//div[@id='label']/a")).click();//locate and click on CRM/SA Link
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();//click on Accounts Tab
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();//locate and click on Create Account 
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Purna");//enter the Account Name
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");//enter the decription
		driver.findElement(By.xpath("//input[@name='numberEmployees']")).sendKeys("10");//enter the number of employees
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");//enter the officeSiteName 
        driver.findElement(By.xpath("//input[@value='Create Account']")).click();//Click create Account 
		System.out.println(driver.getTitle());//displaying the title of the current page
		Thread.sleep(2000);//2000ms=2 secs
		driver.close();

	}

}
