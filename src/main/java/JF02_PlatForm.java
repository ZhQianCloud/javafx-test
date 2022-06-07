import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JF02_PlatForm extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start线程名称->"+ Thread.currentThread().getName());
        stage.setTitle("paltform的使用");
        Platform.runLater(() -> {
            //与start都是JavaFX Application Thread,即runlater不是真的线程, 是个队列
            System.out.println("runLater线程名称->"+Thread.currentThread().getName());
            System.out.println("runLater");
        });

        //false:隐式退出, 窗口关闭,控制台不关闭
        Platform.setImplicitExit(false);
        //判断是否支持3D等
        Platform.isSupported(ConditionalFeature.SCENE3D);
        stage.show();
        Thread.sleep(3000);
        System.out.println("最后的输出");
        //主动结束应用
        Platform.exit();
    }
}
