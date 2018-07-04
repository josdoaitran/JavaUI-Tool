import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UI extends JFrame{
    private JLabel testCase;
    public static JLabel result;
    public JButton runButton;
    private JTextField comment;
    private JLabel  imageLable;
    private ImageIcon auvenirIcon;
    public static String sDirPath = System.getProperty("user.dir");

    public UI(){
        setLayout(new FlowLayout());
        testCase = new JLabel("TestCase");
        add(testCase);
        comment = new JTextField(15);
        add(comment);

        result = new JLabel();
        add(result);

        auvenirIcon =  new ImageIcon("src/Resource/Auvenir.jpg");
        imageLable = new JLabel(auvenirIcon);
        add(imageLable);

        runButton = new JButton("Run");
        add(runButton);

        Events.Event e = new Events.Event();
        runButton.addActionListener((ActionListener) e);
    }


}
