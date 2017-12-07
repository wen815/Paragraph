
package paragraph;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Paragraph  extends JFrame{
/*height and width*/
        static final int HEIGHT=1000;
    static final int WIDTH=1000; 

    public static void main(String[] args) {
        /*show the frame*/
        JFrame jf=new JFrame();
jf.setTitle("Paragraph");
jf.setSize(HEIGHT,WIDTH);

/*create panel*/
Panel p=new Panel();
     p.setLayout(null);
/*textarea containing former context*/
JTextArea t1=new JTextArea();
p.add(t1);
   t1.setBounds(100,50,800,200);
 jf.add(p);  
 /*button*/
 JButton b=new JButton("Paragraph");
 p.add(b);
    b.setBounds(100,300,100,40);
 jf.add(p); 
 /*textarea containing paragraphs*/
JTextArea t2=new JTextArea();
p.add(t2);
   t2.setBounds(100,350,800,200);
 jf.add(p);  
 t1.setLineWrap(true);   t2.setLineWrap(true);   //change the line
t1.setWrapStyleWord(true); t2.setWrapStyleWord(true);  //no breaking the word
jf.show();
/*click event*/
b.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent event){
     String s1=t1.getText();
     String[]s2=s1.split("\n");
     String s3="";
     for(int i=0;i<s2.length;i++){
         s2[i]="<p>"+s2[i]+"</p>"+"\n";
         s3+=s2[i];
         t2.setText(s3);
     }
    }
});
}
}