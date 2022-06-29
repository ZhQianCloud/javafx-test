import javafx.application.Application;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JF15_ScheduledService extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color: #f59393");

        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("javafx");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.show();

        MyScheduledService my=new MyScheduledService();
        my.setDelay(Duration.millis(3000));
        my.setPeriod(Duration.millis(1000));

        my.start();
    }
}

class MyScheduledService extends ScheduledService<Integer> {

    int i=0;
    @Override
    protected Task<Integer> createTask() {
        Task<Integer> task =new Task<Integer>() {

            @Override
            protected Integer call() throws Exception {
                System.out.println("call->ThreadName:  "+Thread.currentThread().getName());
                return i++;
            }

            @Override
            protected void updateValue(Integer integer) { //integerÀ´×ÔcallµÄreturn
                System.out.println("updateValue->ThreadName:  "+Thread.currentThread().getName());
                System.out.println("integer = " + integer);
                if(integer>=5){
                    MyScheduledService.this.cancel();
                }
            }
        };
        return task;
    }
}