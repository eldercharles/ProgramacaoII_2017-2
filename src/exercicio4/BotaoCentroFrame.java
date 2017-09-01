
package exercicio4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BotaoCentroFrame extends JFrame {
 
   private JButton centerJButton; // button to set alignment center
   private FlowLayout layout; // layout object
   private Container container; // container to set layout
   
   // set up GUI and register button listeners
   public BotaoCentroFrame()
   {
      super( "FlowLayout Demo" );

      layout = new FlowLayout(); // create FlowLayout
      container = getContentPane(); // get container to layout
      setLayout( layout ); // set frame layout
      
      

      // set up centerJButton and register listener
      centerJButton = new JButton( "Center" ); // create Center button
      add( centerJButton ); // add Center button to frame
      centerJButton.addActionListener(

         new ActionListener() // anonymous inner class 
         { 
            // process centerJButton event  
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.LEFT );

               // realign attached components
               layout.layoutContainer( container );
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

   }
}