/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;

/**
 *
 * @author gabsolsilva
 */
public class Aula_pratica_1 { // nome da classe publica deve ser o mesmo do arquivo

    //private String 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite 1 para Cadastrar um Usuario,\n"
                            + "Digite 2 para Cadastrar uma Midia ou\n"
                            + "Digite 3 para Busca ou Emprestimo: ");  
        Scanner selecao_inicial = new Scanner (System.in);
        String escolha_inicial = selecao_inicial.nextLine();
        System.out.println("Escolha inicial " + escolha_inicial);
        // TODO code application logic here
    }
    
}
