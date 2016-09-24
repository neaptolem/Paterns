package AbstractFactory;

public class ENDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new ENMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new ENKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new ENTouchpad();
    }
}
