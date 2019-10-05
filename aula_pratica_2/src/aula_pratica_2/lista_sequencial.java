package aula_pratica_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Collections;
import java.io.*;
import java.util.LinkedList;

public class lista_sequencial extends lista
{
    @Override
    public void inserir(usuario nome)
    {
        lista.addLast(nome);
        
        for(int ant = 0; ant < lista.size(); ant++)
        {
            for(int prox = ant + 1; prox < lista.size(); prox++)
            {
                if(lista.get(ant).getNome().compareTo(lista.get(prox).getNome()) > 0)
                {
                    usuario aux = new usuario(lista.get(ant).getNome());
                    lista.set(ant, lista.get(prox));
                    lista.set(prox, aux);
                }
            }
        }
    }
}