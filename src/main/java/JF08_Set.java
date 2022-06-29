import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class JF08_Set extends Application{

    Boolean isManaged=true,isVisible=true;
    int isOpacity=1;

    public void start(Stage stage){

        AnchorPane anchorPane = new AnchorPane();

        Button button = new Button("按钮1");
        Button button1 = new Button("按钮2");
        Button button2 = new Button("按钮3");
        Button button3 = new Button("按钮4");
        Label label = new Label("Hbox子组件个数:4个");
        HBox hBox = new HBox(button, button1,button2,button3,label);
        hBox.setPrefWidth(600);
        hBox.setPrefHeight(200);


        Button button4 = new Button("button3.setManaged(false)");
        Button button5 = new Button("button3.isVisible(false)");
        Button button6 = new Button("button3.setOpacity(0.2)");
        VBox vBox =new VBox(button4, button5, button6);

        vBox.setPrefWidth(200);
        vBox.setPrefHeight(100);
        vBox.setLayoutY(300);
        anchorPane.getChildren().addAll(hBox,vBox);
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();

        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               if(isManaged){
                   System.out.println(1);
                   button2.setManaged(false);
                   button4.setText("button3.setManaged(true)");
                   isManaged=false;
                   label.setText("Hbox子组件个数:"+hBox.getChildren().size());
               }else {
                   System.out.println(2);
                   button2.setManaged(true);
                   button4.setText("button3.setManaged(false)");
                   isManaged=true;
                   label.setText("Hbox子组件个数:"+hBox.getChildren().size());
               }
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(isVisible){
                    System.out.println(1);
                    button2.setVisible(false);
                    button5.setText("button3.isVisible(true)");
                    isVisible=false;
                    label.setText("Hbox子组件个数:"+hBox.getChildren().size());
                }else {
                    System.out.println(2);
                    button2.setVisible(true);
                    button5.setText("button3.isVisible(false)");
                    isVisible=true;
                    label.setText("Hbox子组件个数:"+hBox.getChildren().size());
                }
            }
        });

        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(isOpacity==1){
                    System.out.println(1);
                    button2.setOpacity(0.2);
                    button6.setText("button3.setOpacity(1)");
                    isOpacity=0;
                    label.setText("Hbox子组件个数:"+hBox.getChildren().size());
                }else {
                    System.out.println(2);
                    button2.setOpacity(1);
                    button6.setText("button3.setOpacity(0.2)");
                    isOpacity=1;
                    label.setText("Hbox子组件个数:"+hBox.getChildren().size());
                }
            }
        });

    }
}
