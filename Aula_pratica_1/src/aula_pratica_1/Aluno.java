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
    protected int chave_1 = -1;
    protected int chave_2 = -1;
    protected int chave_3 = -1;
    protected String nome_rua;
    protected int numero_rua;
    protected String cidade;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    protected String data_nascimento;
    protected String data_emprestimo;
    protected String data_devolucao;
    protected String data_atual;
    protected int numero_usp;
    protected int numero_usp_emprestimo;
    protected boolean debito_biblioteca = false;
    Scanner ler_teclado = new Scanner (System.in);
    
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
    protected int set_num_USP()
    {
        System.out.print("Digite o Numero USP: \n");
        try
        {
            this.numero_usp = ler_teclado.nextInt();
            if((String.valueOf(this.numero_usp).length() <= 0) || 
                    (String.valueOf(this.numero_usp).length() > 7) ||
                    (this.numero_usp <= 0))
            {
                System.out.println("Invalido, tente novamente");
                this.set_num_USP();
            }
        }
        catch(Exception e)
        {
            ler_teclado.nextLine();
            System.out.println("Invalido, tente novamente");
            this.set_num_USP();
        }
        //ler_teclado.nextLine();
        return(this.numero_usp);
    }
    protected int set_num_USP_emprestimo()
    {
        System.out.print("Digite o Numero USP de quem quer fazer o emprestimo: \n");
        try
        {
            this.numero_usp_emprestimo = ler_teclado.nextInt();
            if((String.valueOf(this.numero_usp_emprestimo).length() <= 0) || 
                    (String.valueOf(this.numero_usp_emprestimo).length() > 7) ||
                    (this.numero_usp_emprestimo <= 0))
            {
                System.out.println("Invalido, tente novamente");
                this.set_num_USP_emprestimo();
            }
        }
        catch(Exception e)
        {
            ler_teclado.nextLine();
            System.out.println("Invalido, tente novamente");
            this.set_num_USP_emprestimo();
        }
        //ler_teclado.nextLine();
        return(this.numero_usp_emprestimo);
    }
    
        protected String set_data_nascimento()
    {
        //ler_teclado.nextLine();
        System.out.println("Digite a data de nascimento no formato: dd/MM/yyyy ");
        try
        {   
            if(this.chave < 0)
            {
                ler_teclado.nextLine();
                this.chave = 1;
            }
            this.data_nascimento = ler_teclado.nextLine();
            if(this.data_nascimento.length() != 10)
            {
                System.out.println("Invalido, tente novamente");
                this.set_data_nascimento();
            }
            else
            {
                if(Integer.parseInt(this.data_nascimento.substring(0,2)) < 1 || 
                   Integer.parseInt(this.data_nascimento.substring(0,2)) > 31)
                {
                    System.out.println("Invalido, tente novamente");
                    this.set_data_nascimento();
                }
                else
                {
                    if(Integer.parseInt(this.data_nascimento.substring(3,5)) < 1 || 
                       Integer.parseInt(this.data_nascimento.substring(3,5)) > 12) 
                    { 
                        System.out.println("Invalido, tente novamente");
                        this.set_data_nascimento(); 
                    }
                    else
                    {
                        if(this.data_nascimento.substring(2,3).equals("/")
                                && this.data_nascimento.substring(5,6).equals("/"))
                        {
                            ;
                        }
                        else
                        {   
                            System.out.println("Invalido, tente novamente");
                            this.set_data_nascimento();
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_data_nascimento();
        }
        return(this.data_nascimento);
    }
        
    protected String set_data_emprestimo()
    {
        //ler_teclado.nextLine();
        System.out.println("Digite a data de emprestimo no formato: dd/MM/yyyy ");
        try
        {   
            if(this.chave_1 < 0)
            {
                ler_teclado.nextLine();
                this.chave_1 = 1;
            }
            this.data_emprestimo = ler_teclado.nextLine();
            if(this.data_emprestimo.length() != 10)
            {
                System.out.println("Invalido, tente novamente");
                this.set_data_emprestimo();
            }
            else
            {
                if(Integer.parseInt(this.data_emprestimo.substring(0,2)) < 1 || 
                   Integer.parseInt(this.data_emprestimo.substring(0,2)) > 31)
                {
                    System.out.println("Invalido, tente novamente");
                    this.set_data_emprestimo();
                }
                else
                {
                    if(Integer.parseInt(this.data_emprestimo.substring(3,5)) < 1 || 
                       Integer.parseInt(this.data_emprestimo.substring(3,5)) > 12) 
                    { 
                        System.out.println("Invalido, tente novamente");
                        this.set_data_emprestimo(); 
                    }
                    else
                    {
                        if(this.data_emprestimo.substring(2,3).equals("/")
                                && this.data_emprestimo.substring(5,6).equals("/"))
                        {
                            ;
                        }
                        else
                        {   
                            System.out.println("Invalido, tente novamente");
                            this.set_data_emprestimo();
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_data_emprestimo();
        }
        return(this.data_emprestimo);
    }
    
    protected String set_data_devolucao()
    {
        //ler_teclado.nextLine();
        System.out.println("Digite a data de devolucao no formato: dd/MM/yyyy ");
        try
        {   
            if(this.chave_2 < 0)
            {
                ler_teclado.nextLine();
                this.chave_2 = 1;
            }
            this.data_devolucao = ler_teclado.nextLine();
            if(this.data_devolucao.length() != 10)
            {
                System.out.println("Invalido, tente novamente");
                this.set_data_devolucao();
            }
            else
            {
                if(Integer.parseInt(this.data_devolucao.substring(0,2)) < 1 || 
                   Integer.parseInt(this.data_devolucao.substring(0,2)) > 31)
                {
                    System.out.println("Invalido, tente novamente");
                    this.set_data_devolucao();
                }
                else
                {
                    if(Integer.parseInt(this.data_devolucao.substring(3,5)) < 1 || 
                       Integer.parseInt(this.data_devolucao.substring(3,5)) > 12) 
                    { 
                        System.out.println("Invalido, tente novamente");
                        this.set_data_devolucao(); 
                    }
                    else
                    {
                        if(this.data_devolucao.substring(2,3).equals("/")
                                && this.data_devolucao.substring(5,6).equals("/"))
                        {
                            ;
                        }
                        else
                        {   
                            System.out.println("Invalido, tente novamente");
                            this.set_data_devolucao();
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_data_devolucao();
        }
        return(this.data_devolucao);
    }
    protected String set_data_atual()
    {
        System.out.println("Digite a data atual no formato: dd/MM/yyyy ");
        try
        {   
            //if(this.chave_3 < 0)
            //{
            //    ler_teclado.nextLine();
            //    this.chave_3 = 1;
            //}
            this.data_atual = ler_teclado.nextLine();
            if(this.data_atual.length() != 10)
            {
                System.out.println("Invalido, tente novamente");
                this.set_data_atual();
            }
            else
            {
                if(Integer.parseInt(this.data_atual.substring(0,2)) < 1 || 
                   Integer.parseInt(this.data_atual.substring(0,2)) > 31)
                {
                    System.out.println("Invalido, tente novamente");
                    this.set_data_atual();
                }
                else
                {
                    if(Integer.parseInt(this.data_atual.substring(3,5)) < 1 || 
                       Integer.parseInt(this.data_atual.substring(3,5)) > 12) 
                    { 
                        System.out.println("Invalido, tente novamente");
                        this.set_data_atual(); 
                    }
                    else
                    {
                        if(this.data_atual.substring(2,3).equals("/")
                                && this.data_atual.substring(5,6).equals("/"))
                        {
                            ;
                        }
                        else
                        {   
                            System.out.println("Invalido, tente novamente");
                            this.set_data_atual();
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.set_data_atual();
        }
        return(this.data_atual);
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
        if(this.chave < 0)
        {
            ler_teclado.nextLine();
            this.chave = 1;
        }
        this.cidade = ler_teclado.nextLine();
        if(this.cidade.length() <= 0 || this.cidade.length() >= 40)
        {
            System.out.println("Invalido, tente novamente");
            this.set_city();
        }       
        return(this.cidade);
    }
}
