import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JF04Group extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");

        button1.setPrefWidth(50);
        button1.setPrefHeight(30);

        Group group=new Group();
        //离左上角坐标距离
        button1.setLayoutX(50);
        button1.setLayoutY(50);
        button3.setLayoutY(200);
        //组件添加到布局类上
        group.getChildren().addAll(button1, button2,button3);
        //删除组件
        group.getChildren().remove(button3);
//        group.getChildren().clear();
//        group.getChildren().removeAll(button1, button2);
        //不设置宽高,是否自动有宽带
//        group.setAutoSizeChildren(false);

        Scene scene=new Scene(group);

        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
