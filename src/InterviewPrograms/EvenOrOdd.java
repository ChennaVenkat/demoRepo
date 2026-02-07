package InterviewPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The number is even : " + a);
		}else {
			System.out.println("The number is odd : "+ a);
		}
	}

}
