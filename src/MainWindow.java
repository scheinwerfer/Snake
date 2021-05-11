import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {

        setTitle("SnakeGame");
        setSize(320,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500,200);
        add(new GameField());

        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }

}
