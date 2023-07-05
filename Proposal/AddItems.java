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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AddItems extends JFrame {
    private JPanel contentPane;
    private JTextField hiddenTextField;
    private JTextField textField_ItemName;
    private JTextField textField_ItemStatus;
    private JTextField textField_ItemDate;
    private JTextField textField_ItemDescription;
    private JLabel lblDisplayImage;
    private JLabel lblBgImg;
    private JLabel lblMAGLogo;
    private JLabel lblHomeTab;
    private JLabel lblToolsTab;
    private JLabel lblReportsTab;
    private JLabel lblLogoutTab;
    private JLabel lblInsertImage;
    private JLabel lblSave;
    private JFrame previousWindow;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddItems frame = new AddItems();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AddItems() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Disable window resizing and maximizing
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblBgImg = new JLabel("");
        lblBgImg.setBounds(0, 0, 1280, 800);

        // Load and scale the background image
        try {
            Image bgImage = ImageIO.read(new File("D:\\Users\\63916\\Downloads\\AddItemsGUI.png"));
            Image scaledBgImage = bgImage.getScaledInstance(lblBgImg.getWidth(), lblBgImg.getHeight(),
                    Image.SCALE_SMOOTH);
            lblBgImg.setIcon(new ImageIcon(scaledBgImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        contentPane.add(lblBgImg);

        // Set the frame size to 1280 x 800
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = 1280;
        int frameHeight = 800;
        setBounds((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2, frameWidth, frameHeight);

        hiddenTextField = new JTextField();
        hiddenTextField.setBounds(642, 277, 261, 46);
        hiddenTextField.setVisible(false);
        contentPane.add(hiddenTextField);

        lblDisplayImage = new JLabel("");
        lblDisplayImage.setBounds(277, 181, 306, 399);
        contentPane.add(lblDisplayImage);

        textField_ItemName = new JTextField();
        textField_ItemName.setBounds(640, 239, 263, 46);
        textField_ItemName.setBorder(null); // Remove the border
        contentPane.add(textField_ItemName);
        textField_ItemName.setColumns(10);

        textField_ItemStatus = new JTextField();
        textField_ItemStatus.setColumns(10);
        textField_ItemStatus.setBounds(642, 358, 263, 46);
        textField_ItemStatus.setBorder(null); // Remove the border
        contentPane.add(textField_ItemStatus);

        textField_ItemDate = new JTextField();
        textField_ItemDate.setColumns(10);
        textField_ItemDate.setBounds(642, 480, 263, 46);
        textField_ItemDate.setBorder(null); // Remove the border
        contentPane.add(textField_ItemDate);

        textField_ItemDescription = new JTextField();
        textField_ItemDescription.setColumns(10);
        textField_ItemDescription.setBounds(937, 239, 263, 46);
        textField_ItemDescription.setBorder(null); // Remove the border
        contentPane.add(textField_ItemDescription);

        lblMAGLogo = new JLabel("");
        lblMAGLogo.setBounds(25, 37, 148, 64);
        contentPane.add(lblMAGLogo);
        lblMAGLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Navigate to HomePage.java when lblMAGLogo is clicked
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
                // Navigate to HomePage.java when lblHomeTab is clicked
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
                // Navigate to Items.java when lblItemsTab is clicked
                Items itemsPage = new Items();
                itemsPage.setVisible(true);
                dispose();
            }
        });

        lblReportsTab = new JLabel("");
        lblReportsTab.setBounds(23, 310, 139, 46);
        contentPane.add(lblReportsTab);

        lblLogoutTab = new JLabel("");
        lblLogoutTab.setBounds(23, 432, 127, 51);
        contentPane.add(lblLogoutTab);

        lblInsertImage = new JLabel("");
        lblInsertImage.setBounds(332, 623, 198, 51);
        contentPane.add(lblInsertImage);
        lblInsertImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Open a file chooser dialog to select an image file
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Display the selected image on lblDisplayImage
                    try {
                        Image img = ImageIO.read(selectedFile);
                        Image scaledImg = img.getScaledInstance(lblDisplayImage.getWidth(),
                                lblDisplayImage.getHeight(), Image.SCALE_SMOOTH);
                        lblDisplayImage.setIcon(new ImageIcon(scaledImg));
                        lblDisplayImage.setBounds(277, 181, 306, 399); // Set the specified dimensions
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        lblSave = new JLabel("");
        lblSave.setBounds(996, 628, 198, 46);
        contentPane.add(lblSave);
    }
}
