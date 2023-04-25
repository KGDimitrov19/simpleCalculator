package com.calculator.simplecalculator;

import javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Calculator extends Application {

    TextField textField;

    @Override
    public void start(Stage stage)
    {
        //App view
        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        textField=new TextField();
        textField.setAlignment(Pos.BASELINE_RIGHT);
        textField.setPrefWidth(230);
        textField.setPrefHeight(100);
        textField.setEditable(false);
        textField.setStyle("-fx-font-size: 36px;");
        textField.setText("0");
        gridPane.add(textField,0,0,4,1);

        //Buttons number views
        Button btnZero=new Button("0");
        btnZero.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnOne=new Button("1");
        btnOne.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnTwo=new Button("2");
        btnTwo.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnThree=new Button("3");
        btnThree.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnFour=new Button("4");
        btnFour.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnFive=new Button("5");
        btnFive.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnSix=new Button("6");
        btnSix.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnSeven=new Button("7");
        btnSeven.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnEight=new Button("8");
        btnEight.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnNine=new Button("9");
        btnNine.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        //Buttons actions views
        Button btnAddition=new Button("+");
        btnAddition.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnSubtraction=new Button("-");
        btnSubtraction.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnMultiplication=new Button("*");
        btnMultiplication.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnDivision=new Button("/");
        btnDivision.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnEquals=new Button("=");
        btnEquals.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");
        Button btnClear=new Button("C");
        btnClear.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        //Add buttons to build
        gridPane.add(btnClear,2,1);
        gridPane.add(btnDivision,3,1);
        gridPane.add(btnSeven,0,2);
        gridPane.add(btnEight,1,2);
        gridPane.add(btnNine,2,2);
        gridPane.add(btnMultiplication,3,2);

        gridPane.add(btnFour,0,3);
        gridPane.add(btnFive,1,3);
        gridPane.add(btnSix,2,3);
        gridPane.add(btnSubtraction,3,3);

        gridPane.add(btnOne,0,4);
        gridPane.add(btnTwo,1,4);
        gridPane.add(btnThree,2,4);
        gridPane.add(btnAddition,3,4);

        gridPane.add(btnZero,1,5);
        gridPane.add(btnEquals,3,5);
//Events


        btnZero.setOnAction(event->handleButtonPressNumber("0"));
        btnOne.setOnAction(event->handleButtonPressNumber("1"));
        btnTwo.setOnAction(event->handleButtonPressNumber("2"));
        btnThree.setOnAction(event->handleButtonPressNumber("3"));
        btnFour.setOnAction(event->handleButtonPressNumber("4"));
        btnFive.setOnAction(event->handleButtonPressNumber("5"));
        btnSix.setOnAction(event->handleButtonPressNumber("6"));
        btnSeven.setOnAction(event->handleButtonPressNumber("7"));
        btnEight.setOnAction(event->handleButtonPressNumber("8"));
        btnNine.setOnAction(event->handleButtonPressNumber("9"));

        btnClear.setOnAction(event->handleButtonPressClear());

        //Show app
        Scene scene= new Scene(gridPane);
        stage.setScene(scene);
        stage.show();


    }
    private void handleButtonPressNumber(String buttonValue){
        if(Objects.equals(textField.getText(), "0") && Objects.equals(buttonValue, "0")){
            textField.setText(buttonValue);
        }
        else if((!Objects.equals(textField.getText(), "0"))){
            textField.setText((textField.getText())+ buttonValue);
        }
    }
    private void handleButtonPressClear() {
       textField.setText("0");
    }


    public static void main(String[] args) {
        launch();
    }
}
