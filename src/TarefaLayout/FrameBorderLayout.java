
package TarefaLayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 

public class FrameBorderLayout extends JFrame {

    
    public FrameBorderLayout() {
        
	
	JPanel P = new JPanel();
        JPanel A = new JPanel();
        JPanel N = new JPanel();
        JPanel E = new JPanel();
        JPanel L = new JPanel();
        
	
	JButton B1 = new JButton ("Botão 1");
        JButton B2 = new JButton ("Botão 2");
        JButton B3 = new JButton ("Botão 3");
        JButton B4 = new JButton ("Botão 4");
        JButton B5 = new JButton ("Botão 5");
        JButton B6 = new JButton ("Botão 6");
        JButton B7 = new JButton ("Botão 7");
        JButton B8 = new JButton ("Botão 8");
        JButton B9 = new JButton ("Botão 9");
        JButton B0 = new JButton ("Botão 0");
        
	//Localização de cada Painel
	JLabel L1 = new JLabel(" Parte Sul");
        JLabel L2 = new JLabel(" Parte Central");
        JLabel L3 = new JLabel(" Parte Oeste");
        JLabel L4 = new JLabel(" Parte Leste");
        JLabel L5 = new JLabel(" Parte Norte");
        
	//Layouts
	BorderLayout m = new BorderLayout();
        BorderLayout g = new BorderLayout();
        BorderLayout f = new BorderLayout();
        BorderLayout c = new BorderLayout();
        BorderLayout t = new BorderLayout();
        
    }
}