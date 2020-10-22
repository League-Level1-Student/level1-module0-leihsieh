package _08_jack_in_the_box;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {

	int buttonPresses = 0;
	String firstImage = "src/_08_jack_in_the_box/jackInTheBox.png";
	
	JPanel panel = new JPanel();
	JButton button = new JButton("Click me!");
	JFrame frame = new JFrame();
	
	public void run(){
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		//showPicture("jackInTheBox.png");
		
	}
	
	public void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		buttonPresses++;
		if(buttonPresses == 5) {
			showPicture("jackInTheBox.png");
		}
	}
}