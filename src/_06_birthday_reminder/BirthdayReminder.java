
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String guess=JOptionPane.showInputDialog("Who's birthday do you want to be reminded of?");
		// 3. Print out what the user typed
	if (guess.equals("Mom's birthday")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}else if (guess.equals("Dad's birthday")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}else if (guess.equals("Your birthday!")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
