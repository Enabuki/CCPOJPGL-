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

public class AddItems extends JFrame {
    private JPanel contentPane;
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
    private JLabel lblBg;

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

    public AddItems() {
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

        lblDisplayImage = new JLabel("");
        lblDisplayImage.setBounds(277, 181, 306, 399);
        contentPane.add(lblDisplayImage);

        textField_ItemName = new JTextField();
        textField_ItemName.setBounds(640, 239, 263, 46);
        textField_ItemName.setBorder(null);
        contentPane.add(textField_ItemName);
        textField_ItemName.setColumns(10);

        textField_ItemStatus = new JTextField();
        textField_ItemStatus.setColumns(10);
        textField_ItemStatus.setBounds(642, 358, 263, 46);
        textField_ItemStatus.setBorder(null);
        contentPane.add(textField_ItemStatus);

        textField_ItemDate = new JTextField();
        textField_ItemDate.setColumns(10);
        textField_ItemDate.setBounds(642, 480, 263, 46);
        textField_ItemDate.setBorder(null);
        contentPane.add(textField_ItemDate);

        textField_ItemDescription = new JTextField();
        textField_ItemDescription.setColumns(10);
        textField_ItemDescription.setBounds(937, 239, 263, 46);
        textField_ItemDescription.setBorder(null);
        contentPane.add(textField_ItemDescription);

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
        lblToolsTab.setBounds(25, 245, 119, 42);
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
        lblLogoutTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    AdminLogin adminLogin = new AdminLogin();
                    adminLogin.setVisible(true);
                    dispose();
                    // Clear the displayed image and text fields
                    lblDisplayImage.setIcon(null);
                    textField_ItemName.setText("");
                    textField_ItemStatus.setText("");
                    textField_ItemDate.setText("");
                    textField_ItemDescription.setText("");
                } else {
                    // Do nothing and stay in the program
                }
            }
        });

        lblInsertImage = new JLabel("");
        lblInsertImage.setBounds(332, 623, 198, 51);
        contentPane.add(lblInsertImage);
        lblInsertImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        Image img = ImageIO.read(selectedFile);
                        Image scaledImg = img.getScaledInstance(lblDisplayImage.getWidth(),
                                lblDisplayImage.getHeight(), Image.SCALE_SMOOTH);
                        lblDisplayImage.setIcon(new ImageIcon(scaledImg));
                        lblDisplayImage.setBounds(275, 180, 300, 399);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        lblSave = new JLabel("");
        lblSave.setBounds(993, 623, 207, 46);
        contentPane.add(lblSave);
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String itemName = textField_ItemName.getText();
                String itemStatus = textField_ItemStatus.getText();
                String itemDate = textField_ItemDate.getText();
                String itemDescription = textField_ItemDescription.getText();

                if (!itemName.isEmpty() && !itemStatus.isEmpty() && !itemDate.isEmpty() && !itemDescription.isEmpty() && lblDisplayImage.getIcon() != null) {
                    int choice = JOptionPane.showConfirmDialog(null, "Do you want to save this information?", "Save",
                            JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        // Create a panel to display the information and image
                        JPanel panel = new JPanel();
                        panel.setLayout(null);
                        panel.setPreferredSize(new Dimension(600, 200));

                        JLabel imageLabel = new JLabel();
                        imageLabel.setBounds(10, 10, lblDisplayImage.getWidth(), lblDisplayImage.getHeight());
                        imageLabel.setIcon(lblDisplayImage.getIcon());
                        panel.add(imageLabel);

                        JLabel nameLabel = new JLabel("Item Name: " + itemName);
                        nameLabel.setBounds(150, 10, 300, 20);
                        panel.add(nameLabel);

                        JLabel statusLabel = new JLabel("Item Status: " + itemStatus);
                        statusLabel.setBounds(150, 40, 300, 20);
                        panel.add(statusLabel);

                        JLabel dateLabel = new JLabel("Item Date: " + itemDate);
                        dateLabel.setBounds(150, 70, 300, 20);
                        panel.add(dateLabel);

                        JLabel descriptionLabel = new JLabel("Item Description: " + itemDescription);
                        descriptionLabel.setBounds(150, 100, 300, 20);
                        panel.add(descriptionLabel);

                        // Add the panel to your desired layout
                        // For example, if you have a container called 'container', you can add the panel as follows:
                        // container.add(panel);

                        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        
                        // Clear the displayed image and text fields
                        lblDisplayImage.setIcon(null);
                        textField_ItemName.setText("");
                        textField_ItemStatus.setText("");
                        textField_ItemDate.setText("");
                        textField_ItemDescription.setText("");
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter all information!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        lblBg = new JLabel("");
        lblBg.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\AddItemsGUI.png"));
        lblBg.setBounds(0, 0, 1280, 790);
        contentPane.add(lblBg);
    }
}
