package trabalho_final;

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
        interface_grafica.setBounds(0, 0, 700, 500);
        interface_grafica.setTitle("Docs");
        interface_grafica.setVisible(true);
        interface_grafica.setResizable(false);
        interface_grafica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
