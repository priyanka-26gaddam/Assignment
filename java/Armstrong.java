
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,n,rem,result=0;
		n=num;
	    while(n!=0)
	    {
	    	rem=n%10;
	    	result=result+(rem*rem*rem);
	    	n=n/10;
	     }
	    if(result==num)
	    	System.out.println(num + " is an amstrong number");
	    else
	        System.out.println(num + " is not an amstrong number");

	}

}
