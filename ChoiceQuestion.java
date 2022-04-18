import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   protected ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         int n = choices.size();
         String a = Integer.toString(n);
         setAnswer(a);
         // Convert choices.size() to string
      }
   }
   
   public void display()
   {
      // Display the question text
      System.out.println(this.getText());
      // Display the answer choices
      for(int i = 0; i < choices.size(); i++) {
         System.out.println((i + 1) + ": " + choices.get(i));
      }
   }
}

