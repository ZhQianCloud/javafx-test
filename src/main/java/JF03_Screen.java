import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class JF03_Screen extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Screen screen=Screen.getPrimary();
        //��ȡ��Ļ��СmaxX=1920.0, maxY=1080.0
        Rectangle2D rec1=screen.getBounds();
        System.out.println("rec1 = " + rec1);
        System.out.println("rec1.getHeight = " + rec1.getHeight());
        //��ȡ�ɼ���Χ��Ļ��СmaxX=1920.0, maxY=1040.0, ��40Ϊ�ײ�״̬���߶�
        Rectangle2D rec2=screen.getVisualBounds();
        System.out.println("rec2 = " + rec2);
    }
}
