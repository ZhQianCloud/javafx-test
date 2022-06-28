import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JF08_HBox_VBox extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("按钮1");
        Button button1 = new Button("按钮2");
        Button button2 = new Button("按钮3");
        Button button3 = new Button("按钮4");

        VBox vbox = new VBox();
        vbox.setPrefHeight(300);
        vbox.setPrefWidth(300);

        vbox.setStyle("-fx-background-color: #E066FF");
        vbox.getChildren().addAll(button, button1);

        HBox hbox = new HBox();
        hbox.setPrefHeight(300);
        hbox.setPrefWidth(300);
        hbox.setStyle("-fx-background-color: #E06FFF");
        hbox.getChildren().addAll(button2, button3);

        hbox.setLayoutX(200);

        AnchorPane anchorPane = new AnchorPane(vbox,hbox);

        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
