import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameAlphabetPop extends JFrame
{
  public FrameAlphabetPop ()
  {
    super ("Alphabet Pop by Green Eggs & Sam");
//    PanelAlphabetPop panel = new PanelAlphabetPop ();
//    add (panel);
    
    //add(new Splashscreen()); this plays the splashscreen.  I commented it out to see the main menu.
    add(new MainMenu());
    setSize (1200, 700);
    setVisible (true);
    setResizable(false);
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE); 
  }
}