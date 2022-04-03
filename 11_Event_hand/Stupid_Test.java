import java.awt.event.*;
import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;
import java.awt.*;

public class Stupid_Test extends Frame implements ActionListener
{
    Frame f = new Frame("Test");
    Random r = new Random();
    Button B_1 = new Button("Yes");
    Button B_2 = new Button("No");

    Label Question = new Label("Are you Stupid?");

    Stupid_Test()
    {
        B_1.setBounds(20, 70, 60, 20);
        B_2.setBounds(100, 70, 60, 20 );

        Question.setBounds(50, 20, 100, 30);

        f.add(B_1);
        f.add(B_2);
        f.add(Question);
        
        f.setSize(200,250);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent a)
    {
        if(a.getActionCommand()=="No")
            B_2.setBounds(100, r.nextInt(20,200), 60, 20 );
        if(a.getActionCommand()=="Yes")
            f.removeAll();
    }

    public static void main(String[] args) 
    {
        Stupid_Test test = new Stupid_Test();
    }
}