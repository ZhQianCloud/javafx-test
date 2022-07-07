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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JF18_Menu extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane an=new AnchorPane();
        //���˵�
        MenuBar menuBar=new MenuBar();
        Menu menu = new Menu("menu");
        Menu menu1 = new Menu("menu1");
        Menu menu2 = new Menu("menu2");
        Menu menu3 = new Menu("menu3",new Button("button"));
        menuBar.getMenus().addAll(menu, menu1, menu2, menu3);

        //һ���˵�
        MenuItem item = new MenuItem("item");
        item.setAccelerator(KeyCombination.valueOf("ctrl+k"));
        MenuItem item1 = new MenuItem("item1");
        MenuItem item2 = new MenuItem("item2");
        SeparatorMenuItem separator=new SeparatorMenuItem();
        ImageView imageView=new ImageView("favicon.png");
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        MenuItem item3 = new MenuItem("item3",imageView);

        menu.getItems().addAll(item, item1, item2, separator,item3);


        //�˵�����ѡ
        ToggleGroup toggleGroup=new ToggleGroup();
        RadioMenuItem radioMenuItem = new RadioMenuItem("radioMenuItem");
        RadioMenuItem radioMenuItem2 = new RadioMenuItem("radioMenuItem2");
        RadioMenuItem radioMenuItem3 = new RadioMenuItem("radioMenuItem3");
        toggleGroup.getToggles().addAll(radioMenuItem, radioMenuItem2, radioMenuItem3);
        //Ĭ��ѡ��
        radioMenuItem3.setSelected(true);
        //��ӵ�ѡΪһ��, ������
//        radioMenuItem.setToggleGroup(toggleGroup);
//        radioMenuItem2.setToggleGroup(toggleGroup);
//        radioMenuItem3.setToggleGroup(toggleGroup);
        //�ж��Ƿ�ѡ��
        radioMenuItem3.isSelected();
        menu1.getItems().addAll(radioMenuItem, radioMenuItem2, radioMenuItem3);


        //�˵�����ѡ
        CheckMenuItem checkMenuItem=new CheckMenuItem("checkMenuItem");
        CheckMenuItem checkMenuItem2=new CheckMenuItem("checkMenuItem2");
        CheckMenuItem checkMenuItem3=new CheckMenuItem("checkMenuItem3");
        menu1.getItems().addAll(new SeparatorMenuItem(),checkMenuItem, checkMenuItem2, checkMenuItem3);
        //����
        checkMenuItem3.setDisable(true);
        //�����Ƿ�ɼ�
        checkMenuItem2.setVisible(false);



        //�Զ���˵���
        CustomMenuItem custItem = new CustomMenuItem();
        Button button = new Button("Button");
        custItem.setContent(button);

        CustomMenuItem custItem2 = new CustomMenuItem();
        ProgressBar bar = new ProgressBar(0.3);
        custItem2.setContent(bar);

        CustomMenuItem custItem3 = new CustomMenuItem();
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("HboxBotton"), new Button("HboxBotton2"));
        custItem3.setContent(hBox);

        menu2.getItems().addAll(custItem,custItem2,custItem3);




        //MenuButton
        MenuButton menuButton = new MenuButton("MenuButton");
        an.getChildren().addAll(menuButton);
        AnchorPane.setTopAnchor(menuButton,200.0);
        MenuItem item4 = new MenuItem("item4");
        MenuItem item5 = new MenuItem("item5");
        MenuItem item6 = new MenuItem("item6");
        menuButton.getItems().addAll(item4, item5, item6);
        //SplitMenuButton
        SplitMenuButton splitMenuButton=new SplitMenuButton();
        splitMenuButton.setText("SplitMenuButton");
        MenuItem item7 = new MenuItem("item7");
        MenuItem item8 = new MenuItem("item8");
        MenuItem item9 = new MenuItem("item9");
        splitMenuButton.getItems().addAll(item7, item8, item9);
        an.getChildren().addAll(splitMenuButton);
        AnchorPane.setBottomAnchor(splitMenuButton,20.0);


        //Ƕ��,�����˵�
        Menu menu22=new Menu("�����˵�");
        MenuItem item2_1=new MenuItem("item2_1");
        MenuItem item2_2=new MenuItem("item2_2");
        MenuItem item2_3=new MenuItem("item2_3");
        menu22.getItems().addAll(item2_1, item2_2, item2_3);
        menu.getItems().addAll(menu22);


        an.getChildren().addAll(menuBar);
        Scene scene = new Scene(an);

        //��ݼ�,����setOnMouseClicked�¼�ǰ��
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
        //�˵�������������ڿ��һ��
        an.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                menuBar.setPrefWidth(t1.doubleValue());
            }
        });

        //һ���˵�item�¼�
        item.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("actionEvent = " + actionEvent);
            }
        });

        //չ��ʱ�¼�
        menu.setOnShown(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                System.out.println("event = " + event);
            }
        });
        //�����¼�
        menu.setOnHidden(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                System.out.println("event = " + event);
            }
        });



    }
}
