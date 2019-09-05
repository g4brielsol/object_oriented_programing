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
 * @author gabsolsilva
 */


public class Aula_pratica_1 
{ // nome da classe publica deve ser o mesmo do arquivo

    //private String 
    /**
     * @param args the command line arguments
     */
    Scanner ler_teclado = new Scanner(System.in);
    protected int escolha_inicial = -1;
    protected int escolha_final = -1;
    
    protected void pegar_inicio()
    {
        System.out.println("Digite 1 para Cadastrar um Usuario,\n"
                          + "Digite 2 para Cadastrar uma Midia ou\n"
                          + "Digite 3 para Busca ou Emprestimo: ");
        try
        {
           this.escolha_inicial = ler_teclado.nextInt();
           while(this.escolha_inicial < 0 || this.escolha_inicial > 3)
               
            {
                System.out.println("Invalido, tente novamente");
                this.pegar_inicio();
            }
        
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            ler_teclado.nextLine();
            this.pegar_inicio();
        }
    }
    protected int fechar_programa()
    {
        System.out.print("Deseja fechar o programa? digite 1 se sim,\n"
                + "Senao tecle 0 para fazer outra operacao\n");
        try
        {
            this.escolha_final = ler_teclado.nextInt();
            while(this.escolha_final < 0 || this.escolha_final > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.fechar_programa();
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            ler_teclado.nextLine();
            this.fechar_programa();
        }
        return(this.escolha_final);
    }
        
    
    public static void main(String[] args) 
    {
        ArrayList<String> array_nome = new ArrayList<String>();
        ArrayList<Integer> array_n_usp = new ArrayList<Integer>();
        ArrayList<String> array_data_nascimento = new ArrayList<String>();
        ArrayList<String> array_nome_rua = new ArrayList<String>();
        ArrayList<Integer> array_numero_rua = new ArrayList<Integer>();
        ArrayList<String> array_cidade = new ArrayList<String>();
        ArrayList<Boolean> array_debito = new ArrayList<Boolean>();
        
        ArrayList<String> array_titulo = new ArrayList<String>();
        ArrayList<String> array_autor = new ArrayList<String>();
        ArrayList<String> array_editora = new ArrayList<String>();
        ArrayList<String> array_localizacao = new ArrayList<String>();
        ArrayList<String> array_secao = new ArrayList<String>();
        ArrayList<String> array_tipo_midia = new ArrayList<String>();
        ArrayList<Boolean> array_disponivel = new ArrayList<Boolean>();
        Scanner ler_teclado = new Scanner(System.in);
        Aula_pratica_1 comeco = new Aula_pratica_1(); 
        int decisao = 0;
        //comeco.escolha_inicial = -1;
        //while(String.valueOf(decisao).equals("0"))
        while(decisao == 0)
        {   
            comeco.pegar_inicio();
            if(comeco.escolha_inicial == 1)
            {
                Aluno funcao = new Aluno();
                Aluno cadastro = new Aluno();
                //aluno.cadastrar_aluno();
                cadastro.nome = funcao.set_name();
                array_nome.add(cadastro.nome);
                cadastro.numero_usp = funcao.set_num_USP();
                array_n_usp.add(cadastro.numero_usp);
                cadastro.data_nascimento = funcao.set_data_nascimento();
                array_data_nascimento.add(cadastro.data_nascimento);
                cadastro.nome_rua = funcao.set_name_street();
                array_nome_rua.add(cadastro.nome_rua);
                cadastro.numero_rua = funcao.set_num_street();
                array_numero_rua.add(cadastro.numero_rua);
                cadastro.chave = -1;
                cadastro.cidade = funcao.set_city();
                array_cidade.add(cadastro.cidade);
                array_debito.add(cadastro.debito_biblioteca);
            }
           else
            {
                if(comeco.escolha_inicial == 2)
                {
                    Midia funcao_midia = new Midia();
                    Midia cadastro = new Midia();
                    cadastro.titulo = funcao_midia.set_titulo();
                    array_titulo.add(cadastro.titulo);
                    cadastro.autor = funcao_midia.set_autor();
                    array_autor.add(cadastro.autor);
                    cadastro.tipo_midia = funcao_midia.set_tipo_midia();
                    array_tipo_midia.add(cadastro.tipo_midia);
                    cadastro.editora = funcao_midia.set_editora();
                    array_editora.add(cadastro.editora);
                    cadastro.localizacao = funcao_midia.set_localizacao();
                    array_localizacao.add(cadastro.localizacao);
                    cadastro.secao = funcao_midia.set_secao();
                    array_secao.add(cadastro.secao);
                    array_disponivel.add(cadastro.disponivel_emprestimo);
                }
                else
                {
                    ;
                }
            }
            decisao = comeco.fechar_programa();
            if(decisao == 1)
            {
                for(int i=0; i < array_nome.size(); i++)
                {
                    System.out.println(array_nome.get(i));
                }
                System.out.println("Fim do Programa!\n");
            }
        }
    }
}


