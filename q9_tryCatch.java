public class q9_tryCatch {
    public static void main(String[] args) {
        
        try{
            System.out.println(67/0);
        }

        catch (ArithmeticException e){
            System.out.println("you can not divide by zero");
        }

        System.out.println("hurray");
    }
    
}
