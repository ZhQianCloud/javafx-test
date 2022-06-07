import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JF06_Button extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("°´Å¥");
        Scene scene = new Scene(button);
        button.setPrefHeight(300);
        button.setPrefWidth(200);
        button.setLayoutY(200);
        button.setLayoutX(200);

        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
