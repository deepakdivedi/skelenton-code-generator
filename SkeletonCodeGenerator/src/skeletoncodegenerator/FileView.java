package skeletoncodegenerator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class FileView {
    static JFrame frame;
    JButton ExitButton;
    JTextArea displaycode;
    JLabel filename;
    JPanel panel1,panel2,panel3;
    JScrollPane pane;
    
    void GUI(File f,JFrame frame1) throws FileNotFoundException, IOException{
        
        frame=new JFrame();
        
        ExitButton=new JButton();
        ExitButton.setFont(new java.awt.Font("Calibri", 2, 14));
        ExitButton.setText("EXIT");
        
        filename=new JLabel();
        filename.setFont(new java.awt.Font("Calibri", 2, 14));
        filename.setText("File Name : ");
        
        displaycode=new JTextArea();
        displaycode.setEditable(false);
        displaycode.setVisible(true);

        pane=new JScrollPane(displaycode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.getVerticalScrollBar().setValue(1);
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
      
        frame.add(panel1);
        panel1.setLayout(new BorderLayout());
        panel1.add(panel2,BorderLayout.NORTH);
        panel1.add(pane,BorderLayout.CENTER);
        panel1.add(panel3,BorderLayout.SOUTH);
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
                
        panel2.add(filename);
        panel3.add(ExitButton);
        
        filename.setText("File name : "+f.getName());
        
        FileReader fr=new FileReader(f);
        char[] data=new char[(int)f.length()];
        fr.read(data);
        String code=new String(data);
        
        displaycode.setText(code);
        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame1.setVisible(true);
            }
        });
    }
    public void main(File f,JFrame frame1) throws IOException {
        FileView obj=new FileView();
        obj.GUI(f,frame1);
        frame.setSize(500,400);
        frame.setLocation(450,250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
