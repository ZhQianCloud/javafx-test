import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class JF01_HolloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("JF01_HolloWorld.start");
        stage.show();
        //����ģ̬(����۽��¿��Ĵ���,�Ƿ����л���������)
/*        Stage stage1=new Stage();
        stage1.setWidth(300);
        stage1.setHeight(300);
        stage1.initStyle(StageStyle.UTILITY);
        stage1.show();*/

        //�ö�
        stage.setAlwaysOnTop(true);
        //����
        stage.setTitle("����JavaFX����");
        //ͼ��
        stage.getIcons().add(new Image("favicon.png"));
        //͸����
        stage.setOpacity(0.8);
        //����λ��,����λ�ñ仯
        stage.setX(100);
        stage.setY(100);
        stage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("��ǰ����Xλ��:->"+stage.getX());
            }
        });
/*
        //��С��
        stage.setIconified(true);
        //���
        stage.setMaximized(true);
        //���ڿɱ仯��С
        stage.setResizable(false);
 */
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setMaxWidth(1000);
        stage.setMaxHeight(800);
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        System.out.println("maxHeightProperty:"+stage.maxHeightProperty());
        System.out.println("minWidthProperty:"+stage.minWidthProperty());


        //�����߶ȱ仯
        stage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("��ǰ�߶�:->"+stage.getHeight());
            }
        });


    }




    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("JF01_HolloWorld.init");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("JF01_HolloWorld.stop");
    }


}
