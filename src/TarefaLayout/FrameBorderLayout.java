
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
        
	
	JButton BT1 = new JButton ("Botão 1");
        JButton BT2 = new JButton ("Botão 2");
        JButton BT3 = new JButton ("Botão 3");
        JButton BT4 = new JButton ("Botão 4");
        JButton BT5 = new JButton ("Botão 5");
        JButton BT6 = new JButton ("Botão 6");
        JButton BT7 = new JButton ("Botão 7");
        JButton BT8 = new JButton ("Botão 8");
        JButton BT9 = new JButton ("Botão 9");
        JButton BT0 = new JButton ("Botão 0");
        
	//Localização de cada Painel
	JLabel L1 = new JLabel(" Parte Sul");
        JLabel L2 = new JLabel(" Parte Central");
        JLabel L3 = new JLabel(" Parte Oeste");
        JLabel L4 = new JLabel(" Parte Leste");
        JLabel L5 = new JLabel(" Parte Norte");
                
	//Layouts
	BorderLayout B = new BorderLayout();
        BorderLayout S = new BorderLayout();
        BorderLayout Y = new BorderLayout();
        BorderLayout O = new BorderLayout();
        BorderLayout CENTRO = new BorderLayout();
        
	//Propriedades
        super.setTitle("Exercicio Programação ");
        
        P.setLayout(B);
        P.add(BT1, B.NORTH);
        P.add(BT2, B.SOUTH);
        P.add(L5, B.CENTER);
        add(P, B.NORTH);
        
        A.setLayout(S);
        A.add(BT3, S.NORTH);
        A.add(BT4, S.SOUTH);
        A.add(L1, S.CENTER);
        add(A, S.SOUTH);
        
        N.setLayout(Y);
        N.add(BT5, Y.NORTH);
        N.add(BT6, Y.SOUTH);
        N.add(L4, Y.CENTER);
        add(N, Y.EAST);
        
        E.setLayout(O);
        E.add(BT7, O.NORTH);
        E.add(BT8, O.SOUTH);
        E.add(L3, O.CENTER);
        add(E, O.WEST);
        
        L.setLayout(CENTRO);
        L.add(BT9, CENTRO.NORTH);
        L.add(BT0, CENTRO.SOUTH);
        L.add(L2, CENTRO.CENTER);
        add(L, CENTRO.CENTER);
        
        
        
   }
	//Execução do Aplicativo java
      public static void main(String args[]) {
        FrameBorderLayout B = new FrameBorderLayout();
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setSize(500,250); 
        B.setVisible(true);
    }

}

