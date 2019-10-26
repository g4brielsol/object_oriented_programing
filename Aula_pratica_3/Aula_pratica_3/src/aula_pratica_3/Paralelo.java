package aula_pratica_3;

import static java.lang.Thread.sleep;
import java.text.DecimalFormat;

/**
 *
 * @author gabriel
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
    
    protected Paralelo retorna_timer()
    {
        Paralelo instancia_objeto = new Paralelo();
        return(instancia_objeto);
    }
    
    protected float get_mili()
    {
        return this.timer_milisegundos;
    }
    
    protected int get_sec()
    {
        return this.timer_segundos;
    }
    
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
                DecimalFormat min_seg_formato = new DecimalFormat("00");
                DecimalFormat mili_formato = new DecimalFormat("000");
                
                    timer_milisegundos += 1.2;
                    sleep(1);
                    if(timer_milisegundos > 999)
                    {
                        timer_milisegundos = 0;
                        timer_segundos += 1;
                    }                    
                    if(timer_segundos > 59)
                    {
                        timer_segundos = 0;
                        timer_minutos += 1;
                    }
                    if(timer_minutos > 59)
                    {
                        timer_minutos = 0;
                    }
                    
                    Cronometro.milisegundos.setText(mili_formato.format(timer_milisegundos));
                    Cronometro.segundos.setText(min_seg_formato.format(timer_segundos));
                    Cronometro.minutos.setText(min_seg_formato.format(timer_minutos));

            }    
            catch(InterruptedException ex)
            {
                return;
            }
        }

    };
                 
}
