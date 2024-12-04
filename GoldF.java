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
    
    private int collectedCoins;

    public void act()
    {
        
        move();
        eatCoin();
        //coinText();
    }
    public GreenfootImage getBackground() {
        World world = getWorld(); // Get the world the actor is in
        if (world != null) {
            return world.getBackground(); // Return the background of the world
        }
        return null; // Return null if the actor is not in a world
    }
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
            collectedCoins++;
        }
    }
     /*public void coinText() {
    GreenfootImage background = getBackground();  // Get the world's background image

    Color yellow = new Color(66,227,255);
    getBackground().setColor(yellow);;  // Or any color that matches your world background
    background.fillRect(340, 10, 300, 50);  // Clear a rectangle area (adjust the coordinates and size as needed)

    // Set the new text style
    background.setColor(Color.BLACK);
    background.setFont(new Font(32));

    // Draw the new coin count text
    background.drawString(collectedCoins + " coins collected", 350, 35);
}*/

}
