package trabalho_final;

import javax.swing.JFrame;


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
    }
    
}
