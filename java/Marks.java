import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m1,m2,m3;
         
        	  System.out.println("enter the marks of three subjects: ");
        	  Scanner sc=new Scanner(System.in);
        	  m1=sc.nextInt();
        	  m2=sc.nextInt();
        	  m3=sc.nextInt();
        	  if(m1>=60&& m2>=60 && m3>=60)
        	  {
        		  System.out.println("passed");
        	  }
        	  else if(((m1<=60)&&( m2>=60)&&(m3>=60))||((m1>60)&&(m2<60)&&(m3>=60))||((m1>60)&&(m2<60)&&(m3<=60)))
        	  {
        		  System.out.println("promoted");
        	  }
        	  else
        	  {
        		  System.out.println("failed");
        	  }
         
	
	}
}
