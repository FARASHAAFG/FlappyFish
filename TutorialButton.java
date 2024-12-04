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
        if (Greenfoot.mouseMoved(this)) {
            setImage("TutorialButtonHighlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("TutorialButton.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld( new  TutorialScreen());
            Greenfoot.playSound("vgmenuselect (1).wav");
        }
    }
}
