package skeletoncodegenerator;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Frame1 {
    static JFrame frame; 
    JButton NewButton,ViewButton,ExitButton;
    JPanel panel1,panel2,panel3;
    JFileChooser jfc;
    
    void GUI()
    {
        NewButton=new JButton();
        ViewButton=new JButton();
        ExitButton=new JButton();
        NewButton.setFont(new java.awt.Font("Calibri", 2, 14));
        NewButton.setText("NEW");
        ViewButton.setFont(new java.awt.Font("Calibri", 2, 14));
        ViewButton.setText("VIEW");
        ExitButton.setFont(new java.awt.Font("Calibri", 2, 14));
        ExitButton.setText("EXIT");
        
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        
        frame=new JFrame();
        
        frame.add(panel1);
        panel1.setLayout(new GridLayout(2,1));
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        
        panel1.add(panel2);
        panel1.add(panel3);
        
        panel2.add(NewButton);
        panel2.add(ViewButton);
        
        panel3.add(ExitButton);
        
        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        
        ViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jfc=new JFileChooser();
                
                jfc.setFileFilter(new javax.swing.filechooser.FileFilter() {
			public String getDescription() {
				return null;
			}
			public boolean accept(File arg0) {
				// TODO Auto-generated method stub
				return (arg0.getName().endsWith(".java"));
			}
		});
		jfc.setDialogTitle("Select File");
		jfc.setCurrentDirectory(new File("E:\\PROJECTS\\FY MSC MINI PROJECT\\SkeletonCodeGenerator\\Generated Files"));
                
                int r;
                r = jfc.showOpenDialog(frame.getContentPane());
		if(r==JFileChooser.APPROVE_OPTION)
		{
                    frame.setVisible(false);
                    File f1=jfc.getSelectedFile();
                    FileView fv=new FileView();
                    try {
                        fv.main(f1,frame);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
		else
                    JOptionPane.showMessageDialog(frame.getContentPane(),"Please select the file ");
            }
        });
        
        NewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int classes=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter How Many Classes:"));
                Frame2 f=new Frame2();
                f.main(classes);
                frame.dispose();
            }
        });
        
    }
    
    public void main() {
        Frame1 obj=new Frame1();
        obj.GUI();
        frame.pack();
        frame.setLocation(450,250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
