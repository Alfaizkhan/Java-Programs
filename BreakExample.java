public class BreakExample {

   public static void main(String args[]){
	int var;
	for (var =100; var>=10; var --)
	{
	    System.out.println("var: "+var);
	    if (var==91)
	    {
	         break;
	    }
	 }
	 System.out.println("Out of for-loop");
   }
}