import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * Clicker
 * @author Mobile
 */
public class Clicker extends Thread {
    
    boolean run = true;
    Robot robot;
    int delay;

    @Override
    public void run()
    {
        try {
            robot = new Robot();
        } catch (AWTException e1) {
            e1.printStackTrace();
        }

        while(run)
        {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }
}
