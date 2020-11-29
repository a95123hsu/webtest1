/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import static javafx.scene.paint.Color.web;
import static javafx.scene.paint.Color.web;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author andyhsu
 */
public class webController implements Initializable {

    @FXML
    private WebView viewweb;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final WebEngine web=viewweb.getEngine();
        
        String urlweb="https://canvas.psu.edu";
        web.load(urlweb);
    }    

    @FXML
    private void todolist(ActionEvent event) {
         final WebEngine web=viewweb.getEngine();
        
        String urlweb="https://psu.instructure.com/";
        web.load(urlweb);
    }
    
    @FXML
    private void google(ActionEvent event) {
        final WebEngine web=viewweb.getEngine();
        
        String urlweb="https://google.com.tw";
        web.load(urlweb);
    }

    @FXML
    private void youtube(ActionEvent event) {
        final WebEngine web=viewweb.getEngine();
        
        String urlweb="https://psu.instructure.com/profile";
        web.load(urlweb);
    }

    @FXML
    private void facebook(ActionEvent event) {
        final WebEngine web=viewweb.getEngine();
        
        String urlweb="https://psu.instructure.com/conversations";
        web.load(urlweb);
    }
    
}
