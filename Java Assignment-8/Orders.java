import java.util.ArrayList;
import java.util.stream.Stream;

public class Orders {
	float price;
	int id;
	String ordername;
	String orderstatus;
	
	public Orders(float price,int id,String ordername,String orderstatus)
	{
		this.price=price;
		this.id=id;
		this.ordername=ordername;
		this.orderstatus=orderstatus;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Orders>list=new ArrayList<Orders>();
		list.add(new Orders(19000,121,"laptop","Completed"));
		list.add(new Orders(35000,122,"smartwatch","Accepted"));
		list.add(new Orders(86000,123,"mobiles","Completed"));
		list.add(new Orders(59000,124,"materials","Accepted"));
		list.add(new Orders(26000,125,"plastic","Completed"));
		Stream<Orders> filtereddata=list.stream().filter(o->o.price>10000);
		filtereddata.forEach(
				Orders->{
					System.out.println(Orders.ordername+": "+Orders.price);
					System.out.println(Orders.orderstatus);
				}
				);
	}
}


