import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {
        super(600, 450, 1);
        GreenfootImage bg = new GreenfootImage("StartScreen.png");
        setBackground(bg);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        PlayButton playButton = new PlayButton();
        addObject(playButton,300,240);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,300,320);
    }
    public void act()
    {
    if (Greenfoot.mouseClicked(null)) {
        Actor clicked = Greenfoot.getMouseInfo().getActor();
        if (clicked instanceof Button) {
            Button btn = (Button) clicked;
            if (btn.getImage().getAwtImage().toString().contains("PlayButton")) {
                Greenfoot.setWorld(new LevelScreen());
            } else if (btn.getImage().getAwtImage().toString().contains("Tutorial")) {
                Greenfoot.setWorld(new TutorialScreen());
            }
        }
    }
    }
}
