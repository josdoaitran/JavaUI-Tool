import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends UI {

    public static class Event implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            result.setText("AAAAAAAA");
        }
    }
}
