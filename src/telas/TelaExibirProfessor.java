package telas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import organizadoraula.OrganizadorAula.Professor;
import organizadoraula.OrganizadorAula.ProfessorDAO;

public class TelaExibirProfessor extends javax.swing.JInternalFrame {

    private List<Professor> lista;
    private ProfessorDAO dao;
    
    public TelaExibirProfessor() {
        initComponents(); 
        exibirTabela();
    }
    
    private void exibirTabela(){
        
        //Definindo tabalho das colunas e linhas da tabela
        tblProfessor.setRowHeight(20);
        TableColumnModel columnModel2=tblProfessor.getColumnModel();
        columnModel2.getColumn(0).setPreferredWidth(30);
        
        DefaultTableModel itensLista = (DefaultTableModel) tblProfessor.getModel();
        
        dao = new ProfessorDAO();
        lista = dao.list();
        
        if(lista == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Não há professor cadastrados.");
            this.dispose();
        }else{
            for(Professor novaLista: lista) { 
                Object[] exibe = new Object[4];
                exibe[0] = novaLista.getNome(); 
                exibe[1] = novaLista.getTurma();
                exibe[2] = novaLista.getDisciplina();
                exibe[3] = novaLista.getAulasSemana();
                itensLista.addRow(exibe);
            }
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlExibeProf = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfessor = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblExibirProfessor = new javax.swing.JLabel();

        tblProfessor.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        tblProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Turma", "Disciplina", "Aulas por semana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfessor);

        btnExcluir.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExibeProfLayout = new javax.swing.GroupLayout(pnlExibeProf);
        pnlExibeProf.setLayout(pnlExibeProfLayout);
        pnlExibeProfLayout.setHorizontalGroup(
            pnlExibeProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addGroup(pnlExibeProfLayout.createSequentialGroup()
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlExibeProfLayout.setVerticalGroup(
            pnlExibeProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExibeProfLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlExibeProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(jButton1))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        lblExibirProfessor.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        lblExibirProfessor.setText("LISTA DE PROFESSORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlExibeProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblExibirProfessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExibirProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlExibeProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int dialog = JOptionPane.showConfirmDialog(null,"Deseja excluir esse professor?",
            "Exclusão", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE );
        if(dialog == JOptionPane.YES_OPTION){
            DefaultTableModel itensLista = (DefaultTableModel) tblProfessor.getModel();

            for(int i = 0; i <= lista.size(); i++){
                if(i == tblProfessor.getSelectedRow()){
                    itensLista.removeRow(i);
                    lista.remove(i);
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExibirProfessor;
    private javax.swing.JPanel pnlExibeProf;
    private javax.swing.JTable tblProfessor;
    // End of variables declaration//GEN-END:variables
}
