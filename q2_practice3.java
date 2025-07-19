/******************************************************************************
*******************************************************************************/

public class q2_practice3
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		
		String a = "rojgauaaarr";
//                  012345678910
        System.out.println(a);
/*
		// question 2
		System.out.println(a.replace(' ', '_'));
		
		//question 3
		String text = a.replace("is","was");
		System.out.println(text);
	
*/	
		System.out.println(a.indexOf("a"));
		System.out.println(a.lastIndexOf("a"));
		
		if (a.endsWith("r")){
		    System.out.println("good");
		}
		else{
		    System.out.println("bad");
		}
		
		

	}
}
