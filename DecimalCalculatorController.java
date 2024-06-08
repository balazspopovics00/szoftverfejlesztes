package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.DecimalCalculator;

public class DecimalCalculatorController {

    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private TextField thirdNumber;
    @FXML
    private TextField fourthNumber;
    @FXML
    private TextField fifthNumber;
    @FXML
    private Label result;

    private DecimalCalculator decimalCalculator;

    @FXML
    public void initialize() {
        decimalCalculator = new DecimalCalculator();
    }

    public void add(ActionEvent actionEvent) {
        try {
            int firstNumberInt = Integer.parseInt(firstNumber.getText());
            int secondNumberInt = Integer.parseInt(secondNumber.getText());
            int thirdNumberInt = Integer.parseInt(thirdNumber.getText());
            int fourthNumberInt = Integer.parseInt(fourthNumber.getText());
            int fifthNumberInt = Integer.parseInt(fifthNumber.getText());

            DecimalCalculator decimalCalculator = new DecimalCalculator();
            int resultValue = decimalCalculator.decimalAdd(firstNumberInt, secondNumberInt, thirdNumberInt, fourthNumberInt, fifthNumberInt);

            result.setText(Integer.toString(resultValue));
        } catch (NumberFormatException e) {
            result.setText("Kérlek adj meg érvényes számokat.");
        }
    }


    public void calculate(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String res = "";

        try {
            int firstNumberInt = Integer.parseInt(firstNumber.getText());
            int secondNumberInt = Integer.parseInt(secondNumber.getText());
            int thirdNumberInt = Integer.parseInt(thirdNumber.getText());
            int fourthNumberInt = Integer.parseInt(fourthNumber.getText());
            int fifthNumberInt = Integer.parseInt(fifthNumber.getText());

            DecimalCalculator decimalCalculator = new DecimalCalculator();

            if (button.getId().equals("addButton")) {
                int resultValue = decimalCalculator.decimalAdd(firstNumberInt, secondNumberInt, thirdNumberInt, fourthNumberInt, fifthNumberInt);
                res = Integer.toString(resultValue);
            }


        } catch (NumberFormatException e) {
            res = "Kérlek adj meg érvényes számokat.";
        }

        result.setText(res);
    }

}
