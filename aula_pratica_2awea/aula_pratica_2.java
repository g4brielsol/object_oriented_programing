package aula_pratica_2;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.*;


public class aula_pratica_2
{ // nome da classe publica deve ser o mesmo do arquivo

    Scanner ler_teclado = new Scanner(System.in);
    protected int escolha_lista = -1;
    protected int finalizar_programa = -1;

    protected int escolha_0_ou_1(String frase)
    {
        protected int zero_ou_um = -1;
        System.out.println(frase);
        try
        {
            String ler = ler_teclado.nextLine();
            this.zero_ou_um = Integer.parseInt(ler);
            while(this.zero_ou_um < 0 || this.zero_ou_um > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.escolha_0_ou_1();
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            this.escolha_0_ou_1();
        }
        return(this.zero_ou_um);
    }
    public static void main(String[] args) 
    {
        aula_pratica_2 lista = new aula_pratica_2();
        while(lista.finalizar_programa != 1)
        {
            aula_pratica_2.escolha_lista = aula_pratica_2.escolha_0_ou_1("Digite 0 para Lista
                                                                Encadeada, \n Digite 1 pra Lista Sequencial");
            if(aula_pratica_2.escolha_lista == 0)
            {
                System.println("Lista Encadeada");
            }
            else if(aula_pratica_2.escolha_lista == 0)
            {
                System.println("Lista Sequencial");
            }
            aula_pratica_2.finalizar_programa = aula_pratica_2.escolha_0_ou_1("Digite 0 para reiniciar o programa
                                                   , \nou  Digite 1 pra finalizar o programa");
        }

    }

}