import java.util.Arrays;

public  class ExchangePositions {
	
	
	    public static <T> void swap(T[] a, int i, int j) {
	        T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }
	    public static void main(String args[]) {
	    	String[] a= {"1","8","5"};
	    	System.out.println("before: "+Arrays.toString(a));
	    	swap(a,0,2);
	    	System.out.println("after: "+Arrays.toString(a));
	    	
	    }
	    
	    
	
}

