import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUIMain extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        GUIMain frame = new GUIMain();
        frame.setVisible(true);
    }

    public GUIMain() {
        setTitle("PORTFOLIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 487);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnAboutMe = new JButton("ABOUT ME");
        btnAboutMe.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnAboutMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutMe aboutMe = new AboutMe();
            }
        });
        btnAboutMe.setBounds(10, 369, 119, 40);
        contentPane.add(btnAboutMe);

        JLabel lblNewLabel = new JLabel("MY PORTFOLIO");
        lblNewLabel.setBounds(157, 11, 112, 19);
        lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        contentPane.add(lblNewLabel);

        JButton btnAchievements = new JButton("ACHIEVEMENTS");
        btnAchievements.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnAchievements.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Achievements achievements = new Achievements();
                achievements.setVisible(true);
                dispose();
            }
        });
        btnAchievements.setBounds(150, 369, 119, 40);
        contentPane.add(btnAchievements);

        JButton btnHobbies = new JButton("HOBBIES");
        btnHobbies.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnHobbies.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Hobbies hobbies = new Hobbies();
            }
        });
        btnHobbies.setBounds(292, 369, 119, 40);
        contentPane.add(btnHobbies);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\xxyynetworks\\Downloads\\bg.png"));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(61, 62, 299, 271);
        contentPane.add(lblNewLabel_1);
    }
}

class AboutMe extends JFrame {
    private JPanel contentPane;

    public AboutMe() {
        setTitle("ABOUT ME");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 487);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("About Me");
        lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblNewLabel.setBounds(187, 11, 74, 19);
        contentPane.add(lblNewLabel);

        JButton btnClose = new JButton("Close");
        btnClose.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutMe.this.dispose();
            }
        });
        btnClose.setBounds(175, 201, 89, 40);
        contentPane.add(btnClose);

        setVisible(true);
    }
}

