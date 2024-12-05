import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Fisherman extends Actor
{
    private long time = System.currentTimeMillis();
    /**
     * Act - do whatever the Fisherman wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move();
        //remove();
    }
    
    public void move()
    {
        setLocation(getX()-1, getY());
    }
    public void remove(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
