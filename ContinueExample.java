public class ContinueExample {

   public static void main(String args[]){
	int a=10;
	while (a >=0)
	{
           if (a==7)
           {
	       a--;
	       
	       continue;
           }
           		System.out.print(a+" ");
           		a--;
	}
   }
}