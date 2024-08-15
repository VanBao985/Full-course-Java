package shape_circle_square;
import java.awt.Graphics;
public interface Actable {
    void moveTo(Graphics g, int x, int y);
    void draw (Graphics g);
    void erase (Graphics g);
}
