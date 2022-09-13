import javax.swing.*;


public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.setTitle("the shop");
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(Final.WIDTH, Final.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false); // disable resize
        this.add(new MainPanel(Final.X, Final.Y, Final.WIDTH, Final.HEIGHT));
        this.setVisible(true);


    }


}