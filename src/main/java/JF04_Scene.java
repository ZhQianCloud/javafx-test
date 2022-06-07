import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JF04_Scene extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //按钮组件
        Button button=new Button("按钮(打开百度)");
        button.setPrefWidth(200);
        button.setPrefHeight(50);

        //分组布局类
//        Group group=new Group(button);
        Group group=new Group();
        //组件添加到布局类里
        group.getChildren().add(button);
        //创建场景类,并把布局类添加到场景类
        Scene scene=new Scene(group);
        //鼠标样式
        button.setCursor(Cursor.HAND);
//        scene.setCursor(Cursor.cursor("所需样式图片的路径"));

        //场景类添加到窗口上
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
        //添加点击事件
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //用默认浏览器打开一个网址
                HostServices hostServices=getHostServices();
                hostServices.showDocument("https://www.baidu.com/");
            }
        });
    }
}
