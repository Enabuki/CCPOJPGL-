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
import javax.swing.ImageIcon;

public class AboutMe extends JFrame {
    private JPanel contentPane;
    private JLabel lblPortfolio;
    private JLabel lblHome;
    private JLabel lblAboutMe;
    private JLabel lblSkills;
    private JLabel lblContact;
    private JLabel lblPhoto1;
    private JLabel lblAboutText;
    private JLabel lblText1;
    private JLabel lblText2;
    private JLabel lblText3;
    private JLabel lblText4;
    private JLabel lblEducation;
    private JLabel lblText5;
    private JLabel lblText6;
    private JLabel lblText7;
    private JLabel lblText8;
    private JLabel lblText9;
    private JLabel lblText10;
    private JLabel lblText11;
    private JLabel lblText12;

    public AboutMe() {
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
                // Code to navigate to the Home page (Home.java)
                dispose(); // Close the current frame
                Skills skills = new Skills(); // Create an instance of the Home class
                skills.setVisible(true); // Display the Home frame
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
        
        lblPhoto1 = new JLabel("");
        lblPhoto1.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\fbpfp.png"));
        lblPhoto1.setBounds(100, 120, 600, 630);
        contentPane.add(lblPhoto1);
        
        lblAboutText = new JLabel("ABOUT ME\r\n");
        lblAboutText.setFont(new Font("Maiandra GD", Font.BOLD, 30));
        lblAboutText.setForeground(new Color(220, 20, 60));
        lblAboutText.setBounds(759, 108, 217, 155);
        contentPane.add(lblAboutText);
        
        lblText1 = new JLabel("Greetings! My name is Andrei Jefferson S. Aseron, and I am a driven and aspiring IT programmer student. ");
        lblText1.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText1.setForeground(new Color(255, 255, 255));
        lblText1.setBounds(759, 215, 817, 50);
        contentPane.add(lblText1);
        
        lblText2 = new JLabel(" I am deeply fascinated by the world of programming and constantly strive to enhance my skills and ");
        lblText2.setForeground(new Color(255, 255, 255));
        lblText2.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText2.setBounds(757, 245, 817, 50);
        contentPane.add(lblText2);
        
        lblText3 = new JLabel("knowledge in this dynamic field. With a passion for coding and a strong educational background, I am");
        lblText3.setForeground(new Color(255, 255, 255));
        lblText3.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText3.setBounds(761, 275, 817, 50);
        contentPane.add(lblText3);
        
        lblText4 = new JLabel("determined to carve a successful career path as a programmer.");
        lblText4.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText4.setForeground(new Color(255, 255, 255));
        lblText4.setBounds(761, 305, 817, 50);
        contentPane.add(lblText4);
        
        lblEducation = new JLabel("EDUCATION");
        lblEducation.setFont(new Font("Maiandra GD", Font.PLAIN, 30));
        lblEducation.setForeground(new Color(220, 20, 60));
        lblEducation.setBounds(759, 330, 217, 155);
        contentPane.add(lblEducation);
        
        lblText5 = new JLabel("Pasig Catholic College: I completed my high school education at PCC. During this time, I delved into");
        lblText5.setForeground(new Color(255, 255, 255));
        lblText5.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText5.setBounds(759, 425, 817, 50);
        contentPane.add(lblText5);
        
        lblText6 = new JLabel("various programming languages, such as css, html, and java. I've gained a solid foundation in");
        lblText6.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText6.setForeground(new Color(255, 255, 255));
        lblText6.setBounds(759, 455, 817, 50);
        contentPane.add(lblText6);
        
        lblText7 = new JLabel("logical thinking and problem-solving.");
        lblText7.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText7.setForeground(new Color(255, 255, 255));
        lblText7.setBounds(759, 485, 817, 50);
        contentPane.add(lblText7);
        
        lblText8 = new JLabel("National University - Manila: Currently, I am pursuing a degree in Information Technology with a focus");
        lblText8.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText8.setForeground(new Color(255, 255, 255));
        lblText8.setBounds(759, 555, 817, 50);
        contentPane.add(lblText8);
        
        lblText9 = new JLabel("on programming at National University. This program has provided me with an in-depth understanding");
        lblText9.setForeground(new Color(255, 255, 255));
        lblText9.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText9.setBounds(759, 585, 817, 50);
        contentPane.add(lblText9);
        
        lblText10 = new JLabel("of software development concepts, algorithms, data structures, and advanced programming languages.");
        lblText10.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText10.setForeground(new Color(255, 255, 255));
        lblText10.setBounds(759, 615, 817, 50);
        contentPane.add(lblText10);
        
        lblText11 = new JLabel("Through coursework and hands-on projects, I have refined my programming skills and developed a ");
        lblText11.setForeground(new Color(255, 255, 255));
        lblText11.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText11.setBounds(759, 645, 817, 50);
        contentPane.add(lblText11);
        
        lblText12 = new JLabel("strong analytical mindset.");
        lblText12.setForeground(new Color(255, 255, 255));
        lblText12.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
        lblText12.setBounds(759, 675, 817, 50);
        contentPane.add(lblText12);
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
