import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
	public static void main(String[] args) {
		//DECLARE AND INSTANTIATE QUESTIONS
		Question q1 = new Question();
		FillInQuestion q2 = new FillInQuestion("Java is a _static_ language.");
		ChoiceQuestion q3 = new ChoiceQuestion();
		AnyCorrectChoiceQuestion q4 = new AnyCorrectChoiceQuestion();
		MultiChoiceQuestion q5 = new MultiChoiceQuestion();

		//CREATE ARRAYLIST AND PUT QUESTIONS IN IT
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);

		//ADD QUESTIONS
		//*Q1
		q1.setText("What is the keyword to make a child class from a parent class?");
		q1.setAnswer("extends");
		//*Q2
		//*Q3
		q3.setText("How do you declare a String object called word?");
		q3.addChoice("new String word;", false);
      	q3.addChoice("word = new String();", false);
      	q3.addChoice("String word = new String();", false);
      	q3.addChoice("String word;", true);
      	//*Q4
      	q4.setText("Which types are primitive types?");
      	q4.addChoice("boolean", true);
      	q4.addChoice("String", false);
      	q4.addChoice("char", true);
      	q4.addChoice("Integer", false);
      	//*Q5
      	q5.setText("How can you add 1 to a variable x?");
      	q5.addChoice("x = x + 1", true);
      	q5.addChoice("x =+1", false);
      	q5.addChoice("x++", true);
      	q5.addChoice("x+1", false);


		//PRINT OUT QUESTIONS AND GET ANSWER
		Scanner scan = new Scanner(System.in);
		for (Question q : questions) {
			q.display();
      		System.out.print("Your answer: ");
      		String response = scan.nextLine();
      		System.out.println(q.checkAnswer(response));
		}

	}
}