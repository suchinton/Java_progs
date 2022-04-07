import java.awt.event.*;
import java.util.stream.IntStream;
import java.awt.*;

public class Data extends Frame implements ActionListener
{
    Font f1, f2;
    Frame f = new Frame("Registration Form");

    Label Reg       = new Label("Registration Form");
    Label name      = new Label("Name");
    Label mobile_no = new Label("Mobile Number");
    Label Gender    = new Label("Gender");
    Label Dob       = new Label("DOB");
    Label Address   = new Label("Address");

    Button Submit   = new Button("Submit");
    Button Reset    = new Button("Reset");

    int Date[]  = IntStream.range(1, 32).toArray();
    String DD[] = new String[Date.length];

    String MM[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    int Year[]  = IntStream.range(1900, 2023).toArray();
    String YY[] = new String[Year.length];

    Choice DDC = new Choice();
    Choice MMC = new Choice();
    Choice YYC = new Choice();

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
        f1 = new Font("Times New Roman",f1.BOLD,15);
        f2 = new Font("Times New Roman",f2.PLAIN,12);

        for(int i=0; i<Date.length ; i++)
        {
            DD[i] = String.valueOf(Date[i]);
            DDC.add(DD[i]);
        }

        for(int i=0; i<Year.length; i++)
        {
            YY[i] = String.valueOf(Year[i]);
            YYC.add(YY[i]);
        }

        for(int i=0; i<12; i++ )
            MMC.add(MM[i]);

        Reg.setBounds(250, 80,150, 20);
        name.setBounds(20,140,100,20);
        mobile_no.setBounds(20,170,100,20);
        Gender.setBounds(20,200,100,20);
        Dob.setBounds(20,230,100,20);
        Address.setBounds(20,260,100,20);

        nameTF.setBounds(140,140,200,20);
        mobile_noTF.setBounds(140,170,200,20);

        AddressTA.setBounds(140,260,200,150);
        Data_outTA.setBounds(350,140,200,270);

        Submit.setBounds(140,470,100,20);
        Reset.setBounds(250,470,100,20);

        DDC.setBounds(140,230,60,20);
        MMC.setBounds(200,230,60,20);
        YYC.setBounds(260,230,60,20);

        Male.setBounds(140,200,100,20);
        Female.setBounds(250,200,100,20);
        Agg.setBounds(140,430,240,20);        

        Submit.addActionListener(this);
        Reset.addActionListener(this);

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
        Male.setFont(f2);
        Female.setFont(f2);
        Agg.setFont(f2);

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

        f.add(Male);
        f.add(Female);
        f.add(Agg);

        f.setSize(600,520);  
        f.setLayout(null);  
        f.setVisible(true); 
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
                Data_outTA.append("Address   : " + AddressTA.getText());
            }   
            else if(A.getActionCommand()=="Reset")
            {
                Data_outTA.setText(null);
                nameTF.setText(null);
                mobile_noTF.setText(null);
                Gen.setSelectedCheckbox(null);
                AddressTA.setText(null);
            }
        }
    }

    public static void main(String[] args) 
    {
          Data d = new Data();
    }
}