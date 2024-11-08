// WARNING: This file is auto-generated and any changes to it will be overwritten
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
    }

    /**
     * 
     */
    public void move()
    {
        setLocation(getX() - 1, getY());
        if (getX() == 0) {
        }
    }
}
