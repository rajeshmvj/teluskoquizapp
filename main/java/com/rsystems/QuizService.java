package com.rsystems;

import java.io.InputStream;
import java.util.Scanner;

public class QuizService {
    Question questions[] = new Question[5];

    public QuizService() {
        String options1[] = {"2", "4", "8", "6"};
        questions[0] = new Question(1, "Size of int", options1, "3");

        String options2[] = {"2", "4", "8", "6"};
        questions[1] = new Question(2, "Size of char", options2, "2");

        String options3[] = {"2", "4", "8", "6"};
        questions[2] = new Question(3, "Size of float", options3, "1");

        String options4[] = {"2", "4", "8", "6"};
        questions[3] = new Question(4, "Size of double", options4, "3");

        String options5[] = {"2", "4", "8", "6"};
        questions[4] = new Question(5, "Size of long", options5, "0");
    }

    public void playQuiz() {

        int score=0;
        for (Question question:questions) {
            System.out.println("**** Welcome to the Quiz App ****");
            System.out.println("Answer the question no: "+question.getQuestId()+ ": "+ question.getQuestion());
            System.out.println("Options are: ");
            for (String option:question.getOptions()){
                System.out.print(option+", ");
            }
            System.out.println("");
            Scanner scan = new Scanner(System.in);
            String answerFromUser=scan.next();
            if (answerFromUser.equals(question.getAnswer())) {
                score=score+2;
            }
            else {
                score=score-1;
            }
        }
        System.out.println("The score you got is "+score);
    }

}
