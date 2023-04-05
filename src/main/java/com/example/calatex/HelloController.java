package com.example.calatex;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private Button commaButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button equalButton;

    @FXML
    private TextArea expressionArea;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private GridPane gridCalc;

    @FXML
    private Button minusButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button parenthesisButton;

    @FXML
    private Button percentButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button resetButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button timeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;

    @FXML
    void commaButtonClick(ActionEvent event) {
        expressionArea.appendText(",");
    }

    @FXML
    void divisionButtonClick(ActionEvent event) {
        expressionArea.appendText("/");
    }
    @FXML
    void equalButtonClick(ActionEvent event) {
        expressionArea.appendText("=");
    }
    @FXML
    void timeButtonClick(ActionEvent event) {
        expressionArea.appendText("*");
    }
    @FXML
    void minusButtonClick(ActionEvent event) {
        expressionArea.appendText("-");
    }
    @FXML
    void parenthesisButtonClick(ActionEvent event) {
        expressionArea.appendText("()");
    }

    @FXML
    void percentButtonClick(ActionEvent event) {
        expressionArea.appendText("%");
    }

    @FXML
    void plusButtonClick(ActionEvent event) {
        expressionArea.appendText("+");
    }

    @FXML
    void resetButtonClick(ActionEvent event) {
        expressionArea.clear();
    }

    //-----------------Numbers-----------------
    @FXML
    void nineButtonClick(ActionEvent event) {
        expressionArea.appendText("9");
    }
    @FXML
    void eightButtonClick(ActionEvent event) {
        expressionArea.appendText("8");
    }
    @FXML
    void sevenButtonClick(ActionEvent event) {
        expressionArea.appendText("7");
    }
    @FXML
    void sixButtonClick(ActionEvent event) {
        expressionArea.appendText("6");
    }
    @FXML
    void fiveButtonClick(ActionEvent event) {
        expressionArea.appendText("5");
    }

    @FXML
    void fourButtonClick(ActionEvent event) {
        expressionArea.appendText("4");
    }
    @FXML
    void threeButtonClick(ActionEvent event) {
        expressionArea.appendText("3");
    }
    @FXML
    void twoButtonClick(ActionEvent event) {
        expressionArea.appendText("2");
    }
    @FXML
    void oneButtonClick(ActionEvent event) {
        expressionArea.appendText("1");
    }
    @FXML
    void zeroButtonClick(ActionEvent event) {
        expressionArea.appendText("0");
    }
}