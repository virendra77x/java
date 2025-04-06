import java.util.Scanner;

public class add{
    public static void main (String [] args ){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of marks");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    int result = a+b+c+d+e;
    
    System.out.println("here is the value of a = " +result);


}
}