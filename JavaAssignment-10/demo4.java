
interface myInt {
	int add(int a, int b);
}
class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var v = (a,b) -> (a + b);
		System.out.println(v.add(2,3));
	}

}
