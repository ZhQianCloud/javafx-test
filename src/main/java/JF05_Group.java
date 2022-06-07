import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JF05_Group extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");
        Label label = new Label("这个是标签框");
        label.setLayoutX(500);
        label.setLayoutY(500);

        button1.setPrefWidth(50);
        button1.setPrefHeight(30);

        Group group=new Group();
        //离左上角坐标距离
        button1.setLayoutX(50);
        button1.setLayoutY(50);
        button3.setLayoutY(200);
        //组件添加到布局类上
        group.getChildren().addAll(button1, button2,button3,label);
        //删除组件
        group.getChildren().remove(button3);
//        group.getChildren().clear();
//        group.getChildren().removeAll(button1, button2);
        //不设置宽高,是否自动有宽带
//        group.setAutoSizeChildren(false);

        //批量给一组设置属性
        group.setOpacity(0.5);
        //指定位置是否有组件
        group.contains(0, 0);

        Object[] objects=group.getChildren().toArray();
        for (Object obj : objects) {
            if(obj instanceof Button){
                Button but = (Button) obj;
                System.out.println("but = " + but);
            }
        }


        //监听组件个数
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> change) {
                int count=change.getList().size();
                System.out.println("组件个数:" + count);
                label.setText("当前组件个数:" + count);
            }
        });

        //添加组件
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button button = new Button("新按钮");
                button.setLayoutX(Math.random()*500);
                button.setLayoutY(Math.random()*500);
                group.getChildren().add(button);
            }
        });

        Scene scene=new Scene(group);

        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
