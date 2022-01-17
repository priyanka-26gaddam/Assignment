     
public class HashSet<T1,T2,T3,T4>
{
	public void display(T1 id,T2 name,T3 salary,T4 department) {
		System.out.println("id= "+id+" name= "+name+" salary= "+salary+" department= "+department);
	}
	public static void main(String args[]) {
		HashSet<Integer,String,Integer,String>sc=new HashSet<Integer,String,Integer,String>();
		sc.display(1, "priyanka", 2000," Analyst");
	}
}

	