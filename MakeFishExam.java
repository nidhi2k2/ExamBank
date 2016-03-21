


import java.util.Vector;

public class MakeFishExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Fish Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What do you call a fish without an eye?"));
            question.setChoiceA(("Blinky"));
            question.setChoiceB(("One eyed fish"));
            question.setChoiceC(("fsh"));
            question.setChoiceD(("Fishy fishy fishy"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        {
            Question question = new Question();
            question.setQuery(("How do you stop bad fish from smelling??"));
            question.setChoiceA(("Fabreeze"));
            question.setChoiceB(("Flash freeze"));
            question.setChoiceC(("Refrigerate"));
            question.setChoiceD(("Cut off their noses"));
            question.setAnswer(("d"));
            questions.addElement(question);
        }
        return exam;
    }

}
