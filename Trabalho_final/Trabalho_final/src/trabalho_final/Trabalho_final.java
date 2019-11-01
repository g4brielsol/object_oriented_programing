package trabalho_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Trabalho_final 
{
    public static void main(String[] args)
    {
        Trab_interface interface_grafica = new Trab_interface();
        // pega o tamanho da tela do monitor do usuario
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        interface_grafica.setBounds(0, 0, 700, 500);
        // faz a janela do docs ser inicializada no centro da tela do usuario
        interface_grafica.setLocation(dim.width/2-interface_grafica.getSize().width/2, dim.height/2-interface_grafica.getSize().height/2);
        
        interface_grafica.setTitle("Docs");
        interface_grafica.setVisible(true);
        interface_grafica.setResizable(true);
        interface_grafica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // interface nao fazer scroll lateral
        interface_grafica.text_area.setLineWrap(true);
        // undo e redo sem limites de arquivos salvos
        interface_grafica.fazer_refazer.setLimit(-1);
        interface_grafica.text_area.getDocument().addUndoableEditListener
        (
           new UndoableEditListener()
           {
                //interface_grafica.fazer_refazer.isSignificant(10);//.isSignificant();
                public void undoableEditHappened(UndoableEditEvent e)
                {
                    interface_grafica.fazer_refazer.addEdit(e.getEdit());
                }
           }
        );
    }
    
}
