import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends UI {

    public static class runButtonEvent implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            runResult.setText("AAAAAAAA");
        }
    }
    public static class clearButtonEvent implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            clearResult.setText("BBBBBB");
        }
    }
}

