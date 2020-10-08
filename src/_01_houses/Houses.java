package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	public void run() {
		
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(500);
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(3);
		
		pointmedium(rob);
		large(rob);
		pointsmall(rob);
		small(rob);
		pointmedium(rob);
		medium(rob);
		pointsmall(rob);
		pointlarge(rob);
		
	}
	
	public void small(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(60);
		x.turn(90);
		x.move(35);
		x.turn(90);
		x.move(60);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	public void medium(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(120);
		x.turn(90);
		x.move(35);
		x.turn(90);
		x.move(120);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	public void large(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(250);
		x.turn(90);
		x.move(35);
		x.turn(90);
		x.move(250);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	public void pointsmall(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(60);
		x.turn(45);
		x.move(25);
		x.turn(90);
		x.move(25);
		x.turn(45);
		x.move(60);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	public void pointmedium(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(120);
		x.turn(45);
		x.move(25);
		x.turn(90);
		x.move(25);
		x.turn(45);
		x.move(120);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	public void pointlarge(Robot x) {
		
		Random rand = new Random();
		x.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		x.move(250);
		x.turn(45);
		x.move(25);
		x.turn(90);
		x.move(25);
		x.turn(45);
		x.move(250);
		x.turn(-90);
		x.setPenColor(Color.green);
		x.move(20);
		x.turn(-90);
		
	}
	
}
