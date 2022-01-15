
import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{
}
public class SavingAccount{
	Scanner sc=new Scanner(System.in);
	public void withdrawal(double a)
	{
		System.out.println("Enter your id ");
		long id=sc.nextLong();
		System.out.println("Enter your balance");
		double b=sc.nextDouble();
		try {
			if(a<=b)
			{
				b=b-a;
				System.out.println("Balance="+b);
			}
			else {
				throw new InsufficientBalanceException();
			}
		}
			catch(InsufficientBalanceException e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			SavingAccount s=new SavingAccount();
			s.withdrawal(2000);
		}
	}

	