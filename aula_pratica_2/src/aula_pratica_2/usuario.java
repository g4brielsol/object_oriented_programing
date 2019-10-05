package aula_pratica_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.io.*;
import java.util.LinkedList;

public class usuario
{
    private String nome;
    // construtor
    protected usuario(String name)
    {
        this.nome = name;
    }
    //modificar nome
    public void setNome(String novo_nome)
    {
        this.nome = novo_nome;
    }
        // pegar nome
    public String getNome()
    {
        return (this.nome);
    }
}
