package vacina.project.Janelas;

import bancodados.model.VacinadosDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import usuarios.Vacinados;

public class MainAtendente extends javax.swing.JFrame {
    private VacinadosDAO vacinadosDAO = new VacinadosDAO();
    private List<Vacinados> listaFilaVacinar = new ArrayList();
    private Vacinados proximo = new Vacinados(); 
    
    public MainAtendente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogFilaVacinacao = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistFilaToVacinar = new javax.swing.JList<>();
        dialogVacinados = new javax.swing.JDialog();
        lblNomeRegistra = new javax.swing.JLabel();
        lblIdadeRegistra = new javax.swing.JLabel();
        lblPrioridadeRegistra = new javax.swing.JLabel();
        lblEnderecoRegistra = new javax.swing.JLabel();
        btnRegistrarVacina = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnFilaVacinacao = new javax.swing.JButton();

        dialogFilaVacinacao.setMinimumSize(new java.awt.Dimension(400, 300));

        jlistFilaToVacinar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlistFilaToVacinar);

        javax.swing.GroupLayout dialogFilaVacinacaoLayout = new javax.swing.GroupLayout(dialogFilaVacinacao.getContentPane());
        dialogFilaVacinacao.getContentPane().setLayout(dialogFilaVacinacaoLayout);
        dialogFilaVacinacaoLayout.setHorizontalGroup(
            dialogFilaVacinacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFilaVacinacaoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        dialogFilaVacinacaoLayout.setVerticalGroup(
            dialogFilaVacinacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFilaVacinacaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        dialogVacinados.setMinimumSize(new java.awt.Dimension(400, 300));

        lblNomeRegistra.setText("Nome:");

        lblIdadeRegistra.setText("Idade:");

        lblPrioridadeRegistra.setText("prioridade:");

        lblEnderecoRegistra.setText("Endereço:");

        btnRegistrarVacina.setText("Registrar vacina");
        btnRegistrarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVacinaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Proxima Vacina");

        javax.swing.GroupLayout dialogVacinadosLayout = new javax.swing.GroupLayout(dialogVacinados.getContentPane());
        dialogVacinados.getContentPane().setLayout(dialogVacinadosLayout);
        dialogVacinadosLayout.setHorizontalGroup(
            dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVacinadosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnderecoRegistra)
                    .addComponent(lblPrioridadeRegistra)
                    .addGroup(dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNomeRegistra)
                        .addComponent(lblIdadeRegistra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogVacinadosLayout.createSequentialGroup()
                .addGap(0, 136, Short.MAX_VALUE)
                .addGroup(dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarVacina)
                    .addComponent(jLabel5))
                .addGap(123, 123, 123))
        );
        dialogVacinadosLayout.setVerticalGroup(
            dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVacinadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblNomeRegistra)
                .addGap(18, 18, 18)
                .addComponent(lblIdadeRegistra)
                .addGap(18, 18, 18)
                .addComponent(lblPrioridadeRegistra)
                .addGap(18, 18, 18)
                .addComponent(lblEnderecoRegistra)
                .addGap(41, 41, 41)
                .addComponent(btnRegistrarVacina)
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Registros de vacinação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFilaVacinacao.setText("Fila de vacinação");
        btnFilaVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaVacinacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnFilaVacinacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton1)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addComponent(btnFilaVacinacao)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilaVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaVacinacaoActionPerformed
        dialogFilaVacinacao.setVisible(true);
        
        if(!listaFilaVacinar.isEmpty()){
            listaFilaVacinar.clear();
        }
        
        listaFilaVacinar.addAll(vacinadosDAO.getVacinadosGroupPrioridade());
        DefaultListModel listModel = new DefaultListModel();
        
        for(Vacinados pecorrer: listaFilaVacinar){
            if(!pecorrer.isVacinado()){
                listModel.addElement(pecorrer);
            }
        }
        
        jlistFilaToVacinar.setModel(listModel);
    }//GEN-LAST:event_btnFilaVacinacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogVacinados.setVisible(true);
        List<Vacinados> lista = vacinadosDAO.getVacinadosGroupPrioridade();
        Vacinados vac = null;
        for(Vacinados pecorre: lista){
            if(!pecorre.isVacinado()){
                vac = pecorre;
                break;
            }
        }
        
        lblNomeRegistra.setText("Nome: " + vac.getNome());
        lblIdadeRegistra.setText("Idade: " + Integer.toString(vac.getIdade()));
        lblEnderecoRegistra.setText("Endereço: " + vac.getEndereco());
        lblPrioridadeRegistra.setText("Prioridade: " + Integer.toString(vac.getPrioridade()));
        proximo = vac;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVacinaActionPerformed
        proximo.setData_vacinacao(LocalDate.now());
        vacinadosDAO.update(proximo);
        
        dialogVacinados.setVisible(false);
    }//GEN-LAST:event_btnRegistrarVacinaActionPerformed

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
            java.util.logging.Logger.getLogger(MainAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilaVacinacao;
    private javax.swing.JButton btnRegistrarVacina;
    private javax.swing.JDialog dialogFilaVacinacao;
    private javax.swing.JDialog dialogVacinados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlistFilaToVacinar;
    private javax.swing.JLabel lblEnderecoRegistra;
    private javax.swing.JLabel lblIdadeRegistra;
    private javax.swing.JLabel lblNomeRegistra;
    private javax.swing.JLabel lblPrioridadeRegistra;
    // End of variables declaration//GEN-END:variables
}
