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
        //��ť���
        Button button=new Button("��ť(�򿪰ٶ�)");
        button.setPrefWidth(200);
        button.setPrefHeight(50);

        //���鲼����
//        Group group=new Group(button);
        Group group=new Group();
        //�����ӵ���������
        group.getChildren().add(button);
        //����������,���Ѳ�������ӵ�������
        Scene scene=new Scene(group);
        //�����ʽ
        button.setCursor(Cursor.HAND);
//        scene.setCursor(Cursor.cursor("������ʽͼƬ��·��"));

        //��������ӵ�������
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
        //��ӵ���¼�
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //��Ĭ���������һ����ַ
                HostServices hostServices=getHostServices();
                hostServices.showDocument("https://www.baidu.com/");
            }
        });
    }
}
