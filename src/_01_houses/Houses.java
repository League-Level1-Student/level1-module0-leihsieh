package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	public void run() {
		
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(500);
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(3);
		large(rob);
		
	}
	
	public void large(Robot x) {
		for(int i = 0; i < 10; i++) {
			
			x.move(100);
			x.turn(90);
			x.move(20);
			x.turn(90);
			x.move(100);
			x.turn(-90);
			x.setPenColor(Color.green);
			x.move(20);
			x.turn(-90);
		}
	}
	
}
