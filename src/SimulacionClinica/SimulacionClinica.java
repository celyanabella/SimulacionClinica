/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionClinica;

/**
 *
 * @author HP USER
 */
import java.lang.*;import java.awt.*;import java.awt.event.*;import javax.swing.*;

public class SimulacionClinica {



static JFrame ventana= new JFrame();

static JScrollPane panel1 = new JScrollPane();

private JTextArea areaTexto1, areaTexto2;


public static void main(String[] args)

{ 





}; 

    void ini(String progreso) {
     Box cuadro = Box.createHorizontalBox();
      ventana.setTitle("Progreso del programa");
      areaTexto1 = new JTextArea( progreso, 100, 35);
     cuadro.add( new JScrollPane( areaTexto1 ) );



panel1.setViewportView(areaTexto1);



ventana.getContentPane().add(panel1,BorderLayout.CENTER);

ventana.pack(); ventana.setVisible(true);  
    }

    

} 