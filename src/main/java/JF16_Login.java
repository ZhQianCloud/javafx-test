import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JF16_Login extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        GridPane gridPane=new GridPane();
        gridPane.setStyle("-fx-background-color: rgba(136,253,53,0.24)");

        Label label_name = new Label("�˺�");
        Label label_pwd = new Label("����");
        TextField text_name = new TextField();
        text_name.setPromptText("�������˺�");
        PasswordField passwordField=new PasswordField();
        passwordField.setPromptText("����������");

        text_name.setUserData("zxc");
        passwordField.setUserData("123456");


        Button login = new Button("��¼");
        Button clear = new Button("���");

        gridPane.add(label_name,0,0);
        gridPane.add(text_name,1,0);
        gridPane.add(label_pwd,0,1);
        gridPane.add(passwordField,1,1);
        gridPane.add(clear,0,2);
        gridPane.add(login,1,2);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        GridPane.setMargin(login, new Insets(0,0,0,120));


        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();


        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text_name.clear();
                passwordField.clear();
            }
        });

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(text_name.getUserData().equals(text_name.getText()) && passwordField.getUserData().equals(passwordField.getText())){
                    System.out.println("��¼�ɹ�");
                    Stage stage1=new Stage();
                    stage1.setTitle("���ǵ�¼�ɹ��Ľ���");
                    stage1.show();
                }else {
                    FadeTransition fadeTransition = new FadeTransition();
                    fadeTransition.setNode(gridPane);
                    fadeTransition.setFromValue(0);
                    fadeTransition.setToValue(3);
                    fadeTransition.play();
                }
            }
        });
    }
}
