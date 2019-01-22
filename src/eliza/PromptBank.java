package eliza;

import java.util.Scanner;
public class PromptBank {

	static String [] questions = new String [7];
	static String [] statements = new String [7];
	
	public PromptBank(){
		

	}
	
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
	
	public static void populateStatementsArray(){
		statements[0] = "ELIZA: Tell me more about FIRST and LAST.";
		statements[1] = "ELIZA: FIRST seems important to you, so does LAST. Please tell me more.";
		statements[2] = "ELIZA: FIRST and LAST seem to be on your mind. Let's talk about it.";
		statements[3] = "ELIZA: FIRST and LAST does not make sense. Please explain.";
		statements[4] = "ELIZA: I see that FIRST and LAST is on your mind today. However, I cannot predict your future.";
		statements[5] = "ELIZA: Sorry I can't provide you with information on FIRST and LAST.";
		statements[6] = "ELIZA: I see... I see. Well FIRST sounds OK and LAST sounds OK too.";

		//complete this method with your other statements using BLANK1 for word1 and BLANK2 for word2 place holder 
		
	}
	
		//questions = new String[ ]; //initialize your array to the correct length to match your number of questions you populate it with
	
	public static void populateQuestionsArray(){
		questions[0] = "ELIZA: Is there anything else about FIRST and LAST?";
		questions[1] = "ELIZA: Does FIRST bother you? How about LAST?";
		questions[2] = "ELIZA: Are FIRST and LAST things you think about often?";
		questions[3] = "ELIZA: Do you get worried about FIRST? How about LAST?";
		questions[4] = "ELIZA: Why are you so worried about FIRST? When you can only worry about LAST?";
		questions[5] = "ELIZA: Why is FIRST and LAST even important? ";
		questions[6] = "ELIZA: Does FIRST make you happy? Does LAST make you sad?";
		
		//complete this method with your other questions using BLANK1 for word1 and BLANK2 for word2 place holder 
		
	}
	
		//populateStatementsArray();
	
	public static String getRandomStatementTrunk(String blank1, String blank2){
		String withoutPunctuation = blank2.substring(0, blank2.length() - 1);
		
		populateStatementsArray();
		
		String newSentence = " ";
		
		int position = (int) (Math.random() * 7);
		
		String sentence = statements[position];
		newSentence = sentence.replace("FIRST" , blank1);
		newSentence = newSentence.replace("LAST" , withoutPunctuation);
		
		return newSentence;
		
		//fill in the method so it randomly selects the statement template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}

		//populateQuestionsArray();
	
	public static String getRandomQuestionTrunk(String blank1, String blank2){
		String withoutPunctuation = blank2.substring(0, blank2.length() - 1);
		
		populateQuestionsArray();
		
		String newSentence = " ";
		
		int position = (int) (Math.random() * 7);
		
		String sentence = questions[position];
		newSentence = sentence.replace("FIRST" , blank1);
		newSentence = newSentence.replace("LAST" , withoutPunctuation);
		
		return newSentence;
		//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
	
	
}