import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UI extends JFrame{
    private JLabel testCase;
    public static JLabel runResult;
    public static JLabel clearResult;
    public JButton runButton;
    public JButton clearButton;
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

        runResult = new JLabel();
        add(runResult);

        clearResult = new JLabel();
        add(clearResult);

        auvenirIcon =  new ImageIcon("src/Resource/Auvenir.jpg");
        imageLable = new JLabel(auvenirIcon);
        add(imageLable);

        runButton = new JButton("Run");
        add(runButton);

        clearButton = new JButton("Clear");
        add(clearButton);

        Events.runButtonEvent eRun = new Events.runButtonEvent();
        runButton.addActionListener((ActionListener) eRun);

        Events.clearButtonEvent eClear = new Events.clearButtonEvent();
        clearButton.addActionListener((ActionListener) eClear);
    }


}
