package com.example.wordelle;

import javafx.css.Style;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {
    public Text gOlO;
    public Text gOlTw;
    public Text gOlTh;
    public Text gOlFo;
    public Text gOlFi;
    public Text gTwlO;
    public Text gTwlTw;
    public Text gTwlTh;
    public Text gTwlFo;
    public Text gTwlFi;
    public Text gThlO;
    public Text gThlTw;
    public Text gThlTh;
    public Text gThlFo;
    public Text gThlFi;
    public Text gFolO;
    public Text gFolTw;
    public Text gFolTh;
    public Text gFolFo;
    public Text gFolFi;
    public Text gFilO;
    public Text gFilTw;
    public Text gFilTh;
    public Text gFilFo;
    public Text gFilFi;
    public Text gSlO;
    public Text gSlTw;
    public Text gSlTh;
    public Text gSlFo;
    public Text gSlFi;
    public Button submitGuessButton;
    public TextField textGuessOne;
    public TextField textGuessTwo;
    public TextField textGuessThree;
    public TextField textGuessFour;
    public TextField textGuessFive;
    @FXML
    private Label welcomeText;

    public int counter = 1;
    public WordleWords w = new WordleWords();
    ArrayList<WordleWords> guessList = new ArrayList<>();
    @FXML
    void initialize() throws FileNotFoundException {
        ArrayList<WordleWords> wordList = new ArrayList<>();
        FileInputStream fis = new FileInputStream("input/wordsOnly.csv");
        FileInputStream fist = new FileInputStream("input/words.csv");
        Scanner scnr = new Scanner(fis);
        Scanner scnrt = new Scanner(fist);

        int count = 0;

        while (scnr.hasNextLine()){
            WordleWords word = new WordleWords(scnr.next().toUpperCase());
            System.out.print(word.getCharOne()+" ");
            System.out.print(word.getCharTwo()+" ");
            System.out.print(word.getCharThree()+" ");
            System.out.print(word.getCharFour()+" ");
            System.out.println(word.getCharFive());
            wordList.add(word);
            count++;
        }

        double r = Math.random();
        r *= count;
        w = wordList.get((int) r);
        System.out.println(w);
        while (scnrt.hasNextLine()){
            WordleWords word = new WordleWords(scnrt.next().toUpperCase());
            System.out.print(word.getCharOne()+" ");
            System.out.print(word.getCharTwo()+" ");
            System.out.print(word.getCharThree()+" ");
            System.out.print(word.getCharFour()+" ");
            System.out.println(word.getCharFive());
            guessList.add(word);
            count++;
        }
        System.out.println(w);
    }
    @FXML
    protected void onHelloButtonClick() throws FileNotFoundException {

        String first = textGuessOne.getText().toUpperCase();
        String second = textGuessTwo.getText().toUpperCase();
        String third = textGuessThree.getText().toUpperCase();
        String fourth = textGuessFour.getText().toUpperCase();
        String fifth = textGuessFive.getText().toUpperCase();

        WordleWords guess = new WordleWords(first+second+third+fourth+fifth);
        int k=0;
        for (int i = 0; i<guessList.size(); i++){
            if (guessList.get(i).getWord().equals(guess.getWord())){
               k=1;
            }
        }
        if (k==1){
            if(counter==1){
                gOlO.setText(first);
                if (first.equals(w.getCharOne())){
                    gOlO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gOlO.setFill(Color.ORANGE);
                }
                else{
                    gOlO.setFill(Color.DIMGRAY);
                }

                gOlTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gOlTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gOlTw.setFill(Color.ORANGE);
                }
                else{
                    gOlTw.setFill(Color.DIMGRAY);
                }

                gOlTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gOlTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gOlTh.setFill(Color.ORANGE);
                }
                else{
                    gOlTh.setFill(Color.DIMGRAY);
                }

                gOlFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gOlFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gOlFo.setFill(Color.ORANGE);
                }
                else{
                    gOlFo.setFill(Color.DIMGRAY);
                }

                gOlFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gOlFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gOlFi.setFill(Color.ORANGE);
                }
                else{
                    gOlFi.setFill(Color.DIMGRAY);
                }

                welcomeText.setText(" ");
            }
            else if(counter==2){
                gTwlO.setText(first);
                if (first.equals(w.getCharOne())){
                    gTwlO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gTwlO.setFill(Color.ORANGE);
                }
                else{
                    gTwlO.setFill(Color.DIMGRAY);
                }

                gTwlTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gTwlTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gTwlTw.setFill(Color.ORANGE);
                }
                else{
                    gTwlTw.setFill(Color.DIMGRAY);
                }

                gTwlTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gTwlTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gTwlTh.setFill(Color.ORANGE);
                }
                else{
                    gTwlTh.setFill(Color.DIMGRAY);
                }

                gTwlFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gTwlFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gTwlFo.setFill(Color.ORANGE);
                }
                else{
                    gTwlFo.setFill(Color.DIMGRAY);
                }

                gTwlFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gTwlFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gTwlFi.setFill(Color.ORANGE);
                }
                else{
                    gTwlFi.setFill(Color.DIMGRAY);
                }
            }
            else if(counter==3){
                gThlO.setText(first);
                if (first.equals(w.getCharOne())){
                    gThlO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gThlO.setFill(Color.ORANGE);
                }
                else{
                    gThlO.setFill(Color.DIMGRAY);
                }

                gThlTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gThlTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gThlTw.setFill(Color.ORANGE);
                }
                else{
                    gThlTw.setFill(Color.DIMGRAY);
                }

                gThlTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gThlTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gThlTh.setFill(Color.ORANGE);
                }
                else{
                    gThlTh.setFill(Color.DIMGRAY);
                }

                gThlFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gThlFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gThlFo.setFill(Color.ORANGE);
                }
                else{
                    gThlFo.setFill(Color.DIMGRAY);
                }

                gThlFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gThlFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gThlFi.setFill(Color.ORANGE);
                }
                else{
                    gThlFi.setFill(Color.DIMGRAY);
                }
            }
            else if(counter==4){
                gFolO.setText(first);
                if (first.equals(w.getCharOne())){
                    gFolO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gFolO.setFill(Color.ORANGE);
                }
                else{
                    gFolO.setFill(Color.DIMGRAY);
                }

                gFolTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gFolTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gFolTw.setFill(Color.ORANGE);
                }
                else{
                    gFolTw.setFill(Color.DIMGRAY);
                }

                gFolTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gFolTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gFolTh.setFill(Color.ORANGE);
                }
                else{
                    gFolTh.setFill(Color.DIMGRAY);
                }

                gFolFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gFolFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gFolFo.setFill(Color.ORANGE);
                }
                else{
                    gFolFo.setFill(Color.DIMGRAY);
                }

                gFolFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gFolFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gFolFi.setFill(Color.ORANGE);
                }
                else{
                    gFolFi.setFill(Color.DIMGRAY);
                }
            }
            else if(counter==5){
                gFilO.setText(first);
                if (first.equals(w.getCharOne())){
                    gFilO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gFilO.setFill(Color.ORANGE);
                }
                else{
                    gFilO.setFill(Color.DIMGRAY);
                }

                gFilTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gFilTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gFilTw.setFill(Color.ORANGE);
                }
                else{
                    gFilTw.setFill(Color.DIMGRAY);
                }

                gFilTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gFilTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gFilTh.setFill(Color.ORANGE);
                }
                else{
                    gFilTh.setFill(Color.DIMGRAY);
                }

                gFilFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gFilFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gFilFo.setFill(Color.ORANGE);
                }
                else{
                    gFilFo.setFill(Color.DIMGRAY);
                }

                gFilFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gFilFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gFilFi.setFill(Color.ORANGE);
                }
                else{
                    gFilFi.setFill(Color.DIMGRAY);
                }
            }
            else if(counter==6){
                gSlO.setText(first);
                if (first.equals(w.getCharOne())){
                    gSlO.setFill(Color.GREEN);
                }
                else if (first.equals(w.getCharTwo())||first.equals(w.getCharThree())||first.equals(w.getCharFour())||first.equals(w.getCharFive())){
                    gSlO.setFill(Color.ORANGE);
                }
                else{
                    gSlO.setFill(Color.DIMGRAY);
                }

                gSlTw.setText(second);
                if (second.equals(w.getCharTwo())){
                    gSlTw.setFill(Color.GREEN);
                }
                else if (second.equals(w.getCharOne())||second.equals(w.getCharThree())||second.equals(w.getCharFour())||second.equals(w.getCharFive())){
                    gSlTw.setFill(Color.ORANGE);
                }
                else{
                    gSlTw.setFill(Color.DIMGRAY);
                }

                gSlTh.setText(third);
                if (third.equals(w.getCharThree())){
                    gSlTh.setFill(Color.GREEN);
                }
                else if (third.equals(w.getCharOne())||third.equals(w.getCharTwo())||third.equals(w.getCharFour())||third.equals(w.getCharFive())){
                    gSlTh.setFill(Color.ORANGE);
                }
                else{
                    gSlTh.setFill(Color.DIMGRAY);
                }

                gSlFo.setText(fourth);
                if (fourth.equals(w.getCharFour())){
                    gSlFo.setFill(Color.GREEN);
                }
                else if (fourth.equals(w.getCharOne())||fourth.equals(w.getCharTwo())||fourth.equals(w.getCharThree())||fourth.equals(w.getCharFive())){
                    gSlFo.setFill(Color.ORANGE);
                }
                else{
                    gSlFo.setFill(Color.DIMGRAY);
                }

                gSlFi.setText(fifth);
                if (fifth.equals(w.getCharFive())){
                    gSlFi.setFill(Color.GREEN);
                }
                else if (fifth.equals(w.getCharOne())||fifth.equals(w.getCharTwo())||fifth.equals(w.getCharThree())||fifth.equals(w.getCharFour())){
                    gSlFi.setFill(Color.ORANGE);
                }
                else{
                    gSlFi.setFill(Color.DIMGRAY);
                }
            }
            System.out.println(guess);
            if(guess.getWord().equals(w.getWord())){
                welcomeText.setText("Correct! The word is "+w.getWord()+". Only "+counter+" guesses used :)");
                counter = 0;
                initialize();
            }
            counter++;
            textGuessOne.clear();
            textGuessTwo.clear();
            textGuessThree.clear();
            textGuessFour.clear();
            textGuessFive.clear();
        }
        else{
            welcomeText.setText("Invalid Word, please try again.");
            textGuessOne.clear();
            textGuessTwo.clear();
            textGuessThree.clear();
            textGuessFour.clear();
            textGuessFive.clear();
        }

    }
}