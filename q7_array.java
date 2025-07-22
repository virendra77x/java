import java.util.Scanner;
public class q7_array {
    public static void main (String []args){
    int [] arr={6,8,6,3,2,7};
        int [] arr1= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int element : arr){
        System.out.println(element);

        
    }

    System.out.println("enter number");
    for ( int i= 0; i < 5; i++){
         arr1[i]= sc.nextInt();
    }

    for (int element : arr){
        System.out.println(element);
    }
}
}