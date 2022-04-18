import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {

	protected ArrayList<String> answers;
	private int count;

	public AnyCorrectChoiceQuestion() {
		super();
		answers = new ArrayList<String>();
		count = 0;
	}

	public void addChoice(String choice, boolean correct) {
      super.addChoice(choice, correct);
      count++;
      if (correct) {
      	int n = count;
      	String a = Integer.toString(n);
      	answers.add(a);
      }
    }

    public boolean checkAnswer(String response) {
    	boolean correct = false;
    	for (int i = 0; i < answers.size(); i++) {
    		if (response.equals(answers.get(i))) {
    			correct = true;
    		}
    	}
    	return(correct);
    }

    public void display() {
      super.display();
      System.out.println("Provide any one of the correct choices.");
    }
}