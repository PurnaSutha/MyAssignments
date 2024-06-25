package week1.day2assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library libmange=new Library();//creating the object for  LibraryManagement
		String bookTitle=libmange.addBook("The Secret");//calling the method addBook from different (Library)  class
        System.out.println(bookTitle); 
        libmange.issueBook();//calling the method issueBook from different (Library)  class
	}

}
