package question;
import java.util.*;

/* Q3 : Write a program to print fibonacci series */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter how many numbers you want");
		Scanner sc=new Scanner (System.in);
		int n2=sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+","+b+",");
		for (int i=0; i<n2-2; i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}

	}

}
