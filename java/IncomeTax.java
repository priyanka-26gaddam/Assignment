import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0,income;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter income:");
		income=scanner.nextDouble();
		if(income<=180000)
		
			tax=0;
		
		else if(income<=180001)
			tax=0.1*(income-300000);
		else if(income<=300001)
			tax=(0.2*(income-500000))+(0.1*(180001-300000));
		else if(income<=500001)
			tax=(0.3*(income-1000000))+(0.2*(300001-500000))+(0.1*(180001-300000));
			System.out.println("Income tax amounr is"+tax);
	}
}
		