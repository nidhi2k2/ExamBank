

import java.util.Vector;


public class MakeCheExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Che Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Che\'s first name?"));
            question.setChoiceA(("Che"));
            question.setChoiceB(("Dude"));
            question.setChoiceC(("Ernesto"));
            question.setChoiceD(("George"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("Where was Che killed?"));
            question.setChoiceA(("Cuba"));
            question.setChoiceB(("USA"));
            question.setChoiceC(("Bolivia"));
            question.setChoiceD(("Argentian"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        return exam;
    }

}
