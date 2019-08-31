/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;
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
    protected String nome_rua;
    protected int numero_rua;
    protected String cidade;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    protected String data_nascimento;
    protected int numero_usp;
    Scanner ler_teclado = new Scanner (System.in);
    
    protected void set_name()
    {
        System.out.println("Digite o nome: ");
        this.nome = ler_teclado.nextLine();
        //this.nome = "0";
        if(this.nome.length() == 0)
        {
            System.out.println("Invalido, tente novamente");
            this.set_name();
        }
    }
    protected void set_num_USP()
    {
        System.out.print("Digite o Numero USP: ");
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
    }
        protected void set_data_nascimento()
    {
        System.out.println("Digite a data de nascimento no formato: dd/MM/yyyy ");
        //ler_teclado.nextLine();
        try
        {            
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
                            Date date = format.parse(this.data_nascimento);
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
    }
    
    
    protected void set_name_street() 
    {
        System.out.println("Digite o Nome da Rua: ");
        this.nome_rua = ler_teclado.nextLine();
        if(this.nome_rua.length() == 0 || this.nome_rua.length() < 7)
        {
            System.out.println("Invalido, tente novamente");
            this.set_name_street();
        }
    }
    protected void set_num_street()
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
         
        
    }
    protected void set_city()
    {
        System.out.println("Digite a Cidade: ");
        this.cidade = ler_teclado.nextLine();
        if(this.cidade.length() <= 0 || this.cidade.length() >= 40)
        {
            System.out.println("Invalido, tente novamente");
            this.set_city();
        }        
    }    
    protected void cadastrar_aluno()
    {
        this.set_name();
        this.set_num_USP();
        ler_teclado.nextLine();
        this.set_data_nascimento();
        this.set_name_street();
        this.set_num_street();
        this.set_city();
    }

    
}
