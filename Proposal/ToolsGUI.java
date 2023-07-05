import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ToolsGUI extends JFrame {
    private JPanel contentPane;
    private JLabel lblBgImg;
    private JLabel lblMAGLogo;
    private JLabel lblHomeTab;
    private JLabel lblToolsTab;
    private JLabel lblReportsTab;
    private JLabel lblLogoutTab;
    private JFrame previousWindow;
    private JLabel lblAddItembtn;
    private JLabel lblRemoveItem;
    private JLabel lblItemTracker;
    private JLabel lblBg;
    private JLabel lblBackground;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	ToolsGUI frame = new ToolsGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ToolsGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = 1280;
        int frameHeight = 800;
        setBounds((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2, frameWidth, frameHeight);

        lblMAGLogo = new JLabel("");
        lblMAGLogo.setBounds(25, 37, 148, 64);
        contentPane.add(lblMAGLogo);
        lblMAGLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();
            }
        });

        lblHomeTab = new JLabel("");
        lblHomeTab.setBounds(25, 194, 112, 41);
        contentPane.add(lblHomeTab);
        lblHomeTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();
            }
        });

        lblToolsTab = new JLabel("");
        lblToolsTab.setBounds(25, 256, 119, 41);
        contentPane.add(lblToolsTab);
        lblToolsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolsGUI toolsPage = new ToolsGUI();
                toolsPage.setVisible(true);
                dispose();
            }
        });

        lblReportsTab = new JLabel("");
        lblReportsTab.setBounds(23, 310, 139, 46);
        contentPane.add(lblReportsTab);
        lblReportsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LossAndDamageList lossAndDamageList = new LossAndDamageList();
                lossAndDamageList.setVisible(true);
                dispose();
            }
        });

        lblLogoutTab = new JLabel("");
        lblLogoutTab.setBounds(25, 371, 127, 46);
        contentPane.add(lblLogoutTab);
        
        lblAddItembtn = new JLabel("");
        lblAddItembtn.setBounds(1003, 37, 67, 72);
        contentPane.add(lblAddItembtn);
        lblAddItembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItems addItems = new AddItems();
                addItems.setVisible(true);
                dispose();
            }
        });
        
        lblRemoveItem = new JLabel("");
        lblRemoveItem.setBounds(1083, 37, 67, 72);
        contentPane.add(lblRemoveItem);
        
        lblItemTracker = new JLabel("");
        lblItemTracker.setBounds(1165, 37, 55, 64);
        contentPane.add(lblItemTracker);
        
        lblBackground = new JLabel("");
        lblBackground.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\ToolsGUI.png"));
        lblBackground.setBounds(0, 0, 1280, 790);
        contentPane.add(lblBackground);

    
        lblLogoutTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    AdminLogin adminLogin = new AdminLogin();
                    adminLogin.setVisible(true);
                    dispose();
                } else {
                    // Do nothing and stay in the program
                }
            }
        });
    }
}
