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
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Contact extends JFrame {
    private JPanel contentPane;
    private JLabel lblPortfolio;
    private JLabel lblHome;
    private JLabel lblAboutMe;
    private JLabel lblSkills;
    private JLabel lblContact;
    private JLabel lblName;
    private JTextField textField;
    private JLabel lblEmail;
    private JTextField textField1;
    private JLabel lblMessage;
    private JTextField textField2;
    private JLabel lblEmailimg;
    private JLabel lblPhoneimg;
    private JLabel lblLinksimg;
    private JLabel lblAddressimg;
    private JLabel lblEmailText;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblLinksText;
    private JLabel lblNewLabel_2;
    private JLabel lblAddressText;
    private JLabel lblNewLabel_3;
    private JLabel lblExit;

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
        lblHome.setBounds(835, 45, 107, 50);
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
        lblAboutMe.setBounds(955, 45, 107, 50);
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
        lblSkills.setBounds(1100, 45, 120, 50);
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
        lblContact.setBounds(1200, 45, 107, 50);
        contentPane.add(lblContact);
        
        JLabel lblGetInTouch = new JLabel("Get in Touch");
        lblGetInTouch.setForeground(new Color(46, 139, 87));
        lblGetInTouch.setFont(new Font("Maiandra GD", Font.PLAIN, 55));
        lblGetInTouch.setBounds(166, 135, 384, 132);
        contentPane.add(lblGetInTouch);
        
        lblName = new JLabel("Enter name: ");
        lblName.setFont(new Font("Maiandra GD", Font.PLAIN, 22));
        lblName.setForeground(Color.WHITE);
        lblName.setBounds(166, 300, 159, 30);
        contentPane.add(lblName);
        
        textField = new JTextField();
        textField.setFont(new Font("Maiandra GD", Font.PLAIN, 17));
        textField.setBounds(166, 335, 400, 35);
        contentPane.add(textField);
        textField.setColumns(10);
        
        lblEmail = new JLabel("Enter email address:");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Maiandra GD", Font.PLAIN, 22));
        lblEmail.setBounds(166, 410, 200, 30);
        contentPane.add(lblEmail);
        
        textField1 = new JTextField();
        textField1.setFont(new Font("Maiandra GD", Font.PLAIN, 17));
        textField1.setForeground(Color.WHITE);
        textField1.setBounds(166, 445, 400, 35);
        contentPane.add(textField1);
        textField1.setColumns(10);
        
        lblMessage = new JLabel("Enter message:");
        lblMessage.setForeground(Color.WHITE);
        lblMessage.setFont(new Font("Maiandra GD", Font.PLAIN, 22));
        lblMessage.setBounds(166, 520, 159, 30);
        contentPane.add(lblMessage);
        
        textField2 = new JTextField();
        textField2.setFont(new Font("Maiandra GD", Font.PLAIN, 17));
        textField2.setForeground(Color.WHITE);
        textField2.setBounds(166, 555, 400, 150);
        contentPane.add(textField2);
        textField2.setColumns(10);
        
        lblEmailimg = new JLabel("New label");
        lblEmailimg.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\email.png"));
        lblEmailimg.setBounds(850, 320, 74, 75);
        contentPane.add(lblEmailimg);
        
        lblPhoneimg = new JLabel("New label");
        lblPhoneimg.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\phone.png"));
        lblPhoneimg.setBounds(850,410, 74, 75);
        contentPane.add(lblPhoneimg);
        
        lblLinksimg = new JLabel("New label");
        lblLinksimg.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\links.png"));
        lblLinksimg.setBounds(850,500, 74, 75);
        contentPane.add(lblLinksimg);
        
        lblAddressimg = new JLabel("New label");
        lblAddressimg.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\address.png"));
        lblAddressimg.setBounds(850,590, 74, 75);
        contentPane.add(lblAddressimg);
        
        lblEmailText = new JLabel("Email\r\n");
        lblEmailText.setForeground(Color.WHITE);
        lblEmailText.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblEmailText.setBounds(940, 335, 45, 13);
        contentPane.add(lblEmailText);
        
        lblNewLabel = new JLabel("aseronandrei14@gmail.com");
        lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(940, 355, 200, 20);
        contentPane.add(lblNewLabel);
        
        JLabel lblPhoneText = new JLabel("Phone");
        lblPhoneText.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblPhoneText.setForeground(Color.WHITE);
        lblPhoneText.setBounds(940, 425, 45, 13);
        contentPane.add(lblPhoneText);
        
        lblNewLabel_1 = new JLabel("+63 916 268 2657");
        lblNewLabel_1.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(940, 445, 200, 13);
        contentPane.add(lblNewLabel_1);
        
        lblLinksText = new JLabel("Social Media Links");
        lblLinksText.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblLinksText.setForeground(Color.WHITE);
        lblLinksText.setBounds(940, 515, 200, 13);
        contentPane.add(lblLinksText);
        
        lblNewLabel_2 = new JLabel("https://linktr.ee/andreiaseron");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(940, 535, 200, 20);
        contentPane.add(lblNewLabel_2);
        
        lblAddressText = new JLabel("Address");
        lblAddressText.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblAddressText.setForeground(Color.WHITE);
        lblAddressText.setBounds(940, 605, 100, 13);
        contentPane.add(lblAddressText);
        
        lblNewLabel_3 = new JLabel("Taguig City");
        lblNewLabel_3.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(940, 625, 100, 20);
        contentPane.add(lblNewLabel_3);
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
        
        
        lblExit = new JLabel("EXIT");
        lblExit.setForeground(new Color(255, 255, 255));
        lblExit.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblExit.setBounds(1350, 45, 107, 50);
        contentPane.add(lblExit);
        lblExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Code to navigate to the Home page (Home.class)
                System.out.println("Home clicked");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblExit.setFont(new Font("Maiandra GD", Font.BOLD, 15));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExit.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
            }
        });
        
    }
}
