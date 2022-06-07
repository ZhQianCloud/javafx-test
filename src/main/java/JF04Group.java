import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JF04Group extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("��ť1");
        Button button2 = new Button("��ť2");
        Button button3 = new Button("��ť3");

        button1.setPrefWidth(50);
        button1.setPrefHeight(30);

        Group group=new Group();
        //�����Ͻ��������
        button1.setLayoutX(50);
        button1.setLayoutY(50);
        button3.setLayoutY(200);
        //�����ӵ���������
        group.getChildren().addAll(button1, button2,button3);
        //ɾ�����
        group.getChildren().remove(button3);
//        group.getChildren().clear();
//        group.getChildren().removeAll(button1, button2);
        //�����ÿ��,�Ƿ��Զ��п��
//        group.setAutoSizeChildren(false);

        Scene scene=new Scene(group);

        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
