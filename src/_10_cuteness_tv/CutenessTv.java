package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftbutton = new JButton();
	JButton middlebutton = new JButton();
	JButton rightbutton = new JButton();
	
	public void run() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(leftbutton);
		panel.add(middlebutton);
		panel.add(rightbutton);
		leftbutton.setText("Ducks");
		middlebutton.setText("Frog");
		rightbutton.setText("Fluffy Unicorns");
		frame.pack();
		leftbutton.addActionListener(this);
		middlebutton.addActionListener(this);
		rightbutton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == leftbutton) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		if(buttonPressed == middlebutton) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		if(buttonPressed == rightbutton) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
}
