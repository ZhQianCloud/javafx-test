import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JF02_PlatForm extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start�߳�����->"+ Thread.currentThread().getName());
        stage.setTitle("paltform��ʹ��");
        Platform.runLater(() -> {
            //��start����JavaFX Application Thread,��runlater��������߳�, �Ǹ�����
            System.out.println("runLater�߳�����->"+Thread.currentThread().getName());
            System.out.println("runLater");
        });

        //false:��ʽ�˳�, ���ڹر�,����̨���ر�
        Platform.setImplicitExit(false);
        //�ж��Ƿ�֧��3D��
        Platform.isSupported(ConditionalFeature.SCENE3D);
        stage.show();
        Thread.sleep(3000);
        System.out.println("�������");
        //��������Ӧ��
        Platform.exit();
    }
}
