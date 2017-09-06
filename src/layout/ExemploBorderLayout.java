package layout;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExemploBorderLayout extends JFrame {
        private JButton botaosul;
        private JButton botaonorte;
        private JButton botaooeste;
        private JButton botaoleste;
        private JButton botaocentro;
        
        private BorderLayout layout;

   
        public ExemploBorderLayout(){
            botaosul = new JButton("Botão ao Sul");
            botaonorte = new JButton("Botão ao Norte");
            botaooeste = new JButton("Botão a Esquerda");
            botaoleste = new JButton("Botão a Direita");
            botaocentro = new JButton("Botão ao Centro");
            layout = new BorderLayout();
        
            this.setLayout (layout);
            
            
            this.add(botaosul, BorderLayout.SOUTH);
            this.add(botaonorte,BorderLayout.NORTH);
            this.add(botaooeste, BorderLayout.WEST);
            this.add(botaoleste,BorderLayout.EAST);
            this.add(botaocentro,BorderLayout.CENTER);
            
            this.setSize(400, 200);
            this.setLocation(500,200);
            this.setVisible(true);
       // layout.add(botaosul, BorderLayout.);
    
    
}   
}
