package delegate;

/**
 * Created by andrian on 24.09.16.
 */
public class Painter {
    Graphics graphics;
    public void setShape(Graphics graphics){
        this.graphics=graphics;
    }
    public void draw(){
        graphics.draw();
    }
}
