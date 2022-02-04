import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Writetofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var firstfile = "C:\\Users\\Priya\\prices.txt";
		var secondfile = "C:\\Users\\Priya\\total.txt";
		int val =1,pr,total=0;
		String c="Yes";
		try {
		Scanner sc = new Scanner(System.in); 
		 char ch;
		    do {  
	            System.out.println("\n ***Menu***");  
	            System.out.println("a.Insert new price \nb.View purchase Total \nc.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.next().charAt(0);  
	                switch (ch) {  
	                    case 'a': do {
	                    	if(c.equals("Yes")) {
	                    	System.out.println("\nInsert "+val+" item price");
	                    	pr=sc.nextInt();
	                    	total=total+pr;
	                    	Files.writeString(Path.of(firstfile), String.valueOf(pr),StandardOpenOption.APPEND);
	                    	System.out.println("---Price has been saved to the file---");
	                    	System.out.println("***Do u want to enter price for more items?(Yes/No)***");
	                    	c=sc.next();
	                    	val=val+1;
	                    	}else {
	                    		break;
	                    	}
	                    }while(c!="Yes");
	                    break;
	                    case 'b':
	                    	Files.writeString(Path.of(secondfile), String.valueOf(total),StandardOpenOption.APPEND);
	                    	String totprice = Files.readString(Path.of(secondfile));
	                    	System.out.println(totprice);
	                    	break;
	                    case 'c':
	                    	System.out.println("See you soon!!");
	                }
	                
		    } while (ch != (int)'c');  
	                    	
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}