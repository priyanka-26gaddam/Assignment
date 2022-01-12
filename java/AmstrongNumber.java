
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100,a,arm,n;
		System.out.println("Amstrong number from 100 t0 999 are");
		while(i<999)
		{
			n=i;
			arm=0;
			while(n>0)
			{
				a=n%10;
				arm=arm+(a*a*a);
				n=n/10;
			}
			if(arm==i)
				System.out.println(i);
			i++;
		}
		

	}

}
