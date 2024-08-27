package question;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter marks of first subject");
		int n1 = sc.nextInt();
		System.out.println("Enter marks of second subject");
		int n2 = sc.nextInt();
		System.out.println("Enter marks of third subject");
		int n3 = sc.nextInt();
		System.out.println("Enter marks of fourth subject");
		int n4 = sc.nextInt();
		System.out.println("Enter marks of fifth subject");
		int n5 = sc.nextInt();
		
		int sum = n1 + n2 + n3 + n4 + n5;
		
		if(sum >= 90 ) System.out.println("Grade : Ex");
		else if( sum<90 && sum>=80) System.out.println("Grade : A");
		else if( sum<80 && sum>=70) System.out.println("Grade : B");
		else if( sum<70 && sum>=60) System.out.println("Grade : C");
		else if( sum < 60) System.out.println("Grade : A");

	}

}
