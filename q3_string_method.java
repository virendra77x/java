import java.util.Scanner;

public class q3_string_method {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // System.out.println("enter a string");
        // String a = sc.nextLine();
        // System.out.println(a);

        String a = "Harry";
        System.out.println("string is : = " +a);
        String b = a.toLowerCase();
        System.out.println("Length of the string: " + a.length());
        
        System.out.println("Lowercase: " + b);    
        System.out.println("Uppercase: " + a.toUpperCase()); 
        
        System.out.println(a.substring(2));
        System.out.println(a.substring(2));

    
        System.out.println("after string: = " +a);
             
    }
 }