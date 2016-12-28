package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2= new Robot();
r2d2.setSpeed(2100000000);
r2d2.penDown();

for (int i = 0; i < 1; i++) {
	r2d2.turn(90);
	r2d2.move(500);
	r2d2.turn(90);		
	r2d2.move(90);	
	r2d2.move(90);
	r2d2.turn(90);
	r2d2.move(500);
	r2d2.turn(1);
r2d2.turn(21000000);
	
	
	
	
	r2d2.move(180);
}












	}
}
