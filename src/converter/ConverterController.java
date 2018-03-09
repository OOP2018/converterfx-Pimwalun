package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * Can get text from ConverterUI and show result
 * @author Pimwalun Witchawanitchanun
 *
 */
public class ConverterController {
	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	@FXML
	private ComboBox<Length> comboBox1;
	@FXML
	private ComboBox<Length> comboBox2;
	@FXML
	Button convert;
	@FXML
	Button clear;

	/**
	 * JavaFx calls the initialize() method of your controller when
	 * it creates the UI from, after the components have been created
	 * and @FXML annotated attributes have been set.
	 * 
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		System.out.println("Running initlialize");
		if (comboBox1 != null) {
			comboBox1.getItems().addAll(Length.values());
			comboBox1.getSelectionModel().select(0);
		}
		if (comboBox2 != null) {
			comboBox2.getItems().addAll(Length.values());
			comboBox2.getSelectionModel().select(1);
		}
	}

	/**
	 * Convert a distance from one unit to another.
	 * @param event not use.
	 */
	public void handleConvert(ActionEvent event) {
		String text1 = textField1.getText().trim();
		String text2 = textField2.getText().trim();
		Length unit1 = comboBox1.getValue();
		Length unit2 = comboBox2.getValue();
		if (!text1.equals("")) {
			try {
				double value1 = Double.parseDouble(text1);
				double ans = (unit1.getValue() / unit2.getValue()) * value1;
				textField1.setStyle("-fx-text-fill: black");
				textField2.setStyle("-fx-text-fill: black");
				textField2.setText(String.format("%.4g", ans));
			} catch (NumberFormatException e) {
				textField1.setStyle("-fx-text-fill: red");
				textField1.setText("Invalid value");
			}
		} else if (!text2.equals("") && text1.equals("")) {
			try {
				double value2 = Double.parseDouble(text2);
				double ans = (unit2.getValue() / unit1.getValue()) * value2;
				textField1.setStyle("-fx-text-fill: black");
				textField2.setStyle("-fx-text-fill: black");
				textField1.setText(String.format("%.4g", ans));
			} catch (NumberFormatException e) {
				textField2.setStyle("-fx-text-fill: red");
				textField2.setText("Invalid value");
			}
		}
	}

	/**
	 * Clear the textField.
	 * @param event not use.
	 */
	public void handleClear(ActionEvent event) {
		textField1.setText(null);
		textField2.setText(null);
		textField1.clear();
		textField2.clear();
		textField1.setStyle("-fx-text-fill: black");
		textField2.setStyle("-fx-text-fill: black");
	}
}
