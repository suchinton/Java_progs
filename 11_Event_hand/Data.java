import java.awt.event.*;
import java.sql.Array;
import java.util.stream.IntStream;

import javax.swing.ComboBoxModel;

import java.awt.Choice;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.LabelUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class Data extends Frame implements ActionListener
{
    Frame f = new Frame("Registration Form");

    Label Reg = new Label("Registration Form");
    Label name = new Label("Name");
    Label Mobil_no = new Label("Mobil Number");
    Label Gender = new Label("Gender");
    Label Dob = new Label("DOB");
    Label Address = new Label("Address");

    Button Submit = new Button("Submit");
    Button Reset = new Button("Reset");
    
    int D[] = IntStream.range(1, 31).toArray();
    String DD[] = Arrays.toString(DD);
    String MM[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String YY[] = {IntStream.range(1900, 2022).toArray().toString()};

    JComboBox<String> DDC = new JComboBox<String>(DD);
    JComboBox<String> MMC = new JComboBox<String>(MM);

    TextField nameTF = new TextField();    
    TextField Mobil_noTF = new TextField();
    TextField AddressTF = new TextField();
    TextField Data_out = new TextField();

    Checkbox Male = new Checkbox("male");
    Checkbox Female = new Checkbox("Female");
    Checkbox Agg = new Checkbox("Accept Terms and Conditions.");


    Data()
    {
        for(int i=0; i<12; i++)
        {System.out.println(DD[i]);} 
    }

    public void actionPerformed(ActionEvent A)
    {
        
    }

    public static void main(String[] args) 
    {
          Data d = new Data();
    }
}