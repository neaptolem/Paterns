package Facade;

/**
 * Created by andrian on 24.09.16.
 */
public class Computer {
    Power power=new Power();
    DVDRom dvd=new DVDRom();
    HDD hdd=new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);

    }
}
