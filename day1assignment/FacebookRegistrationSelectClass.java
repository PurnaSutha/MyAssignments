package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//object creation for chrome driver
		driver.get("https://en-gb.facebook.com/");//load the url
		driver.manage().window().maximize();//maximizing the window
		Thread.sleep(5000);//wait for 5secs
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();//click on create account
		Thread.sleep(8000);//wait for 8secs
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Purna");//Locate and enter the FirstName
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sutha");//Locate and enter the SurName
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7789546123");//Locate and enter the Mobile number or email
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Flower$@23");//Locate and enter the Password
	    
	    WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	    Select oday=new Select(day);//creating an object for day
        oday.selectByIndex(22);//selecting the day dropdown as 23 using selectByIndex
        
	    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select omonth=new Select (month);//creating an object for month 
	    omonth.selectByVisibleText("Feb");//selecting the day dropdown as Feb using selectByVisibleText
	    
	    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	    Select oyear=new Select (year);//creating an object for year 
	    oyear.selectByValue("1995");//selecting the day dropdown as 1995 using selectByValue
	    
	    driver.findElement(By.xpath("//input[@value='1']")).click();//select the radio button 'female' 
		Thread.sleep(2000);//wait for 5secds
	    driver.close();//closing the browser
	}

}
