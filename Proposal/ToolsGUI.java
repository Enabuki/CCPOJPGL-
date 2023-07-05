import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;


public class ToolsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

    /**
     * Create the frame.
     */
    public ToolsGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setLocationRelativeTo(null); // Set frame to center of screen
        setResizable(false); // Disable frame resizing

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        

        JLabel AdminPic = new JLabel("");
        AdminPic.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\ToolsGUI.png"));
        AdminPic.setBounds(0, 0, 1280, 770);
        contentPane.add(AdminPic);
        
        JPanel panel = new JPanel();
        panel.setBounds(285, 130, 927, 555);
        contentPane.add(panel);
        
        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane);
    }
}
