package eliza;

import java.util.Scanner;

public class Logic {
	

	public static void main(String [] args) {

		Scanner kb = new Scanner(System.in);

		// ask for name
		System.out.print("ELIZA: ");
		System.out.println("Hello, my name is Eliza. What is your name? ");
		
		System.out.print(">> ");
		String username = kb.nextLine(); 


		
		// enters questions loop
		Boolean askAgain = true;
		while (askAgain) {
			// welcome with name
			System.out.print("ELIZA: ");
			System.out.println("Hello, "+ username + ". Glad to meet you. Let's talk about what is on your mind today.");
			System.out.print(">> ");
			String answer = kb.nextLine(); 
			
			// take first, last word, and punctuation mark and put them in variables
			String[] words = answer.split(" ");
			String blank1 = words[0];
			String blank2 = words[ words.length - 1 ];
			String punctuation = answer.substring(answer.length()-1);
			
			
			conversation(blank1, blank2, punctuation);
			
			// ask if it wants to run again
			System.out.print("ELIZA: ");
			System.out.println("Do you want to run this session again? I hope so.");
			System.out.println("-------------------- Yes or No? --------------------");
			System.out.print(">> ");
			String runAgain = kb.nextLine(); 
			
			if (runAgain.equals("no")) {
				askAgain = false;
			}
			
			else if (runAgain.equals("NO")) {
				askAgain = false;
			}
			else if (runAgain.equals("No")) {
				askAgain = false;
			}
			else {}
			
		}
		System.out.print("ELIZA: ");
		System.out.println("Goodbye, goodbye, buh-bye! Until next time. ");
	
	}
	
	public static void conversation(String blank1 , String blank2, String punctuation) {
		Boolean convo = true;
		
		while (convo) {
			
			// call method with appropriate response
			if( punctuation.equals(".") ) {
				System.out.println(PromptBank.getRandomStatementTrunk(blank1, blank2));
			}
			else if( punctuation.equals("?") ) {
				System.out.println(PromptBank.getRandomQuestionTrunk(blank1, blank2));
			}
			else if( punctuation.equals("!") ) {
				System.out.print("ELIZA: ");
				System.out.println("WHOA! Why are you yelling?! I am right here. " + blank1 + " and " + blank2.substring(0, blank2.length() - 1) + " sounds interesting. Let's talk about it....calmly.");
			}
			else {
				System.out.print("ELIZA: ");
				System.out.println("I do not understand statements wihout a punctuation mark. Please tell me again. ");
			}

			// get sentence
			Scanner questions = new Scanner(System.in);
			System.out.print(">> ");
			String secondAnswer = questions.nextLine(); 
		
			// take first and last word put them in variables
			String[] words = secondAnswer.split(" ");
			blank1 = words[0];
			blank2 = words[ words.length - 1 ];
			punctuation = secondAnswer.substring(secondAnswer.length()-1);
			
			// exit convo
			if ( secondAnswer.equals("exit") || secondAnswer.equals("bye") || secondAnswer.equals("EXIT") || secondAnswer.equals("Bye") ) {
				convo = false;
			}
			
		}
				
	}
	
	
}