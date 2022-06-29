import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.function.Consumer;

public class JF11_StackPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //特性:全部重叠在一起
        Button button = new Button("按钮1");
        Button button1 = new Button("按钮2");
        Button button2 = new Button("按钮3");
        Button button3 = new Button("按钮4");
        Button button4 = new Button("按钮5");

        StackPane stackPane = new StackPane(button, button1, button2, button3, button4);

        //遍历
        stackPane.getChildren().forEach(new Consumer<Node>() {
            @Override
            public void accept(Node node) {
                System.out.println("node = " + node);
            }
        });

        Scene scene = new Scene(stackPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
