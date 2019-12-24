package com.appoolooft.searchinrecycler;

public class ModelRecycler {

    String title ;
    String answer ;

    public ModelRecycler() {
    }

    public ModelRecycler(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
