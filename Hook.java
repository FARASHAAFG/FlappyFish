import lang.stride.*;
import java.util.*;
import greenfoot.*;
public class Hook extends Actor
{
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
                // Reset hook or remove fisherman as per game logic
                setLocation(fisherman.getX(), fisherman.getY()); // Example: Reset
            }
        }
    }

    public void catching()
    {
        Actor fish = getOneIntersectingObject(GoldF.class);
        if (fish != null) {
            getWorld().removeObject(fish);
            // Greenfoot.playSound("gameOverArcade.mp3"); // Uncomment if sound is needed
        }
    }
}
