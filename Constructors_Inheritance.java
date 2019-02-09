class ParentClass{
   //Parent class constructor
   ParentClass(){
	System.out.println("Constructor of Parent");
   }
}
class JavaExample extends ParentClass{
   JavaExample(){
	System.out.println("Constructor of Child");
   }
   public static void main(String args[]){
	//Creating the object of child class
	new JavaExample();
   }
}
