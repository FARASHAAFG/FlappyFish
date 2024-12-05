import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class NextLevelButton extends Button
{

    /**
     * Act - do whatever the NextLevelButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        buttonHighlighted();
        buttonClicked();
    }
    
    public void buttonHighlighted(){
        if (Greenfoot.mouseMoved(this)) {
            setImage("nextLevelHighlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("nextLevel.png");
        }
    }
    
    public void buttonClicked(){
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("vgmenuselect (1).wav");

        }
    }
}
