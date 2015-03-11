import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


@SuppressWarnings("serial")
class PlayerBoard extends JPanel {
	
	public PlayerBoard() {
		setBackground(Color.RED);
		setLayout(new GridLayout(2,1));
		//this.setPreferredSize(new Dimension(500,500));
		//this.setSize(500, 500);
		
		JPanel top = new JPanel();
		top.setBackground(Color.gray);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.DARK_GRAY);
		bottom.setLayout(new GridLayout(1,2));
		
		JPanel bL = new JPanel();
		JPanel bR = new JPanel();
		bL.setBackground(Color.GREEN);
		bR.setBackground(Color.ORANGE);
		
		bL.setLayout(new GridLayout(4, 4));
		bR.setLayout(new GridLayout(4, 4));
		
		for (int x = 0; x < 16; x++) {
			JButton bb = new JButton();
			bb.setText(Integer.toString(x));
			bL.add(bb);
		}
		
		for (int x = 0; x < 16; x++) {
			JButton bb = new JButton();
			bb.setText(Integer.toString(x));
			bR.add(bb);
		}
		
		bottom.add(bL);
		bottom.add(bR);

		add(top);
		add(bottom);
	}
}

@SuppressWarnings("serial")
class GameBoard extends JPanel {
	
	public GameBoard() {
		setLayout(new GridLayout(1, 2));
		
		JPanel main = new PlayerBoard();
		main.setSize(500, 500);
		
		JPanel other = new JPanel();
		other.setLayout(new GridLayout(2,1));
		
		JPanel c1 = new PlayerBoard();
		JPanel c2 = new PlayerBoard();
		c1.setSize(250, 250);
		c2.setSize(250, 250);
		other.add(c1);
		other.add(c2);
		
		add(main);
		add(other);
	}
}

@SuppressWarnings("serial")
public class GameTestClass extends JFrame {

	JPanel p = new JPanel();	// main panel
	JPanel p3 = new JPanel();	// first child
	//JPanel p3 = new JPanel();	// another child to switch
	//JPanel p2 = new PlayerBoard();	// another child to switch
	JPanel p2 = new GameBoard();	// another child to switch
	JButton butt   = new JButton("Tiles");
	
	public GameTestClass() {
		
		p = new JPanel();
		p.setPreferredSize(new Dimension(750, 500));
		p.setLayout(new BorderLayout(10, 10));
		p.setBackground(Color.yellow);
		
		p2.setBackground(Color.BLACK);
		//p2.setPreferredSize(new Dimension(500, 500));
		
		/*
		p3.setBackground(Color.RED);
		p3.setLayout(new GridLayout(2,2));
		p3.setPreferredSize(new Dimension(700, 700));
		JPanel p11 = new JPanel();
		JPanel p12 = new JPanel();
		JPanel p13 = new JPanel();
		JPanel p14 = new JPanel();
		p11.setBackground(Color.blue);
		p12.setBackground(Color.DARK_GRAY);
		p13.setBackground(Color.green);
		p14.setBackground(Color.MAGENTA);
		p3.add(p11);
		p3.add(p12);
		p3.add(p13);
		p3.add(p14);
		*/
		
		OptionListener optionListener = new OptionListener();
        butt.addActionListener(optionListener);
        		
		setTitle("Some Frame");
        setLocation(100, 200);		// sets location of window/frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.add(p2, BorderLayout.CENTER);
        p.add(butt, BorderLayout.SOUTH);
        add(p);
        pack();
        setVisible(true);
	}

	//action listener for panel buttons //
	private class OptionListener implements ActionListener
	{   
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == butt) {
				
				if (butt.getText().equals("Tiles")) {
					butt.setText("Done");
					p.remove(p2);
					p.add(p3, BorderLayout.CENTER);
					p.revalidate();
	                p.repaint();
	                pack();
				}
				else if (butt.getText().equals("Done")) {
					butt.setText("Tiles");
					p.remove(p3);
					p.add(p2, BorderLayout.CENTER);
					p.revalidate();
					p.repaint();
					pack();
				}	
			}
		}
	}
	
	public static void main(String[] args) {	
		new GameTestClass();
	}
}