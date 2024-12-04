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
        eatCoin();

    }

    
    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")&& getY() > 140) {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 3);
        }
    }
    
    
    public void setSize(int size) 
    {
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }
    public void eatCoin(){
        Actor coin = getOneIntersectingObject(Coin.class);
        if (coin != null) {
            World world = getWorld();
            world.removeObject(coin);
            Greenfoot.playSound("completetask_0.mp3");
        }
    }

}
