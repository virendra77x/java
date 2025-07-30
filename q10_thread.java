class Mythread extends Thread{
    String name;
    Mythread(String name){
        this.name= name;
    }

    public void run(){
        for(int i =0; i<10; i++){
            System.out.println(name+"value is "+i);
        try{
            Thread.sleep(1000);
        }

        catch (Exception e){
            System.out.println("koi na");
        }
        }
    }
}




public class q10_thread {
    public static void main(String[] args) {
          Thread t1 = new Mythread("Thread1");     
        t1.start();
    }
  
}
