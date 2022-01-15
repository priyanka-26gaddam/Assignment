
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=30,b=0;
			int c=a/b;
			System.out.println("result="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error:"+e);
		}

	}

}
