package week1.day2assignment;

public class Library {

	public String addBook(String bookTitle) //Defined a method with one input argument
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");	
	}
	
	public static void main(String[] args) {
        Library lib=new  Library();
        String bookTitle=lib.addBook("Ikigai");//calling the method using the  object lib
        System.out.println(bookTitle);
        lib.issueBook();//calling the method using the  object lib
	}

}
