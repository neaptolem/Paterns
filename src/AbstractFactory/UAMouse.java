package AbstractFactory;

public class UAMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Ua Mouse click");
    }

    @Override
    public void dbclick() {
        System.out.println("Ua Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction>0)
            System.out.println("UA scroll UP");
        else if (direction<0)
            System.out.println("UA scrol down");
        else System.out.println("UA on the place");

    }
}
