import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JF02_PlatForm extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start�߳�����->"+ Thread.currentThread().getName());
        stage.setTitle("paltform��ʹ��");
//        stage.show();
        Platform.runLater(() -> {
            //��start����JavaFX Application Thread,��runlater��������߳�, �Ǹ�����
            System.out.println("runLater�߳�����->"+Thread.currentThread().getName());
            System.out.println("runLater");
        });

        Thread.sleep(3000);
        System.out.println("�������");
    }
}
