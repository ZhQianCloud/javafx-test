import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JF17_HyperLink extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("°Ù¶È");
        Hyperlink hyperlink=new Hyperlink("https://www.baidu.com",button);

        AnchorPane anchorPane=new AnchorPane();

        anchorPane.getChildren().addAll( hyperlink);
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();

        hyperlink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                HostServices host=JF17_HyperLink.this.getHostServices();
                host.showDocument(hyperlink.getText());
            }
        });
    }
}
