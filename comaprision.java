//comparision between two numbers entered by the user
import java.util.Scanner;

public class Main 
{
  
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
System.out.printf("enter the first number");
		
int a = input.nextInt();
  //taking first number as input from the user
		System.out.printf("enter the second number");
  
		int b = input.nextInt();
  //taking second number as the input from the user
		if(a == b)
  //comparing both the number as equal or not
		System.out.printf("both the number are equal");
  
		if(a<b)
  //comparing if second number is greater than the first number
		System.out.printf(b+"is greater than"+a);
  
		if(a>b)
  //comparing if first number is greater than the second number
		System.out.printf(a+"\tis greater than\t"+b);
 
	}  

}
