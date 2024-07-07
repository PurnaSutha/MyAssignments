package week3.day1assignment;

public class LoginTestData extends TestData //LoginTestData subclass inherits TestData superclass/baseclass
{
	 String username; //Declare Username
	 String password; //Declare password
	public void enterUsername()
	{ 
		System.out.println("Enter the Username " +username);
	}
	public void enterPassword()
	{
		System.out.println("Enter the Password " +password);
	}
	public static void main(String[] args) 
	{
		LoginTestData test=new LoginTestData(); //creating object for subclass  LoginTestData
		test.username="Purna";
		test.password="Test#";
		test.enterCredentials();//Calling TestData superclass methods in subclass
		test.enterUsername();
		test.enterPassword();	
		test.navigateToHomePage();//Calling TestData superclass methods in subclass
	}

}
