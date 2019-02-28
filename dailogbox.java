import javax.swing.JOptionPane;

public class dailogbox {
	public static void main(String[] args)
	{
		
		String userFirstname;
		String userLastname;
		userFirstname = JOptionPane.showInputDialog("Enter your First name:");
		userLastname = JOptionPane.showInputDialog("Enter yout last name:");
		
		JOptionPane.showMessageDialog(null, "Hello ! " + userFirstname + " " + userLastname +", Good evening");
		
		System.exit(0);
	}
}
