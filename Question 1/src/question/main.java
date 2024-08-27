package question;
import java.util.*;



/* Q1 : Write a program to input n numbers on command line argument and calculate maximum of them */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int max=0;
		
		
		for(int i=0;i<n;i++) {
			int r = sc.nextInt();
			if(r>max) {
				max = r;
			}
		}
		
		System.out.println("Maximum of the input number : "+max);
	}

}
