import java.util.Scanner;

public class scannerclass2 {
	public static void main(String[] args) {
		Scanner keyword = new Scanner(System.in);
		
		String username;
		String userNickName;
		int userage;
		
		System.out.println("Enter your name:");
		username = keyword.nextLine();
		
		System.out.println("Enter your Nick Name:");
		userNickName = keyword.nextLine();
		
		System.out.println("Enter your age:");
		userage = keyword.nextInt();
		
		
	}

}
