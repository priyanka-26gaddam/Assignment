
public class AbstractOverride {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d1=new demo1();
		d1.call();
		d1.text();
          
	}
	abstract class demo1{
		void call() {
			System.out.println("calling");
		}
		void text() {
			System.out.println("texting");
		}
	}
	class demo2 extends demo1{
		void call() {
			System.out.println("calling");
		}
		void text() {
			System.out.println("texting");
		}
	}

}
