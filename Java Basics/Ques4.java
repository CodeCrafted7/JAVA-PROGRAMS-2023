/*import java.awt.*;
import java.awt.event.*;

public class Ques4 implements ActionListener{
    TextField t1,t2;
    Button b;
    Label l1,l2,l3;
    int Operation(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int res = (x*x)-(y*y);
        return res;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
            if(t1.getText().equals("") && t2.getText().equals(""))
                l3.setText("Enter the Numbers");
            else
                l3.setText(Integer.toString(Operation()));
    }
    Ques4(){
        Frame f = new Frame();
        f.addWindowListener(new WindowL());
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Operation Perform");
        f.setBounds(100,100,400,400);

        l1 = new Label("Enter First Number");
        l2 = new Label("Enter Second Number");
        l3 = new Label("");
        t1 = new TextField();
        t2 = new TextField();
        b = new Button("SUBMIT");

        l1.setBounds(50,50,120,20);
        l2.setBounds(50,80,120,20);
        t1.setBounds(180,50,50,20);
        t2.setBounds(180,80,50,20);
        l3.setBounds(100,120,100,20);
        b.setBounds(100,150,50,20);

        b.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(l3);
        f.add(b);
    }   
    public static void main(String[] args) {
        new Ques4();
    } 
}

class WindowL implements WindowListener{
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        e.getWindow().dispose();
    }
}*/import java.awt.*;
import java.awt.event.*;

public class Ques4 implements ActionListener{
    TextField t1,t2;
    Button b;
    Label l1,l2,l3;
    int Operation(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int res = (x*x)-(y*y);
        return res;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
            if(t1.getText().equals("") && t2.getText().equals(""))
                l3.setText("Enter the Numbers");
            else
                l3.setText(Integer.toString(Operation()));
    }
    Ques4(){
        Frame f = new Frame();
        f.addWindowListener(new WindowL());
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Operation Perform");
        f.setBounds(100,100,400,400);

        l1 = new Label("Enter First Number");
        l2 = new Label("Enter Second Number");
        l3 = new Label("");
        t1 = new TextField();
        t2 = new TextField();
        b = new Button("SUBMIT");

        l1.setBounds(50,50,120,20);
        l2.setBounds(50,80,120,20);
        t1.setBounds(180,50,50,20);
        t2.setBounds(180,80,50,20);
        l3.setBounds(100,120,100,20);
        b.setBounds(100,150,50,20);

        b.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(l3);
        f.add(b);
    }   
    public static void main(String[] args) {
        new Ques4();
    } 
}

class WindowL implements WindowListener{
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        e.getWindow().dispose();
    }
}