/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package latihanmf7.erest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Blizzard
 */
public class FXMLDocumentController implements Initializable {
@FXML
    private TextField customerNameField;

    @FXML
    private TextField quantityField;

    @FXML
    private ComboBox<String> destinationComboBox;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private Label totalPriceLabel;

    @FXML
    protected void calculateTotalPrice(ActionEvent event) {
        String destination = destinationComboBox.getValue();
        int quantity = Integer.parseInt(quantityField.getText());

        double ticketFee = 0;
        double tax = 0;
        double entryFee = 0;

        if (destination.equals("USA")) {
            ticketFee = 5000000;
            tax = 0;
            entryFee = 2000000;
        } else if (destination.equals("Japan")) {
            ticketFee = 2000000;
            tax = 0;
            entryFee = 1000000;
        } else if (destination.equals("Singapore")) {
            ticketFee = 1000000;
            tax = 0.1;
            entryFee = 500000;
        }

        double totalPrice = ticketFee * quantity + tax * ticketFee * quantity + entryFee;

        if (paymentMethodComboBox.getValue().equals("Credit Card")) {
            totalPrice -= 100000; // Apply credit card discount
        }

        if (totalPrice > 100000000) {
            totalPrice -= entryFee - 500000;
        } else if (totalPrice > 50000000) {
            totalPrice -= entryFee - 200000;
        } else if (totalPrice > 20000000) {
            totalPrice -= entryFee - 100000;
        }

        totalPriceLabel.setText("Total Price: $" + totalPrice);
    }

    @FXML
    protected void placeOrder(ActionEvent event) {
        // Place order logic here
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Todo
    }
    
}
