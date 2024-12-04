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
        super(600, 450, 1); 
        startTime = System.currentTimeMillis(); 
    }

    public void act() {
        if (System.currentTimeMillis() - startTime >= 3600) {
            transitionToWorld(new StartScreen());
        }
    }
    
    public void transitionToWorld(World newWorld) {
        Greenfoot.setWorld(newWorld);
    }

}
    

