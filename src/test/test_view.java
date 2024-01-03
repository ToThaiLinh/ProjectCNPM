package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class test_view extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tạo một AnchorPane chính
        AnchorPane mainAnchorPane = new AnchorPane();

        // Tạo một Button để kích hoạt hiển thị AnchorPane mới
        Button showAnchorPaneButton = new Button("Hiển thị AnchorPane");
        showAnchorPaneButton.setOnAction(event -> showNewAnchorPane(mainAnchorPane));

        // Đặt vị trí của Button trong AnchorPane chính
        AnchorPane.setTopAnchor(showAnchorPaneButton, 10.0);
        AnchorPane.setLeftAnchor(showAnchorPaneButton, 10.0);

        // Thêm Button vào AnchorPane chính
        mainAnchorPane.getChildren().add(showAnchorPaneButton);

        // Tạo Scene từ AnchorPane chính
        Scene scene = new Scene(mainAnchorPane, 300, 200);

        // Thiết lập Stage và hiển thị nó
        primaryStage.setTitle("JavaFX AnchorPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showNewAnchorPane(AnchorPane mainAnchorPane) {
        // Tạo một AnchorPane mới
        AnchorPane newAnchorPane = new AnchorPane();

        // Thiết lập màu sắc cho AnchorPane mới
        Rectangle background = new Rectangle(200, 150, Color.BLUE); // Kích thước và màu sắc
        newAnchorPane.getChildren().add(background);

        // Thiết lập một số thuộc tính của AnchorPane mới, ví dụ: đặt vị trí
        AnchorPane.setTopAnchor(newAnchorPane, 50.0);
        AnchorPane.setLeftAnchor(newAnchorPane, 50.0);

        // Thêm AnchorPane mới vào AnchorPane chính
        mainAnchorPane.getChildren().add(newAnchorPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
