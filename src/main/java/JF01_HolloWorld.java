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
        //窗口模态(焦点聚焦新开的窗口,是否能切换其他窗口)
/*        Stage stage1=new Stage();
        stage1.setWidth(300);
        stage1.setHeight(300);
        stage1.initStyle(StageStyle.UTILITY);
        stage1.show();*/

        //置顶
        stage.setAlwaysOnTop(true);
        //标题
        stage.setTitle("这是JavaFX窗口");
        //图标
        stage.getIcons().add(new Image("favicon.png"));
        //透明度
        stage.setOpacity(0.8);
        //窗口位置,监听位置变化
        stage.setX(100);
        stage.setY(100);
        stage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("当前窗口X位置:->"+stage.getX());
            }
        });
/*
        //最小化
        stage.setIconified(true);
        //最大化
        stage.setMaximized(true);
        //窗口可变化大小
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


        //监听高度变化
        stage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("当前高度:->"+stage.getHeight());
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
