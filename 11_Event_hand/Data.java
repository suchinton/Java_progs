import java.awt.event.*;

import javax.swing.*;

import java.awt.*; 

public class Data extends WindowAdapter implements ActionListener
{
    Font f1, f2;
    
    JFrame f = new JFrame("Registration Form");
    JFrame fr2 = new JFrame("Error!!");

    JLabel Reg       = new JLabel("Registration Form");
    JLabel name      = new JLabel("Name");
    JLabel mobile_no = new JLabel("Mobile Number");
    JLabel Gender    = new JLabel("Gender");
    JLabel Dob       = new JLabel("DOB");
    JLabel Address   = new JLabel("Address");
    JLabel City      = new JLabel("City");

    JLabel errLabel  = new JLabel("Please Agree to Terms and Conditions to Submit or Reset!");

    Button Submit   = new Button("Submit");
    Button Reset    = new Button("Reset");

    Choice DDC = new Choice();
    Choice MMC = new Choice();
    Choice YYC = new Choice();

    List CityL = new List(6);

    TextField nameTF      = new TextField();    
    TextField mobile_noTF = new TextField();

    TextArea AddressTA    = new TextArea();
    TextArea Data_outTA   = new TextArea(5,10);

    CheckboxGroup Gen = new CheckboxGroup();
    Checkbox Male     = new Checkbox("Male",Gen,false);
    Checkbox Female   = new Checkbox("Female",Gen,false);
    Checkbox Agg      = new Checkbox("Accept Terms and Conditions.");

    Data()
    { 
        f.setBackground(Color.lightGray);
        f.setForeground(Color.BLACK);

        String MM[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        CityL.add("Chennai");
        CityL.add("Delhi");
        CityL.add("Mumbai");
        CityL.add("Lucknow");
        CityL.add("Pune");
        CityL.add("Ghaziabad");
	CityL.add("Mirzapur");

        f1 = new Font("Times New Roman",f1.BOLD,15);
        f2 = new Font("Times New Roman",f2.PLAIN,12);

        for(int i=1; i<=31 ; i++)
            DDC.add(Integer.toString(i));

        for(int i=2022; i>1899; i--)
            YYC.add(Integer.toString(i));

        for(int i=0; i<12; i++ )
            MMC.add(MM[i]);

        Reg.setBounds(250, 80,150, 20);
        name.setBounds(20,140,100,20);
        mobile_no.setBounds(20,170,100,20);
        Gender.setBounds(20,200,100,20);
        Dob.setBounds(20,230,100,20);
        Address.setBounds(20,260,100,20);

        errLabel.setBounds(50,50,300,20);

        nameTF.setBounds(140,140,200,20);
        mobile_noTF.setBounds(140,170,200,20);

        AddressTA.setBounds(140,260,200,150);
        Data_outTA.setBounds(350,140,200,270);

        Submit.setBounds(140,550,100,20);
        Reset.setBounds(250,550,100,20);

        DDC.setBounds(140,230,60,20);
        MMC.setBounds(200,230,60,20);
        YYC.setBounds(260,230,60,20);

        City.setBounds(20,420,100,20);
        CityL.setBounds(140,420,220,100);

        Male.setBounds(140,200,100,20);
        Female.setBounds(250,200,100,20);
        Agg.setBounds(140,520,240,20);        

        Submit.addActionListener(this);
        Reset.addActionListener(this);

        f.addWindowListener (this);
        fr2.addWindowListener(this);

        Reg.setFont(f1);
        name.setFont(f2);
        mobile_no.setFont(f2);
        Gender.setFont(f2);
        Dob.setFont(f2);
        Address.setFont(f2);
        nameTF.setFont(f2);
        mobile_noTF.setFont(f2);
        AddressTA.setFont(f2);
        Data_outTA.setFont(f2);
        Submit.setFont(f2);
        Reset.setFont(f2);
        DDC.setFont(f2);
        MMC.setFont(f2);
        YYC.setFont(f2);
        City.setFont(f2);
        CityL.setFont(f2);
        Male.setFont(f2);
        Female.setFont(f2);
        Agg.setFont(f1);

        errLabel.setFont(f1);

        f.add(Reg);
        f.add(name);
        f.add(mobile_no);
        f.add(Gender);
        f.add(Dob);
        f.add(Address);

        f.add(Submit);
        f.add(Reset);

        f.add(nameTF);
        f.add(mobile_noTF);
        f.add(AddressTA);
        f.add(Data_outTA);

        f.add(DDC);
        f.add(MMC);
        f.add(YYC);

        f.add(City);
        f.add(CityL);

        f.add(Male);
        f.add(Female);
        f.add(Agg);

        fr2.add(errLabel);

        f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true); 
    }

    public void windowClosing (WindowEvent e) 
    {  
        if(e.getWindow()==f)
            f.dispose();
        else if(e.getWindow()==fr2)
            fr2.dispose();   
    }    

    public void actionPerformed(ActionEvent A)
    {
        if(Agg.getState()==true)
        {
            if(A.getActionCommand()=="Submit" )
            {
                Data_outTA.setText(null);
                Data_outTA.append("Name      : " + nameTF.getText() +"\n");
                Data_outTA.append("Mobile no : " + mobile_noTF.getText() + "\n");
                Data_outTA.append("Gender    : " + Gen.getSelectedCheckbox().getLabel() + "\n" );
                Data_outTA.append("DOB       : " + DDC.getSelectedItem() + "/" + MMC.getSelectedItem() + "/" + YYC.getSelectedItem() + "\n");
                Data_outTA.append("Address   : " + AddressTA.getText() + "\n");
                Data_outTA.append("City      : " + CityL.getSelectedItem());  
            }
               
            else if(A.getActionCommand()=="Reset")
            {
                Data_outTA.setText(null);
                nameTF.setText(null);
                mobile_noTF.setText(null);
                Gen.setSelectedCheckbox(null);
                AddressTA.setText(null);
                Male.setState(false);
                Female.setState(false);
                Agg.setState(false);;
            }
        }
        else if(Agg.getState()==false && (A.getActionCommand()=="Submit" || A.getActionCommand()=="Reset"))
        { 
            fr2.setAlwaysOnTop(true);
            fr2.setSize(400,100);  
            fr2.setLayout(null);  
            fr2.setVisible(true); 
        }
    }

    public static void main(String[] args) 
    {
          Data d = new Data();
    }
}
