import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Level2Screen extends World
{
    GreenfootSound sound = new GreenfootSound("leap.WAV");
    private long vlobsterLastSpawnTime = System.currentTimeMillis();
    private int vlobsterSpawnDelay = 2000 + Greenfoot.getRandomNumber(7000);
    
    private long sharkLastSpawnTime = System.currentTimeMillis();
    private int sharkSpawnDelay = 3000 + Greenfoot.getRandomNumber(7000);
    
    private long coinLastSpawnTime = System.currentTimeMillis();
    private int CoinSpawnDelay = Greenfoot.getRandomNumber(3000)+2000;
    
    public boolean goalAchieved = false;
    
    private GreenfootImage goalText;
    
    private int passedVlobsters = 0;
    private int passedSharks = 0;
    
    NextLevelButton nextButton = new NextLevelButton();
    /**
     * Constructor for objects of class Game.
     */
    public Level2Screen()
    {
        super(600,450,1);
        prepare();
        sound.play();
    }
    public void act(){
        
        //vlobster
        Color yellow = new Color(66,227,255);
        getBackground().setColor(yellow);
        getBackground().fillRect(0, 0, 500, 45);
        getBackground().setColor(Color.BLACK);
        getBackground().setFont(new Font(32));
        getBackground().drawString(passedVlobsters + "/3 vlobsters " + passedSharks + "/2 sharks", 120,35);
        
        List<Vlobster> vlobsters = getObjects(Vlobster.class);
        for (Vlobster vlobster : vlobsters) {
            if (vlobster.getX() <= 0) { 
                passedVlobsters++;
                removeObject(vlobster);
            }
        }
        
        //shark
        List<Shark> sharks = getObjects(Shark.class);
        for (Shark shark : sharks) {
            if (shark.getX() <= 0) { 
                passedSharks++;
                removeObject(shark);
            }
        }
    
        
        if (!goalAchieved && passedVlobsters >= 3 && passedSharks >= 2) {
            goalAchieved = true;
            levelCleared();
        }
        
        if (!goalAchieved) {
            spawnVlobster();
            if(Greenfoot.getRandomNumber(100)< 5){
                spawnShark();
            }
            spawnCoin();
        }
        
        exit();
        transitionToNextLevel();
    }
    private void prepare()
    {
        GoldF goldF =  new  GoldF();
        addObject(goldF, 96, 238);
        SuperSmallWeed superSmallWeed =  new  SuperSmallWeed();
        addObject(superSmallWeed, 12, 417);
        SuperSmallWeed superSmallWeed2 =  new  SuperSmallWeed();
        addObject(superSmallWeed2, 31, 443);
        SuperSmallWeed superSmallWeed3 =  new  SuperSmallWeed();
        addObject(superSmallWeed3, 54, 419);
        superSmallWeed3.setLocation(48, 440);
        SuperSmallWeed superSmallWeed4 =  new  SuperSmallWeed();
        addObject(superSmallWeed4, 48, 440);
        SuperSmallWeed superSmallWeed5 =  new  SuperSmallWeed();
        addObject(superSmallWeed5, 83, 449);
        superSmallWeed5.setLocation(95, 439);
        SuperSmallWeed superSmallWeed6 =  new  SuperSmallWeed();
        addObject(superSmallWeed6, 95, 439);
        superSmallWeed6.setLocation(112, 421);
        SuperSmallWeed superSmallWeed7 =  new  SuperSmallWeed();
        addObject(superSmallWeed7, 112, 421);
        SuperSmallWeed superSmallWeed8 =  new  SuperSmallWeed();
        addObject(superSmallWeed8, 135, 440);
        SuperSmallWeed superSmallWeed9 =  new  SuperSmallWeed();
        addObject(superSmallWeed9, 160, 441);
        SuperSmallWeed superSmallWeed10 =  new  SuperSmallWeed();
        addObject(superSmallWeed10, 191, 424);
        SuperSmallWeed superSmallWeed11 =  new  SuperSmallWeed();
        addObject(superSmallWeed11, 208, 442);
        SuperSmallWeed superSmallWeed12 =  new  SuperSmallWeed();
        addObject(superSmallWeed12, 175, 446);
        SuperSmallWeed superSmallWeed13 =  new  SuperSmallWeed();
        addObject(superSmallWeed13, 227, 444);
        SuperSmallWeed superSmallWeed14 =  new  SuperSmallWeed();
        addObject(superSmallWeed14, 249, 419);
        SuperSmallWeed superSmallWeed15 =  new  SuperSmallWeed();
        addObject(superSmallWeed15, 270, 433);
        SuperSmallWeed superSmallWeed16 =  new  SuperSmallWeed();
        addObject(superSmallWeed16, 308, 439);
        SuperSmallWeed superSmallWeed17 =  new  SuperSmallWeed();
        addObject(superSmallWeed17, 286, 442);
        SuperSmallWeed superSmallWeed18 =  new  SuperSmallWeed();
        addObject(superSmallWeed18, 334, 416);
        SuperSmallWeed superSmallWeed19 =  new  SuperSmallWeed();
        addObject(superSmallWeed19, 358, 436);
        SuperSmallWeed superSmallWeed20 =  new  SuperSmallWeed();
        addObject(superSmallWeed20, 376, 442);
        SuperSmallWeed superSmallWeed21 =  new  SuperSmallWeed();
        addObject(superSmallWeed21, 400, 426);
        SuperSmallWeed superSmallWeed22 =  new  SuperSmallWeed();
        addObject(superSmallWeed22, 444, 445);
        SuperSmallWeed superSmallWeed23 =  new  SuperSmallWeed();
        addObject(superSmallWeed23, 472, 447);
        superSmallWeed22.setLocation(454, 419);
        SuperSmallWeed superSmallWeed24 =  new  SuperSmallWeed();
        addObject(superSmallWeed24, 454, 419);
        SuperSmallWeed superSmallWeed25 =  new  SuperSmallWeed();
        addObject(superSmallWeed25, 421, 418);
        SuperSmallWeed superSmallWeed26 =  new  SuperSmallWeed();
        addObject(superSmallWeed26, 491, 446);
        SuperSmallWeed superSmallWeed27 =  new  SuperSmallWeed();
        addObject(superSmallWeed27, 512, 448);
        SuperSmallWeed superSmallWeed28 =  new  SuperSmallWeed();
        addObject(superSmallWeed28, 531, 415);
        SuperSmallWeed superSmallWeed29 =  new  SuperSmallWeed();
        addObject(superSmallWeed29, 560, 435);
        superSmallWeed29.setLocation(575, 440);
        SuperSmallWeed superSmallWeed30 =  new  SuperSmallWeed();
        addObject(superSmallWeed30, 575, 440);
        SuperSmallWeed superSmallWeed31 =  new  SuperSmallWeed();
        addObject(superSmallWeed31, 596, 409);
        superSmallWeed3.setLocation(68, 392);
        SmallWeed smallWeed =  new  SmallWeed();
        addObject(smallWeed, 68, 392);
        superSmallWeed16.setLocation(301, 416);
        SmallWeed smallWeed2 =  new  SmallWeed();
        addObject(smallWeed2, 301, 416);
        superSmallWeed31.setLocation(592, 422);
        Seaweed seaweed =  new  Seaweed();
        addObject(seaweed, 495, 394);
        Level1Goal goalText = new Level1Goal();
        addObject(goalText, 60, 23);

    }
    public void spawnVlobster() {
        long currentTime = System.currentTimeMillis();
        
        if (currentTime - vlobsterLastSpawnTime >= vlobsterSpawnDelay) { 
            addObject(new Vlobster(), 600, Greenfoot.getRandomNumber(195) + 150);
            
            vlobsterLastSpawnTime = currentTime;
            vlobsterSpawnDelay = vlobsterSpawnDelay;
        }
    }
    
    public void spawnShark(){
        long currentTime = System.currentTimeMillis();
        if (currentTime - sharkLastSpawnTime >= sharkSpawnDelay) { 
            addObject(new Shark(), 600, Greenfoot.getRandomNumber(195) + 150);
            
            sharkLastSpawnTime = currentTime;
            sharkSpawnDelay = sharkSpawnDelay;
        }
    }

    public void spawnCoin(){
        long currentTime = System.currentTimeMillis();
        if (currentTime - coinLastSpawnTime >= CoinSpawnDelay) { 
            addObject(new Coin(), 600, Greenfoot.getRandomNumber(200) + 150);
            
            coinLastSpawnTime = currentTime;
            CoinSpawnDelay = CoinSpawnDelay;
        }
    }
    
    public void exit(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new StartScreen());
            sound.stop();
        }
    }
    
    
    private void levelCleared() {
        addObject(new LevelCleared(), 300, 225);
        addObject(nextButton,293, 326 );
        //addObject(new text(), 440, 261);
    }
    
    private void transitionToNextLevel(){
        if(Greenfoot.mouseClicked(nextButton)) {
            Greenfoot.setWorld(new Level3Screen());
            sound.stop();
        }
    }
    
}