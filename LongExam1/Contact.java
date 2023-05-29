import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Contact extends JFrame {
    private JPanel contentPane;
    private JLabel lblPortfolio;
    private JLabel lblHome;
    private JLabel lblAboutMe;
    private JLabel lblSkills;
    private JLabel lblContact;

    public Contact() {
        setTitle("PORTFOLIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblPortfolio = new JLabel("PORTFOLIO");
        lblPortfolio.setBounds(78, 47, 178, 30);
        lblPortfolio.setForeground(Color.WHITE);
        lblPortfolio.setHorizontalAlignment(SwingConstants.CENTER);
        lblPortfolio.setFont(new Font("Maiandra GD", Font.PLAIN, 24));
        contentPane.add(lblPortfolio);

        // Retrieve screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        lblHome = new JLabel("HOME");
        lblHome.setForeground(new Color(255, 255, 255));
        lblHome.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblHome.setBounds(955, 45, 107, 50);
        contentPane.add(lblHome);
        lblHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Code to navigate to the Home page (Home.java)
                dispose(); // Close the current frame
                Home home = new Home(); // Create an instance of the Home class
                home.setVisible(true); // Display the Home frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblHome.setFont(new Font("Maiandra GD", Font.BOLD, 15));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblHome.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
            }
        });

        lblAboutMe = new JLabel("ABOUT ME");
        lblAboutMe.setForeground(new Color(255, 255, 255));
        lblAboutMe.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblAboutMe.setBounds(1080, 45, 107, 50);
        contentPane.add(lblAboutMe);
        lblAboutMe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AboutMe aboutme = new AboutMe();
                aboutme.setVisible(true);
                dispose(); // Close the current Home frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblAboutMe.setFont(new Font("Maiandra GD", Font.BOLD, 15));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblAboutMe.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
            }
        });

        lblSkills = new JLabel("SKILLS");
        lblSkills.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblSkills.setForeground(new Color(255, 255, 255));
        lblSkills.setBounds(1230, 45, 120, 50);
        contentPane.add(lblSkills);
        lblSkills.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Skills skills = new Skills();
                skills.setVisible(true);
                dispose(); // Close the current Home frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSkills.setFont(new Font("Maiandra GD", Font.BOLD, 15));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSkills.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
            }
        });

        lblContact = new JLabel("CONTACT");
        lblContact.setForeground(new Color(255, 255, 255));
        lblContact.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblContact.setBounds(1350, 45, 107, 50);
        contentPane.add(lblContact);
        lblContact.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Code to navigate to the Home page (Home.java)
                dispose(); // Close the current frame
                Contact contact = new Contact(); // Create an instance of the Home class
                contact.setVisible(true); // Display the Home frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblContact.setFont(new Font("Maiandra GD", Font.BOLD, 15));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblContact.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
            }
        });
    }
}
