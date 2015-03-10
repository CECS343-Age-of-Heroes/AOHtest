import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// comments go here
// test comment
// my name is matt
// another commit
// I hope this works

public class GameTestClass extends JFrame {

	private JPanel p = new JPanel();
	
	public GameTestClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mediaFrame.setBackground(Color.GREEN.darker().darker());
		setResizable(false);
		setLocationRelativeTo(null);
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(1200, 800));
		p.add(new JPanel(new Dimension(12)))
		
		//mediaFrame.getContentPane().add(new MLPanel());
		getContentPane().add(p);
		pack();
		setVisible(true);
	}


	public static void main(String[] args) {
        
		//System.out.println("Hello World!");
		new GameTestClass();
		//System.out.println(Poop(3, 2));
		
	}

	public static int Poop(int x, int y) {
		return x + y;
	}
}
