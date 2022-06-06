import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JF02_PlatForm extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start线程名称->"+ Thread.currentThread().getName());
        stage.setTitle("paltform的使用");
//        stage.show();
        Platform.runLater(() -> {
            //与start都是JavaFX Application Thread,即runlater不是真的线程, 是个队列
            System.out.println("runLater线程名称->"+Thread.currentThread().getName());
            System.out.println("runLater");
        });

        Thread.sleep(3000);
        System.out.println("最后的输出");
    }
}
