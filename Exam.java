

import java.util.Vector;

import javax.swing.JOptionPane;

public class Exam {
 
	public static void main(String[] args) throws Exception {

		Vector<Exam> exams = new Vector<Exam>();
		exams.add(MakeFishExam.justDoIt());
		// exams.add(MakeCameronExam.justDoIt());
		/* Add more exams here using the two lines above as a template. */

		while (true) {

			String prompt = "Which exam would you like to take? (q to quit) ";

			int i = 1;
			for (Exam exam : exams) {
				prompt = prompt + "\n" + i++ + " ) " + exam.name;
			}

			String examNumber = JOptionPane.showInputDialog(null, prompt);
			if (examNumber.equalsIgnoreCase("Q")) {break;}

			Exam exam = exams.get(Integer.parseInt(examNumber) - 1);

			int nextQuestionNumber = 0;
			Vector<String> answers = new Vector<String>();
			while (exam.getNumberOfQuestions() > nextQuestionNumber) {

				Question question = exam.getQuestion(nextQuestionNumber);
				nextQuestionNumber++;
				String displayQuestion = question.getQuery() 
						+ "\n a) " + question.getChoiceA() 
						+ "\n b) "+ question.getChoiceB() 
						+ "\n c) " + question.getChoiceC() 
						+ "\n d) " + question.getChoiceD();
				answers.add(JOptionPane.showInputDialog(null, displayQuestion));

			}
			String displayResult = "" + exam.getNumberCorrect(answers) + " out of " + exam.getNumberOfQuestions();
			JOptionPane.showMessageDialog(null, displayResult);
		}
		JOptionPane.showMessageDialog(null, "Goodbye.");
	}

	public Exam(String name, java.util.Vector<Question> questions) {
		this.name = name;
		this.setQuestions(questions);
	}

	public String name;

	java.util.Vector<Question> questions = new java.util.Vector<Question>();

	public java.util.Vector<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(java.util.Vector<Question> questions) {
		this.questions = questions;
	}

	public int getNumberOfQuestions() {
		return questions.size();
	}

	public int getNumberCorrect(java.util.Vector<String> answers) {
		int numberCorrect = 0;

		for (int i = 0; i < answers.size(); i++) {
			Question q = (Question) this.questions.get(i);
			if (((String) answers.get(i)).equalsIgnoreCase(q.getAnswer())) {
				numberCorrect++;
			}
		}
		return numberCorrect;
	}

	public int getCorrect() {
		return 0;
	}

	public Question getQuestion(int index) {
		return (Question) questions.elementAt(index);
	}

}

class Question {
	private String id;
	private String query;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;
	private String discussion;
	private String image;
	private String reference;


	public String getDiscussion() {
		return discussion;
	}


	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}

	public String getCorrect() {
		return answer;
	}

	public boolean isCorrect(String choice) {
		return choice.equals(answer);
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getChoiceA() {
		return choiceA;
	}


	public void setChoiceA(String choiceA) {
		this.choiceA = choiceA;
	}


	public String getChoiceB() {
		return choiceB;
	}


	public void setChoiceB(String choiceB) {
		this.choiceB = choiceB;
	}


	public String getChoiceC() {
		return choiceC;
	}


	public void setChoiceC(String choiceC) {
		this.choiceC = choiceC;
	}


	public String getChoiceD() {
		return choiceD;
	}


	public void setChoiceD(String choiceD) {
		this.choiceD = choiceD;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}
