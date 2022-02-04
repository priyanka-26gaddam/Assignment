import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


	public class Trader {
	String name,trader;
	String city;
	int year;
	int value;
	Trader(String name,String trader, String city,int year,int value)
	{
		this.name=name;
		this.trader=trader;
		this.city=city;
		this.year=year;
		this.value=value;
	}
	public static void main(String args[])
	{
		ArrayList<Trader> l5=new ArrayList<Trader>();
		l5.add(new Trader("priya","bussiness","hyd",2011,3000));
		l5.add(new Trader("madhu","bussiness","pune",2011,4000));
		l5.add(new Trader("chintu","business","delhi",2011,2000));
		
		/*Stream<Trader> filtereddata=l5.stream().filter(t->t.city=="pune");
		filtereddata.forEach
		(
				trader ->{
					System.out.println(trader.city);
					}
				);*/
		Stream<Trader> filtereddata=l5.stream().filter(t->t.name=="priya");
		filtereddata.forEach
		(
				trader ->{
					System.out.println(trader.name);
					}
				);
	}


	}
