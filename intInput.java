import javax.swing.JOptionPane;

public class intInput {
	
	public static void main(String[] args)
	{
			String userNumber;
			int userInt;
			userNumber = JOptionPane.showInputDialog(" Please enter an Interger");
			
			userInt = Integer.parseInt(userNumber);
			
			JOptionPane.showMessageDialog(null, userInt + 200 );
			
			System.exit(0);
	}

}
