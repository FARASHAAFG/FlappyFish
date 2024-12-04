import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PlayButton extends Button
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        buttonHighlighted();
        buttonClicked();
    }
    public void buttonHighlighted(){
        if (Greenfoot.mouseMoved(this)) {
            setImage("PlayButtonHighlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("PlayButton.png");
        }
    }
    public void buttonClicked(){
        if (Greenfoot.mouseClicked(this))
        {
            if (getWorld() instanceof StartScreen) {
                StartScreen startScreen = (StartScreen) getWorld();
                startScreen.stopMusic();
            }
            
            Greenfoot.setWorld(new Level1Screen()); 
            Greenfoot.playSound("vgmenuselect.wav");
        }
    }
}
