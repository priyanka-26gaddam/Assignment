
class Employees {
	 public static int base=10000;
	int salary() {
		return base;
	}
}
class Manager extends Employees{
	int salary() {
		return base+20000;
	}
}
class Labour extends Employees{
	 int salary()
	 {
		 return base+10000;
	 }
}
public class Employee {
	
	static void printSalary(Employees e) {
		System.out.println(e.salary());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Employees e1=new Manager();
	    System.out.println("Manager salary:");
	    printSalary(e1);
	    Employees e2=new Labour();
	    System.out.println("Labour salary:");
	    printSalary(e2);
		}

	}


