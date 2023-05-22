  import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	
	class Achievements extends JFrame {
	    private JPanel contentPane;
	
	    public Achievements() {
	        setTitle("ACHIEVEMENTS");
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setBounds(100, 100, 450, 487);
	        contentPane = new JPanel();
	        contentPane.setBackground(new Color(222, 184, 135));
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	
	        JLabel lblAchievements = new JLabel("Achievements");
	        lblAchievements.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
	        lblAchievements.setBounds(167, 11, 109, 19);
	        contentPane.add(lblAchievements);
	
	        JButton btnClose = new JButton("Close");
	        btnClose.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
	        btnClose.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                GUIMain GUI = new GUIMain();
	                GUI.setVisible(true);
	                dispose();
	                
	            }
	        });
	        btnClose.setBounds(150, 369, 119, 40);
	        contentPane.add(btnClose);
	
	
	        setVisible(true);
	    }
	}
