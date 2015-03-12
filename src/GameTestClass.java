import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;


@SuppressWarnings("serial")
class PlayerBoard extends JPanel {
	
	public PlayerBoard() {
		setBackground(Color.RED);
		setLayout(new GridLayout(2,1));
		//this.setPreferredSize(new Dimension(250,250));
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
		//setLayout(new GridLayout(1, 2));
		
		JPanel main = new PlayerBoard();
		main.setPreferredSize(new Dimension(500, 500));
		
		JPanel others = new JPanel();
		others.setLayout(new GridLayout(2,1));
		
		JPanel c1 = new PlayerBoard();
		JPanel c2 = new PlayerBoard();
		c1.setPreferredSize(new Dimension(250, 250));
		c2.setPreferredSize(new Dimension(250, 250));
		others.add(c1);
		others.add(c2);
		
		add(main);
		add(others);
	}
}

@SuppressWarnings("serial")
public class GameTestClass extends JFrame {

	JPanel p = new JPanel();	// main panel
	JPanel p2 = new GameBoard();// another child to switch
	JPanel p3 = new JPanel();	// child
	JButton butt   = new JButton("Tiles");
	
	public GameTestClass() {
		
		p.setPreferredSize(new Dimension(750, 560));
		//p.setLayout(new BorderLayout(10, 10));
		p.setBackground(Color.yellow);

		p3.setBackground(Color.RED);
		p3.setPreferredSize(new Dimension(750, 500));
		p3.setLayout(new GridLayout(2,2));
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
		
		OptionListener optionListener = new OptionListener();
        butt.addActionListener(optionListener);
        		
		setTitle("Some Frame");
        setLocation(100, 200);		// sets location of the program window/frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.add(p2, BorderLayout.CENTER);
        p.add(p3, BorderLayout.CENTER);
        p2.setVisible(true);
        p3.setVisible(false);
        p.add(butt, BorderLayout.SOUTH);
        add(p);
        pack();
        setVisible(true);
	}

	//action listener for panel buttons //
	private class OptionListener implements ActionListener
	{   
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == butt) {
				
				if (butt.getText().equals("Tiles")) {
					butt.setText("Done");
					//p.remove(p2);
					//p.add(p3, BorderLayout.CENTER);
					p2.setVisible(false);
					p3.setVisible(true);
					p.revalidate();
	                p.repaint();
	                pack();
				}
				else if (butt.getText().equals("Done")) {
					butt.setText("Tiles");
					//p.remove(p3);
					//p.add(p2, BorderLayout.CENTER);
					p2.setVisible(true);
					p3.setVisible(false);
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