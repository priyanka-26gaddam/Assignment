import java.util.ArrayList;
import java.util.function.Predicate;

class Employee implements Comparable<Employee>{
	int Id;
	String Name;
	int salary;
	public Employee (int id,String name,int salary) {
		this.Id=id;
		this.Name=name;
		this.salary=salary;
				
	}
	public int compareTo(Employee e) {
		if(Id>e.Id) {
			return 1;
			}
		else if(Id<e.Id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String getName()
	{
		return Name;
	}
	
}
public class RemoveIfmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Employee>employees=new ArrayList<Employee>();
       employees.add(new Employee(101,"priyanka",30000));
       employees.add(new Employee(102,"nithin",40000));
       employees.add(new Employee(103,"mani",30000));
       employees.add(new Employee(104,"bharu",25000));
       employees.add(new Employee(105,"priya",20000));
       Predicate<Employee>condition=employee->employee.getName().startsWith("p");
       employees.removeIf(condition);
       System.out.println(employees);
	}

}
