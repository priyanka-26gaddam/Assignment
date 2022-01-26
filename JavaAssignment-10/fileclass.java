
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class fileclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("C:","Users","prgaddam","Desktop","Java11Assignments_StudentList.txt");
		
		try
		{
			String line;
			int count =0;
			
			String content = Files.readString(filePath);
			System.out.println(content);
			
			
			String words[] = content.split(" ");
			count = count + words.length;
			System.out.println("Total Name Count: " + count);
		}
		catch (IOException o)
		{
			o.printStackTrace();
		}		
		
	}

}
