import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mobile
 */
public class Main {

    static ArrayList<Clicker> threads = new ArrayList<Clicker>();

    public static void Start(boolean isOn)
    {
        if(!threads.isEmpty())
        {
            threads.get(0).run = false;
            threads.remove(0);
        }

        if(!isOn)
        {
            return;
        }

        Clicker test = new Clicker();
        try
        {
            //mil
            test.delay += Integer.parseInt(Window.jTextField7.getText());
            //seconds
            test.delay += Integer.parseInt(Window.jTextField6.getText()) * 1000;
            //minutes
            test.delay += Integer.parseInt(Window.jTextField5.getText()) * 1000 * 60;
            //hours
            test.delay += Integer.parseInt(Window.jTextField4.getText()) * 1000 * 60 * 60;
        }
        catch (Exception e)
        {
            test.delay = 1000;
        }
        test.start();
        threads.add(test);
    }

}