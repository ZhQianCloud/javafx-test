import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JF06_Input extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label();
        label.setText("请输入文本");

        TextField textField = new TextField();
        textField.setPrefHeight(30);
        textField.setPrefWidth(200);
        textField.setLayoutX(100);
        textField.setLayoutY(70);

        textField.setFocusTraversable(false);
        textField.setPromptText("请输入8个字以下");

        //文本变化监听
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldstr, String newstr) {
                //请输入8个字以下
                if(newstr.length()>8){
                    textField.setText(oldstr);
                }
            }
        });

        //文本被选中监听
        textField.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldstr, String newstr) {
                System.out.println("oldstr = " + oldstr);
                System.out.println("newstr = " + newstr);
            }
        });

        //单击事件
        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("label = " + label.getText());
            }
        });




        Tooltip tooltip = new Tooltip();
        tooltip.setText(textField.getText());
        tooltip.setFont(Font.font(30));
        textField.setTooltip(tooltip);



        Group group = new Group();
        group.getChildren().addAll(label,textField);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
