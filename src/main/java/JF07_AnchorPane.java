import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class JF07_AnchorPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();

        Button button = new Button("按钮1");
        Button button1 = new Button("按钮2");
        Button button2 = new Button("按钮3");
        Button button3 = new Button("按钮4");

        Group group = new Group();
        Group group1 = new Group();


        group.getChildren().addAll(button, button1);
        group1.getChildren().addAll(button2,button3);

        anchorPane.setTopAnchor(group,100.0);
        group.setLayoutX(200);

        anchorPane.getChildren().addAll(button, button1);
        anchorPane.setBackground(Background.fill(Paint.valueOf("grey")));


        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
