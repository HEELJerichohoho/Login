
package login.calcu;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login2 implements ActionListener {
JFrame myFrame;
JPanel myPanel;
JLabel lblUser, lblPassword;
JTextField txtUser;
JPasswordField psUser;
JButton btnSubmit, btnReset;
public void init() {
myFrame = new JFrame("Exercise 1");
myFrame.setSize(390, 170);
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setLocationRelativeTo(null);
myPanel = new JPanel();
myFrame.setContentPane(myPanel);
myPanel.setBackground(new Color(102, 205, 170));
myPanel.setLayout(null);
lblUser = new JLabel("User Name");
lblUser.setSize(150, 35);
lblUser.setFont(new Font("Arial", Font.ITALIC, 18));
lblUser.setForeground(new Color(44, 53, 57));
myPanel.add(lblUser);
lblUser.setLocation(5, 5);
txtUser = new JTextField();
txtUser.setSize(200, 35);
txtUser.setFont(new Font("Arial", Font.BOLD, 20));
txtUser.setBackground(new Color(240, 255, 240));
txtUser.setForeground(new Color(52, 124, 23));
txtUser.setHorizontalAlignment(SwingConstants.RIGHT);
myPanel.add(txtUser);
txtUser.setLocation(165, 5);
lblPassword = new JLabel("Password");
lblPassword.setSize(150, 35);
lblPassword.setFont(new Font("Arial", Font.ITALIC, 18));
lblPassword.setForeground(new Color(44, 53, 57));
myPanel.add(lblPassword);
lblPassword.setLocation(5, 45);
psUser = new JPasswordField();
psUser.setSize(200, 35);
psUser.setBackground(new Color(240, 255, 240));
psUser.setForeground(new Color(52, 124, 23));
psUser.setHorizontalAlignment(SwingConstants.RIGHT);
myPanel.add(psUser);
psUser.setLocation(165, 45);
btnSubmit = new JButton("Submit");
btnSubmit.setSize(150, 35);
btnSubmit.setBackground(new Color(8, 160, 75));
btnSubmit.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
btnSubmit.setForeground(new Color(3, 62, 62));
btnSubmit.addActionListener(this);
btnSubmit.setMnemonic('s');
myPanel.add(btnSubmit);
btnSubmit.setLocation(25, 85);
btnReset = new JButton("Reset");
btnReset.setSize(150, 35);
btnReset.setBackground(new Color(8, 160, 75));
btnReset.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
btnReset.setForeground(new Color(3, 62, 62));
btnReset.addActionListener(this);
btnReset.setMnemonic('r');
myPanel.add(btnReset);
btnReset.setLocation(200, 85);
myFrame.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnSubmit) {
String user = txtUser.getText().toString();
char[] pass = psUser.getPassword();
String pword = String.valueOf(pass);
if (user.equals("juan") && pword.equals("1234")) {
JOptionPane.showMessageDialog(null, "Login Success");
} else {
JOptionPane.showMessageDialog(null, "Invalid Username and Password");
}
} else if (e.getSource() == btnReset) {
txtUser.setText("");
psUser.setText("");
txtUser.requestFocus();
}
}
}