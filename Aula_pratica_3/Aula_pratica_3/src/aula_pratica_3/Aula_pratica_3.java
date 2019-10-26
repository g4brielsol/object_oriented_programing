package aula_pratica_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author gabriel
 */
public class Aula_pratica_3 {

    public static void main(String[] args) 
    {
        Cronometro cronometro = new Cronometro();
        cronometro.setBounds(0,0,380,200);
        cronometro.setTitle("Cronometro");
        cronometro.setVisible(true);
        cronometro.setResizable(false);
        cronometro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
