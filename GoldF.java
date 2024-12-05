import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GoldF extends Actor
{
    private int size;
    
    private boolean goalAchieved = false;
    
    private GreenfootImage goalText;
    private GreenfootImage checkmark;
    
    static private int collectedCoins;

    public void act()
    {
        move();
        eatCoin();
    }
    static public int getCoinsNum(){
        return collectedCoins;
    }
    public void move()
    {
        if ((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))&& getY() > 140) {
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
            collectedCoins++;
        }
    }
}
