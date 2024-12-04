import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialScreen extends World
{

    /**
     * Constructor for objects of class TutorialScreen.
     */
    public TutorialScreen()
    {
        super(600, 450, 1);
        prepare();
    }
    
    private void prepare(){

        TutorialText tutorialText = new TutorialText();
        addObject(tutorialText,300,40);
        Tutorial1 tutorial1 = new Tutorial1();
        addObject(tutorial1,300,244);
        SpaceText spaceText = new SpaceText();
        addObject(spaceText, 300, 420);
    }
    
    public void exit(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
