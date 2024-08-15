import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {
    int boardWidth = 700;
    int boardHeight = 640;
    //images
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;
    //Bird
    int birdX = boardWidth/8;
    int birdY =(int) (boardHeight/1.8);
    int birdWidth = 37;
    int birdHeight = 26;
    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;
        Bird(Image img){
            this.img = img;
        }
    }
    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth = 64;   // scale 1/6
    int pipeHeight = 512;
    class Pipe{
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        boolean passed = false;
        Image img;
        Pipe(Image img){
            this.img = img;
        }
    }

    //game logics
    Bird bird;
    ArrayList<Pipe> pipes;
    Random random = new Random();
    int velocityY = -5;
    int velocityX = -4;
    int gravity = 1;
    boolean gameOver = false;
    double score = 0.0;
    Timer gameLoop;
    Timer placePipeTimer;
    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
//        setBackground(Color.MAGENTA);
        setFocusable(true);
        addKeyListener(this);
        // loads image
        backgroundImg = new ImageIcon(getClass().getResource("Image/flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("Image/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("Image/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("Image/bottompipe.png")).getImage();
        //Bird
        bird = new Bird(birdImg);

        //Starts game
        gameLoop = new Timer(1000/60, this);   // 60 frames per second
        //this: ActionPerformed: running on real-time
        gameLoop.start();
        //Pipes
        pipes = new ArrayList<Pipe>();
        placePipeTimer = new Timer(1500, new ActionListener() {  //running
            @Override
            public void actionPerformed(ActionEvent e) {
                placePipe();
            }
        });
        placePipeTimer.start();
    }
    @Override
    public void paintComponent(Graphics g){   // from JPanel (inherit from JComponent)
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
        for (Pipe p: pipes){
            g.drawImage(p.img, p.x, p.y, p.width, p.height, null);
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font("Comic Sans MC", Font.CENTER_BASELINE, 40));
        if(gameOver){
            g.setColor(Color.RED);
            g.drawString("Game over: "+ String.valueOf((int)score), (int) (boardWidth/3.3), (int)(boardHeight/2));
            g.setColor(Color.WHITE);
            g.setFont(new Font("Comic Sans MC", Font.CENTER_BASELINE, 25));
            g.drawString("PRESS ENTER TO PLAY AGAIN!", (int)(boardWidth/5),(int)(boardHeight/1.6));
        }
        else   g.drawString(String.valueOf((int)score),(int)(boardWidth/2),45);
    }
    @Override
    public void actionPerformed(ActionEvent e) {  // from ActionListener
        move();
        repaint();
        if (gameOver){
            gameLoop.stop();
            placePipeTimer.stop();
        }
    }
    public void move(){
        //bird
        velocityY+=gravity;
        bird.y+=velocityY;
        bird.y= Math.max(bird.y, 0);
        //pipes
        for(Pipe p: pipes){
            p.x+=velocityX;  //look like: bird go ahead, trust: pipe draw back :))
            if (collision(bird, p)){
                gameOver = true;
            }
            if (!p.passed && bird.x > p.x + p.width){
                p.passed = true;
                score += 0.5;
            }
        }
        if (bird.y > boardHeight){
            gameOver = true;
        }
    }
    public boolean collision(Bird b, Pipe p){
        return b.x < p.x + p.width && b.x + b.width > p.x
                && b.y < p.y + p.height && b.y + b.height > p.y;
    }
    public void placePipe(){
        //top Pipe
        int pipeTopY = (int) (pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2)); //
        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = pipeTopY;
        pipes.add(topPipe);
        int randomSpace = random.nextInt(80);
        int spaceBirdThrough = (int) (boardHeight/6.5) + randomSpace;
        //bottom Pipe
        int pipeBottomY = pipeTopY + pipeHeight + spaceBirdThrough;
        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = pipeBottomY;
        pipes.add(bottomPipe);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -10;
        }
        if (gameOver && e.getKeyCode() == KeyEvent.VK_ENTER){
            bird.y = birdY;
            velocityY = -5;
            pipes.clear();
            gameOver = false;
            score = 0.0;
            gameLoop.start();
            placePipeTimer.start();
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }

}
