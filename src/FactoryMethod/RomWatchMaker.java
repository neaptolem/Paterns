package FactoryMethod;

public class RomWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new RomWatch();
    }
}
