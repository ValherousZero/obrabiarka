package itas.p4;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kaibr on 08.11.2016.
 */
public class PanelPolnoc extends JPanel {
    private JTextField userName;
    private JPasswordField pass;

    public PanelPolnoc() {
        inicjuj();
    }

    private void inicjuj() {
        add(new JLabel("Nazwa użytkownika: ", SwingConstants.CENTER));
        add(userName  = new JTextField(10));
        add(new JLabel("Hasło: ", SwingConstants.CENTER));
        add(pass = new JPasswordField(10));
    }

    public JTextField getUserName() {
        return userName;
    }

    public JPasswordField getPass() {
        return pass;
    }

    public void setUserName(JTextField userName) {
        this.userName = userName;
    }

    public void setPass(JPasswordField pass) {
        this.pass = pass;
    }
}
