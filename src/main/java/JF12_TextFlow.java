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

        Text text = new Text("文本11111111111111111111111111111\n");
        text.setFont(Font.font("楷体",30));
        text.setFill(Paint.valueOf("#FFB6C1"));
        //字体界限
        text.setBoundsType(TextBoundsType.VISUAL);
        //对齐方式
        text.setTextAlignment(TextAlignment.CENTER);
        //鼠标样式
        text.setCursor(Cursor.HAND);
        //下划线
        text.setUnderline(true);
        //文本位置
        text.setTextOrigin(VPos.BOTTOM);
        //包围文字宽度
        text.setWrappingWidth(20);
        //上下间距
        text.setLineSpacing(20);
        Text text2 = new Text("文本222222222222222222222222");

        //自动换行
        TextFlow textFlow = new TextFlow(text,text2);
        Scene scene = new Scene(textFlow);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();
    }
}
