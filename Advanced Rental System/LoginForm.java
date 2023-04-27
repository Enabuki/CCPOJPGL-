import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

    private JFrame frame;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm window = new LoginForm();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(72, 50, 80, 14);
        panel.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(162, 47, 161, 20);
        panel.add(txtUsername);
        txtUsername.setColumns(10);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(72, 100, 80, 14);
        panel.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(162, 97, 161, 20);
        panel.add(txtPassword);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login details", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
                
                // clear the fields
                txtUsername.setText("");
                txtPassword.setText("");
            }
        });
        btnLogin.setBounds(162, 150, 89, 23);
        panel.add(btnLogin);
        
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // clear the fields
                txtUsername.setText("");
                txtPassword.setText("");
            }
        });
        btnClear.setBounds(254, 150, 89, 23);
        panel.add(btnClear);
        
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(162, 184, 181, 23);
        panel.add(btnExit);
    }
}
