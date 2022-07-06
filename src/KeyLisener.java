import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

/**
 * KeyLisener
 *
 * @author Mobile
 */
public class KeyLisener implements NativeKeyListener {

    public static void Start() {        

        GlobalScreen.addNativeKeyListener(new KeyLisener());
    
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
        
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
        Activate(nativeEvent);
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
        
    }

    private void Activate(NativeKeyEvent nativeEvent)
    {
        if(NativeKeyEvent.getKeyText(nativeEvent.getKeyCode()) == "F6")
        {
            if(Window.jRadioButton1.isSelected())
            {
                Window.jRadioButton1.setSelected(false);
                Window.jRadioButton2.setSelected(true);
            }
            else if(!Window.jRadioButton1.isSelected())
            {
                Window.jRadioButton1.setSelected(true);
                Window.jRadioButton2.setSelected(false);
            }
            
            Main.Start(Window.jRadioButton1.isSelected());
        }
    }

}
