package test;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;

public class controller_test {

    @FXML
    private Button button_insert_pane;

    @FXML
    private AnchorPane main_frame;

    @FXML
    void switch_pane(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/view/test1.fxml"));
    	main_frame.getChildren().add(root);
    }

}


