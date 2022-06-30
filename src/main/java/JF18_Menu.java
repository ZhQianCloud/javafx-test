import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JF18_Menu extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane an=new AnchorPane();
        //主菜单
        MenuBar menuBar=new MenuBar();
        Menu menu = new Menu("menu");
        Menu menu1 = new Menu("menu1");
        Menu menu2 = new Menu("menu2");
        Menu menu3 = new Menu("menu3",new Button("button"));
        menuBar.getMenus().addAll(menu, menu1, menu2, menu3);

        //一级菜单
        MenuItem item = new MenuItem("item");
        item.setAccelerator(KeyCombination.valueOf("ctrl+k"));
        MenuItem item1 = new MenuItem("item1");
        MenuItem item2 = new MenuItem("item2");
        SplitMenuButton split = new SplitMenuButton();
        ImageView imageView=new ImageView("favicon.png");
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        MenuItem item3 = new MenuItem("item3",imageView);
        menu.getItems().addAll(item, item1, item2, item3);


        an.getChildren().addAll(menuBar);


        Scene scene = new Scene(an);

        //快捷键,放在setOnMouseClicked事件前面
        KeyCombination kc = KeyCombination.valueOf("ctrl+k");
        Mnemonic mnemonic = new Mnemonic(an, kc);
        scene.addMnemonic(mnemonic);

        an.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("mouseEvent = " + mouseEvent);
            }
        });


        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();

        menuBar.setPrefWidth(stage.getWidth());
        //菜单栏宽度与主窗口宽度一致
        an.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                menuBar.setPrefWidth(t1.doubleValue());
            }
        });

        //一级菜单item事件
        item.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("actionEvent = " + actionEvent);
            }
        });

        //展开时事件

        menu.setOnShown(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                System.out.println("event = " + event);
            }
        });



    }
}
