// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GoldF extends Actor
{

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
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 1);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 1);
        }
    }
}
