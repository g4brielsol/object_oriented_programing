package aula_pratica_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author gabriel sol
 */
public class Cronometro extends javax.swing.JFrame {
    Paralelo thread_timer = new Paralelo();
    // define o formato a ser passado para o jTextField
    DecimalFormat min_seg_formato = new DecimalFormat("00");
    DecimalFormat mili_formato = new DecimalFormat("000"); 
        
    protected int botao_iniciar_pausar = 0;
    protected float timer_milisegundos = 0;
    protected int timer_segundos = 0;
    protected int timer_minutos = 0;
    
    public Cronometro() {
        initComponents();
        // fazer os text fields nao editáveis
        this.minutos_text_field.setEditable(false);
        this.segundos_text_field.setEditable(false);
        this.milisegundos_text_field.setEditable(false);
       // setar os valores iniciais dos text fields no formato definido pelo exercicio
        this.minutos_text_field.setText(min_seg_formato.format(0));
        this.segundos_text_field.setText(min_seg_formato.format(0));
        this.milisegundos_text_field.setText(mili_formato.format(0));
    }
    // código gerado pelo proprio netbeans para o JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minutos_text_field = new javax.swing.JTextField();
        milisegundos_text_field = new javax.swing.JTextField();
        segundos_text_field = new javax.swing.JTextField();
        iniciar_pausar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minutos_text_field.setText("minutos");
        minutos_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutos_text_fieldActionPerformed(evt);
            }
        });

        milisegundos_text_field.setText("milisegundos");
        milisegundos_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milisegundos_text_fieldActionPerformed(evt);
            }
        });

        segundos_text_field.setText("segundos");
        segundos_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundos_text_fieldActionPerformed(evt);
            }
        });

        iniciar_pausar.setText("Iniciar");
        iniciar_pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_pausarActionPerformed(evt);
            }
        });

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(minutos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(segundos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milisegundos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniciar_pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milisegundos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutos_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechar)
                    .addComponent(reset)
                    .addComponent(iniciar_pausar))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // fim do codigo gerado pelo netbeans
    private void minutos_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutos_text_fieldActionPerformed

    }//GEN-LAST:event_minutos_text_fieldActionPerformed

    private void milisegundos_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milisegundos_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milisegundos_text_fieldActionPerformed

    private void segundos_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundos_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundos_text_fieldActionPerformed
    // Botao Iniciar que vira Pausar ao ser clicado e vice versa
    private void iniciar_pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_pausarActionPerformed
        // Quando o botao Iniciar for clicado
        if (botao_iniciar_pausar == 0)
        {
            thread_timer.timer_milisegundos = timer_milisegundos;
            thread_timer.timer_segundos = timer_segundos;
            thread_timer.timer_minutos = timer_minutos;
            // iniciar a thread
            thread_timer.start();
            // coloca "Pausar" no text field
            this.iniciar_pausar.setText("Pausar");
            // altera a variavel botao_iniciar_pausar para quando o botao
            // for clicado novamente, para pausar, ele executar outras funcoes
            botao_iniciar_pausar = 1;
        }
        // Quando o botao Pausar for clicado
        else if(botao_iniciar_pausar == 1)
        {
            try
            {
                // salva os valores de milisegundos, segundos e minutos
                // antes de interromper a thread
                timer_milisegundos = thread_timer.get_mili();
                timer_segundos = thread_timer.get_sec();
                timer_minutos = thread_timer.get_min();
                // interrompe a thread
                thread_timer.interrupt();
                // thread_timer se torna um novo objeto da classe Paralelo
                thread_timer = thread_timer.retorna_timer();
                // muda o text field para "Iniciar"
                this.iniciar_pausar.setText("Iniciar");
                // coloca os valores de milisegundos, segundos e minutos
                // salvos anteriormente nos seus respectivos text fields
                this.milisegundos_text_field.setText(mili_formato.format(timer_milisegundos));
                this.segundos_text_field.setText(min_seg_formato.format(timer_segundos));
                this.minutos_text_field.setText(min_seg_formato.format(timer_minutos));
                // altera a variavel  botao_iniciar_pausar para quando o botao
                // for clicado novamente, para iniciar, ele executar outras funcoes
                botao_iniciar_pausar = 0;
            }
            catch(Exception e)
            {
                System.out.println("exp"+ e);
            }
        }
    }//GEN-LAST:event_iniciar_pausarActionPerformed
    // o botao fechar interrompe a thread e fecha a janela
    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        thread_timer.interrupt();
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed
    // botao Reset
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // colocar o texto "Iniciar" no botao Iniciar/Pausar
        this.iniciar_pausar.setText("Iniciar");
        try
        {
            // interrompe a thread
            thread_timer.interrupt();
            // thread_timer se torna um novo objeto da classe Paralelo
            thread_timer = thread_timer.retorna_timer();
            // Faz os valores milisegundos, segundos e minutos
            // comecarem do 0 quando o botao Iniciar for clicado novamente
            timer_milisegundos = 0;
            timer_segundos = 0;
            timer_minutos = 0;
            // coloca 0 nos text fields de milisegundos, segundos e minutos
            this.minutos_text_field.setText(min_seg_formato.format(0));
            this.segundos_text_field.setText(min_seg_formato.format(0));
            this.milisegundos_text_field.setText(mili_formato.format(0));
            // altera a variavel botao_iniciar_pausar para as funcoes
            // de Iniciar serem executadas quando o botao Iniciar/Pausar for clicado
            botao_iniciar_pausar = 0;
        }
        catch(Exception e)
        {
            System.out.println("exp"+ e);
        }

    }//GEN-LAST:event_resetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fechar;
    private javax.swing.JButton iniciar_pausar;
    protected static javax.swing.JTextField milisegundos_text_field;
    protected static javax.swing.JTextField minutos_text_field;
    private javax.swing.JButton reset;
    protected static javax.swing.JTextField segundos_text_field;
    // End of variables declaration//GEN-END:variables
}
