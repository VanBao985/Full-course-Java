import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FighterJet extends JPanel implements ActionListener, KeyListener {
    class Block{
        int x;
        int y;
        int width;
        int height;
        Image img;
        boolean alive = true;  // used for alien
        boolean used = false;  // used for bullets
        boolean direct = false;  // determine right or left for alien
        Block(int x, int y, int width, int height, Image img){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
        }
    }
    //board
    int tileSize = 32;
    int rows = 18;
    int columns = 20;
    int boardWidth = tileSize * columns; // 32 * 16
    int boardHeight = tileSize * rows; // 32 * 16

    // ship
    int shipWidth = tileSize * 2;
    int shipHeight = tileSize;
    int shipX = tileSize * columns/2 - tileSize;
    int shipY = tileSize * rows - 2 * tileSize;
    int shipVelocityX = (int) (tileSize *1.3);
    int shipVelocityY = tileSize;
    Block ship;
    Image shipImg;
    Image alienImg;
    Image alienCyanImg;
    Image alienMagentaImg;
    Image alienYellowImg;
    ArrayList<Image> alienImgArray;

    //logic games
    Timer gameLoop;
    Timer placeAlien;
    Timer placeBullet;
    int score = 0;
    boolean gameOver = false;
    Random rd = new Random();

    //alien
    ArrayList<Block> alienArray;
    int alienWidth = tileSize * 2;
    int alienHeight = tileSize;
    int alienX;
    int alienY = 0;
    int alienCount = 1;
    int alienVelocityX = 1;
    int alienVelocityY = 2;

    //bullets
    ArrayList<Block> bulletArrays;
    int bulletWidth = tileSize/6;
    int bulletHeight = tileSize/2;
    int bulletVelocity = -6;
    FighterJet() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.GRAY);
        setFocusable(true);

        //load images
        shipImg = new ImageIcon(getClass().getResource("Images/ship.png")).getImage();
        alienImg = new ImageIcon(getClass().getResource("Images/alien.png")).getImage();
        alienCyanImg = new ImageIcon(getClass().getResource("Images/alien-cyan.png")).getImage();
        alienMagentaImg = new ImageIcon(getClass().getResource("Images/alien-magenta.png")).getImage();
        alienYellowImg = new ImageIcon(getClass().getResource("Images/alien-yellow.png")).getImage();

        alienImgArray = new ArrayList<Image>();
        alienImgArray.add(alienImg);
        alienImgArray.add(alienCyanImg);
        alienImgArray.add(alienMagentaImg);
        alienImgArray.add(alienYellowImg);

        //set up ship
        ship = new Block(shipX, shipY, shipWidth, shipHeight, shipImg);

        //logic games
        gameLoop = new Timer(1000/60, this);
        gameLoop.start();
        addKeyListener(this);

        //aliens
        alienArray = new ArrayList<Block>();
        placeAlien = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAlien();
            }
        });
        placeAlien.start();
        //bullets
        bulletArrays = new ArrayList<Block>();
        placeBullet = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createBullet();
            }
        });
        placeBullet.start();
    }
    public void createAlien(){
        for (int i = 0; i < alienCount; i++){
            int indexImgAlien = rd.nextInt(alienImgArray.size());
            alienX = rd.nextInt((tileSize*columns-tileSize));
            Block alien = new Block(alienX, alienY, alienWidth, alienHeight, alienImgArray.get(indexImgAlien));
            alien.direct = rd.nextBoolean();
            alienArray.add(alien);
        }
        if (alienCount <= 20) {
            alienCount++;
        }
    }
    int tmpBullet = 0; // used random triple Bullet
    public void createBullet(){
        Block bullet = new Block(ship.x + tileSize - 2, ship.y - tileSize/2, bulletWidth, bulletHeight, null);
        bulletArrays.add(bullet);
        tmpBullet++;
        if (tmpBullet > 20){
            tmpBullet = 0;
        }
        int randomBullet = rd.nextInt(101) + tmpBullet;
        if (randomBullet > 85 ){
            Block doubleBullet = new Block(ship.x + tileSize - 17, ship.y - tileSize/2, bulletWidth, bulletHeight, null);
            bulletArrays.add(doubleBullet);
        }
        if (randomBullet > 100){
            Block tripleBullet = new Block(ship.x + tileSize + 13, ship.y - tileSize/2, bulletWidth, bulletHeight, null);
            bulletArrays.add(tripleBullet);
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        //ship
        g.drawImage(ship.img, ship.x, ship.y, shipWidth, ship.height, null);
        //aliens
        for (Block alien: alienArray){
            if (alien.alive){
                g.drawImage(alien.img, alien.x, alien.y, alien.width, alien.height, null);
            }
        }
        //bullets
        g.setColor(Color.BLUE);
        for (Block bullet : bulletArrays){
            if (!bullet.used) {
                g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
            }
        }

        //score
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans MS", Font.ROMAN_BASELINE, 30));
        if (gameOver){
            g.drawString("Score: " + score, tileSize * columns/3 + 40, 40);
            g.drawString("Press SPACE to try again", tileSize * columns/4, 80);
        }
        g.drawString(String.valueOf(score), tileSize/2, (int)(tileSize * (rows - 0.5)));
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("15/07/2024_Bato", (int)(tileSize*(columns-3.55)), tileSize*rows - 4);
    }

    public void move(){
        //aliens
        for(Block alien: alienArray){
            if(!gameOver && alien.y > tileSize * rows){
                gameOver = true;
            }
            if (alien.alive){
                if (alien.x == (tileSize*columns-tileSize) || alien.x == -tileSize){
                    alien.direct = !alien.direct;
                }
                if (alien.direct) alien.x += alienVelocityX;
                else alien.x -= alienVelocityX;
                alien.y += alienVelocityY;
            }

        }
        //bullets
        for (Block bullet : bulletArrays){
            if (!bullet.used){
                bullet.y += bulletVelocity;
            }
            for (Block alien: alienArray){
                if (!bullet.used && alien.alive && detectCollision(bullet, alien)){
                    bullet.used = true;
                    alien.alive = false;
                    score += 10;
                }
            }
        }
        //clears bullet
        while (bulletArrays.size() > 0 && (bulletArrays.get(0).used || bulletArrays.get(0).y < 0 )){
            bulletArrays.remove(0);
        }
    }
    public boolean detectCollision(Block a, Block b){
        return a.x < b.x + b.width && a.x + a.width > b.x &&
                a.y < b.y + b.height && a.y + a.height > b.height;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        move();
        if (gameOver){
            gameLoop.stop();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()== KeyEvent.VK_LEFT && ship.x > tileSize/2){
            ship.x -= shipVelocityX;
        }
        if (e.getKeyCode()== KeyEvent.VK_RIGHT && ship.x < tileSize*(columns-2)){
            ship.x += shipVelocityX;
        }
        if (e.getKeyCode()== KeyEvent.VK_UP && ship.y > tileSize*rows/1.5){
            ship.y -= shipVelocityY;
        }
        if (e.getKeyCode()== KeyEvent.VK_DOWN && ship.y < tileSize*(rows-1)){
            ship.y += shipVelocityY;
        }
        if (gameOver && e.getKeyCode() == KeyEvent.VK_SPACE){
            alienArray.clear();
            bulletArrays.clear();
            gameOver = false;
            gameLoop.start();
            alienCount = 1;
            score = 0;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()== KeyEvent.VK_LEFT && ship.x > tileSize/2){
            ship.x -= shipVelocityX;
        }
        if (e.getKeyCode()== KeyEvent.VK_RIGHT && ship.x < tileSize*(columns-2)){
            ship.x += shipVelocityX;
        }
        if (e.getKeyCode()== KeyEvent.VK_UP && ship.y > tileSize*rows/1.5){
            ship.y -= shipVelocityY;
        }
        if (e.getKeyCode()== KeyEvent.VK_DOWN && ship.y < tileSize*(rows-1)){
            ship.y += shipVelocityY;
        }
    }
}