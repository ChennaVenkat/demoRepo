package InterviewPrograms;

// Write a program to reverse astring without using inbuilt methods like reverse(), StringBuilder

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ChennaVenkat";
		String rev="";
		
		for(int i=str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
