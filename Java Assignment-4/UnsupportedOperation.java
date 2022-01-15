import java.util.Scanner;

public class UnsupportedOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number: ");
					a=sc.nextInt();
					System.out.println("enter second number: ");
					b=sc.nextInt();
					System.out.println(a/b);
					}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling"+e);
			System.out.println("UnsupportedOperationException");
		}
		

	}

}
