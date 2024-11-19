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
        Seaweed seaweed =  new  Seaweed();
        addObject(seaweed, 347, 349);
        GoldF goldF =  new  GoldF();
        addObject(goldF, 113, 234);
        seaweed.setLocation(334, 374);
        seaweed.setLocation(319, 411);
        seaweed.setLocation(556, 413);
        seaweed.setLocation(547, 406);
        seaweed.setLocation(546, 361);
    }
}
