import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: ß  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {

    	// 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("What color would you like the robot to use? (yellow, blue, or green)");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

Robot wrenBot = new Robot();
wrenBot.setSpeed(5);
wrenBot.penDown();
wrenBot.setPenWidth(10);

if(color.equals("yellow")){
	wrenBot.setPenColor(600, 0, 0);
}
if(color.equals("blue")){
	wrenBot.setPenColor(0, 0, 600);
}
if(color.equals("green")){
	wrenBot.setPenColor(150, 0, 0);
}

for(int i = 0; i < 4; i++){
wrenBot.move(100);
wrenBot.turn(90);
}
    }

}






