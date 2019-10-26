package aula_pratica_3;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author gabriel sol
 */
public class Aula_pratica_3 {

    public static void main(String[] args) 
    {
        // pega o tamanho da tela do monitor do usuario
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Cronometro cronometro = new Cronometro();
        // faz o tamanho da janela do cronometro
        cronometro.setBounds(0,0,380,200);
        // faz o cronometro ser inicializado no centro da tela do usuario
        cronometro.setLocation(dim.width/2-cronometro.getSize().width/2, dim.height/2-cronometro.getSize().height/2);
        // coloca o titulo da janela como "cronometro"
        cronometro.setTitle("Cronometro");
        cronometro.setVisible(true);
        // nao deixa o tamanho da janela ser alterado
        cronometro.setResizable(false);        
    }
    
}
