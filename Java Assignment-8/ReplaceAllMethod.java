import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAllMethod {

    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
         
        System.out.println(alphabets);
         
        alphabets.replaceAll( e -> e.toLowerCase() );  
         
        System.out.println(alphabets);
    }
}