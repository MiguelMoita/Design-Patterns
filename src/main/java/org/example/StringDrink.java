package org.example;

public class StringDrink {
    private String text;

    public StringDrink(){
        this.text = "";
    }

    public StringDrink(String text){
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}