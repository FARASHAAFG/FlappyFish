import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LevelCleared extends Actor
{

    /**
     * Act - do whatever the LevelCleared wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        coinText();
    }
    public GreenfootImage getBackground() {
        World world = getWorld(); // Get the world the actor is in
        if (world != null) {
            return world.getBackground(); // Return the background of the world
        }
        return null; // Return null if the actor is not in a world
    }
    public void coinText(){
        GreenfootImage background = getBackground();  // Get the world's background image

        Color yellow = new Color(66,227,255);
        getBackground().setColor(yellow);;  // Or any color that matches your world background
        background.fillRect(340, 10, 300, 50);  // Clear a rectangle area (adjust the coordinates and size as needed)

        // Set the new text style
        background.setColor(Color.BLACK);
        background.setFont(new Font(32));

        // Draw the new coin count text
        background.drawString(GoldF.getCoinsNum() + " coins collected", 350, 35);
    }
}
