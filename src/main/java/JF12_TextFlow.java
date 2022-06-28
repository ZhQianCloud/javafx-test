import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class JF12_TextFlow extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Text text = new Text("�ı�11111111111111111111111111111\n");
        text.setFont(Font.font("����",30));
        text.setFill(Paint.valueOf("#FFB6C1"));
        //�������
        text.setBoundsType(TextBoundsType.VISUAL);
        //���뷽ʽ
        text.setTextAlignment(TextAlignment.CENTER);
        //�����ʽ
        text.setCursor(Cursor.HAND);
        //�»���
        text.setUnderline(true);
        //�ı�λ��
        text.setTextOrigin(VPos.BOTTOM);
        //��Χ���ֿ��
        text.setWrappingWidth(20);
        //���¼��
        text.setLineSpacing(20);
        Text text2 = new Text("�ı�222222222222222222222222");

        //�Զ�����
        TextFlow textFlow = new TextFlow(text,text2);
        Scene scene = new Scene(textFlow);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
