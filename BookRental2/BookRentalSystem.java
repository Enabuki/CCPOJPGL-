import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BookRentalSystem {
public static void main (String[] args) {
	ArrayList<Book> books = new ArrayList<>();
	Book book1 = new Book();
	book1.title = "System Analysis and Design";
	book1.author ="Gary B. Shelly";
	book1.numberofCopies = 2;
	
	Book book2 = new Book();
	book2.title = " Android Application";
	book2.author ="Corinne Hoisington";
	book2.numberofCopies = 3;
	
	Book book3 = new Book();
	book3.title = " PROGRAMMING CONCEPTS AND LOGIC FORMULA";
	book3.author ="ROSAURO E. MANUEL";
	book3.numberofCopies = 4;
    
    books.add(book1);
    books.add(book2);
    books.add(book3);
    
    System.out.println ("ELECTRONIC BOOK RENTAL SYSTEM");
    System.out.println ("*****************************");
    
    for(int x = 0; x <books.size(); x++) {
    	System.out.println(x + ". " + books.get(x).getTitle() + ", " + books.get(x).getAuthor());
    	System.out.println();
    }
    boolean end = false;
    
    while (end == false) {
    	try {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("CHOOSE A NUMBER TO RENT A BOOK:");
    	int choice = scan.nextInt();
    	
    	Book book = books.get(choice);
    	int copy = book.getNumberofCopies();
    	if (copy>0) {
    		System.out.println("YOU RENTED: " + books.get(choice).getTitle());
    		book.setnumberofCopies(copy-=1);
    	}
    	else {
    		System.out.println("NO COPIES AVAILABLE");
    	}
    	System.out.println("RENT AGAIN? Y/N");
    	String ask = scan.next();
    	if(ask.equals("N")) {
    		end = true;
    	}
    }
    	catch(IndexOutOfBoundsException ex) {
    		System.out.println("INVALID CHOICE");
    	}
    	catch(InputMismatchException ex) {
    		System.out.println("CHOOSE A NUMBER");
    	}
}
}
}
