import java.awt.event.*;
import javax.naming.spi.DirStateFactory.Result;
import java.awt.*;

public class Calculator extends Frame implements ActionListener
{
    Frame f = new Frame("Simple Calculator");

    Label first_no = new Label("First Number");  
    Label Sec_no = new Label("Second Number");    
    Label result = new Label("Result");

    Label Add = new Label("Add");
    Label Div = new Label("Div");
    Label Sub = new Label("Sub");
    Label Mult = new Label("Mult");

    TextField first_noTF = new TextField();
    TextField Sec_noTF = new TextField();   
    TextField resultTF = new TextField();

    Button Add_B = new Button(Add.getText());  
    Button Div_B = new Button(Div.getText());  
    Button Sub_B = new Button(Sub.getText());
    Button Mult_B = new Button(Mult.getText());

    Calculator()
    {
        first_no.setBounds(20, 80, 100, 20);
        Sec_no.setBounds(20, 110, 100, 20);  
        result.setBounds(20, 140, 100, 20); 
        result.setForeground(Color.red);
        
        first_noTF.setBounds(120, 80, 100, 20);  
        Sec_noTF.setBounds(120, 110, 100, 20);       
        resultTF.setBounds(120, 140, 100, 20);
        resultTF.setBackground(Color.LIGHT_GRAY);

        Add_B.setBounds(10, 310, 100, 20);       
        Div_B.setBounds(110, 310, 100, 20);          
        Sub_B.setBounds(210, 310, 100, 20);         
        Mult_B.setBounds(310, 310, 100, 20);
        
        f.add(first_no);  
        f.add(Sec_no);  
        f.add(result);  
        f.add(Add);
        f.add(Div);
        f.add(Sub);
        f.add(Mult);
        
        f.add(first_noTF);  
        f.add(Sec_noTF);  
        f.add(resultTF);

        f.add(Add_B);
        f.add(Div_B);
        f.add(Sub_B);
        f.add(Mult_B);

        Add_B.addActionListener(this);
        Sub_B.addActionListener(this);
        Div_B.addActionListener(this);
        Mult_B.addActionListener(this);
        
        f.setSize(450,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }

    public void actionPerformed(ActionEvent A)
    {
        float no1 = Float.parseFloat(first_noTF.getText());
        float no2 = Float.parseFloat(Sec_noTF.getText());

        if(A.getActionCommand()=="Add")
            resultTF.setText((""+(no1+no2)));

        else if(A.getActionCommand()=="Div")
            resultTF.setText(""+(no1/no2));

        else if(A.getActionCommand()=="Mult")
            resultTF.setText(""+(no1*no2));

        else if(A.getActionCommand()=="Sub")
            resultTF.setText(""+(no1-no2));

        else
            resultTF.setText("Ans");
    }

    public static void main(String[] args) 
    {
        Calculator calc = new Calculator(); 
    }  
} 