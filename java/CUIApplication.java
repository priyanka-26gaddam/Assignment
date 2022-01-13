import java.util.Scanner; 
public class CUIApplication{
public static void main(String[] args) {
             // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    boolean isLonginSuccess=false;
    for(int i=0;i<3;i++)
    {
    	boolean isValidUser=true;
    	System.out.println("enter user name: ");
    	String userName=sc.nextLine();
    	System.out.println("enter user password: ");
    	String password=sc.nextLine();
    	if(userName.contains(" ")|| userName.length()<3) {
    		System.out.println("Invalid user name");
    		isValidUser=false;
    	}
    	if(password.contains(" ") || password.length()<3)
    	{
    		System.out.println("invalid user password");
    		isValidUser=false;
    	}
    	if(isValidUser) {
    		System.out.println("Welcome " + userName);
    		isLonginSuccess=true;
    		break;
    	}
    	
    }
    if(!isLonginSuccess){
    	System.out.println("Please Contact Admin!");
    	return;
    }
}
}   /* import java.util.Scanner; 
public class CUIApplication{
public static void main(String[] args) {
             // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
       String sp=" ";
       System.out.println("Enter username");
       String usrname=sc.nextLine();
       if((usrname.contains(sp))||usrname.length()<6) {
             System.out.println("Invalid username");
             return;
       }
       System.out.println("Enter password");
       String usrpwd=sc.nextLine();
       if((usrpwd.contains(sp))||usrpwd.length()<6) {
             System.out.println("Invalid password");
             return;
       }
       System.out.println(usrname+ "you are registered successfully");
       System.out.println("Enter username");
       String lname=sc.nextLine();
       System.out.println("Enter password");
       String lpwd=sc.nextLine();
       if(usrname.equals(lname)&&usrpwd.equals(lpwd)) {
             System.out.println("Welcome"+lname+"you have logged in successfully");
       }
             else {
                    System.out.println("Username or password mismatch");
             }
       }
       }*/
       

/*import java.util.Scanner;

public class CUIApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       String username;
       int attempts=3;
       while(attempts!=0){
   
       System.out.print("Enter your username: ");
       username=sc.nextLine();
       System.out.println("WELCOME "+username);
       break;
       
      }
       
       if(attempts==0)
       System.out.println("Contact Admin");

}
}*/
 
