import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{
    GreenfootSound sound = new GreenfootSound("river_mastered.mp3");
    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {
        super(600, 450, 1);
        GreenfootImage bg = new GreenfootImage("StartScreen.png");
        setBackground(bg);
        prepare();
        sound.play();
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
    
    }
    public void stopMusic(){
        sound.stop();
    }
}
