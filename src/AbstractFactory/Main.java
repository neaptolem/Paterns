package AbstractFactory;

public class Main {
    static public void main(String[] args){
        DeviceFactory deviceFactory=getFactoryByCountryCode("EN");
        Mouse m=deviceFactory.getMouse();
        Keyboard k=deviceFactory.getKeyboard();
        Touchpad t=deviceFactory.getTouchpad();
        m.click();
        k.print();
        k.println();
        t.track(10,35);

    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "UA":
                return new UADeviceFactory();
            case "EN":
                return new ENDeviceFactory();
            default:
                throw new RuntimeException("Unsuported Country Code: "+lang);
        }
    }

}
