import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class Hobbies extends JFrame {
    private JPanel contentPane;

    public Hobbies() {
        setTitle("HOBBIES");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 487);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(222, 184, 135));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHobbies = new JLabel("Hobbies");
        lblHobbies.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
        lblHobbies.setBounds(190, 11, 69, 19);
        contentPane.add(lblHobbies);

        JButton btnClose = new JButton("Close");
        btnClose.setFont(new Font("Maiandra GD", Font.PLAIN, 11));
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Hobbies.this.dispose();
            }
        });
        btnClose.setBounds(171, 367, 89, 40);
        contentPane.add(btnClose);

        setVisible(true);
    }
}
