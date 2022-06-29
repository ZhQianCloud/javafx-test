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

        //����:ȫ���ص���һ��
        Button button = new Button("��ť1");
        Button button1 = new Button("��ť2");
        Button button2 = new Button("��ť3");
        Button button3 = new Button("��ť4");
        Button button4 = new Button("��ť5");

        StackPane stackPane = new StackPane(button, button1, button2, button3, button4);

        //����
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
