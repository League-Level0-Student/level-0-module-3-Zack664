
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		
//2. Make the robot draw a shape (this will take more than one line of code)	
	
	
		
		
		
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String WC = JOptionPane.showInputDialog("What color would you like rob to draw in?");
		//5. Use an if/else statement to set the pen color that the user requested

		if (WC.equalsIgnoreCase ("pink")) {
			rob.setPenColor(Color.pink);
			rob.setSpeed(100);
			rob.penDown();
			
			int count1=1;
			while (count1 < 5) {
				
				rob.move(100);
				rob.turn(-90);
				count1 += 1;
		
			
			
		
		}
			if (WC.equalsIgnoreCase ("blue")) {
				rob.setPenColor(Color.blue);
				rob.setSpeed(100);
				rob.penDown();
				
				int count2=1;
				while (count1 < 5) {
					
					rob.move(100);
					rob.turn(-90);
					count1 += 1;
			
				
				
			
			}if (WC.equalsIgnoreCase ("green")) {
				rob.setPenColor(Color.green);
				rob.setSpeed(100);
				rob.penDown();
				
				int count3=1;
				while (count1 < 5) {
					
					rob.move(100);
					rob.turn(-90);
					count1 += 1;
			
				
				
			
			}if (WC.equalsIgnoreCase ("orange")) {
				rob.setPenColor(Color.orange);
				rob.setSpeed(100);
				rob.penDown();
				
				int count4=1;
				while (count1 < 5) {
					
					rob.move(100);
					rob.turn(-90);
					count1 += 1;
			
				
				
			
			}
				
        //6. If the user doesn't enter anything, choose a random color

			}if (WC.equalsIgnoreCase ("    ")) {
				rob.setPenColor(Color.orange);
				rob.setSpeed(100);
				rob.penDown();
				
				int count4=1;
				while (count1 < 5) {
					
					rob.move(100);
					rob.turn(-90);
					count1 += 1;
				}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		
			}
			}
			}
		}
	}
}
		
	

