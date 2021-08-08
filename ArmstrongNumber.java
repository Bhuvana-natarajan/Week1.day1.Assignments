package Week1.day1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int original = 153, calculated,result=0;
		calculated= original;
		while (original != 0) 
		{
			result =result +(calculated %10);
			result =result +(calculated * calculated*calculated);
			calculated = calculated/10;
		}
		
		if(result == original)
			System.out.println(calculated +"is an armstrong number");
		else
			System.out.println(calculated + "is not an armstrong number");
	
		
	}

}
