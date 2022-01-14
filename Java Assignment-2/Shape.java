
	abstract class Shapes {
		abstract void draw();
	}
	class Line extends Shapes{
		void draw()
		{
			System.out.println("drawing line");
		}
	}
		class Rectangle extends Shapes{
			void draw() {
				System.out.println("drawing rectangle");
			}
		}
		class Circle extends Shapes{
			void draw() {
				System.out.println("drawing circle");
			}
		}
		
		public class Shape{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shapes s1=new Line();
			s1.draw();
			Shapes s2=new Rectangle();
			s2.draw();
			Shapes s3=new Circle();
			s3.draw();
	}
	}
