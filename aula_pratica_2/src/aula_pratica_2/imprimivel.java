package aula_pratica_2;

import java.util.LinkedList;

public class imprimivel 
{
    public void imprimir(LinkedList<usuario> lista_para_imprimir)
    {
        int i;
        if(lista_para_imprimir.size() < 1)
        {
            System.out.println("Lista nao possui nenhum usuario!");
        }
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
