class boy{
    String name;
    
}

class arun extends boy{
    int age;
    arun (int age, String name){
        this.age= age;
        this.name= name;
    }
//  public void setage(int age){
//     this.age = age;
//  }
 public void display() {
    System.out.println(" age is "+ age);
    System.out.println(" name is "+ name);
 }
}


public class q8_constructor{
    public static void main(String[]args){
        arun a1= new arun(19, "harish");
        //a1.setage(18);
        a1.display();
    }
}