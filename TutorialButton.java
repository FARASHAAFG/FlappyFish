import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialButton extends Button
{
    /**
     * Act - do whatever the TutorialButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        buttonHighlighted();
        buttonClicked();
        
        for(int i = 1; i < 5; i++) {
            if (Greenfoot.isKeyDown("space")) {
 
        }
        }
        
    }
    
    public void buttonHighlighted(){
        if (Greenfoot.mouseMoved(this)) {
            setImage("TutorialButtonHighlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("TutorialButton.png");
        }
    }
    
    public void buttonClicked(){
        if (Greenfoot.mouseClicked(this))
        {
            if (getWorld() instanceof StartScreen) {
                StartScreen startScreen = (StartScreen) getWorld();
                //startScreen.stopMusic();
            }
            Greenfoot.playSound("vgmenuselect (1).wav");
            Greenfoot.setWorld(new TutorialScreen()); 
        }
    }
}
