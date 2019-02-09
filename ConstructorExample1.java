public class ConstructorExample1 {

   int age;
   String name;
	
   //Default constructor
   ConstructorExample1(){
	this.name="rush";
	this.age=30;
   }
	
   //Parameterized constructor
   ConstructorExample1(String n,int a){
	this.name=n;
	this.age=a;
   }
   public static void main(String args[]){
	ConstructorExample1 obj1 = new ConstructorExample1();
	ConstructorExample1 obj2 = 
		       new ConstructorExample1("alfaiz", 21);
	System.out.println(obj1.name+" "+obj1.age);
	System.out.println(obj2.name+" "+obj2.age);
   }
}