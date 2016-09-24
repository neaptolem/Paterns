package builder;

public class Car {
    private String make;
    private Transmission transmission;
    private int maxSpeed;
    public void setMake(String make){
        this.make=make;
    }
    public  void setTransmission(Transmission transmission){
        this.transmission=transmission;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public String toString(){
        return "Make: "+make+"\n Transmission: "+transmission+"\n maxSpeed: "+maxSpeed;
    }
}
