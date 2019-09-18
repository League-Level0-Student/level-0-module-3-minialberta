package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String yes="Yes";
	String no="No";

String holacomoestas=JOptionPane.showInputDialog("Are you happy?");
if (holacomoestas.equals(yes)) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
}else if (holacomoestas.equals(no)) {
	String answer2=JOptionPane.showInputDialog("Do you want to be happy?");

	if (answer2.equals(yes)) {
		JOptionPane.showMessageDialog(null, "Change something!");
	}else if (answer2.equals(no));
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
}
}
}
