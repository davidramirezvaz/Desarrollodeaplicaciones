package nuevos;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class LayoutExample {

	private JFrame f;
	private JButton b1, b2, b3 , b4 ,b5;
	
	public LayoutExample()
	{
		f = new JFrame ("GUI Example");
		b1 = new  JButton("BOTON 1");
		b2 = new  JButton("BOTON 2");
		b3 = new  JButton("BOTON 3");
		b4 = new  JButton("BOTON 4");
		b5 = new  JButton("BOTON 5");
		
	}
	
	public void lauchFrame ()
	{
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		
		LayoutExample guiWindow = new LayoutExample();
		guiWindow.lauchFrame();
	}

}
