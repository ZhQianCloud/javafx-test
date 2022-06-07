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

        Button button1 = new Button("��ť1");
        Button button2 = new Button("��ť2");
        Button button3 = new Button("��ť3");
        Label label = new Label("����Ǳ�ǩ��");
        label.setLayoutX(500);
        label.setLayoutY(500);

        button1.setPrefWidth(50);
        button1.setPrefHeight(30);

        Group group=new Group();
        //�����Ͻ��������
        button1.setLayoutX(50);
        button1.setLayoutY(50);
        button3.setLayoutY(200);
        //�����ӵ���������
        group.getChildren().addAll(button1, button2,button3,label);
        //ɾ�����
        group.getChildren().remove(button3);
//        group.getChildren().clear();
//        group.getChildren().removeAll(button1, button2);
        //�����ÿ��,�Ƿ��Զ��п��
//        group.setAutoSizeChildren(false);

        //������һ����������
        group.setOpacity(0.5);
        //ָ��λ���Ƿ������
        group.contains(0, 0);

        Object[] objects=group.getChildren().toArray();
        for (Object obj : objects) {
            if(obj instanceof Button){
                Button but = (Button) obj;
                System.out.println("but = " + but);
            }
        }


        //�����������
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> change) {
                int count=change.getList().size();
                System.out.println("�������:" + count);
                label.setText("��ǰ�������:" + count);
            }
        });

        //������
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button button = new Button("�°�ť");
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
