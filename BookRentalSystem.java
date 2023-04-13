import java.util.Scanner;

public class BookRentalSystem {
    public static void main(String[] args) {
        // Initialize the book information
        String[] titles = {"System Analysis and Design", "Android Application", "Programming Concepts and Logic Formulation"};
        String[] authors = {"Unknown", "John Doe", "Jane Doe"};
        int[] yearsPublished = {2000, 2010, 2020};
        int[] numCopies = {2, 3, 4};
        
        Scanner input = new Scanner(System.in);
        
        // Loop until all books are borrowed
        while (true) {
            // Display the list of books with their information and availability
            System.out.println("List of Books:");
            for (int i = 0; i < titles.length; i++) {
                System.out.println((i + 1) + ". " + titles[i] + " by " + authors[i] + " (" + yearsPublished[i] + ")");
                System.out.println("   Copies available: " + numCopies[i]);
            }
            
            // Prompt the user to select a book by index
            System.out.print("Enter the index of the book you want to borrow (0 to exit): ");
            int bookIndex = input.nextInt();
            
            // Check if the user wants to exit
            if (bookIndex == 0) {
                break;
            }
            
            // Check if the book index is valid
            if (bookIndex < 1 || bookIndex > titles.length) {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
                continue;
            }
            
            // Check if the book is available
            if (numCopies[bookIndex - 1] == 0) {
                System.out.println("Book not available, please select another book.");
                continue;
            }
            
            // Borrow the book and decrease the number of copies available
            System.out.println("You have borrowed " + titles[bookIndex - 1] + " by " + authors[bookIndex - 1] + ".");
            numCopies[bookIndex - 1]--;
        }
        
        // End of program
        System.out.println("Thank you for using our book rental system!");
    }
}
