package Facade;


public class HDD {
    public void copyFromDVD(DVDRom dvd){
       if(dvd.hasData()){
           System.out.println("Copy data from disk");
       }else {
           System.out.println("Insert disc with data");
       }
    }
}
