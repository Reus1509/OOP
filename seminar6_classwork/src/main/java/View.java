import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class View {
    private Controller controller;
    private JLabel statusLabel;
    private JTextField inputField;

    public View(){
        createUI();
    }

    private void createUI(){
        statusLabel = new JLabel("Введите пароль: ");
        inputField = new JTextField(20);
        JButton loginButton = new JButton("LogIn");
        loginButton.addActionListener((ActionEvent e) -> {
            controller.login(inputField.getText());
        });

        Box topBox = Box.createHorizontalBox();
        topBox.add(statusLabel);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(inputField);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(loginButton);

        JFrame frame = new JFrame("Окно ввода пароля.");
        ((JPanel) frame.getContentPane()).setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topBox, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(333, 333);
    }

    public void setController(Controller p){
        controller = p;
    }

    public void updateStatusLabel(String text){
        statusLabel.setText(text);
    }

    public void hideInputField(){
        inputField.setVisible(false);
    }
}
