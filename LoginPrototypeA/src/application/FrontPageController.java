/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class FrontPageController implements Initializable {

    @FXML
    private ImageView progress; 
    @FXML
    private JFXButton signUpButton;
    @FXML
    private JFXTextField userNameFrontField;
    @FXML
    private JFXPasswordField passwordFrontField;
    @FXML
    private JFXButton signInButton;
     @FXML
    private JFXTextField regUserName;
    @FXML
    private JFXPasswordField regPassword;
    @FXML
    private JFXTextField regEmail;
    @FXML
    private JFXTextField regFName;
    @FXML
    private JFXTextField regLName;
    @FXML
    private JFXButton regSignUpButton;
    @FXML
    private JFXButton regGoBackButton;
    
    
    
    @FXML
    private void handleClose(MouseEvent event){
        System.exit(0);
    }
   
    @FXML
    private void loginAction(MouseEvent e){
        progress.setVisible(true);
        PauseTransition pt = new PauseTransition();
       pt.setDuration(Duration.seconds(3));
       pt.setOnFinished(ev -> 
       { 
        System.out.println("Login Successful!");
    });
              pt.play();
    }
   
    @FXML
   private void signUpAction(ActionEvent e) throws IOException{
       signUpButton.getScene().getWindow().hide();
       Stage signupStage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
       Scene scene = new Scene(root);
       signupStage.setScene(scene);
       signupStage.initStyle(StageStyle.UNDECORATED);
       signupStage.setResizable(false);
       signupStage.show();
   }
   
   @FXML
   private void goBackAction(ActionEvent e) throws IOException{
       regGoBackButton.getScene().getWindow().hide();
       Stage stage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("frontPage.fxml"));
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.initStyle(StageStyle.UNDECORATED);
       stage.setResizable(false);
       stage.show();
   }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    progress.setVisible(false);


    }    
    
    
    

 
    
}
