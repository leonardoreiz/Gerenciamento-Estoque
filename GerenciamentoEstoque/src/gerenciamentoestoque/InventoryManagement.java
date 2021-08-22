/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentoestoque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author leona
 */
public class InventoryManagement extends Application {

   
    public static void main(String[] args) {
        launch(args);
        
    }
    @Override
    public void start(Stage InventoryManagement) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ScreenInventory.fxml"));
        Parent root = fxmlLoader.load();
        Stage sInv = new Stage();
        sInv.setTitle("Inventory Management");
        sInv.setScene(new Scene(root));
        sInv.show();
    }
    
}
