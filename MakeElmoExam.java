

import java.util.Vector;


public class MakeCheExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Elmo Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Elmo\'s first name?"));
            question.setChoiceA(("Elmo"));
            question.setChoiceB(("Dude"));
            question.setChoiceC(("Ernesto"));
            question.setChoiceD(("George"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("Where was Elmo born?"));
            question.setChoiceA(("Cuba"));
            question.setChoiceB(("USA"));
            question.setChoiceC(("Bolivia"));
            question.setChoiceD(("Argentian"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        return exam;
    }

}
