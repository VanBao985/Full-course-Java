import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int boardWidth = 700;
        int boardHeight = 640;
        JFrame frame = new JFrame("Flappy Bird");
//        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        frame.requestFocus();
        frame.setVisible(true);
    }
}