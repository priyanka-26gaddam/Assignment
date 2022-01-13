
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Java String pool refers to collection of String which are stored in heap memory";
         System.out.println(str);
         System.out.println(str.toLowerCase());
         System.out.println(str.toUpperCase());
         System.out.println(str.replace('a','$'));
         System.out.println(str.contains("collection"));
         System.out.println(str.matches("(.*)Java String pool refers to collection of String which are stored in heap memory"));
         System.out.println(str.equals("Java String pool refers to collection of String which are stored in heap memory"));
	}

}
