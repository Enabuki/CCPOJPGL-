import java.awt.EventQueue;
import java.awt.Image;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;


public class ToolsInformationFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JButton removeButton;

        /*

    Launch the application.
            */
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  ToolsInformationFrame frame = new ToolsInformationFrame(0);
                  frame.setVisible(true);} catch (Exception e) {
                  e.printStackTrace();}}});}

        /*

    Create the frame.*/
    public ToolsInformationFrame(int index) {
        
                
        ToolsInformationReader dataHolder = new ToolsInformationReader();
        ArrayList<Tools> itemsList = dataHolder.getItemsList();
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 475);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon icon = new ImageIcon(itemsList.get(index).getItemImage());
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(225, 299, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        JLabel lblNewLabel = new JLabel(scaledIcon);
        lblNewLabel.setBounds(38, 108, 225, 299);
        contentPane.add(lblNewLabel);

        textField = new JTextField(itemsList.get(index).getItemName());
        textField.setBounds(515, 73, 152, 29);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField(itemsList.get(index).getItemStatus());
        textField_1.setBounds(515, 138, 152, 29);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField(itemsList.get(index).getItemDateIssued());
        textField_2.setBounds(515, 208, 152, 29);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JTextArea textArea = new JTextArea(itemsList.get(index).getItemDescription());
        textArea.setBounds(288, 268, 409, 139);
        contentPane.add(textArea);
        
        removeButton = new JButton("REMOVED");
        removeButton.setBounds(20, 20, 100, 30);
        removeButton.setOpaque(false);
        removeButton.setContentAreaFilled(false);
        removeButton.setBorderPainted(false);
        removeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int choice = JOptionPane.showConfirmDialog(null, "Do you want to remove this item?", "Remove Item", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        removeItem(index);
                        dispose();
                        new ToolsGUI();
                    } else {
                        // Do nothing and stay in the program
                    }
                    
                        
                }
        });
        
        contentPane.add( removeButton);
        
        JLabel lblBg_1 = new JLabel("");
        lblBg_1.setBackground(Color.decode("#1c1c39"));
        lblBg_1.setBounds(0, 0, 750, 475);
        contentPane.add(lblBg_1);
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        
    }
    
    public void removeItem(int i){
        
        ToolsInformationReader dataHolder = new ToolsInformationReader();
        ArrayList<Tools> itemsList = dataHolder.getItemsList();
        ArrayList<String> searchElements = new ArrayList<>();

        searchElements.add(itemsList.get(i).getItemName());
        searchElements.add(itemsList.get(i).getItemImage());
        searchElements.add(itemsList.get(i).getItemDateIssued());
        searchElements.add(itemsList.get(i).getItemDescription());
        searchElements.add(itemsList.get(i).getItemStatus());
     

        try {
            List<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\NITRO 5\\eclipse-workspace\\RentalSystem\\src\\Tools"));
            String line;

            while ((line = reader.readLine()) != null) {
                boolean allElementsFound = true;

                for (String element : searchElements) {
                    if (!line.contains(element)) {
                        allElementsFound = false;
                        break;
                    }
                }

                if (!allElementsFound) {
                    lines.add(line);
                }
            }

            reader.close();

            // Write the updated lines back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\NITRO 5\\eclipse-workspace\\RentalSystem\\src\\Tools"));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();
            JOptionPane.showConfirmDialog(null, "Item Removed Successfully", "Removed Item", JOptionPane.PLAIN_MESSAGE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
