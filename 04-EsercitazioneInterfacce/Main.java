package interfacce;

//import java.awt.Toolkit;
/*import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JTextField;*/

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*JFrame frame = new JFrame("Frame Demo");
		
		
		JTextField textField = new JTextField("sdasdsa");
		
		frame.getContentPane().add(textField);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < 10; i++) {
			Toolkit.getDefaultToolkit().beep();
			TimeUnit.SECONDS.sleep(1);
		}*/
		
		Shape s = new Circle(new Point(2,1), 5);
		
		TwoDimensionalCanvas c = new TextualTwoDimensionalCanvas();
		
		s.draw(c);
		
		Rotatable r = s;
		
		Scalable f = s;
		
		Scalable g = (Scalable) r;
		
		Rotatable e = (Rotatable) f;
	}
}
