import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawnSmile extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		//desenho do rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);

		//desenho dos olhos
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30,30);
		g.fillOval(135, 65, 30, 30);

		//desenho da boca
		g.fillOval(50, 110, 120, 60);

		//retoque da boca
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(20, 120, 120, 40);
	}
}