package com.mcnz.exam;

import java.util.Vector;

public class MakeCameronExam {
	
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Cameron Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Cameron's favorite wild animal?"));
            question.setChoiceA(("Fox"));
            question.setChoiceB(("Turtle"));
            question.setChoiceC(("Turkey"));
            question.setChoiceD(("Salmon"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What is Cameron's POF handle?"));
            question.setChoiceA(("WackyOne"));
            question.setChoiceB(("DylanWhenChillin"));
            question.setChoiceC(("Potemcam"));
            question.setChoiceD(("Cameron"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        return exam;
    }

}
