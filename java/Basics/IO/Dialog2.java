import javax.swing.JOptionPane;

public class Dialog2
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name? ");
		String welcomeMessage = "Hello " + name + " welcome to the crazy world of java!";
		JOptionPane.showMessageDialog(null, welcomeMessage);
	}
}