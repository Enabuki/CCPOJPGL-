import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

    private JPanel contentPane;
    private JLabel lblHome;
    private JLabel lblAboutMe;
    private JLabel lblAchievements;
    private JLabel lblContact;
    private JLabel lblNewLabel;

    public static void main(String[] args) {
        Home frame = new Home();
        frame.setVisible(true);
    }

    public Home() {

        setTitle("PORTFOLIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel = new JLabel("PORTFOLIO");
        lblNewLabel.setBounds(26, 45, 178, 30);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 24));
        contentPane.add(lblNewLabel);

        lblHome = createLabel("HOME", 955, 45, 15, Home.class);
        lblAboutMe = createLabel("ABOUT ME", 1095, 45, 15, Home.class);
        lblAchievements = createLabel("ACHIEVEMENTS", 1235, 45, 15, Home.class);
        lblContact = createLabel("CONTACT", 1375, 45, 15, Home.class);

        // Retrieve screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(45, 201, 131, 77);
        lblNewLabel_2.setForeground(Color.WHITE);
        contentPane.add(lblNewLabel_2);
    }

    private JLabel createLabel(String text, int x, int y, int fontSize, Class<? extends Home> targetClass) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 119, 40);
        label.setFont(new Font("Maiandra GD", Font.PLAIN, fontSize));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Home frame = targetClass.getDeclaredConstructor().newInstance();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                underlineLabel(label);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ununderlineLabel(label);
            }
        });

        return label;
    }

    private void underlineLabel(JLabel label) {
        Font font = label.getFont();
        label.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
    }

    private void ununderlineLabel(JLabel label) {
        Font font = label.getFont();
        label.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
    }
}
