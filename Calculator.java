import java.util.Scanner;
class Calculator
{
  public static void main(String args[]){
	int a,b,value;
	System.out.println("enter two numbers");
	Scanner number = new Scanner(System.in);
	a = number.nextInt();
	b = number.nextInt();
	System.out.println("press 1 for addition\n press 2 for subtraction\n press 3 for division\n press 4 for multiplication");
	value = number.nextInt();
	switch(value)
	{
	   case 1 : 
	   {
		System.out.println("addition is = "+(a+b));
		break;
	   }
	   case 2 : 
	   {
		System.out.println("subtraction is = "+(a-b));
		break;
	   }
	   case 3 : 
	   {
		System.out.println("division is = "+(a/b));
		break;
	   }
	   case 4 : 
	   {
		System.out.println("multiplication is = "+(a*b));
		break;
	   }
	   default : 
	   {
		System.out.println("you have inserted wrong keyword");
		break;
	   }
	}
  }
}
