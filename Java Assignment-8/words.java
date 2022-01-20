import java.util.List;
import java.util.function.Consumer;

public class words {

	public static void main(String[] args) 
	{
		var words=List.of("priya","chinna","mani","chintu");
		words.forEach((Consumer<? super String>) new Consumer<String>()
{
public void accept(String s)
{
	StringBuilder initials=new StringBuilder();
	for(String st:s.split(" "))
	{
		initials.append(st.charAt(0));
	}
	System.out.println(initials.toString());
}
});
}
}