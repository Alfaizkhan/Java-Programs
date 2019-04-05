package allinOne;

	class allOOP {
		public void display() {
			System.out.println("ALL OOP CONCEPT IN ONE");
		}
	}

//inheritance example
	
class one extends allOOP {
	@Override
	public void display() {
		System.out.println("class one");
	}
		public int add(int x, int y) {
		return x+y;
	}
		//Overload
		public double add(double x,double y) {
			return x+y;
			}
		}

//encapsulation example

class encapsulation {
	private String name;
	public String getName() {
	return name;
}
	public void setName(String newName) {
		name = newName;
		}
	}

//abstraction example
abstract class TwoWheeler {
	public abstract void run();
	}
		class yamaha extends TwoWheeler{
			public void run(){
				System.out.println("\nYamaha FZs is Love");
			}
		}
		
class MainClass {
	public static void main(String[] args) {
		allOOP obj1=new allOOP();
		obj1.display();
		one obj2=new one();
		obj2.display();
		
		System.out.println(obj2.add(4,2));
		System.out.println(obj2.add(5.5,2.0)); //polymorphism
		encapsulation encap = new encapsulation();
		encap.setName("Alfaizkhan Pathan");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new yamaha();
		test.run();
	}
}