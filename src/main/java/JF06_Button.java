import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JF06_Button extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);

        Button button = new Button("��ť");
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);

        System.out.println("button = " + button.getText());
        button.setPrefHeight(100);
        button.setPrefWidth(200);
        button.setLayoutY(10);
        button.setLayoutX(10);
        button.setFont(Font.font("Microsoft YaHei UI", FontWeight.BOLD, FontPosture.ITALIC,40));
        //����,Բ��,�߾�
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf("#FFB6C1"), new CornerRadii(10),new Insets(10));
        Background background = new Background(backgroundFill);
        button.setBackground(background);
        //��Ե��ʽ
        BorderStroke borderStroke = new BorderStroke(Paint.valueOf("#00FFFF"), BorderStrokeStyle.DOTTED,new CornerRadii(4),new BorderWidths(5));
        Border border = new Border(borderStroke);
        button.setBorder(border);
        //�����ʽ
        button.setCursor(Cursor.HAND);
        //����
        button.setTextFill(Paint.valueOf("#F5F5F5"));
        //��css��ʽ
        Button button2 = new Button("���ǰ�ť2");
        button2.setPrefHeight(50);
        button2.setPrefWidth(100);
        button2.setLayoutY(200);
        button2.setLayoutX(20);
        button2.setStyle(
                "-fx-background-color: #1169EE20;"+
                "-fx-text-fill: #FFFFFF;"+
                "-fx-border-color: #F4A460;"+
                "-fx-border-radius: 5;"+
                "-fx-background-radius: 5;"+
                "-fx-background-insets: 0;"+
                "-fx-font-size: 15;"+
                "-fx-font-family: 'Segoe Print';"+
                "-fx-border-style: dotted;"+
                "-fx-border-width: 4;"
        );




        vbox.getChildren().addAll(button,button2);

        //�����¼�
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button but = (Button) actionEvent.getSource();
                System.out.println("but.getText() = " + but.getText());
            }
        });

        //˫��ʱ��
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getClickCount()==2){
                    System.out.println("button2��˫����");
                }

                if(mouseEvent.getButton().name().equals(MouseButton.PRIMARY.name())){
                    System.out.println("button2:�������������");
                }
                if(mouseEvent.getButton().name().equals(MouseButton.SECONDARY.name())){
                    System.out.println("button2:����Ҽ��������");
                }
            }
        });

        //������
        button2.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("setOnKeyPressed = " + keyEvent.getCode().getName());
                if (keyEvent.getCode().getName().equals(KeyCode.A.getName())){
                    System.out.println("ָ����A��������");
                }
            }
        });
        button2.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("setOnKeyReleased = " + keyEvent.getCode().getName());
            }
        });

        //��ݼ�
        KeyCombination kcb1 = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
        scene.getAccelerators().put(kcb1, new Runnable() {
            @Override
            public void run() {
                System.out.println("ִ���˿�ݼ�����");
            }
        });


        stage.show();
    }
}
