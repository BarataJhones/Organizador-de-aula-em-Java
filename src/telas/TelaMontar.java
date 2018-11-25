package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import organizadoraula.OrganizadorAula.HorariosSalvos;
import organizadoraula.OrganizadorAula.Professor;
import organizadoraula.OrganizadorAula.ProfessorDAO;
import organizadoraula.OrganizadorAula.TabelasDAO;

public class TelaMontar extends javax.swing.JInternalFrame {

    private List<Professor> lista;
    private ProfessorDAO dao;
    
    private List<HorariosSalvos> listaTabela;
    private TabelasDAO daoTabela;

    public TelaMontar() {
        initComponents();
        colocarProfessor();
    }

    private void colocarProfessor(){
        
        dao = new ProfessorDAO();
        lista = dao.list();
        
        //Definindo tabalho das colunas e linhas da tabela
        tblMontar.setRowHeight(50);
        TableColumnModel columnModel=tblMontar.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        
        tblColunaHorariosFixa.setRowHeight(50);
        TableColumnModel columnModel2=tblColunaHorariosFixa.getColumnModel();
        columnModel2.getColumn(0).setPreferredWidth(70);
        
        //Colocando os professor nos comboboxs da tabela
        //ArrayList<Professor> listaProfDisponiveis = new ArrayList<>();
        //for (Professor confere : lista) {
            
            /*if (confere.getHorariosDisponiveis().contains("Segunda, 7:10 até 8:00")){
                listaProfDisponiveis.add(confere);*/
            
            tblMontar.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(boxListar1));
            tblMontar.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(boxListar1));
            tblMontar.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(boxListar1));
            tblMontar.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(boxListar1));
            tblMontar.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(boxListar1));
            
            try{
                DefaultComboBoxModel comboModel = new DefaultComboBoxModel(lista.toArray());
                boxListar1.setModel(comboModel);
            }catch(java.lang.NullPointerException e){

            }
        //}
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxListar1 = new javax.swing.JComboBox<>();
        pnlMontar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMontar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblColunaHorariosFixa = new javax.swing.JTable();
        lblMontar = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblEscolhaTurma = new javax.swing.JLabel();
        boxTurma = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();

        boxListar1.setEditable(true);
        boxListar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não há professores cadastrados" }));
        boxListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxListar1ActionPerformed(evt);
            }
        });

        tblMontar.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        tblMontar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta"
            }
        ));
        jScrollPane1.setViewportView(tblMontar);

        tblColunaHorariosFixa.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        tblColunaHorariosFixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:10 até 8:00"},
                {"8:00 até 8:50"},
                {"8:50 até 9:40"},
                {"10:00 até 10:50"},
                {"10:50 até 11:40"}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblColunaHorariosFixa);

        javax.swing.GroupLayout pnlMontarLayout = new javax.swing.GroupLayout(pnlMontar);
        pnlMontar.setLayout(pnlMontarLayout);
        pnlMontarLayout.setHorizontalGroup(
            pnlMontarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMontarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMontarLayout.setVerticalGroup(
            pnlMontarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMontarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblMontar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        lblMontar.setText("MONTAR TABELA");

        btnSair.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblEscolhaTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblEscolhaTurma.setText("Escolha a turma:");

        boxTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        boxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "5º ano", "6º ano" }));

        btnSalvar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscolhaTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlMontar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(lblMontar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMontar)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscolhaTurma)
                    .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlMontar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnSalvar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void boxListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxListar1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        HorariosSalvos horaSalva = new HorariosSalvos();

        for(int i = 0; i < tblMontar.getRowCount(); i++){
            for(int j = 0; j < tblMontar.getColumnCount(); j++){
                horaSalva.getListaHorarios().add((String) tblMontar.getModel().getValueAt(i, j).toString());
            }
        }
        TabelasDAO dadoDAO = new TabelasDAO();
        dadoDAO.save(horaSalva);
        
        JOptionPane.showMessageDialog(null, "Tabela salva.");

        //EXIBIR TESTE//////////////////////////////////
        daoTabela= new TabelasDAO();
        listaTabela = daoTabela.list();

        for (HorariosSalvos novaLista : listaTabela) {
            System.out.println(novaLista.getListaHorarios());
        }
        //////////////////////////////////////
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxListar1;
    private javax.swing.JComboBox<String> boxTurma;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEscolhaTurma;
    private javax.swing.JLabel lblMontar;
    private javax.swing.JPanel pnlMontar;
    private javax.swing.JTable tblColunaHorariosFixa;
    private javax.swing.JTable tblMontar;
    // End of variables declaration//GEN-END:variables
}
