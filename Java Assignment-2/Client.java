abstract class Presistence
{
	abstract void presist();
} 
class FilePresistence extends Presistence{
	void presist()
	{
		System.out.println("data saved in file");
	}
}
class DatabasePresistence extends Presistence{
	void presist()
	{
	System.out.println("data saved in database");
	}
}
public class Client extends Presistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Presistence obj=new Client();
		obj.presist();
	}
	void presist() {
		System.out.println("Persist method from client");

	}

}
