package builder;


public class Main {
    static public void main(String[] args){
//        Car car=new CarBuilder()
//                .buildMake("Mercedes")
//                .buildTransmission(Transmission.AUTO)
//                .buildMaxSpeed(280)
//                .build();
//        System.out.println(car.toString());
        Director director=new Director();
        director.setBuilder(new SubaruBuilder());
        Car car=director.buildCar();
        System.out.println(car.toString());
    }
}
