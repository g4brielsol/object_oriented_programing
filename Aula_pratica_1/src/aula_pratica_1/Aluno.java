/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.*;
/**
 *
 * @author gabriel
 */
public class Aluno 
{
    protected String nome;
    protected int chave = -1;
    protected String nome_rua;
    protected int numero_rua;
    protected String cidade;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    protected String data;
    protected String data_nascimento;
    protected String data_emprestimo;
    protected String data_devolucao;
    protected String data_atual;
    protected int numero_usp;
    protected int numero_usp_emprestimo;
    protected boolean debito_biblioteca = false;
    Scanner ler_teclado = new Scanner(System.in);
    
    protected String set_name()
    {
        System.out.println("Digite o nome: ");
        this.nome = ler_teclado.nextLine();
        if(this.nome.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_name();
        }    
        return (this.nome);   
    }
    protected int set_num_USP(String frase)
    {
        System.out.println(frase);
        try
        {
            String receiver = ler_teclado.nextLine();
            this.numero_usp = Integer.parseInt(receiver);
            if((String.valueOf(this.numero_usp).length() < 1) || 
                    (String.valueOf(this.numero_usp).length() > 7) ||
                    (this.numero_usp <= 0)
                    )
            {
                ler_teclado.nextLine();
                System.out.println("Invalido, tente novamente");
                this.set_num_USP(frase);
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_num_USP(frase);
        }
        return(this.numero_usp);
    }
    protected int buscar_num_USP(ArrayList<Integer> array)
    {
        int n_usp = this.set_num_USP("Digite o Numero USP de quem quer fazer o emprestimo: ");
        for(int i = 0; i < array.size(); i++)
        {
            if(n_usp == array.get(i))
            {
                System.out.println(array.get(i) +
                                   " encontrado!");
                return(i);
            }
        }
        System.out.println("Pessoa nao encontrada, tente novamente");
        return(-1);
    }
    
    
    protected String set_data(String frase)
    {
        //ler_teclado.nextLine();
        System.out.println(frase);
        try
        {
            this.data = ler_teclado.nextLine();
            if(this.data.length() != 10)
            {
                System.out.println("Invalido, tente novamente");
                this.set_data(frase);
            }
            else
            {
                if(Integer.parseInt(this.data.substring(0,2)) < 1 || 
                   Integer.parseInt(this.data.substring(0,2)) > 31 ||
                   Integer.parseInt(this.data.substring(3,5)) < 1 || 
                   Integer.parseInt(this.data.substring(3,5)) > 12 ||
                   Integer.parseInt(this.data.substring(6,10)) > 2019 || 
                   Integer.parseInt(this.data.substring(6,10)) < 1910     
                   )
                {
                    System.out.println("Invalido, tente novamente");
                    this.set_data(frase);
                }
                else
                {
                    if(Integer.parseInt(this.data.substring(3,5)) < 1 || 
                       Integer.parseInt(this.data.substring(3,5)) > 12) 
                    { 
                        System.out.println("Invalido, tente novamente");
                        this.set_data(frase); 
                    }
                    else
                    {
                        if(this.data.substring(2,3).equals("/")
                                && this.data.substring(5,6).equals("/"))
                        {
                            ;
                        }
                        else
                        {   
                            System.out.println("Invalido, tente novamente");
                            this.set_data(frase);
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_data(frase);
        }
        return(this.data);
    }
    
    protected String set_name_street() 
    {
        System.out.println("Digite o Nome da Rua: ");
        this.nome_rua = ler_teclado.nextLine();
        if(this.nome_rua.length() == 0 || this.nome_rua.length() < 7)
        {
            System.out.println("Invalido, tente novamente");
            this.set_name_street();
        }
        return(this.nome_rua);
    }
    protected int set_num_street()
    {
        System.out.println("Digite o Numero da Rua: ");
        try
        {
            this.numero_rua = ler_teclado.nextInt();
            if(String.valueOf(this.numero_rua).length() <= 0 ||
               String.valueOf(this.numero_rua).length() > 4)
            {
                System.out.println("Invalido, tente novamente");
                //ler_teclado.nextInt();
                this.set_num_street();
            }
        }
        catch(Exception e)
        {
            ler_teclado.nextLine();
            System.out.println("Invalido, tente novamente");
            this.set_num_street();
        }
        //ler_teclado.nextLine();
        return(this.numero_rua);
    }
    protected String set_city()
    {
        ler_teclado.nextLine();
        System.out.println("Digite a Cidade: ");

        this.cidade = ler_teclado.nextLine();
        if(this.cidade.length() <= 0 || this.cidade.length() >= 40)
        {
            System.out.println("Invalido, tente novamente");
            this.set_city();
        }       
        return(this.cidade);
    }
}
