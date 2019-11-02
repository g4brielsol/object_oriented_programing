package trabalho_final;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.FileWriter;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class Trab_interface extends javax.swing.JFrame {
    // cria objeto da classe Clipboard para transferir dados de copiar e colar
    protected Clipboard clipboard = getToolkit().getSystemClipboard();  
    // cria objeto da classe UndoManager para fazer os Undos e os Redos
    protected static UndoManager fazer_refazer = new UndoManager();
    // nome do arquivo a ser salvo
    protected String nome_arquivo;
    
    public Trab_interface() {
        initComponents();
    }
    
    // codigo gerado pelo NetBeans ao criar um JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        refazer = new javax.swing.JButton();
        desfazer = new javax.swing.JButton();
        recortar = new javax.swing.JButton();
        colar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        refazer.setText("Refazer");
        refazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refazerActionPerformed(evt);
            }
        });

        desfazer.setText("Desfazer");
        desfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desfazerActionPerformed(evt);
            }
        });

        recortar.setText("Recortar");
        recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recortarActionPerformed(evt);
            }
        });

        colar.setText("Colar");
        colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colarActionPerformed(evt);
            }
        });

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });

        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(recortar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refazer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desfazer)
                    .addComponent(refazer)
                    .addComponent(recortar)
                    .addComponent(colar)
                    .addComponent(copiar)
                    .addComponent(salvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // contador de caracteres ao fazer Undo/Redo
    private int counter = 5;
    // funcao do botao Undo
    private void desfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desfazerActionPerformed
        //se for possivel executar o Desfazer
        if(fazer_refazer.canUndo())
        {
            // executa o Desfazer na quantidade especificada pelo counter
            while(counter != 0)
            {
                fazer_refazer.undo();
                counter -=1;
            }
            // counter volta ao seu valor inicial
            counter = 5;
        }
    }//GEN-LAST:event_desfazerActionPerformed
    // funcao do botao Redo
    private void refazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refazerActionPerformed
        // se for possivel executar o "Refazer"
        if(fazer_refazer.canRedo())
        {
            // executa o Refazer na quantidade especificada pelo counter
            while(counter != 0)
            {
                fazer_refazer.redo();
                counter -=1;
            }
            counter = 5;
        }
    }//GEN-LAST:event_refazerActionPerformed

    private void recortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recortarActionPerformed
        // pega o texto selecionado na caixa de texto escrita pelo usuario
        String string_recortada = text_area.getSelectedText();
        // cria um objeto com a capacidade de transferir a string recortada
        StringSelection string_selecionada = new StringSelection(string_recortada);
        // coloca a string_selecionada no objeto transferível
        clipboard.setContents(string_selecionada, string_selecionada);
        // substitui o texto selecionado por vazio ("")
        text_area.replaceRange("", text_area.getSelectionStart(), text_area.getSelectionEnd());
    }//GEN-LAST:event_recortarActionPerformed

    private void colarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colarActionPerformed
        try
        {
            // retorna um objeto transferível representando o conteudo atual do clipboard
            Transferable texto_copiado = clipboard.getContents(Trab_interface.this);
            // transforma o objeto transferido em string
            String texto_para_colar = (String) texto_copiado.getTransferData(DataFlavor.stringFlavor);
            // substitui o texto nas áreas de início e fim especificadas pela string texto_para_colar
            text_area.replaceRange(texto_para_colar, 
                                   text_area.getSelectionStart(),
                                   text_area.getSelectionEnd());
        }
        catch(Exception e)
        {
            System.out.println("Erro");   
        }
            
    }//GEN-LAST:event_colarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        // retorna o texto selecionado
        String string_copiada = text_area.getSelectedText();
        // cria um string capaz de ser transferida
        StringSelection string_selecionada = new StringSelection(string_copiada);
        // coloca a string_selecionada no conteudo atual do clipboard, que pode ser transferido
        clipboard.setContents(string_selecionada, string_selecionada);
    }//GEN-LAST:event_copiarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // cria um janela com a especificacao de salvar
        FileDialog janela_de_salvar = new FileDialog(Trab_interface.this, "Salvar arquivo ", FileDialog.SAVE);
        janela_de_salvar.setVisible(true);
        
        // se o arquivo nao for nulo, coloca o titulo na variavel nome_arquivo
        if(janela_de_salvar.getFile() != null)
        {
            // concatena o nome do diretorio com o nome doa arquivo
            nome_arquivo = janela_de_salvar.getDirectory() + janela_de_salvar.getFile();
            // coloca o nome_arquivo no frame
            setTitle(nome_arquivo);
        }
        try
        {
            // instancia o objeto que salva arquivos
            FileWriter salvar_arquivo = new FileWriter(nome_arquivo);
            // pega o texto escrito na area de texto do programa e salva
            salvar_arquivo.write(text_area.getText()) ;
            // colocar o titulo do arquivo
            setTitle(nome_arquivo);
            salvar_arquivo.close();
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_salvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Implementado pelo proprio NetBeans ao criar o JFrame
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Trab_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trab_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trab_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trab_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trab_interface().setVisible(true);
            }
        });
    }
    
    // Implementado pelo proprio NetBeans ao criar o JFrame
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colar;
    private javax.swing.JButton copiar;
    protected javax.swing.JButton desfazer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel;
    private javax.swing.JButton recortar;
    private javax.swing.JButton refazer;
    private javax.swing.JButton salvar;
    protected static javax.swing.JTextArea text_area;
    // End of variables declaration//GEN-END:variables

}
