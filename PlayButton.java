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
        if (Greenfoot.mouseMoved(this)) {
            setImage("PlayButtonHighlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("PlayButton.png");
        }
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelScreen()); 

        }
    }
}
