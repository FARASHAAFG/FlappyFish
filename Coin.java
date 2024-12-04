import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Coin extends Actor
{
    
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        remove();
    }
    
    public void move(){
        setLocation(getX()-1, getY());
    }
    
    public void remove(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
