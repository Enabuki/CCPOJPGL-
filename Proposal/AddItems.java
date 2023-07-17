import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class AddItems extends JFrame {
    private JPanel contentPane;
    private JTextField textField_ItemName;
    private JTextField textField_ItemDescription;
    private JLabel lblDisplayImage;
    private JLabel lblBgImg;
    private JLabel lblMAGLogo;
    private JLabel lblHomeTab;
    private JLabel lblToolsTab;
    private JLabel lblReportsTab;
    private JLabel lblLogoutTab;
    private JLabel lblInsertImage;
    private JLabel lblClear;
    private JLabel lblSave;
    private String insertedImage;
    private JComboBox<String> comboBox_ItemStatus;
    private JComboBox<String> comboBox_Month;
    private JComboBox<String> comboBox_Day;
    private JComboBox<String> comboBox_Year;
    private JLabel lblDate;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddItems frame = new AddItems();
                    frame.setLocationRelativeTo(null);
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

        textField_ItemName = new JTextField("");
        textField_ItemName.setBounds(640, 239, 263, 46);
        textField_ItemName.setBorder(null);
        contentPane.add(textField_ItemName);
        textField_ItemName.setColumns(10);

        textField_ItemDescription = new JTextField("");
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
                    comboBox_ItemStatus.setSelectedIndex(0);
                    textField_ItemDescription.setText("");
                    comboBox_ItemStatus.setSelectedIndex(0);
                    lblDate.setText("");
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
                    insertedImage = fileChooser.getSelectedFile().getAbsolutePath();
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
        lblSave.setBounds(784, 623, 198, 46);
        contentPane.add(lblSave);
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String itemName = textField_ItemName.getText();
                String itemImage = getInsertedImagePath();
                String itemStatus = (String) comboBox_ItemStatus.getSelectedItem();
                String itemDate = lblDate.getText(); // Get the date from lblDate
                String itemDescription = textField_ItemDescription.getText();
                
                
                if (!itemName.isEmpty() && !itemDescription.isEmpty() && lblDisplayImage.getIcon() != null) {
                    int choice = JOptionPane.showConfirmDialog(null, "Do you want to save this information?", "Save",
                        JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        saveItem(itemName, itemImage, itemStatus, itemDate, itemDescription); // Save the date as well
                        JOptionPane.showMessageDialog(null, "Information Saved!", "Saved",
                            JOptionPane.INFORMATION_MESSAGE);
                        lblDisplayImage.setIcon(null);
                        textField_ItemName.setText("");
                        comboBox_ItemStatus.setSelectedIndex(0);
                        textField_ItemDescription.setText("");
                        comboBox_ItemStatus.setSelectedIndex(0);
                        lblDate.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter all information!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        lblClear = new JLabel("");
        lblClear.setBounds(996, 628, 204, 46);
        contentPane.add(lblClear);
        lblClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisplayImage.setIcon(null);
                textField_ItemName.setText("");         
                textField_ItemDescription.setText("");
                comboBox_ItemStatus.setSelectedIndex(0);
                lblDate.setText("");
            }
        });
        
        comboBox_ItemStatus = new JComboBox<>();
        comboBox_ItemStatus.setBounds(640, 359, 263, 51);
        comboBox_ItemStatus.addItem("AVAILABLE");
        comboBox_ItemStatus.addItem("NOT AVAILABLE");
        contentPane.add(comboBox_ItemStatus);
        
        comboBox_Month = new JComboBox<>(new String[]{
            "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"
        });
        
        comboBox_Day = new JComboBox<>(new String[]{
            "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31"
        });
        
        comboBox_Year = new JComboBox<>(new String[]{
            "2023", "2024", "2025", "2026"
        });
        
        JButton btnAddDate = new JButton("Add Date");
        btnAddDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel(new GridLayout(3, 2));
                panel.add(new JLabel("Month:"));
                panel.add(comboBox_Month);
                panel.add(new JLabel("Day:"));
                panel.add(comboBox_Day);
                panel.add(new JLabel("Year:"));
                panel.add(comboBox_Year);
                
                int result = JOptionPane.showConfirmDialog(null, panel, "Select Date", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String selectedMonth = (String) comboBox_Month.getSelectedItem();
                    String selectedDay = (String) comboBox_Day.getSelectedItem();
                    String selectedYear = (String) comboBox_Year.getSelectedItem();
                    String selectedDate = selectedMonth + " " + selectedDay + " " + selectedYear;
                    
                    int confirmResult = JOptionPane.showConfirmDialog(null, "Are you sure that the date is correct?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirmResult == JOptionPane.YES_OPTION) {
                        lblDate.setText(selectedDate);
                        JOptionPane.showMessageDialog(null, "Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        btnAddDate.setBounds(640, 559, 85, 21);
        contentPane.add(btnAddDate);
        
        lblDate = new JLabel("");
        lblDate.setBounds(640, 487, 263, 46);
        contentPane.add(lblDate);
        
        JLabel lblBg = new JLabel("");
        lblBg.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\AddItemsGUI.png"));
        lblBg.setBounds(0, 0, 1280, 800);
        contentPane.add(lblBg);
    }
    
    public void saveItem(String name, String image, String status, String date, String description) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\NITRO 5\\eclipse-workspace\\RentalSystem\\src\\Tools", true));
            writer.write(name + "|" + image + "|" + status + "|" + date + "|" + description);
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public String getInsertedImagePath() {
        return insertedImage;
    }
}

