package aula_pratica_3;

import static java.lang.Thread.sleep;
import java.text.DecimalFormat;

/**
 *
 * @author gabriel sol
 */
public class Paralelo extends Thread implements Runnable {

    protected int thread_rodando;
    protected float timer_milisegundos;
    protected int timer_segundos;
    protected int timer_minutos;
    
    public Paralelo()
    {
        this.thread_rodando = 1;
        this.timer_milisegundos = 0;
        this.timer_segundos = 0;
        this.timer_minutos = 0;
    }
    // funcao que retorna um novo objeto da classe Paralelo
    protected Paralelo retorna_timer()
    {
        Paralelo instancia_objeto = new Paralelo();
        return(instancia_objeto);
    }
    // retorna os milisegundos da thread
    protected float get_mili()
    {
        return this.timer_milisegundos;
    }
    // retorna os segundos da thread
    protected int get_sec()
    {
        return this.timer_segundos;
    }
    // retorna os minutos da thread
    protected int get_min()
    {
        return this.timer_minutos;
    }
    
    public void run()
    {
        while(thread_rodando == 1)
        {
            try
            {
                // cria o formato definido pelo exercicio
                DecimalFormat min_seg_formato = new DecimalFormat("00");
                DecimalFormat mili_formato = new DecimalFormat("000");
                    // passo dos milisegundos, o valor de 1.195 e um valor 
                    // que nem atrasa nem adianta muito em relacao a um timer
                    // de celular, varios testes comparativos foram feitos
                    // para determinar esse valor
                    timer_milisegundos += 1.195;
                    // thread espera 1 milisegundo
                    sleep(1);
                    // se os milisegundos forem maior que 999
                    if(timer_milisegundos > 999)
                    {
                        // milisegundo se torna 0 e segundo e incrementado com 1
                        timer_milisegundos = 0;
                        timer_segundos += 1;
                    }
                    // se os segundos forem maior que 59
                    if(timer_segundos > 59)
                    {
                        // segundo se torna 0 e minutos e incrementado com 1
                        timer_segundos = 0;
                        timer_minutos += 1;
                    }
                    // se os minutos forem maior que 59
                    if(timer_minutos > 59)
                    {
                        // minutos se torna 0 novamente
                        timer_minutos = 0;
                    }
                    // o valor dos milisegundos, segundos e minutos sao escrito 
                    // nos text fields do cronometro
                    Cronometro.milisegundos_text_field.setText(mili_formato.format(timer_milisegundos));
                    Cronometro.segundos_text_field.setText(min_seg_formato.format(timer_segundos));
                    Cronometro.minutos_text_field.setText(min_seg_formato.format(timer_minutos));
            }
            // se for interrompido, para a thread
            catch(InterruptedException ex)
            {
                return;
            }
        }

    };
                 
}
