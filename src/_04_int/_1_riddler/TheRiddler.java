package _04_int._1_riddler;


import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question = JOptionPane.showInputDialog("So Frank a very famous celebrity was out to dinner with his friend Bob, not famous, "
				+ "and they were outside this very famous restaurant waiting to put their name in when the hostess spots Frank and motions "
				+ "for he and Bob to come up to the front. Within minutes, the two are seated and a waiter comes by to take their drink orders. "
				+ "Frank orders a coke and Bob a Black and Tan. The waiter returns a little later with their drinks and then takes "
				+ "their food orders: Frank orders the house special of the night, roasted peacock; and Bob orders a deluxe burger."
				+ " In another twenty minutes, the food arrives. After taking one bite of his roasted peacock, Frank runs outside and "
				+ "shoots himself. Why?");
		
		if(question.equals("Four weeks prior to this evening out, Frank, Bob, Frank’s brother, and lots of Franks fans"
				+ " were on a small cruise ship together. The ship sank in the midst of a storm and the only survivors to make it to a n"
				+ "earby island were Frank, Bob, Frank’s brother, and Frank’s number one fan. As the hours flew by, everyone’s hunger grew, and "
				+ "as a gesture towards his idol, Frank’s number one fan said he’d take Bob and Frank’s brother with him to go find food for them"
				+ " all. The three boys are gone for hours and hours when finally just Frank’s number one fan and Bob emerge from the trees. They"
				+ " say the bad news is that they lost Frank’s brother ans spent forever looking for him, but the good thing is that the"
				+ "y found food, and they presented Frank with peacock which they hunted and killed.\n"
				+ "\n"
				+ "Frank so enjoyed the peacock that he decided to order it four weeks later at this great restaurant, b"
				+ "ut at the restaurant it tasted so different from what he had had before that it made him realize it wasn’t peacock "
				+ "that he had eaten on the island, but rather it was his brother.")) {
			
			JOptionPane.showMessageDialog(null,"Correct");
			score += 1;
			}
		else {
			JOptionPane.showMessageDialog(null, "Incorect,Wrong Get better :(:(:(::(:(:(:(:(:(:(:(:((:(((((((((((((("
					+ ":(::(:(:(:(::(:(:(::(:(:*(:(:(:(:(::(:(:((:(. The answer was "
					+ ""
					+ ""
					+ "Four weeks prior to this evening out, Frank, Bob, Frank’s brother, and lots of Franks fans\"\n"
					+ "				+ \" were on a small cruise ship together. The ship sank in the midst of a storm and the only survivors to make "
					+ "it to a n\"\n"
					+ "				+ \"earby island were Frank, Bob, Frank’s brother, and Frank’s number one fan. As the hours flew by, everyone’s "
					+ "hunger grew, and \"\n"
					+ "				+ \"as a gesture towards his idol, Frank’s number one fan said he’d take Bob and Frank’s brother with him to"
					+ "go find food for them\"\n"
					+ "				+ \" all. The three boys are gone for hours and hours when finally just Frank’s number one fan and Bob emerge from the trees. They\"\n"
					+ "				+ \" say the bad news is that they lost Frank’s brother ans spent forever looking for him, but the good thing is that the\"\n"
					+ "				+ \"y found food, and they presented Frank with peacock which they hunted and killed.\\n\"\n"
					+ "				+ \"\\n\"\n"
					+ "				+ \"Frank so enjoyed the peacock that he decided to order it four weeks later at this great restaurant, b\"\n"
					+ "				+ \"ut at the restaurant it tasted so different from what he had had before that it made him realize it wasn’t peacock \"\n"
					+ "				+ \"that he had eaten on the island, but rather it was his brother.");
		}
		
		
		String question1 = JOptionPane.showInputDialog("A group of campers have been on vacation so long, that they've forgotten the day of the week."
				+ " The following conversation ensues. Darryl: What's the day? I dont think it is Thursday, Friday or Saturday."
				+ " Tracy: Well that doesn't narrow it down much. Yesterday was Sunday. Melissa: Yesterday wasn't Sunday, tomorrow is Sunday. "
				+ "Ben: The day after tomorrow is Saturday. Adrienne: The day before yesterday was Thursday. Susie: Tomorrow is Saturday."
				+ " David: I know that the day after tomorrow is not Friday. If only one person's statement is true, what day of the week is it?");
		
		if(question1.equals("It is Wednesday. If it was any other day of the week, more than one statement would be true. "
				+ "To solve the riddle, evaluate each person's statement and write down what day it could be according to the statement. "
				+ "David's statement indicates it could be any day of the week except for Wednesday. When you list the days that it could be "
				+ "according to everyone's statement, it turns out Wednesday is the day mentioned only one time. Darryl: Sunday, Monday, Tuesday, "
				+ "or Wednesday Tracy: Monday Melissa: Saturday Ben: Thursday Adrienne: Saturday Susie: Friday David: Sunday, Monday, Tuesday,"
				+ " Thursday, Friday or Saturday")) 
		{
			
			JOptionPane.showMessageDialog(null,"Correct");
			score += 1;
			}
		else {
			JOptionPane.showMessageDialog(null, "Incorect,Wrong Get better :(:(:(::(:(:(:(:(:(:(:(:((:(((((((((((((("
					+ ":(::(:(:(:(::(:(:(::(:(:*(:(:(:(:(::(:(:((:(. The answer was "
					+ ""
					+ "It is Wednesday. If it was any other day of the week, more than one statement would be true. \"\n"
					+ "				+ \"To solve the riddle, evaluate each person's statement and write down what day it could be according to the statement. \"\n"
					+ "				+ \"David's statement indicates it could be any day of the week except for Wednesday. When you list the days that it could be \"\n"
					+ "				+ \"according to everyone's statement, it turns out Wednesday is the day mentioned only one time. Darryl: Sunday, Monday, Tuesday, \"\n"
					+ "				+ \"or Wednesday Tracy: Monday Melissa: Saturday Ben: Thursday Adrienne: Saturday Susie: Friday David: Sunday, Monday, Tuesday,\"\n"
					+ "				+ \" Thursday, Friday or Saturday");

		}
		String question2 = JOptionPane.showInputDialog("If you drop me, I’m sure to crack, but smile at me and I’ll smile back. What am I??");
		
		if(question2.equals("A mirror")) 
		{
			
			JOptionPane.showMessageDialog(null,"Correct");
			score += 1;
			}
		else {
			JOptionPane.showMessageDialog(null, "Incorect,Wrong Get better :(:(:(::(:(:(:(:(:(:(:(:((:(((((((((((((("
					+ ":(::(:(:(:(::(:(:(::(:(:*(:(:(:(:(::(:(:((:(. The answer was "
					+ ""
					+ "A mirror");

		
		}
		
		JOptionPane.showMessageDialog(null, " 0 ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

