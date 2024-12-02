import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Shark extends Actor
{
    private int moveDelay = 0;
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
    }

    public void move()
    {
        /*Actor shark = this;
        if (shark.isAtEdge()){
        World world = getWorld();
        world.removeObject(shark);
    }*/
        if (moveDelay == 0){
            move (-10);
        int moveDirection = Greenfoot.getRandomNumber(2);
        if(moveDirection == 0){
            setLocation(getX(), getY() - 5);
        } else {
            setLocation(getX(), getY() + 5);
        }
        moveDelay = 10;
    } else {
        moveDelay--;
    }
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
}
