package telas;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import organizadoraula.OrganizadorAula.Professor;
import organizadoraula.OrganizadorAula.ProfessorDAO;

public class TelaCadastroProfessor extends javax.swing.JInternalFrame {

    //Setando as variáveis que vão receber os professores armazenados
    private List<Professor> lista;
    private ProfessorDAO dao;

    public TelaCadastroProfessor() {
        initComponents();
        definirAulas();

    }
    DefaultListModel tabelaEsquerdaComHorarios = new DefaultListModel();
    DefaultListModel tabelaDireitaPegaHorarios = new DefaultListModel();

    private void definirAulas() {
        tabelaEsquerdaComHorarios.addElement("Segunda, 7:10 até 8:00");
        tabelaEsquerdaComHorarios.addElement("Segunda, 8:00 até 8:50");
        tabelaEsquerdaComHorarios.addElement("Segunda, 8:50 até 9:40");
        tabelaEsquerdaComHorarios.addElement("Segunda, 10:00 até 10:50");
        tabelaEsquerdaComHorarios.addElement("Segunda, 10:50 até 11:40");
        tabelaEsquerdaComHorarios.addElement("Terça, 7:10 até 8:00");
        tabelaEsquerdaComHorarios.addElement("Terça, 8:00 até 8:50");
        tabelaEsquerdaComHorarios.addElement("Terça, 8:50 até 9:40");
        tabelaEsquerdaComHorarios.addElement("Terça, 10:00 até 10:50");
        tabelaEsquerdaComHorarios.addElement("Terça, 10:50 até 11:40");
        tabelaEsquerdaComHorarios.addElement("Quarta, 7:10 até 8:00");
        tabelaEsquerdaComHorarios.addElement("Quarta, 8:00 até 8:50");
        tabelaEsquerdaComHorarios.addElement("Quarta, 8:50 até 9:40");
        tabelaEsquerdaComHorarios.addElement("Quarta, 10:00 até 10:50");
        tabelaEsquerdaComHorarios.addElement("Quarta, 10:50 até 11:40");
        tabelaEsquerdaComHorarios.addElement("Quinta, 7:10 até 8:00");
        tabelaEsquerdaComHorarios.addElement("Quinta, 8:00 até 8:50");
        tabelaEsquerdaComHorarios.addElement("Quinta, 8:50 até 9:40");
        tabelaEsquerdaComHorarios.addElement("Quinta, 10:00 até 10:50");
        tabelaEsquerdaComHorarios.addElement("Quinta, 10:50 até 11:40");
        tabelaEsquerdaComHorarios.addElement("Sexta, 7:10 até 8:00");
        tabelaEsquerdaComHorarios.addElement("Sexta, 8:00 até 8:50");
        tabelaEsquerdaComHorarios.addElement("Sexta, 8:50 até 9:40");
        tabelaEsquerdaComHorarios.addElement("Sexta, 10:00 até 10:50");
        tabelaEsquerdaComHorarios.addElement("Sexta, 10:50 até 11:40");

        lstHoraCom.setModel(tabelaEsquerdaComHorarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTurma = new javax.swing.JLabel();
        lblDisciplina = new javax.swing.JLabel();
        boxTurma = new javax.swing.JComboBox<>();
        boxDisciplina = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        lblAulasSemana = new javax.swing.JLabel();
        boxAulasSemana = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        pnlHorarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstHoraCom = new javax.swing.JList<>();
        btnAddAula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstHoraPega = new javax.swing.JList<>();
        btnRemAula = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setResizable(true);

        lblCadastro.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        lblCadastro.setText("CADASTRO DE PROFESSOR");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preencha os dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 16))); // NOI18N

        lblNome.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblTurma.setText("Turma:");

        lblDisciplina.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblDisciplina.setText("Disciplina:");

        boxTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        boxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "5º ano", "6º ano" }));
        boxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTurmaActionPerformed(evt);
            }
        });

        boxDisciplina.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        boxDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Artes", "Ciências", "Cultura afro", "Ed. física", "Geografia", "História", "Inglês", "Matemática", "Português", "Religião" }));

        btnAdicionar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblAulasSemana.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblAulasSemana.setText("Aulas por semana:");

        boxAulasSemana.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        boxAulasSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1 aula", "2 aulas", "3 aulas", "4 aulas", "5 aulas" }));

        btnCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblDisciplina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAulasSemana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxAulasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurma)
                    .addComponent(boxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisciplina)
                    .addComponent(boxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAulasSemana)
                    .addComponent(boxAulasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione os horários disponíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 0, 16))); // NOI18N

        jScrollPane1.setViewportView(lstHoraCom);

        btnAddAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_right.png"))); // NOI18N
        btnAddAula.setText("Adicionar ");
        btnAddAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAulaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstHoraPega);

        btnRemAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_left_red.png"))); // NOI18N
        btnRemAula.setText("Remover");
        btnRemAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHorariosLayout = new javax.swing.GroupLayout(pnlHorarios);
        pnlHorarios.setLayout(pnlHorariosLayout);
        pnlHorariosLayout.setHorizontalGroup(
            pnlHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHorariosLayout.setVerticalGroup(
            pnlHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(pnlHorariosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnAddAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTurmaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Professor prof = new Professor();
        int contaAulas = 0;
        
        //Verificação de campos preenchidos.
        if ("".equals(txtNome.getText()) || "Selecione".equals(boxTurma.getSelectedItem())
            || "Selecione".equals(boxDisciplina.getSelectedItem()) || "Selecione".equals(boxAulasSemana.getSelectedItem())
            || tabelaDireitaPegaHorarios.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente.");
         
        }else {
            
            prof.setNome(txtNome.getText());
            prof.setTurma((String) boxTurma.getSelectedItem());
            prof.setDisciplina((String) boxDisciplina.getSelectedItem());
            prof.setAulasSemana((String) boxAulasSemana.getSelectedItem());
            
            //Confere o que foi colocado no campo de aulas por semana, e passa para a variável "contaAulas".
            if( "1 aula".equals(boxAulasSemana.getSelectedItem())){
                contaAulas = 1;
            }else if ( "2 aulas".equals(boxAulasSemana.getSelectedItem())){
                contaAulas = 2;
            }else if ( "3 aulas".equals(boxAulasSemana.getSelectedItem())){
                contaAulas = 3;
            }else if ( "4 aulas".equals(boxAulasSemana.getSelectedItem())){
                contaAulas = 4;
            }else if ( "5 aulas".equals(boxAulasSemana.getSelectedItem())){
                contaAulas = 5;
            }
            
            //Joga os Horários Disponíveis selecionados na variável HorariosDisponiveis
            int tamanhoLista = lstHoraPega.getModel().getSize();
            
            if (tamanhoLista <contaAulas){ //Conferere se a lista de horários selecionados é menor que a quantidade de aulas por semana.
                JOptionPane.showMessageDialog(null, "O número de horários disponíveis é menor que o número de aulas por semana.");
            }else{
                for (int i = 0; i < tamanhoLista; i++) {
                    prof.getHorariosDisponiveis().add(lstHoraPega.getModel().getElementAt(i));
                }

                ProfessorDAO profDado = new ProfessorDAO();
                profDado.salvar(prof);

                //EXIBIR TESTE//////////////////////////////////
                /*dao = new ProfessorDAO();
                lista = dao.list();

                for (Professor entity : lista) {
                    System.out.println(entity);
                }
                ////////////////////////////////////// */

                JOptionPane.showMessageDialog(null, "Professor cadastrado");

                //Após cadastrar, seta todos os campos para o padrão.
                txtNome.setText("");
                boxTurma.setSelectedItem("Selecione");
                boxDisciplina.setSelectedItem("Selecione");
                boxAulasSemana.setSelectedItem("Selecione");
                tabelaEsquerdaComHorarios.removeAllElements();
                definirAulas();
                tabelaDireitaPegaHorarios.removeAllElements();
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if ("".equals(txtNome.getText()) && "Selecione".equals(boxTurma.getSelectedItem())
            && "Selecione".equals(boxDisciplina.getSelectedItem()) && "Selecione".equals(boxAulasSemana.getSelectedItem())
            && tabelaDireitaPegaHorarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há operação para cancelar");

        } else {
            int dialog = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cadastro?",
                    "Cancelamento", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
            if (dialog == JOptionPane.YES_OPTION) {
                txtNome.setText("");
                boxTurma.setSelectedItem("Selecione");
                boxDisciplina.setSelectedItem("Selecione");
                boxAulasSemana.setSelectedItem("Selecione");
                tabelaEsquerdaComHorarios.removeAllElements();
                definirAulas();
                tabelaDireitaPegaHorarios.removeAllElements();
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAulaActionPerformed

        try {
            tabelaDireitaPegaHorarios.addElement(lstHoraCom.getSelectedValue());
            lstHoraPega.setModel(tabelaDireitaPegaHorarios);

            int index = lstHoraCom.getSelectedIndex();
            tabelaEsquerdaComHorarios.remove(index);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não há mais aulas para adicionar.");
        }
    }//GEN-LAST:event_btnAddAulaActionPerformed

    private void btnRemAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemAulaActionPerformed
        try {
            tabelaEsquerdaComHorarios.addElement(lstHoraPega.getSelectedValue());
            lstHoraCom.setModel(tabelaEsquerdaComHorarios);

            int index = lstHoraPega.getSelectedIndex();
            tabelaDireitaPegaHorarios.remove(index);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não há mais aulas para remover.");
        }
    }//GEN-LAST:event_btnRemAulaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAulasSemana;
    private javax.swing.JComboBox<String> boxDisciplina;
    private javax.swing.JComboBox<String> boxTurma;
    private javax.swing.JButton btnAddAula;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemAula;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAulasSemana;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JList<String> lstHoraCom;
    private javax.swing.JList<String> lstHoraPega;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlHorarios;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
