interface Arithmetic{
	int operation(int a,int b);
}
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addition operation 
		Arithmetic addition=(a,b)->a+b;
		System.out.println("Addition is:" +addition.operation(4, 7));
		//Subtraction
		Arithmetic subtraction=(a,b)->a-b;
		System.out.println("Subtraction is:" +subtraction.operation(10, 7));
		//Multiplication
		Arithmetic mul=(a,b)->a*b;
		System.out.println("Multiplication is:" +mul.operation(6, 7));
		//division
		Arithmetic division=(a,b)->a/b;
		System.out.println("division is:" +division.operation(20, 10));
		

	}

}
