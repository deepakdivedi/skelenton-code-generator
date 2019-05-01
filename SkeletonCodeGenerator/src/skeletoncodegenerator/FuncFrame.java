package skeletoncodegenerator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pojo.ClassData;

public class FuncFrame {
    String f[]=new String[20];
    static JFrame frame;
    JTextField args[],names[],rettyps[];
    JLabel methods,funcNum[],rettyp,arg,blk;
    JButton finish;
    JPanel panel1,panel2;
    
    void GUI(int number,ClassData c,boolean status){
        frame=new JFrame();
        panel1=new JPanel();
        panel2=new JPanel();
        
        frame.setLayout(new GridLayout(2,1));
        panel1.setLayout(new GridLayout(number+1,4));
        panel2.setLayout(new FlowLayout());
        
        frame.add(panel1);
        frame.add(panel2);
        
        methods=new JLabel();
        methods.setFont(new java.awt.Font("Calibri", 2, 14));
        methods.setText("Function Name");
        
        rettyp=new JLabel();
        rettyp.setFont(new java.awt.Font("Calibri", 2, 14));
        rettyp.setText("Return Type");
        
        arg=new JLabel();
        arg.setFont(new java.awt.Font("Calibri", 2, 14));
        arg.setText("Arguments(,seperated)");
        
        blk=new JLabel();
        
        finish=new JButton();
        finish.setFont(new java.awt.Font("Calibri", 2, 14));
        finish.setText("Finish");
        
        args=new JTextField[number];
        names=new JTextField[number];
        rettyps=new JTextField[number];
        funcNum=new JLabel[number];
        
        panel1.add(blk);
        panel1.add(rettyp);
        panel1.add(methods);
        panel1.add(arg);
        
        for(int j=0;j<number;j++){
            funcNum[j]=new JLabel("Funtion "+(j+1)+":");
            names[j]=new JTextField(10);
            rettyps[j]=new JTextField(10);
            args[j]=new JTextField(20);
            panel1.add(funcNum[j]);
            panel1.add(rettyps[j]);
            panel1.add(names[j]);
            panel1.add(args[j]);
            if(status==true){
                rettyps[0].setText("public static void");
                names[0].setText("main");
                args[0].setText("String[] args");
            }
        }
        
        panel2.add(finish);
        
        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.functions=new String[number];
                for(int j=0;j<number;j++){
                    c.functions[j]=""+rettyps[j].getText()+" "+names[j].getText()+"("+args[j].getText()+"){\n\n\t}";
                }
                frame.dispose();
            }
        });
    }
    
    public void main(int number,ClassData c,boolean status){
        FuncFrame obj=new FuncFrame();
        obj.GUI(number,c,status);
        frame.pack();
        frame.setLocation(200,150);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
