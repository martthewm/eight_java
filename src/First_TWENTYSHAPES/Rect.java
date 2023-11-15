package First_TWENTYSHAPES;

import java.awt.*;
import java.util.Random;

public class Rect extends Shape {

    public Rect() {
        Random rand = new Random();
        this.x = rand.nextInt(0,384);
        this.y = rand.nextInt(0,384);
        this.width = rand.nextInt(64,256);
        this.height = rand.nextInt(64,256);
        this.color = new Color(rand.nextInt(0,255),rand.nextInt(0,255),rand.nextInt(0,255)).brighter();

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
}
