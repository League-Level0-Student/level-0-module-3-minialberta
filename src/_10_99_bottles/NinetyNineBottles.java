package _10_99_bottles;

import javax.swing.JOptionPane;

public class NinetyNineBottles {
public static void main(String[] args) {
	String num="99";
	int x=Integer.parseInt(num);
	int y=x-1;
	for (int i = 0; i < 99; i++) {
		
	JOptionPane.showMessageDialog(null, x+" bottles of beer on the wall, "+x+" bottles of beer on the wall. Take one down, pass it around, "+y+" bottles of beer on the wall.");
		x=x-1;
		y=y-1;
	}
}
}
