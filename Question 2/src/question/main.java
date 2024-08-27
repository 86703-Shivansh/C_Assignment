package question;
import java.util.*;


/* Q2 : Write a program to calculate the factorial of a number */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int fact = 1;
		while(n>0) {
			fact = fact * n;
			n--;
		}
		
		System.out.println("Factorial of the number is : "+fact);

	}

}
