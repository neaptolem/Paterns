package AbstractFactory;

public class ENMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("EN Mouse click");
    }

    @Override
    public void dbclick() {
        System.out.println("EN Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("EN scroll UP");
        else if (direction < 0)
            System.out.println("EN scrol down");
        else System.out.println("EN on the place");

    }
}
