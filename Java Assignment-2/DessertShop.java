abstract class DessertItem {
	protected String name;
	public DessertItem()
	{
		name="";
	}
	public DessertItem(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	public abstract double getCost();

}


 class candy extends DessertItem {
	private double weight;
	private double pricePerPound;
	public candy()
	{
		super();
		weight=0;
		pricePerPound=0;
	}
	public candy(String name,double w,double prc)
	{
		super(name);
		weight=w;
		pricePerPound=prc;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public double getPricePerPound()
	{
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound)
	{
		this.pricePerPound=pricePerPound;
	}
public double getCost()
{
	double total=weight*pricePerPound;
	total=Math.round(total*100);
	return total;
}
public String toString()
{
	String s=String.format("%-50s$%2f\n\t%.2f lbs@$.2f",getName(),getCost()/100,weight,pricePerPound);
	return s;
}
}
 class cookie extends DessertItem {
	private int quantity;
	private double pricePerDozen;
	public cookie()
	{
		super();
		quantity=0;
		pricePerDozen=0;
	}
	public cookie(String name,int qty,double prc)
	{
		super(name);
		quantity=qty;
		pricePerDozen=prc;
	}
	public double getQuantity()
	{
		return quantity;
	}
	public double getPricePerDozen()
	{
		return pricePerDozen;
	}
	public void setPricePerDozen(double pricePerDozen)
	{
		this.pricePerDozen=pricePerDozen;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
public double getCost()
{
	double total=pricePerDozen/12*quantity;
	total=Math.round(total*100);
	return total;
}
public String toString()
{
	String s=String.format("%-50s $.%2f\n\t%d cookies@ $%.2f per Dozen",getName(),getCost()/100,quantity,pricePerDozen);
return s;
}
}

 class IceCream extends DessertItem
{
	
		private int numberOfScoops;
		private double pricePerScoop;
		private double toppingPrice;
		public IceCream()
		{
			super();
			numberOfScoops=0;
			pricePerScoop=0;
			toppingPrice=0;
		}
		public IceCream(String name,int scoops,double prcPerScoop,double toppings)
		{
			super(name);
			numberOfScoops=scoops;
			pricePerScoop=prcPerScoop;
			toppingPrice=toppings;
			
		}
		public int getnumberOfScoops()
		{
			return numberOfScoops;
		}
		
		public void setnumberOfScoops(int numberOfScoops)
		{
			this.numberOfScoops=numberOfScoops;
		}
		public double getPricePerScoop()
		{
			return pricePerScoop;
		}
		public void setPricePerScoop(double pricePerScoop) {
			this.pricePerScoop=pricePerScoop;
		}

		public double getToppingPrice()
		{
			return toppingPrice;
		}
		public void setToppingPrice(double toppingPrice)
		{
			this.toppingPrice=toppingPrice;
		}
		
	public double getCost()
	{
		double total=(numberOfScoops*pricePerScoop+toppingPrice);
		return Math.round(100*total);
	}
	public String toString()
	{
		String s=String.format("%-50s$%.2f\n\t%dscoops@$%.2f/scoop+$%.2f",getName(),getCost()/100,numberOfScoops,pricePerScoop,toppingPrice);
	return s;
	}
	}


 class DessertShop {

public static void main(String arg[])
{
	candy item1=new candy("Peanut Butter Fudge",2.25,3.99);
	cookie item2=new cookie("Oatmeal Raisin cookies",4,3.99);
	IceCream item3=new IceCream("VAnilla Ice Cream",2,1.05,0.45);
	System.out.println(item1);
	System.out.println(item2);
	System.out.println(item3);
}
}
