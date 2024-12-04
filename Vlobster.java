import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Vlobster extends Actor
{
    private long time = System.currentTimeMillis();
    private int speed = Greenfoot.getRandomNumber(3)+1;
    public Vlobster(){
        turn(Greenfoot.getRandomNumber(360));
    }
    /**
     * Act - do whatever the Vlobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        //remove();
    }
    public void move(){
        setLocation(getX() - speed, getY());
    }
    public void eat()
    {
        Actor fish = getOneIntersectingObject(GoldF.class);
        if (fish != null) {
            World world = getWorld();
            world.removeObject(fish);
            /* Greenfoot.playSound("gameOverArcade.mp3");*/
        }
    }
    /*public void remove(){
          if (isAtEdge()){
        getWorld().removeObject(this);
    }
    }*/
}

