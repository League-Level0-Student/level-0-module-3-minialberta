package _16_obedient_robot;

import java.awt.Color;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
String answer1=JOptionPane.showInputDialog("What color do you want me to draw in?(Red or Blue)");
if(answer1.equals("Blue")) {
rob.setPenColor(Color.blue);
}else {rob.setPenColor(Color.red);

}
String answer=JOptionPane.showInputDialog("What do you want me to draw? (Circle, Square, Triangle)");

rob.setSpeed(100000000);
rob.penDown();	
if (answer.equals("Circle")) {
			drawCircle();
		}else if(answer.equals("Square")) {
			
			drawSquare();
		}else {
			drawTriangle();
		}
		
	}
	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
	}
}
	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
			
		}
	}
}
