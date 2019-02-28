import javax.swing.JOptionPane;

public class userResponse {
	public static void main(String[] args)
	{
		String userResponse;
	
		userResponse = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello " + userResponse + ", Good morning");
		
		System.exit(0);
	}

}
