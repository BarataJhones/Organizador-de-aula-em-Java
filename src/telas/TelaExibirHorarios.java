package telas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import organizadoraula.OrganizadorAula.HorariosSalvos;
import organizadoraula.OrganizadorAula.TabelasDAO;

public class TelaExibirHorarios extends javax.swing.JInternalFrame {

    private List<HorariosSalvos> listaTabela;
    private TabelasDAO daoTabela;
    
    public TelaExibirHorarios() {
        initComponents();
        passarParaTabela();
    }

    private void passarParaTabela(){
        DefaultTableModel itensTabela = (DefaultTableModel) tblExibir.getModel();
        
        daoTabela = new TabelasDAO();
        listaTabela = daoTabela.list();
        
        if(listaTabela == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Não há professor cadastrados.");
            this.dispose();
        }else{
            for(int linha=0; linha<listaTabela.size(); linha++) { 
                for(int coluna=linha+1; coluna<listaTabela.size(); coluna++) {
                    Object[][] exibe = new Object[5][5];
                    exibe[coluna][linha] = listaTabela.get(coluna);
                    itensTabela.addRow(exibe);
                }
            }
        }
  }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlExibir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExibir = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblColunaHorariosFixo = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        lblExibir = new javax.swing.JLabel();
        lblEscolhaTurma = new javax.swing.JLabel();
        boxTurma = new javax.swing.JComboBox<>();

        tblExibir.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        tblExibir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExibir);

        tblColunaHorariosFixo.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        tblColunaHorariosFixo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblColunaHorariosFixo);

        javax.swing.GroupLayout pnlExibirLayout = new javax.swing.GroupLayout(pnlExibir);
        pnlExibir.setLayout(pnlExibirLayout);
        pnlExibirLayout.setHorizontalGroup(
            pnlExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExibirLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlExibirLayout.setVerticalGroup(
            pnlExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExibirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSair.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblExibir.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        lblExibir.setText("EXIBIR HORÁRIOS");

        lblEscolhaTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblEscolhaTurma.setText("Escolha a turma:");

        boxTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        boxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "5º ano", "6º ano" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlExibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(lblExibir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEscolhaTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExibir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscolhaTurma)
                    .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(pnlExibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTurma;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEscolhaTurma;
    private javax.swing.JLabel lblExibir;
    private javax.swing.JPanel pnlExibir;
    private javax.swing.JTable tblColunaHorariosFixo;
    private javax.swing.JTable tblExibir;
    // End of variables declaration//GEN-END:variables
}
