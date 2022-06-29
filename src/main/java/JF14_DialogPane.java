import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JF14_DialogPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color: #f59393");

        Button button = new Button("�����ʾ����");

        an.getChildren().addAll(button);
        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();


        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("actionEvent = " + actionEvent);
                DialogPane dialogPane=new DialogPane();
                //��������
                dialogPane.setHeaderText("���Ǹ�������Header");
                dialogPane.setContentText("���ǵ�����ContentText");
                //������
                dialogPane.getButtonTypes().add(ButtonType.APPLY);
                dialogPane.getButtonTypes().add(ButtonType.CLOSE);
                dialogPane.getButtonTypes().add(ButtonType.FINISH);
                //����ͼƬ
                Image image = new Image("favicon.png");
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(30);
                imageView.setFitHeight(30);
                dialogPane.setGraphic(imageView);
                //���ò鿴����
                dialogPane.setExpandableContent(new Text("���Ǹ����............................."));

                Stage stage1 = new Stage();
                //����ӵ����
                stage1.initOwner(stage);
                stage1.initModality(Modality.WINDOW_MODAL);
                stage1.setTitle("���Ǹ�����");
                Scene scene1 = new Scene(dialogPane);
                //��ֹ����
                stage1.setResizable(false);
                //�ö�
                stage1.setAlwaysOnTop(true);
                stage1.setScene(scene1);
                stage1.show();
                
                //��ȡ�����ڵ�button
                Button apply = (Button) dialogPane.lookupButton(ButtonType.APPLY);
                apply.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        System.out.println("actionEvent = " + actionEvent);
                    }
                });

                Button close = (Button) dialogPane.lookupButton(ButtonType.CLOSE);
                close.setCursor(Cursor.HAND);
                close.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage1.close();
                    }
                });
            }
        });
    }
}
