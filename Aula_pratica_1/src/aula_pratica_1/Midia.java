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
    
    protected String set_titulo()
    {
        System.out.println("Digite o Titulo: ");
        this.titulo = ler_teclado.nextLine();
        if(this.titulo.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_titulo();
        }
        return(this.titulo);
    }
    
    protected String set_autor()
    {
        System.out.println("Digite o Autor: ");
        this.autor = ler_teclado.nextLine();
        if(this.autor.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_autor();
        }    
        return(this.autor);
    }

    protected String set_tipo_midia()
    {
        System.out.println("Digite o Tipo de Midia: ");
        this.tipo_midia = ler_teclado.nextLine();
        if(this.tipo_midia.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_tipo_midia();
        }
        return(this.tipo_midia);
    }
    
    protected String set_editora()
    {
        System.out.println("Digite a Editora: ");
        this.editora = ler_teclado.nextLine();
        if (this.editora.length() <= 1) {
            System.out.println("Invalido, tente novamente");
            this.set_editora();
        }
        return(this.editora);
    }    
    
    protected String set_localizacao()
    {
        System.out.println("Digite a Localizacao: ");
        this.localizacao = ler_teclado.nextLine();
        if(this.localizacao.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_localizacao();
        }
        return(this.localizacao);
    }
    
    protected String set_secao()
    {
        System.out.println("Digite a Secao: ");
        this.secao = ler_teclado.nextLine();
        if(this.secao.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_secao();
        } 
        return(this.secao);
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
            if(array.get(i).contains(digito_usuario))
            {
                indice = i;
                return(i);
            }
        }
        if(indice < 0)
        {
            for(i = 0; i < array_1.size(); i++)
            {
                //System.out.println("autor" + array.get(i));
                //System.out.println("contem string " + array.get(i).contains(digito_usuario));
                if(array_1.get(i).contains(digito_usuario))
                {
                    return(i);
                }                
            }
        }
        return(indice);
    }
    protected int devolver()
    {
        System.out.print("Digite 1 para concluir a devolucao,\n"
                + "Digite 0 para nao concluir\n");
        try
        {
            this.conclusao = ler_teclado.nextInt();
            while(this.conclusao < 0 ||
                    this.conclusao > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.devolver();
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            ler_teclado.nextLine();
            this.devolver();
        }
        return(this.conclusao);
    }
}
