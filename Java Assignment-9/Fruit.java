import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Fruit {
	
	String name;
	int Price;
	int calories;
	String color;
	public Fruit(String name,int Price, int calories,String color) {
		this.name=name;
		this.Price=Price;
		this.calories=calories;
		this.color=color;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit>list=new ArrayList<Fruit>();
		list.add(new Fruit("mango",500,150,"yellow"));
		list.add(new Fruit("banana",200,90,"yellow"));
		list.add(new Fruit("apple",300,250,"red"));
		list.add(new Fruit("grapes",200,70,"green"));
		list.add(new Fruit("pineapple",300,150,"yellow"));
		list.stream().filter(n->n.calories<100).forEach(p->System.out.println(p.name));
		list.stream().filter(n->n.color=="red").forEach(p->System.out.println(p.name));
		//list.stream().fliter(forEach(p-> System.out.println(p.name));
	    // list.stream().sorted((p1,p2)-> p1.getPrice() - p2.getPrice()).forEach(pr-> System.out.println(pr.getPrice()+" "+pr.getname()));
	   /*  <Fruits> filtereddata=list.stream().filter(F->F.calories<100);
			filtereddata.forEach
			(
					Fruit ->{
						System.out.println(Fruit.name+":"+Fruit.calories);
						}
					);*/
			
			
			
			//list.stream().filter(n->n.calories<100).forEach(p->System.out.println(p.name));
			//list.stream().filter(n->n.color=="red").forEach(p->System.out.println(p.name));
			
			//-----------------------------------------------------------
			
			
			   Stream<Fruit> filtereddata=list.stream().filter(q2->q2.color=="red");
			filtereddata.forEach
			(
					q2 ->{
						System.out.println(q2.name+"->"+q2.color);
						}
					);

			// TODO Auto-generated method stub*/
			/*3.Stream<Fruit> filtereddata=list.stream().filter(F->F.color=="yellow");
			filtereddata.forEach
			(
					Fruit ->{
						System.out.println(Fruit.name+"---->"+Fruit.color);
											}
					);*/
		}
	}


