import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Snake green_snake = new Snake();
        addObject(green_snake, 200, 300);
        
    }
}
