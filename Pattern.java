import java.util.Scanner;


public class Main

{
	
public static void main(String[] args) 
{
	   
 int a,b,sum=0;
	
	System.out.println("\t\tSUM OF DIGITS");
	
	System.out.println("Enter the no. of digits");
	
	Scanner s=new Scanner(System.in);
		
a=s.nextInt();
	
	while(a>0)

		{

		    b=a%10;

		    sum=sum+b;
	
	    a=a/10;
		
}
		
System.out.println("Sum of given digits is:"+sum);

	}

}