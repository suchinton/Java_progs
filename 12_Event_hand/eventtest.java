import javax.swing.Action;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class eventtest extends Freame implements ActionListener
{
    Frame f;
    Button b;
    TextField tf;

    eventtest()
    {
        f = new Frame("Test");
        b = new Button("Click");
        tf = new TextFiel(10);

        f.add(b);
        b.add(tf);

        b.add.ActionListener(this);

        SetSize(300);
        SetVisible(true);
    }

    void actinoPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        tf.setText(str);
    }

    public static void main(String[] args) 
    {
        eventtest e = new eventtest();    
    }
}