import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Seaweed extends Actor
{

    /**
     * Act - do whatever the Seaweed wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
    }

    /**
     * 
     */
    public void move()
    {
        setLocation(getX() - 1, getY());
        if (getX() == 0) {
            setLocation(600, getY());
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor fish = getOneIntersectingObject(GoldF.class);
        if (fish != null) {
            World world = getWorld();
            world.removeObject(fish);
            /* Greenfoot.playSound("gameOverArcade.mp3");*/
        }
    }
}
