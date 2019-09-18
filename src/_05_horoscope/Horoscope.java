package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("What is your star sign?");
	
	if (answer.equals("Ram")) {
		JOptionPane.showMessageDialog(null, "You're an Aries!");
		
	}else
	if (answer.equals("Bull")) {
		JOptionPane.showMessageDialog(null, "You're a Taurus!");
	}else
	if (answer.equals("Twins")) {
		JOptionPane.showMessageDialog(null, "You're a Gemini!");
	}else
	if (answer.equals("Crab")) {
		JOptionPane.showMessageDialog(null, "You're a Cancer!");
	}else
	if (answer.equals("Lion")) {
		JOptionPane.showMessageDialog(null, "You're a Leo!");
	}else
	if (answer.equals("Maiden")) {
		JOptionPane.showMessageDialog(null, "You're a Virgo!");
	}else
	if (answer.equals("Scales")) {
		JOptionPane.showMessageDialog(null, "You're a Libra!");
	}else
	if (answer.equals("Scorpion")) {
		JOptionPane.showMessageDialog(null, "You're a Scorpion!");
	}else
	if (answer.equals("Centaur")) {
		JOptionPane.showMessageDialog(null, "You're a Saggitarius!");
	}else
	if (answer.equals("Mountain Goat")) {
		JOptionPane.showMessageDialog(null, "You're a Capricorn!");
	}else
	if (answer.equals("Man who carries water")) {
		JOptionPane.showMessageDialog(null, "You're an Aquarius!");
	}else
	if (answer.equals("Fish")) {
		JOptionPane.showMessageDialog(null, "Pisces");
	}
	
	
}
}
