import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JF09_BorderPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane top=new AnchorPane();
        top.setStyle("-fx-background-color: #4682B4");
        top.setPrefHeight(20);

        AnchorPane left = new AnchorPane();
        left.setStyle("-fx-background-color: #3CB371");
        left.setPrefWidth(20);

        AnchorPane right = new AnchorPane();
        right.setStyle("-fx-background-color: #DDA0DD");
        right.setPrefWidth(30);

        AnchorPane buttom = new AnchorPane();
        buttom.setStyle("-fx-background-color: #FAFAD2");
        buttom.setPrefHeight(30);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #FFA500");

        //放入
        borderPane.setTop(top);
        borderPane.setBottom(buttom);
        borderPane.setLeft(left);
        borderPane.setRight(right);

        //内边距,子组件外边距
        borderPane.setPadding(new Insets(20));
        borderPane.setMargin(buttom,new Insets(30));


        //获取组件
        AnchorPane an=(AnchorPane)borderPane.getBottom();
        System.out.println(an);

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
