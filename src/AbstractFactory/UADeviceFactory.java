package AbstractFactory;

public class UADeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new UAMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new UAKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new UATouchpad();
    }
}
