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

        Button button = new Button("点击显示弹窗");

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
                //弹窗内容
                dialogPane.setHeaderText("这是个弹窗的Header");
                dialogPane.setContentText("这是弹窗的ContentText");
                //添加组件
                dialogPane.getButtonTypes().add(ButtonType.APPLY);
                dialogPane.getButtonTypes().add(ButtonType.CLOSE);
                dialogPane.getButtonTypes().add(ButtonType.FINISH);
                //设置图片
                Image image = new Image("favicon.png");
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(30);
                imageView.setFitHeight(30);
                dialogPane.setGraphic(imageView);
                //设置查看更多
                dialogPane.setExpandableContent(new Text("这是更多的............................."));

                Stage stage1 = new Stage();
                //窗口拥有者
                stage1.initOwner(stage);
                stage1.initModality(Modality.WINDOW_MODAL);
                stage1.setTitle("这是个弹窗");
                Scene scene1 = new Scene(dialogPane);
                //禁止拉伸
                stage1.setResizable(false);
                //置顶
                stage1.setAlwaysOnTop(true);
                stage1.setScene(scene1);
                stage1.show();
                
                //获取弹窗内的button
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
