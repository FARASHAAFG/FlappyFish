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
        addObject(goldF, 108, 228);
        Seaweed seaweed =  new  Seaweed();
        addObject(seaweed, 552, 358);
        Seaweed seaweed2 =  new  Seaweed();
        addObject(seaweed2, 461, 413);
        Seaweed seaweed3 =  new  Seaweed();
        addObject(seaweed3, 351, 376);
        Seaweed seaweed4 =  new  Seaweed();
        addObject(seaweed4, 228, 439);
        Seaweed seaweed5 =  new  Seaweed();
        addObject(seaweed5, 112, 394);
        Seaweed seaweed6 =  new  Seaweed();
        addObject(seaweed6, 13, 439);
        SmallWeed smallWeed =  new  SmallWeed();
        addObject(smallWeed, 398, 438);
        SmallWeed smallWeed2 =  new  SmallWeed();
        addObject(smallWeed2, 271, 447);
        SmallWeed smallWeed3 =  new  SmallWeed();
        addObject(smallWeed3, 171, 431);
        seaweed6.setLocation(45, 433);
        SmallWeed smallWeed4 =  new  SmallWeed();
        addObject(smallWeed4, 45, 433);
        seaweed2.setLocation(495, 407);
        SmallWeed smallWeed5 =  new  SmallWeed();
        addObject(smallWeed5, 495, 407);
        seaweed.setLocation(553, 414);
        seaweed3.setLocation(344, 422);
        seaweed5.setLocation(120, 417);
    }
}
