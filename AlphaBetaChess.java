import javax.swing.*;

public class AlphaBetaChess {
    public static void main(String[] args) {
        // stuff    
        JFrame f = new JFrame("My Title Goes here");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserInterface ui = new UserInterface();
        f.add(ui);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}