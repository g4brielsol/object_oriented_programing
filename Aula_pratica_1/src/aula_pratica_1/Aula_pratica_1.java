/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;
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
    protected int escolha_inicial;
    
    protected void pegar_inicio()
    {
        System.out.println("Digite 1 para Cadastrar um Usuario,\n"
                          + "Digite 2 para Cadastrar uma Midia ou\n"
                          + "Digite 3 para Busca ou Emprestimo: ");
        try
        {
           this.escolha_inicial = ler_teclado.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            ler_teclado.nextLine();
            this.pegar_inicio();
        }
    }        
    
    public static void main(String[] args) 
    {
        Aula_pratica_1 comeco = new Aula_pratica_1(); 
        comeco.pegar_inicio();
        //comeco.ler_teclado.nextLine();
        Aluno aluno = new Aluno();
        aluno.cadastrar_aluno();
        System.out.println("aluno nome: " + aluno.nome.length());
        // TODO code application logic here3
    }
}


