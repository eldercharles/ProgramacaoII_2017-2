package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExemploGridLayout extends JFrame {
        private JButton one;
        private JButton two;
        private JButton three;
        private JButton four;
        private JButton five;
        private JButton six;
        
        private GridLayout layout;

   
        public ExemploGridLayout(){
            one = new JButton("one");
            two = new JButton("two");
            three = new JButton("three");
            four = new JButton("four");
            five = new JButton("five");
            six = new JButton("six");
            
            layout = new GridLayout(2,3,5,5);
        
            this.setLayout (layout);
            
            
            this.add(one);
            this.add(two);
            this.add(three);
            this.add(four);
            this.add(five);
            this.add(six);
            
            this.setSize(400, 200);
            this.setLocation(500,200);
            this.setVisible(true);
       // layout.add(botaosul, BorderLayout.);
    
    
}   
}
