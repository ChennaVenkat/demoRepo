package InterviewPrograms;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java Program to swap two given Strings
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("Before swapping String 1 is "+ str1);
		System.out.println("Before swapping string 2 is "+ str2);
		
		//Swapping
		String temp = str1;
		str1=str2;
		str2=temp;
		
		System.out.println("After swapping String1 is "+str1);
		System.out.println("After swapping string2 is "+str2);

	}

}
