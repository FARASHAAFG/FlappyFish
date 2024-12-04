import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOver extends World
{
    private long startTime;
    private int countdown; 
    public GameOver() {
        super(600, 450, 1);
        startTime = System.currentTimeMillis();
        countdown = 3; 
    }
    public void act() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        if (elapsedTime >= 5 && countdown > 0) {
           transitionToWorld(new StartScreen()); 
        }
    }
    public void transitionToWorld(World newWorld) {
        Greenfoot.setWorld(newWorld);
    }
}

