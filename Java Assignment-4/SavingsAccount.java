
import java.util.Scanner;
class IllegalBankTransactionException extends RuntimeException{
	
}
public class SavingsAccount {
	
	Scanner sc  = new Scanner(System.in);
	public void withdrawal(double a)
	{
		System.out.println("Enter your Id ");
		long id = sc.nextLong();
		System.out.println("Enter your balance ");
		double b = sc.nextDouble();
		try {
			if(a>0) {
				System.out.println("Balance= " + b);
				
			}
			else {
				throw new IllegalBankTransactionException();
			}
			
		}
		catch (IllegalBankTransactionException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount();
		s.withdrawal(-10201);
}}
