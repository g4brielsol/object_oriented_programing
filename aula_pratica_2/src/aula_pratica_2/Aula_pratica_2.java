package aula_pratica_2;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.*;
import java.util.LinkedList;


public class Aula_pratica_2
{ // nome da classe publica deve ser o mesmo do arquivo
    Scanner ler_teclado = new Scanner(System.in);
    protected int zero_ou_um;
    protected int zero_a_tres;
    protected int escolha_lista;
    protected int escolha_nome;
    protected int finalizar_programa;
    protected int qtd_nomes;
    protected String nome;
    protected String remove_nome;

    protected int escolha_0_ou_1(String frase)
    {
        this.zero_ou_um = -1;
        this.escolha_lista = -1;
        this.finalizar_programa = -1;
        this.escolha_nome = -1;
        
        System.out.println(frase);
        
        try
        {
            String ler = ler_teclado.nextLine();
            this.zero_ou_um = Integer.parseInt(ler);
            while(this.zero_ou_um < 0 || this.zero_ou_um > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.escolha_0_ou_1(frase);
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.escolha_0_ou_1(frase);
        }
        return(this.zero_ou_um);
    }
    protected int escolha_zero_a_tres(String frase)
    {
        this.zero_a_tres = -1;
        System.out.println(frase);
        try
        {
            String ler = ler_teclado.nextLine();
            this.zero_a_tres = Integer.parseInt(ler);
            while(this.zero_a_tres < 0 || this.zero_a_tres > 3)

             {
                 System.out.println("Invalido, tente novamente");
                 this.escolha_zero_a_tres(frase);
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.escolha_zero_a_tres(frase);
        }
        return(this.zero_a_tres);
    }
    
    protected String set_name(String frase)
    {
        System.out.println(frase);
        this.nome = ler_teclado.nextLine();
        if(this.nome.length() <= 1)
        {
            System.out.println("Invalido, tente novamente");
            this.set_name(frase);
        }    
        return (this.nome);   
    }
    protected int qtd_nomes(String frase)
    {
        this.qtd_nomes = -1;
        System.out.println(frase);
        try
        {
            String ler = ler_teclado.nextLine();
            this.qtd_nomes = Integer.parseInt(ler);
            while(this.qtd_nomes < 1 || this.qtd_nomes > 20)

             {
                 System.out.println("Invalido, tente novamente");
                 this.qtd_nomes(frase);
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.qtd_nomes(frase);
        }
        return(this.qtd_nomes);
    }
    
    
    public static void main(String[] args) 
    {
        Aula_pratica_2 lista = new Aula_pratica_2();
        while(lista.finalizar_programa != 1)
        {
            lista.escolha_lista = lista.escolha_0_ou_1("Digite 0 para Lista"
                              + " Encadeada, \nou Digite 1 pra Lista Sequencial:");
            if(lista.escolha_lista == 0)
            {
                lista_encadeada list_encadeada = new lista_encadeada();
                lista.escolha_nome = -1;
                while(lista.escolha_nome != 3)
                {
                    lista.escolha_nome = lista.escolha_zero_a_tres("Digite 0 para inserir um novo usuario, \n"
                            + "Digite 1 para remover um usuario, \n"
                            + "Digite 2 para imprimir a lista encadeada \n"
                            + "ou Digite 3 para prosseguir com o programa");
                    if(lista.escolha_nome == 0)
                    {
                        lista.qtd_nomes = lista.qtd_nomes("Quantos nomes voce deseja inserir? (entre 1 e 20)");
                        for(int qtd = 0; qtd < lista.qtd_nomes; qtd++)
                        {
                            lista.nome = lista.set_name("Digite o " + qtd + " nome a ser inserido");
                            list_encadeada.inserir(new usuario(lista.nome));
                        }
                    }
                    else if(lista.escolha_nome == 1)
                    {
                        lista.remove_nome = lista.set_name("Digite o nome a ser removido");
                        list_encadeada.remover(new usuario(lista.remove_nome));
                    }
                    else if (lista.escolha_nome == 2)
                    {
                        list_encadeada.imprimir(list_encadeada.lista);
                    } 
                }
            }
            else if(lista.escolha_lista == 1)
            {
                lista_sequencial lista_sequencial = new lista_sequencial();
                lista.escolha_nome = -1;
                while(lista.escolha_nome != 3)
                {
                    lista.escolha_nome = lista.escolha_zero_a_tres("Digite 0 para inserir um novo usuario, \n"
                            + "Digite 1 para remover um usuario, \n"
                            + "Digite 2 para imprimir a lista encadeada \n"
                            + "ou Digite 3 para prosseguir com o programa");
                    if(lista.escolha_nome == 0)
                    {
                        lista.qtd_nomes = lista.qtd_nomes("Quantos nomes voce deseja inserir? (entre 1 e 20)");
                        for(int qtd = 0; qtd < lista.qtd_nomes; qtd++)
                        {
                            lista.nome = lista.set_name("Digite o " + qtd + " nome a ser inserido");
                            lista_sequencial.inserir(new usuario(lista.nome));
                        }
                    }
                    else if(lista.escolha_nome == 1)
                    {
                        lista.remove_nome = lista.set_name("Digite o nome a ser removido");
                        lista_sequencial.remover(new usuario(lista.remove_nome));
                    }
                    else if (lista.escolha_nome == 2)
                    {
                        lista_sequencial.imprimir(lista_sequencial.lista);
                    } 
                }
            }
            lista.finalizar_programa = lista.escolha_0_ou_1("Digite 0 para reiniciar, "
                    + "               \nou Digite 1 pra finalizar o programa:");
        }

    }

}