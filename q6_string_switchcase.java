import java.util.Scanner;

public class q6_string_switchcase {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // System.out.println("enter a string");
        // String a = sc.nextLine();
        // System.out.println(a);

        String a = "Harry";
        System.out.println("string is : = " +a);
    
    
        
        
        while(true)    {
         System.out.println("Enter your choice: ");
        System.out.println("1. Get length of the string");
        System.out.println("2. Convert to lowercase");
        System.out.println("3. Convert to uppercase");
        System.out.println("4. Exit");
        
        int choice = sc.nextInt();
        
                switch (choice) {
                case 1:
                    System.out.println("Length of the string: " + a.length());
                    break;
                case 2:
                    System.out.println("Lowercase: " + a.toLowerCase());
                    break;
                case 3:
                    System.out.println("Uppercase: " + a.toUpperCase());
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner before exiting
                    return; // Exit the program           
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                }
               
            }
             
    }
 }