package com.example.wordelle;

public class WordleWords {
    private String word;
    private String charOne;
    private String charTwo;
    private String charThree;
    private String charFour;
    private String charFive;

    public WordleWords (){
        word = "words";
        charOne = word.substring(0,1);
        charTwo = word.substring(1,2);
        charThree = word.substring(2,3);
        charFour = word.substring(3,4);
        charFive = word.substring(4);
    }
    public WordleWords (String w){
        word = w;
        charOne = word.substring(0,1);
        charTwo = word.substring(1,2);
        charThree = word.substring(2,3);
        charFour = word.substring(3,4);
        charFive = word.substring(4);
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getCharOne() {
        return charOne;
    }
    public void setCharOne(String charOne) {
        this.charOne = charOne;
    }
    public String getCharTwo() {
        return charTwo;
    }
    public void setCharTwo(String charTwo) {
        this.charTwo = charTwo;
    }
    public String getCharThree() {
        return charThree;
    }
    public void setCharThree(String charThree) {
        this.charThree = charThree;
    }
    public String getCharFour() {
        return charFour;
    }
    public void setCharFour(String charFour) {
        this.charFour = charFour;
    }
    public String getCharFive() {
        return charFive;
    }
    public void setCharFive(String charFive) {
        this.charFive = charFive;
    }

    @Override
    public String toString() {
        return "WordleWord{" +
                "word='" + word + '\'' +
                " " + charOne +
                " " + charTwo +
                " " + charThree +
                " " + charFour +
                " " + charFive +
                '}';
    }
}
