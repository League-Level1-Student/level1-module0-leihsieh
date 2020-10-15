package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public void showButton() {
				
		JFrame j = new JFrame();
		j.setVisible(true);
		JButton jb = new JButton();
		j.add(jb);
		j.pack();
		jb.addActionListener(this);
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "Tomorrow will be your lucky day");
		}
		else if(rand==1) {
			JOptionPane.showMessageDialog(null, "Tomorrow will be moderately lucky");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null, "Tomorrow will be kind of lucky");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will not be lucky tomorrow");
		}
		else if(rand==4) {
			JOptionPane.showMessageDialog(null, "You will win the lottery tomorrow");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "woohoo");
		
	}
	
}
