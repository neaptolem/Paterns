package FactoryMethod;

public class Main {
    static public void main(String[] args){
        WatchMaker watchMaker=new DigitalWatchMaker();
        Watch watch=watchMaker.createWatch();
        watch.showTime();
        WatchMaker watchMaker1=getMakerByName("Digital");
        Watch watch1=watchMaker1.createWatch();
    }
    static public WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rom"))
            return new RomWatchMaker();
        throw new RuntimeException("We don't have this line"+maker);
    }
}
