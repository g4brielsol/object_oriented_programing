package aula_pratica_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.*;
import java.util.LinkedList;

public class lista extends imprimivel
{
    LinkedList<usuario> lista = new LinkedList<usuario>();
    protected int tam;

    public int tamanho()
    {
        return lista.size();
    }
    
    public void inserir(usuario nome)
    {
        lista.addLast(nome);
    }
    
    public void remover(usuario nome)
    {
        int i, removido = 0;
        for(i = 0; i < lista.size(); i++)
        {
            if(lista.get(i).getNome().compareTo(nome.getNome()) == 0)
            {
                lista.remove(i);
                removido = 1;
            }
        }
        if(removido == 0)
        {
            System.out.println("Nome nao foi encontrado!");
        }
    }
}