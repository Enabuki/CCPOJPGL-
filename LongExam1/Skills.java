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

public class Skills extends JFrame {
    private JPanel contentPane;
    private JLabel lblPortfolio;
    private JLabel lblHome;
    private JLabel lblAboutMe;
    private JLabel lblSkills;
    private JLabel lblContact;
    private JLabel lblMySkills;
    private JLabel lblNewLabel_1;
    private JLabel lblPLangIMG;
    private JLabel lblDesignIMG;
    private JLabel lblSoftSkillsIMG;
    private JLabel lblText1;
    private JLabel lblText2;
    private JLabel lblText3;
    private JLabel lblText4;
    private JLabel lblText5;
    private JLabel lblText6;
    private JLabel lblExit;

    public Skills() {
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
        
        lblMySkills = new JLabel("My Skills");
        lblMySkills.setFont(new Font("Maiandra GD", Font.PLAIN, 40));
        lblMySkills.setForeground(new Color(220, 20, 60));
        lblMySkills.setBounds(700, 173, 223, 101);
        contentPane.add(lblMySkills);
        
        lblPLangIMG = new JLabel("");
        lblPLangIMG.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\ProgramingLanguage.png"));
        lblPLangIMG.setBounds(170, 160, 400, 400);
        contentPane.add(lblPLangIMG);
        
        lblDesignIMG = new JLabel("");
        lblDesignIMG.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\Design.png"));
        lblDesignIMG.setBounds(170, 290, 400, 400);
        contentPane.add(lblDesignIMG);
        
        lblSoftSkillsIMG = new JLabel("");
        lblSoftSkillsIMG.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\SoftSkills.png"));
        lblSoftSkillsIMG.setBounds(170, 460, 400, 400);
        contentPane.add(lblSoftSkillsIMG);
        
        lblText1 = new JLabel("Programming Languages\r\n");
        lblText1.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText1.setForeground(new Color(255, 255, 255));
        lblText1.setBounds(370, 310, 200, 30);
        contentPane.add(lblText1);
        
        lblText2 = new JLabel("Has a basic knowledge of Java and HTML/CSS");
        lblText2.setForeground(new Color(255, 255, 255));
        lblText2.setBackground(new Color(255, 255, 255));
        lblText2.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText2.setBounds(370, 350, 600, 30);
        contentPane.add(lblText2);
        
        lblText3 = new JLabel("Design + Development");
        lblText3.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText3.setForeground(new Color(255, 255, 255));
        lblText3.setBounds(370, 450, 600, 30);
        contentPane.add(lblText3);
        
        lblText4 = new JLabel("Knowledgable of responsive websites and designs by using Java and HTML");
        lblText4.setForeground(new Color(255, 255, 255));
        lblText4.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText4.setBounds(370, 490, 600, 30);
        contentPane.add(lblText4);
        
        lblText5 = new JLabel("Soft Skills");
        lblText5.setForeground(new Color(255, 255, 255));
        lblText5.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText5.setBounds(370, 490, 200, 300);
        contentPane.add(lblText5);
        
        lblText6 = new JLabel("I am driven by curiousity for learning. I also possess strong communication and problem solving skills.");
        lblText6.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
        lblText6.setForeground(new Color(255, 255, 255));
        lblText6.setBounds(370, 530, 1000, 300);
        contentPane.add(lblText6);
        
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
