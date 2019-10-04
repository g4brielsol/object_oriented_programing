/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pratica_1;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
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
    protected int escolha_emprestimo_devolucao = -1;
    
    protected void pegar_inicio()
    {
        System.out.println("Digite 1 para Cadastrar um Usuario,\n"
                          + "Digite 2 para Cadastrar uma Midia ou\n"
                          + "Digite 3 para Busca ou Emprestimo: ");
        //ler_teclado.nextLine();
        try
        {
           String ler = ler_teclado.nextLine();
           this.escolha_inicial = Integer.parseInt(ler);
           while(this.escolha_inicial < 1 || this.escolha_inicial > 3)
               
            {
                System.out.println("Invalido, tente novamente");
                this.pegar_inicio();
            }
        
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            //ler_teclado.nextLine();
            this.pegar_inicio();
        }
    }
    
    protected int emprestar_devolver()
    {
        System.out.print("Digite 0 para emprestimo de livros,\n"
                + "Digite 1 para devolucao de livros\n");
        try
        {
            String ler = ler_teclado.nextLine();
            this.escolha_emprestimo_devolucao = Integer.parseInt(ler);
            while(this.escolha_emprestimo_devolucao < 0 ||
                    this.escolha_emprestimo_devolucao > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.emprestar_devolver();
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            //ler_teclado.nextLine();
            this.emprestar_devolver();
        }
        return(this.escolha_emprestimo_devolucao);
    }
        
    protected int fechar_programa()
    {
        System.out.print("Deseja fechar o programa? digite 1 se sim,\n"
                + "Senao tecle 0 para fazer outra operacao\n");
        try
        {
            String ler = ler_teclado.nextLine();
            this.escolha_final = Integer.parseInt(ler);
            while(this.escolha_final < 0 || this.escolha_final > 1)

             {
                 System.out.println("Invalido, tente novamente");
                 this.fechar_programa();
             }
        }
        catch(Exception e)
        {
            System.out.println("Invalido, tente novamente");
            //ler_teclado.nextLine();
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
        ArrayList<String> array_emprestimo = new ArrayList<String>();
        ArrayList<String> array_livro = new ArrayList<String>();
        ArrayList<String> array_devolucao = new ArrayList<String>();
        
        ArrayList<String> array_titulo = new ArrayList<String>();
        ArrayList<String> array_autor = new ArrayList<String>();
        ArrayList<String> array_editora = new ArrayList<String>();
        ArrayList<String> array_localizacao = new ArrayList<String>();
        ArrayList<String> array_secao = new ArrayList<String>();
        ArrayList<String> array_tipo_midia = new ArrayList<String>();
        ArrayList<Boolean> array_disponivel = new ArrayList<Boolean>();
        Scanner ler_teclado = new Scanner(System.in);
        Aula_pratica_1 comeco = new Aula_pratica_1(); 
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        int decisao = 0;
        int indice_pessoa = -1;
        int decisao_terceiro_menu;

        while(decisao == 0)
        {   
            comeco.pegar_inicio();
            if(comeco.escolha_inicial == 1)
            {
                Aluno cadastro = new Aluno();
                //aluno.cadastrar_aluno();
                cadastro.nome = cadastro.set_name();
                array_nome.add(cadastro.nome);
                cadastro.numero_usp = cadastro.set_num_USP("Digite o Numero USP: ");
                array_n_usp.add(cadastro.numero_usp);
                cadastro.data_nascimento = cadastro.set_data("Digite a data de nascimento no formato: dd/MM/yyyy ");
                array_data_nascimento.add(cadastro.data_nascimento);
                cadastro.nome_rua = cadastro.set_name_street();
                array_nome_rua.add(cadastro.nome_rua);
                cadastro.numero_rua = cadastro.set_num_street();
                array_numero_rua.add(cadastro.numero_rua);
                cadastro.chave = -1;
                cadastro.cidade = cadastro.set_city();
                array_cidade.add(cadastro.cidade);
                array_debito.add(cadastro.debito_biblioteca);
                array_emprestimo.add(null);
                array_livro.add("None");
                array_devolucao.add(null);
            }
           else
            {
                if(comeco.escolha_inicial == 2)
                {
                    Midia cadastro = new Midia();
                    cadastro.titulo = cadastro.set_feature("Digite o Titulo: ");
                    array_titulo.add(cadastro.titulo);
                    cadastro.autor = cadastro.set_feature("Digite o Autor: ");
                    array_autor.add(cadastro.autor);
                    cadastro.tipo_midia = cadastro.set_feature("Digite o Tipo de Midia: ");
                    array_tipo_midia.add(cadastro.tipo_midia);
                    cadastro.editora = cadastro.set_feature("Digite a Editora: ");
                    array_editora.add(cadastro.editora);
                    cadastro.localizacao = cadastro.set_feature("Digite a Localizacao: ");
                    array_localizacao.add(cadastro.localizacao);
                    cadastro.secao = cadastro.set_feature("Digite a Secao: ");
                    array_secao.add(cadastro.secao);
                    array_disponivel.add(cadastro.disponivel_emprestimo);
                }
                else
                {
                    if(comeco.escolha_inicial == 3)
                    {
                        Aula_pratica_1 biblioteca = new Aula_pratica_1();
                        decisao_terceiro_menu = biblioteca.emprestar_devolver();
                        Aluno emprestimo_aluno = new Aluno();
                        emprestimo_aluno.data_atual = emprestimo_aluno.set_data("Digite a data atual no formato: dd/MM/yyyy ");

                        if(decisao_terceiro_menu == 0) // emprestimo
                        {
                            indice_pessoa = emprestimo_aluno.buscar_num_USP(array_n_usp);
                            if(indice_pessoa >= 0)
                            {
                                if(array_debito.get(indice_pessoa) == true) // se a pessoa tem dividas
                                {
                                    try
                                    {
                                        Date inicio = data.parse(emprestimo_aluno.data_atual);
                                        Date fim = data.parse(array_devolucao.get(indice_pessoa));
                                        long diferenca = fim.getTime() - inicio.getTime();
                                        if(diferenca >= 0)
                                        {
                                            System.out.println(array_nome.get(indice_pessoa) +
                                                " precisa devolver a midia " + array_livro.get(indice_pessoa) +
                                                " ate a data " + data.format(fim));
                                        }
                                        else
                                        {
                                            System.out.println(array_nome.get(indice_pessoa) +
                                                    " deveria ter devolvido a midia " +
                                                    array_livro.get(indice_pessoa) +
                                                    " em " +
                                                    data.format(fim) + 
                                                    ", esta atrasado em " + ((-1) * diferenca/86400000) + 
                                                    " dia(s)!");
                                        }
                                    }
                                    catch(Exception e)
                                    {
                                        ;
                                    }
                                }
                                else // se a pessoa nao tem dividas
                                {
                                    Midia emprestar_livro = new Midia();
                                    int indice_livro;
                                    emprestar_livro.buscar_titulo = emprestar_livro.buscar_titulo_autor();
                                    indice_livro = emprestar_livro.buscar_catalogo(array_titulo, array_autor, 
                                                                                   emprestar_livro.buscar_titulo);
                                    //System.out.println("Digito usuario " + emprestar_livro.buscar_titulo);
                                    if(indice_livro == -1) // livro nao encontrado
                                    {
                                        System.out.println("Livro nao encontrado!!");

                                    }
                                    else // livro encontrado
                                    {
                                        System.out.println("Livro Encontrado: " + array_titulo.get(indice_livro));
                                        if(array_disponivel.get(indice_livro) == true)
                                        {
                                            System.out.println("O livro esta disponivel para emprestimo!");
                                            emprestimo_aluno.data_emprestimo = emprestimo_aluno.set_data("Digite a data de emprestimo no formato: dd/MM/yyyy ");
                                            Calendar c = Calendar.getInstance();
                                            try
                                            {    
                                                c.setTime(data.parse(emprestimo_aluno.data_emprestimo));
                                            }
                                            catch(Exception e)
                                            {
                                                ;
                                            }
                                            c.add(Calendar.DATE, 7);  // adiciona 7 dias a data de emprestimo
                                            emprestimo_aluno.data_devolucao = data.format(c.getTime()); 
                                            array_emprestimo.set(indice_pessoa, emprestimo_aluno.data_emprestimo);
                                            array_devolucao.set(indice_pessoa, emprestimo_aluno.data_devolucao);
                                            array_debito.set(indice_pessoa, true);
                                            array_livro.set(indice_pessoa, array_titulo.get(indice_livro));
                                            array_disponivel.set(indice_livro, false); 
                                            System.out.println("Emprestimo cadastrado com sucesso!");

                                        }
                                        else // livro alugado por outra pessoa
                                        {
                                            System.out.println("O livro nao esta disponivel para emprestimo");
                                        }
                                    }
                                }
                            }
                        }
                        else // devolucao de midias
                        {
                            indice_pessoa = emprestimo_aluno.buscar_num_USP(array_n_usp);
                            if(array_debito.get(indice_pessoa) == true) // se a pessoa tem debitos
                            {
                                try
                                {
                                    Date inicio = data.parse(emprestimo_aluno.data_atual);
                                    Date fim = data.parse(array_devolucao.get(indice_pessoa));
                                    long diferenca = fim.getTime() - inicio.getTime();
                                    if(diferenca >= 0) // se a pessoa ainda esta no prazo
                                    {
                                        System.out.println(array_nome.get(indice_pessoa) +
                                            " pode devolver a midia " + array_livro.get(indice_pessoa) +
                                            " sem multa ate a data " + data.format(fim));
                                        Midia emprestar_livro = new Midia();
                                        emprestar_livro.conclusao = emprestar_livro.devolver("Digite 1 para concluir a devolucao,\n",
                                                                               "Digite 0 para nao concluir\n");
                                        if(emprestar_livro.conclusao == 1)
                                        {    
                                            int indice_livro;
                                            emprestar_livro.buscar_titulo = array_livro.get(indice_pessoa);
                                            indice_livro = emprestar_livro.buscar_catalogo(array_titulo, array_autor, 
                                                                                       emprestar_livro.buscar_titulo);
                                            array_emprestimo.set(indice_pessoa, null);
                                            array_devolucao.set(indice_pessoa, null);
                                            array_debito.set(indice_pessoa, false);
                                            array_livro.set(indice_pessoa, null);
                                            array_disponivel.set(indice_livro, true); 
                                            System.out.println("Devolucao concluida com sucesso!");
                                        }
                                        else
                                        {
                                            System.out.println("Devolucao nao concluida!");
                                        }
                                    }
                                    else // pessoa deve pagar multas com a biblioteca
                                    {
                                        System.out.println(array_nome.get(indice_pessoa) +
                                                " deveria ter devolvido a midia " +
                                                array_livro.get(indice_pessoa) +
                                                " em " +
                                                data.format(fim) + 
                                                ", esta atrasado em " + ((-1) * diferenca/86400000) + 
                                                " dia(s)!");
                                        Midia emprestar_livro = new Midia();
                                        emprestar_livro.conclusao = emprestar_livro.devolver("Digite 1 se a pessoa "
                                                + "pagou a multa e concluiu a devolucao,\n", "Digite 0 se a pessoa "
                                                        + "nao pagou a multa e nao concluiu a devolucao");
                                        if(emprestar_livro.conclusao == 1)
                                        {    
                                            int indice_livro;
                                            emprestar_livro.buscar_titulo = array_livro.get(indice_pessoa);
                                            indice_livro = emprestar_livro.buscar_catalogo(array_titulo, array_autor, 
                                                                                       emprestar_livro.buscar_titulo);
                                            array_emprestimo.set(indice_pessoa, null);
                                            array_devolucao.set(indice_pessoa, null);
                                            array_debito.set(indice_pessoa, false);
                                            array_livro.set(indice_pessoa, null);
                                            array_disponivel.set(indice_livro, true); 
                                            System.out.println("Devolucao concluida com sucesso!");
                                        }
                                        else
                                        {
                                            System.out.println("Devolucao nao concluida!");
                                        }
                                    }
                                }
                                catch(Exception e)
                                {
                                    ;
                                }
                            }
                            else
                            {
                                System.out.println(array_nome.get(indice_pessoa) + " nao possui nenhum debito com a biblioteca");
                            }
                        }
                        
                    }
                                    
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


