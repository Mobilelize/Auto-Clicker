import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;

public class MouseLisener implements NativeMouseListener{
    
    public static void Start() {

        GlobalScreen.addNativeMouseListener(new MouseLisener());

    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent arg0) 
    {

    }

    @Override
    public void nativeMousePressed(NativeMouseEvent arg0) 
    {
        //System.out.println(arg0.getButton());
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent arg0) 
    {

    }

}
