import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class text extends Actor
{

    /**
     * Act - do whatever the text wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updateText(" points");   
    }
    public void updateText(String text) {
        GreenfootImage image = new GreenfootImage(200, 50);
        image.setColor(Color.WHITE);  // Background color
        image.fill();  
        image.setColor(Color.BLACK);  
        image.setFont(new Font(24)); 
        image.drawString((GoldF.getCoinsNum() * 5) + " points", 440, 261);

        setImage(image);
    }
    public GreenfootImage getBackground() {
        World world = getWorld(); // Get the world the actor is in
        if (world != null) {
            return world.getBackground(); // Return the background of the world
        }
         return null;
    }
}
