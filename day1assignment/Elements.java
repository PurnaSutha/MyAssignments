package week3.day1assignment;

public class Elements extends Button//Elements Executionclass inherits the Button subclass
{

	public static void main(String[] args) {
	//creating an object for Button subclass
	 Button b=new Button();
	 b.click();                 //method of WebElement superclass/base class
	 b.setText("Button");       //method of WebElement superclass/base class
	 b.submit();                 //method of Button subclass
	 
	//creating an object for TextField subclass
	 TextField t=new TextField();
	 t.click();                  //method of WebElement superclass/base class
	 t.setText("TextField");     //method of WebElement superclass/base class
	 t.getText();                //method of TextField subclass
	 
	//creating an object for CheckBoxButton subclass
	 CheckBoxButton c=new CheckBoxButton();
	 c.clickCheckButton();       //method of CheckBoxButton subclass
	 c.click();                  //method of WebElement superclass/base class
	 c.setText("CheckBoxButton");//method of WebElement superclass/base class
	 c.submit();                 //method of Button subclass
	 
	 //creating an object for RadioButton subclass
	 RadioButton r =new RadioButton();
	 r.selectRadioButton();       //method of RadioButton subclass
	 r.click();                  //method of WebElement superclass/base class
	 r.setText("Radio Button");  //method of WebElement superclass/base class
	 r.submit();                 //method of Button subclass
			
	}

}
