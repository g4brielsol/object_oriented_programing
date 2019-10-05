/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.text.ParseException;
import java.io.*;

/**
 *
 * @author gabsolsilva
 */
public class Midia {
    protected String titulo;
    protected String autor;
    protected String tipo_midia;
    protected String editora;
    protected String localizacao;
    protected String secao;
    protected String buscar_titulo;
    protected int conclusao;
    protected int indice = -1;
    protected boolean disponivel_emprestimo = true;
    Scanner ler_teclado = new Scanner (System.in);
    
    protected String set_feature(String frase)
    {
        System.out.println(frase);
        this.titulo = ler_teclado.nextLine();
        if(this.titulo.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_feature(frase);
        }
        return(this.titulo);
    }    
    
    protected String buscar_titulo_autor()
    {
        System.out.println("Digite o titulo ou o autor. Ou digite parte do titulo ou do autor a ser encontrado: ");
        this.buscar_titulo = ler_teclado.nextLine();
        if(this.buscar_titulo.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.buscar_titulo_autor();
        } 
        return(this.buscar_titulo);
    }
    protected int buscar_catalogo(ArrayList<String> array, ArrayList<String> array_1, String digito_usuario)
    {
        int i;
        for(i = 0; i < array.size(); i++)
        {
            if(array.get(i).toLowerCase().contains(digito_usuario.toLowerCase()))
            {
                indice = i;
                return(i);
            }
        }
        if(indice < 0)
        {
            for(i = 0; i < array_1.size(); i++)
            {
                if(array_1.get(i).toLowerCase().contains(digito_usuario.toLowerCase()))
                {
                    return(i);
                }                
            }
        }
        return(indice);
    }
    protected int devolver(String frase_1, String frase_2)
    {
        System.out.println(frase_1
                + frase_2);
        try
        {
            this.conclusao = ler_teclado.nextInt();
            while(this.conclusao < 0 ||
                    this.conclusao > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.devolver(frase_1, frase_2);
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            ler_teclado.nextLine();
            this.devolver(frase_1, frase_2);
        }
        return(this.conclusao);
    }
}
