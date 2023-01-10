import javax.swing.JFrame;

public class DrawSmileTest{
	public static void main(String[] args){
		DrawnSmile panel = new DrawnSmile();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}