package vacina.project.Janelas;

import bancodados.model.VacinadosDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import usuarios.Vacinados;

public class MainAtendente extends javax.swing.JFrame {
    VacinadosDAO vacinadosDAO = new VacinadosDAO();
    List<Vacinados> listaFilaVacinar = new ArrayList();
    
    
    public MainAtendente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogFilaVacinacao = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistFilaToVacinar = new javax.swing.JList<>();
        btnRegistrarVacina = new javax.swing.JButton();
        dialogVacinados = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        btnFilaVacinacao = new javax.swing.JButton();

        dialogFilaVacinacao.setMinimumSize(new java.awt.Dimension(400, 300));

        jlistFilaToVacinar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlistFilaToVacinar);

        btnRegistrarVacina.setText("Registrar Vacina");
        btnRegistrarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogFilaVacinacaoLayout = new javax.swing.GroupLayout(dialogFilaVacinacao.getContentPane());
        dialogFilaVacinacao.getContentPane().setLayout(dialogFilaVacinacaoLayout);
        dialogFilaVacinacaoLayout.setHorizontalGroup(
            dialogFilaVacinacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFilaVacinacaoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(dialogFilaVacinacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogFilaVacinacaoLayout.createSequentialGroup()
                        .addComponent(btnRegistrarVacina)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogFilaVacinacaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        dialogFilaVacinacaoLayout.setVerticalGroup(
            dialogFilaVacinacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFilaVacinacaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarVacina)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        dialogVacinados.setMinimumSize(new java.awt.Dimension(450, 300));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout dialogVacinadosLayout = new javax.swing.GroupLayout(dialogVacinados.getContentPane());
        dialogVacinados.getContentPane().setLayout(dialogVacinadosLayout);
        dialogVacinadosLayout.setHorizontalGroup(
            dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVacinadosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        dialogVacinadosLayout.setVerticalGroup(
            dialogVacinadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVacinadosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Registros de vacinação");

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

    private void btnRegistrarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVacinaActionPerformed
        Vacinados vac = listaFilaVacinar.get(jlistFilaToVacinar.getSelectedIndex());
        vac.setData_vacinacao(LocalDate.now());
        vac.setVacinado(true);
        vacinadosDAO.update(vac);
        
        dialogFilaVacinacao.setVisible(false);
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
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistFilaToVacinar;
    // End of variables declaration//GEN-END:variables
}
