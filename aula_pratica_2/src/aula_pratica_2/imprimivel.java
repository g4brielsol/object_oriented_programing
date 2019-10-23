package aula_pratica_2;

import java.util.LinkedList;

public class imprimivel 
{
    public void imprimir(LinkedList<usuario> lista_para_imprimir)
    {
        int i;
        // se a lista nao tiver usuarios
        if(lista_para_imprimir.size() < 1)
        {
            System.out.println("Lista nao possui nenhum usuario!");
        }
        // se a lista tiver pelo menos um usuario
        else
        {
            for(i = 0; i < lista_para_imprimir.size(); i++)
            {
                System.out.print(lista_para_imprimir.get(i).getNome() + " ");
            }
            System.out.println();
        }
    }
    
}
