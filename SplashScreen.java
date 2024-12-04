import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World {
    private long startTime;
    private int transparency = 255;
    public SplashScreen() {
        super(600, 450, 1);  // Set the size of the world
        startTime = System.currentTimeMillis();  // Record the start time
    }

    public void act() {
        // Check if 3000 milliseconds (3 seconds) have passed
        if (System.currentTimeMillis() - startTime >= 3600) {
            transitionToWorld(new StartScreen());
        }
    }
    
    public void transitionToWorld(World newWorld) {
        Greenfoot.setWorld(newWorld);  // Transition to the new world
    }

}
    

