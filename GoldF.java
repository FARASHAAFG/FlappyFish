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
    
    private int passedVlobsters = 0;

    /**
     * Act - do whatever the GoldF wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move();
        eatCoin();
        //checkVlobsters();
    }

    
    /**
     * 
     */
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
        }
    }
    
    private void checkVlobsters(){
        goalText = new GreenfootImage(passedVlobsters + "/5 vlobsters", 35, Color.BLACK, new Color(0,0,0,0));
        getWorld().getBackground().drawImage(goalText, 120, 6);
        
        List<Vlobster> vlobsters = getWorld().getObjects(Vlobster.class);
        for (Vlobster vlobster : vlobsters) {
            if (vlobster.getX() <= 0) { 
                passedVlobsters++;
                getWorld().removeObject(vlobster);
            }
        }
        
        goalText = new GreenfootImage(passedVlobsters + "/5 vlobsters", 35, Color.BLACK, new Color(0,0,0,0));
        getWorld().getBackground().drawImage(goalText, 120, 6);
        
        if (!goalAchieved && passedVlobsters >=5){
            goalAchieved = true;
        }
    }

}
