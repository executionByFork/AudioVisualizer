/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmaudiovizualizer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author main
 */
public class FXMLDocumentController implements Initializable {
    private double radius;
    private double center;
    private double cir;
    private double eWidth;
    private final double numBars = 360;
    private double numBarsInQuad;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @FXML
    private Circle circle;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        radius = circle.getRadius();
        cir = 2 * Math.PI * radius;
        eWidth = cir/numBars;
        numBarsInQuad = numBars/4;
        center = circle.getCenterX();
        for (int i = 0; i < numBarsInQuad; i++) {
            Ellipse ellipse = new Ellipse();
            
        }
        
    }    
    
}
