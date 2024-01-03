package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/test.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        
        stage.initStyle(StageStyle.TRANSPARENT);
        //scene.getStylesheets().add("/path/to/your/style.css"); 
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
	
