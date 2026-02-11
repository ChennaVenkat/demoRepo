package InterviewPrograms;

public class SwapStringUsingConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "maruti";
		String str2 = "suzuki";
		
		System.out.println("Before swapping String 1 is "+ str1);
		System.out.println("Before swapping string 2 is "+ str2);
		
		str1 = str1 + str2;
		
		
		str2 = str1.substring(0,str1.length()-str2.length());
		str1= str1.substring(str2.length());
		//str1 = str1.substring(6, str1.length());
		
		
		System.out.println("After swapping String 1 is "+ str1);
		System.out.println("After swapping string 2 is "+ str2);
		
	}

}
