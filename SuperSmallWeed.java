import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SuperSmallWeed extends Actor
{

    /**
     * Act - do whatever the SuperSmallWeed wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act()
    {
        move();
    }
    public void move()
    {
        setLocation(getX()-1,getY());
        if (getX() == 0) {
            setLocation(600, getY());
        }
    }
    }

