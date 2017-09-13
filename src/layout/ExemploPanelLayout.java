
package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ExemploPanelLayout extends JFrame{

        private JPanel painelSul;
        private JButton botaoPainelLeste;
        private JButton botaoPainelLeste2;
        
        
        public ExemploPanelLayout() {
            
            painelSul = new JPanel ();
            botaoPainelLeste = new JButton("Botao Painel leste");
            botaoPainelLeste2 = new JButton("Botao Painel leste2");
            
            FlowLayout layout = new FlowLayout ();
            
            painelSul.setLayout(layout);
            painelSul.add(botaoPainelLeste);
            
            this.add(botaoPainelLeste, BorderLayout.EAST);
    }
    
}
