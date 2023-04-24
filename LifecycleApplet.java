import java.awt.Graphics;
import java.applet.Applet;

public class LifecycleApplet extends Applet {
    private String message;

    public void init() {
        message = "Initializing the applet";
    }

    public void start() {
        message = "Starting the applet";
    }

    public void paint(Graphics g) {
        g.drawString(message, 10, 50);
    }

    public void stop() {
        message = "Stopping the applet";
    }

    public void destroy() {
        message = "Destroying the applet";
    }
}
