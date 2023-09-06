import java.awt.*;
import java.awt.event.*;

public class City extends Frame implements ActionListener{
    Frame f = new Frame();
    Label l;
    TextArea T;
    TextField t;
    Button b1, b2;
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            T.append(t.getText()+"\n");
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    }
    City(){
        f.setBounds(100,100,400,400);
        f.setTitle("List Box Demo");
        f.setLayout(null);
        f.setVisible(true);

        l = new Label("Enter City");
        T = new TextArea();
        t = new TextField();
        b1 = new Button("ADD>>");
        b2 = new Button("EXIT");

        T.setEditable(false);

        l.setBounds(50,50,70,20);
        T.setBounds(220,90,120,100);
        t.setBounds(50,80,100,20);
        b1.setBounds(50,150,70,20);
        b2.setBounds(270,220,70,20);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(l);
        f.add(T);
        f.add(t);
        f.add(b1);
        f.add(b2);
    }
    public static void main(String[] args) {
        new City();
    }
}