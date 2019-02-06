
public class ExeptionHandling {
	public static void main(String[] args)
	{
		try {
		int[] myNum= {1,2,3};
		System.out.println(myNum[10]);
		
		int x=32,y=0;
		int a=x/y;
		System.out.println(a);
		
		}
			catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Something went wrong");
		}
				finally
		{
			System.out.println("Good bye!");
		}
	}
}
