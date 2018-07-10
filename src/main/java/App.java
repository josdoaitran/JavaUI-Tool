import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton runButton;
    private JPanel mainPanel;
    private JButton button2;
    private JComboBox comboBox1;
    private JTree testSuiteTree;
    private JProgressBar progressBar1;
    private JTextField textField3;
    private JTextField textField1;

    public App() {
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"AAAAA");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1200,600);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setData(TestCaseTree data) {
    }

    public void getData(TestCaseTree data) {
    }

    public boolean isModified(TestCaseTree data) {
        return false;
    }
}
