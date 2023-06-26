import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

    private JPanel contentPane;

    private JLabel lblPortfolio;
    private JLabel lblSentence2;
    private JLabel lblSentence4;
    private JLabel lblSentence5;
    private JLabel lblSentence6;
    private JLabel lblPicture1x1;
    private JLabel lblFbLogo;
    private JLabel lblIgLogo;
    private JLabel lblGhubLogo;
    private JLabel lblAboutMe;
    private JLabel lblSkills;
    private JLabel lblContact;
    private JLabel lblExit;

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

        JLabel lblSentence1 = new JLabel("Hi, I'm Andrei Aseron");
        lblSentence1.setFont(new Font("Maiandra GD", Font.BOLD, 40));
        lblSentence1.setBounds(103, 210, 503, 255);
        lblSentence1.setForeground(Color.WHITE);
        contentPane.add(lblSentence1);

        lblSentence2 = new JLabel("BSIT - Mobile and Web Application Student");
        lblSentence2.setFont(new Font("Maiandra GD", Font.BOLD, 25));
        lblSentence2.setForeground(new Color(213, 40, 40));
        lblSentence2.setBounds(103, 246, 831, 287);
        contentPane.add(lblSentence2);

        JLabel lblSentence3 = new JLabel("Welcome to my portfolio website! Through this Java GUI-powered platform,");
        lblSentence3.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        lblSentence3.setForeground(Color.WHITE);
        lblSentence3.setBounds(103, 250, 749, 385);
        contentPane.add(lblSentence3);

        lblSentence4 = new JLabel("I showcase my skills, projects, and achievements in a visually appealing and ");
        lblSentence4.setForeground(Color.WHITE);
        lblSentence4.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        lblSentence4.setBounds(103, 107, 919, 725);
        contentPane.add(lblSentence4);

        lblSentence5 = new JLabel("interactive manner, allowing visitors to explore my expertise and accomplishments ");
        lblSentence5.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        lblSentence5.setForeground(Color.WHITE);
        lblSentence5.setBounds(103, 107, 919, 787);
        contentPane.add(lblSentence5);

        lblSentence6 = new JLabel("in an engaging way.");
        lblSentence6.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        lblSentence6.setForeground(Color.WHITE);
        lblSentence6.setBounds(103, 119, 519, 820);
        contentPane.add(lblSentence6);

        lblPicture1x1 = new JLabel(); // Create the JLabel for the picture
        lblPicture1x1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPicture1x1.setForeground(Color.WHITE);
        lblPicture1x1.setBounds(970, 140, 500, 485); // Set the desired size of the image label
        contentPane.add(lblPicture1x1);

        // Load the image file
        ImageIcon imageIcon = new ImageIcon("D:\\Users\\63916\\Downloads\\nobg1x1.png");

        // Resize the image to fit the label size
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(lblPicture1x1.getWidth(), lblPicture1x1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Set the resized image as the icon for the label
        lblPicture1x1.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\nobg1x1.jpg"));

        lblFbLogo = new JLabel("");
        lblFbLogo.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\fb.jpg"));
        lblFbLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lblFbLogo.setForeground(Color.WHITE);
        lblFbLogo.setBounds(86, 105, 63, 1250);
        contentPane.add(lblFbLogo);
        lblFbLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                navigateToAccount("https://www.facebook.com/jefferson.aseron");
            }
        });

        lblIgLogo = new JLabel("");
        lblIgLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lblIgLogo.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\ig.jpg"));
        lblIgLogo.setBounds(130, 105, 119, 1250);
        contentPane.add(lblIgLogo);
        lblIgLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                navigateToAccount("https://www.instagram.com/jefferson_aseron/");
            }
        });

        lblGhubLogo = new JLabel("");
        lblGhubLogo.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\ghub.png"));
        lblGhubLogo.setBounds(240, 106, 50, 1250);
        contentPane.add(lblGhubLogo);
        lblGhubLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                navigateToAccount("https://github.com/Enabuki");
            }
        });

        JLabel lblHome = new JLabel("HOME");
        lblHome.setForeground(new Color(255, 255, 255));
        lblHome.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblHome.setBounds(835, 45, 107, 50);
        contentPane.add(lblHome);
        lblHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Code to navigate to the Home page (Home.class)
                System.out.println("Home clicked");
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

        lblSkills = new JLabel("SKILLS\r\n");
        lblSkills.setFont(new Font("Maiandra GD", Font.PLAIN, 16));
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
        lblContact.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Contact contact = new Contact();
                contact.setVisible(true);
                dispose(); // Close the current Home frame
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

    private void navigateToAccount(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
