package FactoryMethod;

/**
 * Created by andrian on 24.09.16.
 */
public class DigitalWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
