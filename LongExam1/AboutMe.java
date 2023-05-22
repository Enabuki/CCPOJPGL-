import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class AboutMe extends JFrame {
    private JPanel contentPane;

    public AboutMe() {
        setTitle("ABOUT ME");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 487);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblAboutMe = new JLabel("About Me");
        lblAboutMe.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblAboutMe.setBounds(187, 11, 74, 19);
        contentPane.add(lblAboutMe);

        JButton btnClose = new JButton("Close");
        btnClose.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutMe.this.dispose();
            }
        });
        btnClose.setBounds(174, 377, 89, 40);
        contentPane.add(btnClose);

        setVisible(true);
    }
}
