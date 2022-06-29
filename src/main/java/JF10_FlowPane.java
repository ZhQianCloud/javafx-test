import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JF10_FlowPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("按钮1");
        Button button1 = new Button("按钮2");
        Button button2 = new Button("按钮3");
        Button button3 = new Button("按钮4");
        Button button4 = new Button("按钮5");
        Button button5 = new Button("按钮6");
        Button button6 = new Button("按钮7");
        FlowPane flowPane=new FlowPane(button,button2,button1,button3,button4,button5,button6);
        //居中方式
        flowPane.setAlignment(Pos.BOTTOM_RIGHT);
        //排列方式
        flowPane.setOrientation(Orientation.VERTICAL);
        //间隔
        flowPane.setHgap(20);
        flowPane.setVgap(20);


        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
