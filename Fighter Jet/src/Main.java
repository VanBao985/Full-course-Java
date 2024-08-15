import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int titleSize = 32;
        int columns = 16;
        int rows = 16;
        int boardHeight = titleSize * rows; //32*16
        int boardWidth = titleSize * columns; //32*16
        JFrame frame = new JFrame("Fighter Jet");
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FighterJet fighterJet = new FighterJet();
        frame.add(fighterJet);
        frame.requestFocus();
        frame.pack();
        frame.setVisible(true);
    }
}