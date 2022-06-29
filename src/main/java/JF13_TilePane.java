import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JF13_TilePane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        TilePane tilePane = new TilePane();
        /***
         * ����: ��������һ����������ʽ, �����ĸ��ű���һ��
         */
        Button button = new Button("button");
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");

        //button������߾�, button1,button2...Ҳ��������߾�
        TilePane.setMargin(button, new Insets(30));

        tilePane.setHgap(10);

        tilePane.setStyle("-fx-background-color: rgba(98,246,212,0.5)");
        tilePane.getChildren().addAll(button, button1, button2, button3, button4, button5, button6);
        Scene scene = new Scene(tilePane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
