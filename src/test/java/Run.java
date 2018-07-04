import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setSize(1200,600);
        ui.setVisible(true);
        ui.pack();
        ui.setTitle("UI Tool");
    }
}
