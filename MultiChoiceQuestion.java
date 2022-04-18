public class MultiChoiceQuestion extends AnyCorrectChoiceQuestion {

	public MultiChoiceQuestion() {
		super();
	}

	public boolean checkAnswer(String response) {
		boolean correct = false;
		int guesses = 0;
		int count = 0;
		for(int i = 0; i < response.length(); i++) {
			if (response.substring(i, i + 1).equals(" ")) {
				continue;
			}
			else {
				guesses++;
				for(int j = 0; j < answers.size(); j++) {
					if ((response.substring(i, i + 1).equals(answers.get(j)))) {
						count++;
					}
				}
			}
		}
		if (count == guesses) {
			correct = true;
		}
		return(correct);
	}

	public void display() {
		System.out.println(this.getText());
		// Display the answer choices
		for(int i = 0; i < choices.size(); i++) {
			System.out.println((i + 1) + ": " + choices.get(i));
		}
		System.out.println("Enter all correct choices separated by spaces.");
    }


}