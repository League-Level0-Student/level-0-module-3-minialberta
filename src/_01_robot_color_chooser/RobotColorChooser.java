//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Bobby=new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10; i++) {
		String quantity=JOptionPane.showInputDialog("What color would you like the robot to draw in? red or blue?");

		//5. Use an if/else statement to set the pen color that the user requested
if(quantity.equals("red")) {
	Bobby.setPenColor(Color.red);
}else if(quantity.equals("blue")) {
	Bobby.setPenColor(Color.blue);

}
        //6. If the user doesn’t enter anything, choose a random color
if(quantity.contentEquals("")) {
	Bobby.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

			
		
		//4. Set the pen width to 10
		Bobby.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Bobby.penDown();
		Bobby.setSpeed(10000000);
Bobby.move(200);
Bobby.turn(120);
Bobby.move(200);
Bobby.turn(120);
Bobby.move(200);
Bobby.turn(120);

	}
	}
}
