import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private String phoneNum;
    private Boolean legalPhoneNum = false;
    private ImageIcon imageIcon;

    public MainPanel(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        opening();
        this.imageIcon = new ImageIcon("superMerket.png");
        this.add(new JLabel(imageIcon));

//        this.add(new Main());
    }

    public void opening() {
        JLabel welcome = new JLabel("Welcome to the online shopping website");
        welcome.setBounds(Final.WELECOME_X, Final.Y, Final.WELECOME_HEIGHT, Final.HEIGHT_OF_JLABEL);
        welcome.setFont(new Font("Serif", Font.BOLD, 20));
        welcome.setForeground(Color.BLUE);
        this.add(welcome);

        JLabel welcome2 = new JLabel("Please login to continue");
        welcome2.setBounds(Final.WELECOME_X, Final.WELECOME2_Y, Final.WELECOME2_HEIGHT, Final.HEIGHT_OF_JLABEL);
        welcome2.setFont(new Font("Serif", Font.BOLD, 20));
        welcome2.setForeground(Color.BLUE);
        this.add(welcome2);

        JTextField phoneNum = new JTextField("Type phone number and press Enter");
        phoneNum.setBounds(Final.PHONE_NUM_X, Final.PHONE_NUM_Y, Final.PHONE_NUM_WIDTH, Final.PHONE_NUM_HEIGHT);
        this.add(phoneNum);
        phoneNum.addActionListener(e -> {
            this.phoneNum = phoneNum.getText();
            this.legalPhoneNum = checkPhoneNum(this.phoneNum);
            System.out.println(this.phoneNum);
        });

        JButton login = new JButton("Login");
        login.setBounds(Final.PHONE_NUM_X + Final.PHONE_NUM_WIDTH + 10, Final.PHONE_NUM_Y, Final.PHONE_NUM_WIDTH / 2, Final.PHONE_NUM_HEIGHT);
        this.add(login);
        login.addActionListener(e -> {
            standbyFunction(this.legalPhoneNum);
            //do something
        });

    }

    public boolean checkPhoneNum(String phoneNum) {
        if (phoneNum.length() != 10) {
            return false;
        }
        for (int i = 0; i < phoneNum.length(); i++) {
            if (phoneNum.charAt(i) < '0' || phoneNum.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public void standbyFunction(Boolean legalPhoneNum) {
        if (!legalPhoneNum) {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
        }
    }
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.imageIcon.paintIcon(this, graphics, 0, 0);
    }

}





