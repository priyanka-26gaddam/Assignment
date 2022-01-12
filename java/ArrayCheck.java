import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num,n,search,arr[];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of elements :");
      n=sc.nextInt();
      arr=new int[n];
      System.out.println("enter "+n+"elements");
      for(num=0;num<n;num++) 
    	  arr[num]=sc.nextInt();
    	  System.out.println("enter the value to be find in array");
    	  search=sc.nextInt();
    	  for(num=0;num<n;num++)
    	  {
    		  if(arr[num]==search)
    		  {
    			  System.out.println(search+"present in array");
    			  break;
    		  }
    	  }
    		  if(num==n)
    		  System.out.println(search+"not present in array");
    	  
      
      
	

}
	}

