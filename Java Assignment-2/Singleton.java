
public class Singleton {
	private static Singleton singleton=null;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton =new Singleton();
		}
		return singleton;
	}
	public void getContactDetails() {
		System.out.println("contact details");
	}

	public static void mani(String[] args) {
		Singleton obj1= singleton.getInstance();
		System.out.println(obj1);
		Singleton obj2= singleton.getInstance();
		System.out.println(obj2);
		}
}
     /* private static final Singleton instance=new Singleton();
      private Singleton() {}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static Singleton getInstance() {
			return instance;

	}

}*/
