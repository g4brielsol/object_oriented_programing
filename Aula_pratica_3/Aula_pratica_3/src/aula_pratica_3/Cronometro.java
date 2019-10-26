
package aula_pratica_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author gabriel
 */
public class Cronometro extends javax.swing.JFrame {
    
    //Paralelo thread_mili = new Paralelo("milisegundos");
    //Paralelo thread_segundos = new Paralelo("segundos");
    //Paralelo thread_minutos = new Paralelo("minutos");
    Paralelo thread_timer = new Paralelo();
    DecimalFormat min_seg_formato = new DecimalFormat("00");
    DecimalFormat mili_formato = new DecimalFormat("000"); 
    
        
    protected int liga_desliga = 0;
    protected int timer_milisegundos = 0;
    protected int timer_segundos = 0;
    protected int timer_minutos = 0;
    
    public Cronometro() {
        initComponents();
        this.minutos.setEditable(false);
        this.segundos.setEditable(false);
        this.milisegundos.setEditable(false);
       

        this.minutos.setText(min_seg_formato.format(0));
        this.segundos.setText(min_seg_formato.format(0));
        this.milisegundos.setText(mili_formato.format(0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minutos = new javax.swing.JTextField();
        milisegundos = new javax.swing.JTextField();
        segundos = new javax.swing.JTextField();
        iniciar_pausar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minutos.setText("minutos");
        minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //minutosActionPerformed(evt);
            }
        });

        milisegundos.setText("milisegundos");
        milisegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //milisegundosActionPerformed(evt);
            }
        });

        segundos.setText("segundos");
        segundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //segundosActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniciar_pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {milisegundos, minutos, segundos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechar)
                    .addComponent(reset)
                    .addComponent(iniciar_pausar))
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {milisegundos, minutos, segundos});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed

  
    private void iniciar_pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_pausarActionPerformed

            if (liga_desliga == 0)
            {
                //thread_mili.start();
                //thread_segundos.start();
                //thread_minutos.start();
                //thread_timer = thread_timer.retorna_timer();
                thread_timer.start();

                this.iniciar_pausar.setText("Pausar");
                liga_desliga = 1;
            }
            else if(liga_desliga == 1)
            {
                try
                {
    
                    //thread_segundos.wait();
                    //thread_minutos.wait();
                    timer_milisegundos = thread_timer.get_mili();
                    timer_segundos = thread_timer.get_sec();
                    timer_minutos = thread_timer.get_min();
                    
                    thread_timer.interrupt();
                    thread_timer = thread_timer.retorna_timer();
                    
                    this.iniciar_pausar.setText("Iniciar");
                    
                    this.milisegundos.setText(mili_formato.format(timer_milisegundos));
                    this.segundos.setText(min_seg_formato.format(timer_segundos));
                    this.minutos.setText(min_seg_formato.format(timer_minutos));
                    
                    liga_desliga = 2;        
                }
                catch(Exception e)
                {
                    System.out.println("exp"+ e);
                }
            }
            else if(liga_desliga == 2)
            {
                try
                {
                    //thread_timer.thread_rodando = 1;
                    //thread_timer = thread_timer.retorna_timer();
                    thread_timer.timer_milisegundos = timer_milisegundos;
                    thread_timer.timer_segundos = timer_segundos;
                    thread_timer.timer_minutos = timer_minutos;
                    thread_timer.start();
                    this.iniciar_pausar.setText("Pausar");
                    liga_desliga = 1;        
                }
                catch(Exception e)
                {
                    System.out.println("exp "+ e);
                }
            }        
        
    }//GEN-LAST:event_iniciar_pausarActionPerformed
  
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

            this.iniciar_pausar.setText("Iniciar");
            try
            {
                
                
                //thread_mili.wait();
                
                //thread_segundos.wait();
                //thread_minutos.wait();
                thread_timer.interrupt();
                //Paralelo thread_timer =  new Paralelo();//thread_timer.retorna_timer();
                thread_timer = thread_timer.retorna_timer();
                //boolean interrompido = thread_timer.isInterrupted();
                //System.out.println("interrompido? " + interrompido);
                thread_timer.timer_milisegundos = 0;
                thread_timer.timer_segundos = 0;
                thread_timer.timer_minutos = 0; 
                
                timer_milisegundos = 0;
                timer_segundos = 0;
                timer_minutos = 0; 

                this.minutos.setText(min_seg_formato.format(0));
                this.segundos.setText(min_seg_formato.format(0));
                this.milisegundos.setText(mili_formato.format(0));
                
                liga_desliga = 2;
            }
            catch(Exception e)
            {
                System.out.println("exp"+ e);
            }
        
    }//GEN-LAST:event_resetActionPerformed

  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fechar;
    private javax.swing.JButton iniciar_pausar;
    protected static javax.swing.JTextField milisegundos;
    protected static javax.swing.JTextField minutos;
    private javax.swing.JButton reset;
    protected static javax.swing.JTextField segundos;
    // End of variables declaration//GEN-END:variables
}
