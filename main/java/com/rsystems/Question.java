package com.rsystems;

import java.util.Arrays;

public class Question {

    private int questId;
    private String question;
    private String options[];
    private String answer;

    public Question(int questId, String question, String[] options, String answer) {
        this.questId = questId;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questId=" + questId +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", answer='" + answer + '\'' +
                '}';
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
