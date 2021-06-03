package vacina.project.Janelas;

import bancodados.model.AdministradorDAO;
import bancodados.model.AtendenteDAO;
import bancodados.model.VacinadosDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import usuarios.Administrador;
import usuarios.Atendente;
import usuarios.Vacinados;

public class MainAdministrador extends javax.swing.JFrame {
    private AdministradorDAO admDAO = new AdministradorDAO();
    private AtendenteDAO atendentDAO = new AtendenteDAO();
    private VacinadosDAO vacinadosDAO = new VacinadosDAO();
    private List<Atendente> listaAtendente = new ArrayList();
    private List<Administrador> listaAdm = new ArrayList();
    /**
     * Creates new form MainAdministrador
     */
    public MainAdministrador() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAgendar = new javax.swing.JDialog();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnIdade = new javax.swing.JSpinner();
        rbTrabalhaSaude = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnAgendar = new javax.swing.JButton();
        dialogCadastrar = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        txtCPFCadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioCadastro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaCadastro = new javax.swing.JTextField();
        btnCadastrarUsuario = new javax.swing.JButton();
        rbAdmOrNot = new javax.swing.JRadioButton();
        dialogRemover = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRemoverAdm = new javax.swing.JList<>();
        btnRemover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRemoverAtendente = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        dialogAgendar.setMinimumSize(new java.awt.Dimension(400, 300));

        txtNome.setName(""); // NOI18N

        jLabel1.setText("Nome");

        jLabel2.setText("idade");

        spnIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        rbTrabalhaSaude.setText("Trabalha na área de saúde");

        jLabel3.setText("Endereço");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAgendarLayout = new javax.swing.GroupLayout(dialogAgendar.getContentPane());
        dialogAgendar.getContentPane().setLayout(dialogAgendarLayout);
        dialogAgendarLayout.setHorizontalGroup(
            dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAgendarLayout.createSequentialGroup()
                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogAgendarLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogAgendarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbTrabalhaSaude)
                            .addGroup(dialogAgendarLayout.createSequentialGroup()
                                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dialogAgendarLayout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(spnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(dialogAgendarLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAgendar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        dialogAgendarLayout.setVerticalGroup(
            dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAgendarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbTrabalhaSaude)
                .addGap(18, 18, 18)
                .addGroup(dialogAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnAgendar)
                .addGap(36, 36, 36))
        );

        dialogCadastrar.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel4.setText("Nome Completo");

        jLabel5.setText("CPF");

        jLabel6.setText("Usuário: ");

        jLabel7.setText("Senha: ");

        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        rbAdmOrNot.setText("Administrador");

        javax.swing.GroupLayout dialogCadastrarLayout = new javax.swing.GroupLayout(dialogCadastrar.getContentPane());
        dialogCadastrar.getContentPane().setLayout(dialogCadastrarLayout);
        dialogCadastrarLayout.setHorizontalGroup(
            dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCadastrarLayout.createSequentialGroup()
                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogCadastrarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dialogCadastrarLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dialogCadastrarLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dialogCadastrarLayout.createSequentialGroup()
                                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuarioCadastro)
                                    .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))))
                    .addGroup(dialogCadastrarLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCadastrarUsuario))
                    .addGroup(dialogCadastrarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rbAdmOrNot)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        dialogCadastrarLayout.setVerticalGroup(
            dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCadastrarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAdmOrNot)
                .addGap(18, 18, 18)
                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCadastrarUsuario)
                .addGap(22, 22, 22))
        );

        dialogRemover.setMinimumSize(new java.awt.Dimension(400, 300));

        listRemoverAdm.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRemoverAdm);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        listaRemoverAtendente.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaRemoverAtendente);

        jLabel8.setText("Administradores");

        jLabel9.setText("Atendentes");

        javax.swing.GroupLayout dialogRemoverLayout = new javax.swing.GroupLayout(dialogRemover.getContentPane());
        dialogRemover.getContentPane().setLayout(dialogRemoverLayout);
        dialogRemoverLayout.setHorizontalGroup(
            dialogRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRemoverLayout.createSequentialGroup()
                .addGroup(dialogRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogRemoverLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnRemover))
                    .addGroup(dialogRemoverLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(dialogRemoverLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(65, 65, 65))
        );
        dialogRemoverLayout.setVerticalGroup(
            dialogRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRemoverLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(dialogRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnRemover)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cadastrar usuário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agendar vacina");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remover usuário");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Relatório de vacinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dialogCadastrar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        if(rbAdmOrNot.isSelected()){
            Administrador adm = new Administrador();
            
            adm.setNome(txtNomeCadastro.getText().toString());
            adm.setCpf(txtCPFCadastro.getText().toString());
            adm.setUsuario(txtUsuarioCadastro.getText().toString());
            adm.setSenha(txtSenhaCadastro.getText().toString());
            
            admDAO.create(adm);
        }else{
            Atendente ate = new Atendente();
            
            ate.setNome(txtNomeCadastro.getText().toString());
            ate.setCpf(txtCPFCadastro.getText().toString());
            ate.setUsuario(txtUsuarioCadastro.getText().toString());
            ate.setSenha(txtSenhaCadastro.getText().toString());
            
            atendentDAO.create(ate);
        }
        dialogCadastrar.setVisible(false);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
        Vacinados vac = new Vacinados();
        vac.setNome(txtNome.getText().toString());
        vac.setIdade(Integer.parseInt(spnIdade.getValue().toString()));
        vac.setEndereco(txtEndereco.getText().toString());
        vac.setTrabalho_saude(rbTrabalhaSaude.isSelected());
        
        if(vac.getIdade() >= 70){
            vac.setPrioridade(1);
        }else if(vac.isTrabalho_saude()){
            vac.setPrioridade(2);
        }else{
            vac.setPrioridade(3);
        }
        
        vacinadosDAO.create(vac);
        
        dialogAgendar.setVisible(false);
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                dialogAgendar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          dialogRemover.setVisible(true);
          if(!listaAtendente.isEmpty() || !listaAdm.isEmpty()){
              listaAtendente.clear();
              listaAdm.clear();
          }
          
          listaAtendente.addAll(atendentDAO.read());
          listaAdm.addAll(admDAO.read());
          DefaultListModel listModel = new DefaultListModel();
          DefaultListModel listModel2 = new DefaultListModel();

          for(Atendente pecorre: listaAtendente){
              listModel.addElement(pecorre);
          }
          listaRemoverAtendente.setModel(listModel);
          
          
          for(Administrador pecorre: listaAdm){
              listModel2.addElement(pecorre);
          }
          listRemoverAdm.setModel(listModel2);
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if(!listRemoverAdm.isSelectionEmpty()){
            int index = listRemoverAdm.getSelectedIndex();
            admDAO.delete(listaAdm.get(index));
        }
        
        if(!listaRemoverAtendente.isSelectionEmpty()){
            int index = listaRemoverAtendente.getSelectedIndex();
            atendentDAO.delete(listaAtendente.get(index));
        }
        dialogRemover.setVisible(false);
    }//GEN-LAST:event_btnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnRemover;
    private javax.swing.JDialog dialogAgendar;
    private javax.swing.JDialog dialogCadastrar;
    private javax.swing.JDialog dialogRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRemoverAdm;
    private javax.swing.JList<String> listaRemoverAtendente;
    private javax.swing.JRadioButton rbAdmOrNot;
    private javax.swing.JRadioButton rbTrabalhaSaude;
    private javax.swing.JSpinner spnIdade;
    private javax.swing.JTextField txtCPFCadastro;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JTextField txtSenhaCadastro;
    private javax.swing.JTextField txtUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
}
