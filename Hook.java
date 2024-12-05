import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Hook extends Actor
{
    static int passedFisherman = 0;
    public void act()
    {
        updatePositionWithFisherman();
        catching();
    }

    public void updatePositionWithFisherman()
    {
        List<Fisherman> fishermen = getWorld().getObjects(Fisherman.class);
        if (!fishermen.isEmpty()) {
            Fisherman fisherman = fishermen.get(0);
            setLocation(fisherman.getX(), fisherman.getY() + 125);
            if (isAtEdge()) {
                // Reset hook
                setLocation(fisherman.getX(), fisherman.getY());
                passedFisherman++;
            }
        }
    }

    public void catching()
    {
        Actor fish = getOneIntersectingObject(GoldF.class);
        if (fish != null) {
            getWorld().removeObject(fish);
            World world = getWorld();
            world.removeObject(fish);
            transitionToWorld(new GameOver());
            // Greenfoot.playSound("gameOverArcade.mp3"); // Uncomment if sound is needed
        }
    }
    public void transitionToWorld(World newWorld) {
        Greenfoot.setWorld(newWorld);
    }
}
