import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame {
    private JPanel      JP1      = new JPanel(),
                        JP2      = new JPanel(),
                        JP3      = new JPanel(),
                        JP4      = new JPanel();                       
    private JButton     JB       = new JButton("Login");
    private JLabel      Jl1      = new JLabel(new ImageIcon("unnamed.jpg")),
                        Jl2      = new JLabel(" Username : "),
                        Jl3      = new JLabel(" Password : "); 
                                  
    private JTextField  JT2     = new JTextField(10),
                        JT3     = new JTextField(10);              
                                     
    App(){
        setSize(600,300);                                              
        setLayout(new FlowLayout());                                 
        setTitle("Covid-19_HUB");                                      

        JP1.setLayout(new FlowLayout());                                
            JP1.add(Jl1);                                     
        JP2.setLayout(new FlowLayout());                            
            JP2.add(Jl2);                                            
            JP2.add(JT2);
        JP3.setLayout(new FlowLayout());    
            JP3.add(Jl3);
            JP3.add(JT3);
        JP4.setLayout(new FlowLayout());    
            JP4.add(JB);
        add(JP1);                                                       
        add(JP2);                                                       
        add(JP3);
        add(JP4);
        setVisible(true);                                               
        setDefaultCloseOperation(EXIT_ON_CLOSE);                        
    }
}
class Main {
    public static void main(String[] args) {
        new App();                                                      // Create App Instance and run it
    }
}