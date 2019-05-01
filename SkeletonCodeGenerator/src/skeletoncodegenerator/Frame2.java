package skeletoncodegenerator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import pojo.ClassData;
import java.io.*;
public class Frame2 implements ItemListener{
    static JFrame frame;
    JLabel className,numberoffunc,extendlab,containsMain,dataTyp,Mem,intlab,floatlab,doublelab,charlab,boollab,stringlab,blanklab;
    JTextField name,extendclass,funcNumber,intargs,floatargs,doubleargs,charargs,boolargs,stringargs;
    JButton finish,enterFunc;
    JCheckBox extcb,maincb,intcb,floatcb,doublecb,charcb,boolcb,stringcb;
    JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    void GUI(int classes){
        frame=new JFrame();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        panel6=new JPanel();
        
        frame.setLayout(new GridLayout(4,1));
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(7,3));
        panel3.setLayout(new GridLayout(2,l));
        panel4.setLayout(new FlowLayout());
        panel5.setLayout(new FlowLayout());
        panel6.setLayout(new FlowLayout());
        
        blanklab=new JLabel();
        
        className=new JLabel();
        className.setFont(new java.awt.Font("Calibri", 2, 14));
        className.setText("Class Name : ");
        
        extendlab=new JLabel();
        extendlab.setFont(new java.awt.Font("Calibri", 2, 14));
        extendlab.setText("Extends");
        
        containsMain=new JLabel();
        containsMain.setFont(new java.awt.Font("Calibri", 2, 14));
        containsMain.setText("Contains Main :");
        
        dataTyp=new JLabel();
        dataTyp.setFont(new java.awt.Font("Calibri", 2, 14));
        dataTyp.setText("Data Type");
        
        Mem=new JLabel();
        Mem.setFont(new java.awt.Font("Calibri", 2, 14));
        Mem.setText("Members(,seperated)");
        
        numberoffunc=new JLabel();
        numberoffunc.setFont(new java.awt.Font("Calibri", 2, 14));
        numberoffunc.setText("How Many Methods:");
        
        intlab=new JLabel();
        intlab.setFont(new java.awt.Font("Calibri", 2, 14));
        intlab.setText("int : ");
        
        floatlab=new JLabel();
        floatlab.setFont(new java.awt.Font("Calibri", 2, 14));
        floatlab.setText("float : ");
    
        doublelab=new JLabel();
        doublelab.setFont(new java.awt.Font("Calibri", 2, 14));
        doublelab.setText("double : ");
        
        charlab=new JLabel();
        charlab.setFont(new java.awt.Font("Calibri", 2, 14));
        charlab.setText("char : ");
        
        boollab=new JLabel();
        boollab.setFont(new java.awt.Font("Calibri", 2, 14));
        boollab.setText("boolean : ");
        
        stringlab=new JLabel();
        stringlab.setFont(new java.awt.Font("Calibri", 2, 14));
        stringlab.setText("String : ");
        
        finish=new JButton();
        finish.setFont(new java.awt.Font("Calibri", 2, 14));
        finish.setText("Finish Class");
        
        enterFunc=new JButton();
        enterFunc.setFont(new java.awt.Font("Calibri", 2, 14));
        enterFunc.setText("Enter Functions");
        
        name=new JTextField(10);
        name.setFont(new java.awt.Font("Courier", 2, 14));
        
        extendclass=new JTextField(10);
        extendclass.setFont(new java.awt.Font("Courier", 2, 14));
        extendclass.setEnabled(false);
        
        funcNumber=new JTextField(5);
        funcNumber.setFont(new java.awt.Font("Courier", 2, 14));
        
        intargs=new JTextField(20);
        intargs.setFont(new java.awt.Font("Courier", 2, 14));
        intargs.setEnabled(false);
        
        floatargs=new JTextField(20);
        floatargs.setFont(new java.awt.Font("Courier", 2, 14));
        floatargs.setEnabled(false);
        
        doubleargs=new JTextField(20);
        doubleargs.setFont(new java.awt.Font("Courier", 2, 14));
        doubleargs.setEnabled(false);
        
        charargs=new JTextField(20);
        charargs.setFont(new java.awt.Font("Courier", 2, 14));
        charargs.setEnabled(false);
        
        boolargs=new JTextField(20);
        boolargs.setFont(new java.awt.Font("Courier", 2, 14));
        boolargs.setEnabled(false);
        
        stringargs=new JTextField(20);
        stringargs.setFont(new java.awt.Font("Courier", 2, 14));
        stringargs.setEnabled(false);
        
        intcb=new JCheckBox();
        floatcb=new JCheckBox();
        doublecb=new JCheckBox();
        charcb=new JCheckBox();
        boolcb=new JCheckBox();
        stringcb=new JCheckBox();
        extcb=new JCheckBox();
        maincb=new JCheckBox();
        
        intcb.addItemListener(this);
        floatcb.addItemListener(this);
        doublecb.addItemListener(this);
        charcb.addItemListener(this);
        boolcb.addItemListener(this);
        stringcb.addItemListener(this);
        extcb.addItemListener(this);
        
        panel1.add(className);
        panel1.add(name);
        panel1.add(extcb);
        panel1.add(extendlab);
        panel1.add(extendclass);
        panel1.add(containsMain);
        panel1.add(maincb);
        
        panel2.add(dataTyp);
        panel2.add(blanklab);
        panel2.add(Mem);
        panel2.add(intlab);
        panel2.add(intcb);
        panel2.add(intargs);
        panel2.add(floatlab);
        panel2.add(floatcb);
        panel2.add(floatargs);
        panel2.add(doublelab);
        panel2.add(doublecb);
        panel2.add(doubleargs);
        panel2.add(charlab);
        panel2.add(charcb);
        panel2.add(charargs);
        panel2.add(boollab);
        panel2.add(boolcb);
        panel2.add(boolargs);
        panel2.add(stringlab);
        panel2.add(stringcb);
        panel2.add(stringargs);
        
        panel3.add(panel5);
        panel3.add(panel6);
        
        panel4.add(finish);
        
        panel5.add(numberoffunc);
        panel5.add(funcNumber);
        
        panel6.add(enterFunc);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        ClassData classObj[]=new ClassData[classes];
        finish.setEnabled(false);
        enterFunc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterFunc.setEnabled(false);
                boolean status=false;
                classObj[i]=new ClassData();
                classObj[i].noOfFunctions=Integer.parseInt(funcNumber.getText().trim());
                if(maincb.isSelected()){
                    classObj[i].noOfFunctions++;
                    mainclassno=i;
                    status=true;
                }
                FuncFrame obj=new FuncFrame();
                obj.main(classObj[i].noOfFunctions,classObj[i],status);
                finish.setEnabled(true);
            }
        });
        
        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finish.setEnabled(false);
                enterFunc.setEnabled(true);
                classObj[i].className=""+name.getText();
                if(extcb.isSelected()) {
                    classObj[i].inherits=""+extendclass.getText();
                }
                if(intcb.isSelected()) {
                    classObj[i].intVars=""+intargs.getText();
                }
                if(floatcb.isSelected()) {
                    classObj[i].floatVars=""+floatargs.getText();
                }
                if(doublecb.isSelected()) {
                    classObj[i].doubleVars=""+doubleargs.getText();
                }
                if(charcb.isSelected()) {
                    classObj[i].charVars=""+charargs.getText();
                }
                if(boolcb.isSelected()) {
                    classObj[i].booleanVars=""+boolargs.getText();
                }
                if(stringcb.isSelected()) {
                    classObj[i].stringVars=""+stringargs.getText();
                }
                
                name.setText("");
                extendclass.setText("");
                intargs.setText("");
                floatargs.setText("");
                doubleargs.setText("");
                charargs.setText("");
                boolargs.setText("");
                stringargs.setText("");
                funcNumber.setText("");
                

                i++;
                if(i==classes){
                    FileWriter fw=null;
                    File file=null;
                    for(i=0;i<classes;i++){
                       try {
                            file=new File("E:\\PROJECTS\\FY MSC MINI PROJECT\\SkeletonCodeGenerator\\Generated Files\\"+classObj[mainclassno].className+".java");
                            if(i==0)
                                fw=new FileWriter(file);
                            else
                                fw = new FileWriter(file,true);
                            if(classObj[i].inherits!=null)
                                fw.write("\n\nclass "+classObj[i].className+" extends "+classObj[i].inherits+"{\n");
                            else
                                fw.write("\n\nclass "+classObj[i].className+"{\n");
                            if(classObj[i].intVars!=null)
                                fw.write("\tint "+classObj[i].intVars+";\n");
                            if(classObj[i].floatVars!=null)
                                fw.write("\tfloat "+classObj[i].floatVars+";\n");
                            if(classObj[i].doubleVars!=null)
                                fw.write("\tdouble "+classObj[i].doubleVars+";\n");
                            if(classObj[i].charVars!=null)
                                fw.write("\tchar "+classObj[i].charVars+";\n");
                            if(classObj[i].booleanVars!=null)
                                fw.write("\tboolean "+classObj[i].booleanVars+";\n");
                            if(classObj[i].stringVars!=null)
                                fw.write("\tString "+classObj[i].stringVars+";\n");
                            if(classObj[i].noOfFunctions!=0)
                            for(l=0;l<classObj[i].noOfFunctions;l++){
                                fw.write("\n\t"+classObj[i].functions[l]+"\n");
                            }
                            fw.write("}");
                    
                            fw.close();
                        } 
                        catch (IOException ex) {
                            System.out.println(ex);
                        } 
                    }
                    
                    Frame1 obj=new Frame1();
                    obj.main();
                    frame.dispose();
                }
                
                intcb.setSelected(false);
                floatcb.setSelected(false);
                doublecb.setSelected(false);
                charcb.setSelected(false);
                boolcb.setSelected(false);
                stringcb.setSelected(false);
                maincb.setSelected(false);
                extcb.setSelected(false);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie){
        if(intcb.isSelected())
            intargs.setEnabled(true);
        else{
            intargs.setEnabled(false);
            intargs.setText("");
        }
        if(floatcb.isSelected())
            floatargs.setEnabled(true);
        else{
            floatargs.setEnabled(false);
            floatargs.setText("");
        }
        if(doublecb.isSelected())
            doubleargs.setEnabled(true);
        else{
            doubleargs.setEnabled(false);
            doubleargs.setText("");
        }
        if(charcb.isSelected())
            charargs.setEnabled(true);
        else{
            charargs.setEnabled(false);
            charargs.setText("");
        }
        if(boolcb.isSelected())
            boolargs.setEnabled(true);
        else{
            boolargs.setEnabled(false);
            boolargs.setText("");
        }
        if(stringcb.isSelected())
            stringargs.setEnabled(true);
        else{
            stringargs.setEnabled(false);
            stringargs.setText("");
        }
        if(extcb.isSelected())
            extendclass.setEnabled(true);
        else{
            extendclass.setEnabled(false);
            extendclass.setText("");
        }
    }
   
    int i=0,j,k,l,mainclassno=0;
    
    public void main(int classes) {
        Frame2 obj=new Frame2();
        obj.GUI(classes);
        frame.setSize(600,600);
        frame.setLocation(300,100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
