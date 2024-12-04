import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialScreen extends World
{
    private List<Actor> frames = new ArrayList<>();
    private int currentIndex = 0;
    
    /**
     * Constructor for objects of class TutorialScreen.
     */
    public TutorialScreen()
    {
        super(600, 450, 1);
        prepare();
    }
    
    public void act(){
        exit();
        handleInput();
    }
    
    private void prepare(){

        TutorialText tutorialText = new TutorialText();
        addObject(tutorialText,300,40);
        SpaceText spaceText = new SpaceText();
        addObject(spaceText, 300, 420);
        
        Tutorial1 tut1 = new Tutorial1();
        Tutorial2 tut2 = new Tutorial2();
        Tutorial3 tut3 = new Tutorial3();
        Tutorial4 tut4 = new Tutorial4();
        Tutorial5 tut5 = new Tutorial5();
        
        frames.add(tut1);
        frames.add(tut2);
        frames.add(tut3);
        frames.add(tut4);
        frames.add(tut5);
        
        Tutorial1 tutorial1 = new Tutorial1();
        addObject(tutorial1,300,244);
    }
    
    public void exit(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new StartScreen());
        }
    }
    
    private void handleInput() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.delay(20); //cooldown
            cycleActors();
            Greenfoot.playSound("Page Turning Sfx.wav");
        }
    }
    
    private void cycleActors() {
        if (currentIndex < frames.size()) {
            removeObject(frames.get(currentIndex));
        }

        currentIndex = (currentIndex + 1) % frames.size();
        
        addObject(frames.get(currentIndex), 300, 244);
    }
}
