import java.applet.Applet;
import java.awt.Graphics;

public class Appletlife extends Applet {
    public void init() {
        System.out.println("i m in init");
    }

    public void start() {
        System.out.println("i m in start");
    }

    public void paint(Graphics G) {
        System.out.println("i m in paint");
    }

    public void stop() {
        System.out.println("i m in stop");
    }

    public void destroy() {
        System.out.println("destroyed");
    }
}
