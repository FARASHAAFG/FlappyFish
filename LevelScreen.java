// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LevelScreen extends World
{

    /**
     * Constructor for objects of class LevelScreen.
     */
    public LevelScreen()
    {
        super(600, 450, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GoldF goldF =  new  GoldF();
        addObject(goldF, 96, 238);
        Seaweed seaweed =  new  Seaweed();
        addObject(seaweed, 494, 358);
        SmallWeed smallWeed =  new  SmallWeed();
        addObject(smallWeed, 296, 393);
        SmallWeed smallWeed2 =  new  SmallWeed();
        addObject(smallWeed2, 86, 421);
        smallWeed.setLocation(302, 394);
    }
}
