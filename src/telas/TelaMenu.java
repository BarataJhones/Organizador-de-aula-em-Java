package telas;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class TelaMenu extends javax.swing.JFrame {

    
            
    public TelaMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/background.jpg"));
        final Image image = icon.getImage();
        telaDesktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUsuario = new javax.swing.JMenu();
        mnuUsuarioCadastrar = new javax.swing.JMenuItem();
        mnuUsuarioLista = new javax.swing.JMenuItem();
        mnuProfessor = new javax.swing.JMenu();
        mnuProfessorCadastrar = new javax.swing.JMenuItem();
        mnuProfessorLista = new javax.swing.JMenuItem();
        mnuAlterar = new javax.swing.JMenu();
        mnuExibir = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        telaDesktop.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout telaDesktopLayout = new javax.swing.GroupLayout(telaDesktop);
        telaDesktop.setLayout(telaDesktopLayout);
        telaDesktopLayout.setHorizontalGroup(
            telaDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        telaDesktopLayout.setVerticalGroup(
            telaDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_suit.png"))); // NOI18N
        mnuUsuario.setText("Usuários");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });

        mnuUsuarioCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        mnuUsuarioCadastrar.setText("Cadastrar");
        mnuUsuarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioCadastrarActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuUsuarioCadastrar);

        mnuUsuarioLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.png"))); // NOI18N
        mnuUsuarioLista.setText("Lista de usuários");
        mnuUsuario.add(mnuUsuarioLista);

        jMenuBar1.add(mnuUsuario);

        mnuProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_green.png"))); // NOI18N
        mnuProfessor.setText("Professor");
        mnuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfessorActionPerformed(evt);
            }
        });

        mnuProfessorCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_green_add.png"))); // NOI18N
        mnuProfessorCadastrar.setText("Cadastrar");
        mnuProfessorCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfessorCadastrarActionPerformed(evt);
            }
        });
        mnuProfessor.add(mnuProfessorCadastrar);

        mnuProfessorLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_green_edit.png"))); // NOI18N
        mnuProfessorLista.setText("Lista de professores");
        mnuProfessorLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfessorListaActionPerformed(evt);
            }
        });
        mnuProfessor.add(mnuProfessorLista);

        jMenuBar1.add(mnuProfessor);

        mnuAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/change.png"))); // NOI18N
        mnuAlterar.setText("Alterar");
        mnuAlterar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuAlterarMenuSelected(evt);
            }
        });
        mnuAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAlterarMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuAlterar);

        mnuExibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/monitor.png"))); // NOI18N
        mnuExibir.setText("Exibir horários");
        mnuExibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuExibirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuExibir);

        mnuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        mnuSobre.setText("Sobre");
        mnuSobre.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuSobreMenuSelected(evt);
            }
        });
        mnuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSobreMouseClicked(evt);
            }
        });
        mnuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSobre);

        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit icon.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaDesktop)
        );

        setSize(new java.awt.Dimension(1132, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuProfessorCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfessorCadastrarActionPerformed
        
        TelaCadastroProfessor telaCadProf = new TelaCadastroProfessor();
        telaDesktop.add(telaCadProf);
        telaCadProf.setVisible(true);
    }//GEN-LAST:event_mnuProfessorCadastrarActionPerformed

    private void mnuUsuarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioCadastrarActionPerformed
        TelaCadastroUsuarioInterna telaCadUser = new TelaCadastroUsuarioInterna();
        telaDesktop.add(telaCadUser);
        telaCadUser.setVisible(true);
    }//GEN-LAST:event_mnuUsuarioCadastrarActionPerformed

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void mnuProfessorListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfessorListaActionPerformed
        
        TelaExibirProfessor telaExebirProf = new TelaExibirProfessor();
        telaDesktop.add(telaExebirProf);
        telaExebirProf.setVisible(true);
    }//GEN-LAST:event_mnuProfessorListaActionPerformed

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
    }//GEN-LAST:event_mnuSobreActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuProfessorActionPerformed

    private void mnuSobreMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuSobreMenuSelected
            
    }//GEN-LAST:event_mnuSobreMenuSelected

    private void mnuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSobreMouseClicked
        JOptionPane.showMessageDialog(null, "Esse programa tem o intúito de facilitar a organização de aulas nas escolas.\n"+
            "Basta cadastra o professor, com sua respetctiva turma e disciplina, seus horários doisponíveis\n"+
            "e ir em alterar para organizar de acordo com os horários de cada professor.");
    }//GEN-LAST:event_mnuSobreMouseClicked

    private void mnuAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAlterarMouseClicked
        TelaMontar telaMont = new TelaMontar();
        telaDesktop.add(telaMont);
        telaMont.setVisible(true);
    }//GEN-LAST:event_mnuAlterarMouseClicked

    private void mnuAlterarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuAlterarMenuSelected
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mnuAlterarMenuSelected

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnuSairMouseClicked

    private void mnuExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuExibirMouseClicked
        TelaExibirHorarios telaExibe = new TelaExibirHorarios();
        telaDesktop.add(telaExibe);
        telaExibe.setVisible(true);
    }//GEN-LAST:event_mnuExibirMouseClicked

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAlterar;
    private javax.swing.JMenu mnuExibir;
    private javax.swing.JMenu mnuProfessor;
    private javax.swing.JMenuItem mnuProfessorCadastrar;
    private javax.swing.JMenuItem mnuProfessorLista;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenu mnuSobre;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenuItem mnuUsuarioCadastrar;
    private javax.swing.JMenuItem mnuUsuarioLista;
    private javax.swing.JDesktopPane telaDesktop;
    // End of variables declaration//GEN-END:variables
}
