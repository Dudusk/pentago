import javax.swing.*;
import java.awt.*;


public class AccueilJFrame extends JFrame {
    private Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private int height = (int)dimension.getHeight();
    private int width  = (int)dimension.getWidth();

    private JPanel container = new JPanel();
    
    private JButton buttonForgetPassword = new JButton("Mot De Passe Oublié");
    private JButton buttonSignUp = new JButton("S'inscrire");

    private JLabel labelUsername = new JLabel("Identifiant: ");
    private JTextField textFieldUsername = new JTextField(15);

    private JLabel labelPassword = new JLabel("Mot de passe: ");
    private JTextField textFieldPassword = new JPasswordField(15);

    public AccueilJFrame(){

        this.setTitle("jPentagoProject");
        this.setSize(width/2, height/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        buttonForgetPassword.setLocation(0,0);

        container.add(labelUsername);
        container.add(textFieldUsername);

        container.add(labelPassword);
        container.add(textFieldPassword);

        container.add(buttonForgetPassword);
        container.add(buttonSignUp);
        this.setContentPane(container);
        this.setVisible(true);
    }
}