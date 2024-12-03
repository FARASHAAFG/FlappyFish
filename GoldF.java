import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GoldF extends Actor
{
    private int size;

    /**
     * Act - do whatever the GoldF wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move();
        

    }

    
    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up") && getY() > 140) {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
        }
    }
    
    
    public void setSize(int size) 
    {
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }

}
